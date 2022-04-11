package DAO

import Competencias.Competencia

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class CompetenciasDAO {

    private Connection connection

    public CompetenciasDAO(){
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

    public List<Competencia> listar(){
        String sql = "SELECT * FROM competencias"
        List<Competencia> retorno = new ArrayList<>()

        try {
            PreparedStatement stmt = connection.prepareStatement(sql)
            ResultSet resultado = stmt.executeQuery()
            while(resultado.next()){
                Competencia comp = new Competencia()
                comp.setNome(resultado.getString("nome"))

                retorno.add(comp)
            }

        } catch (SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
        }

        return retorno
    }

    public boolean inserir(Competencia comp){
        String sql = "INSERT INTO competencias(nome) VALUES(?)"

        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, comp.nome)

            stmt.execute()
            return true

        } catch(SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
            return false
        }

    }

    public boolean alterar(Competencia comp, String nome){
        String sql = "UPDATE competencias SET nome=? WHERE nome=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, comp.nome)
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
        String sql = "DELETE FROM competencias WHERE nome=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, nome)
            stmt.execute()

        } catch(SQLException ex){
            ex.printStackTrace()
        }

    }


}
