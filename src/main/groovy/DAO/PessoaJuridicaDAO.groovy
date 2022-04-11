package DAO

import Pessoas.PessoaFisica
import Pessoas.PessoaJuridica

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class PessoaJuridicaDAO {

    private Connection connection

    public PessoaJuridicaDAO(){
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

    public List<PessoaFisica> listar(){
        String sql = "SELECT * FROM empresas"
        List<PessoaFisica> retorno = new ArrayList<>()

        try {
            PreparedStatement stmt = connection.prepareStatement(sql)
            ResultSet resultado = stmt.executeQuery()
            while(resultado.next()){
                PessoaJuridica empresa = new PessoaJuridica()
                empresa.setNome(resultado.getString("nome"))
                empresa.setCnpj(resultado.getString("cnpj"))
                empresa.setEmail(resultado.getString("email"))
                empresa.setEstado(resultado.getString("pais"))
                empresa.setCep(resultado.getString("cep"))
                empresa.setDescricao(resultado.getString("descricao"))

                //List<String> comp = new ArrayList<>()
                //comp.add(resultado.getString(""))
                //empresa.setCompetencias(comp)
                retorno.add(empresa)
            }

        } catch (SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
        }

        return retorno
    }

    //INSERE NOVOS CANDIDATOS NO BANCO DE DADOS
    public boolean inserir(PessoaJuridica pessoa){
        String sql = "INSERT INTO empresas(nome, cnpj, email, descricao," +
                "pais, cep, senha) VALUES (?,?,?,?,?,?,?)"


        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, pessoa.nome)
            stmt.setString(2, pessoa.cnpj.toString())
            stmt.setString(3, pessoa.email)
            stmt.setString(4, pessoa.descricao)
            stmt.setString(5, pessoa.pais)
            stmt.setString(6, pessoa.cep.toString())
            stmt.setString(7, "123456")

            stmt.execute()
            return true

        } catch(SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
            return false
        }

    }



}
