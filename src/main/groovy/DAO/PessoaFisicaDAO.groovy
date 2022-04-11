package DAO

import Pessoas.PessoaFisica
import sun.util.logging.PlatformLogger

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.util.logging.Logger

class PessoaFisicaDAO {

    private Connection connection

    public PessoaFisicaDAO(){
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

    //Pega as pessoas do banco de dados e coloca dentro da lista
    public List<PessoaFisica> listar(){
        String sql = "SELECT * FROM candidatos"
        List<PessoaFisica> retorno = new ArrayList<>()

        try {
            PreparedStatement stmt = connection.prepareStatement(sql)
            ResultSet resultado = stmt.executeQuery()
            while(resultado.next()){
                PessoaFisica candidato = new PessoaFisica()
                candidato.setNome(resultado.getString("nome") + " " + resultado.getString("sobrenome"))
                candidato.setCpf(resultado.getString("cpf"))
                candidato.setEmail(resultado.getString("email"))
                candidato.setCpf(resultado.getString("cpf"))
                candidato.setEstado(resultado.getString("pais"))
                candidato.setCep(resultado.getString("cep"))
                candidato.setDescricao(resultado.getString("descricao"))

                String dataNasc = resultado.getString("data_de_nascimento")
                String regex = /-/
                def anoNasc = dataNasc.split(regex)

                Calendar data = Calendar.getInstance()
                def anoAtual = data.toYear()
                String idade = anoAtual - anoNasc[0].toInteger()

                candidato.setIdade(idade as int)
                //List<String> comp = new ArrayList<>()
                //comp.add(resultado.getString(""))
                //candidato.setCompetencias(comp)
                retorno.add(candidato)
            }

        } catch (SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
        }

        return retorno
    }

    //INSERE NOVOS CANDIDATOS NO BANCO DE DADOS
    public boolean inserir(PessoaFisica pessoa){
        String sql = "INSERT INTO candidatos(nome, sobrenome,  data_de_nascimento, email, cpf," +
                " pais, cep,  descricao, senha, id_competencias) VALUES (?,?,?,?,?,?,?,?,?,?)"

        def nomeCompleto = pessoa.getNome()
        def split = nomeCompleto.trim().split("[,.!?'@_] *| +")
        String primeiroNome = split[0]
        String sobrenome = split[1]

        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, primeiroNome)
            stmt.setString(2, sobrenome)
            stmt.setString(3, pessoa.idade.toString())
            stmt.setString(4, pessoa.email)
            stmt.setString(5, pessoa.cpf.toString())
            stmt.setString(6, pessoa.estado)
            stmt.setString(7, pessoa.cep.toString())
            stmt.setString(8, pessoa.descricao)
            stmt.setString(9, "123456")
            stmt.setInt(10, 7)
            stmt.execute()
            return true

        } catch(SQLException ex){
            ex.printStackTrace()
            println("Erro na conexão!")
            return false
        }

    }

    //ALTERA PELO CPF
    public boolean alterar(PessoaFisica pessoa, String cpf){
        String sql = "UPDATE candidatos SET nome=?, sobrenome=?, data_de_nascimento=?, email=?, cpf=?, pais=?, cep=?, descricao=?" +
                " WHERE cpf=?"
        try{

            def nomeCompleto = pessoa.getNome()
            def split = nomeCompleto.trim().split("[,.!?'@_] *| +")
            String primeiroNome = split[0]
            String sobrenome = split[1]

            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(5, pessoa.cpf.toString())
            stmt.setString(1, primeiroNome)
            stmt.setString(2, sobrenome)
            stmt.setString(3, pessoa.idade.toString())
            stmt.setString(4, pessoa.email)
            stmt.setString(6, pessoa.estado)
            stmt.setString(7, pessoa.cep.toString())
            stmt.setString(8, pessoa.descricao)
            stmt.setString(9, pessoa.cpf.toString())
            stmt.execute()
            return true

        }catch(SQLException ex){
            ex.printStackTrace()
            println("Erro de conexão!")
            return false
        }


    }

    //REMOVE PELO CPF
    public void remover(String cpf){
        String sql = "DELETE FROM candidatos WHERE cpf=?"
        try{
            PreparedStatement stmt = connection.prepareStatement(sql)
            stmt.setString(1, cpf)
            stmt.execute()

        } catch(SQLException ex){
            ex.printStackTrace()
        }



    }

}
