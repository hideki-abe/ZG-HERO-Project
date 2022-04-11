package DAO

import Competencias.Competencia
import Vagas.Vaga

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class VagasDAO {

    private Connection connection

    public VagasDAO(){
        try {
            Class.forName("org.postgresql.Driver")
            String url = "jdbc:postgresql://localhost:5432/postgres"
            String user = "postgres"
            String password = "postgres"
            this.connection = DriverManager.getConnection(url, user, password)

        } catch (ClassNotFoundException | SQLException ex){
            println("Erro na conexão!")
            //Logger.getLogger(PessoaFisicaDAO.class.getName()).log(PlatformLogger.Level.SEVERE, null, ex)
        }
    }

    public List<Vaga> listar(){
        String sql = "SELECT * FROM vagas"
        List<Vaga> retorno = new ArrayList<>()

        try {
            PreparedStatement stmt = connection.prepareStatement(sql)
            ResultSet resultado = stmt.executeQuery()
            while(resultado.next()){
                Vaga vaga = new Vaga()
                vaga.setNome(resultado.getString("nome"))
                vaga.setDesc(resultado.getString("descricao"))
                vaga.setLugar(resultado.getString("lugar"))

                retorno.add(vaga)
            }

        } catch (SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
        }

        return retorno
    }

    public boolean inserir(Vaga vaga){
        String sql = "INSERT INTO vagas(nome, descricao, lugar, id_empresas, id_competencias) VALUES(?,?,?,?,?)"

        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, vaga.getNome())
            stmt.setString(2, vaga.getDesc())
            stmt.setString(3, vaga.getLugar())
            stmt.setInt(4, vaga.getId_empresas())
            stmt.setInt(5, vaga.getId_competencais())

            stmt.execute()
            return true

        } catch(SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
            return false
        }
    }
    public boolean alterar(Vaga vaga, String nome){
        String sql = "UPDATE vagas SET nome=? WHERE nome=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, vaga.nome)
            stmt.setString(2, nome)

            stmt.execute()
            return true

        }catch(SQLException ex){
            ex.printStackTrace()
            println("Erro de conexão!")
            return false
        }
    }

    public void remover(String nome){
        String sql = "DELETE FROM vagas WHERE nome=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, nome)
            stmt.execute()

        } catch(SQLException ex){
            ex.printStackTrace()
        }

    }



}
