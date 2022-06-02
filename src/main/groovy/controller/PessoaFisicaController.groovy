package controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import model.dao.pessoas.PessoaDAO
import model.factory.pessoas.PessoaFisicaCC
import model.pessoas.Pessoa
import model.pessoas.PessoaFisica


@WebServlet("/candidatos")
class PessoaFisicaController extends HttpServlet{

    PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:9000");
        resp.setHeader("Access-Control-Allow-Methods", "GET");
        resp.setHeader("Access-Control-Max-Age", "3600");
        resp.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        List candidatos = candidatoDAO.listar()
        PessoaFisica candidato = candidatos.get(0)

        if(true){
            String json = "{\n";
            json += "\"name\": " + candidato.getNome() + ", \n"//+ JSONObject.quote(person.getName()) + ",\n";
            json += "\"about\": " + candidato.getDescricao() + ", \n" //+ JSONObject.quote(person.getAbout()) + ",\n";
            json += "\"birthYear\": " + candidato.getIdade() + "\n" //+ person.getBirthYear() + "\n";
            json += "}";
            resp.getOutputStream().println(json);
        }
        else{
            //That person wasn't found, so return an empty JSON object. We could also return an error.
            resp.getOutputStream().println("{}");
        }

        resp.addHeader("Access-Control-Allow-Origin", "*")


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        println "Cadastrando novo candidato!"
        String nome = req.getParameter("nome")
        String email = req.getParameter("email")
        String cpf = req.getParameter("cpf")
        String idade = req.getParameter("idade")
        String estado = req.getParameter("estado")
        String cep = req.getParameter("cep")
        String descricao = req.getParameter("descricao")
        String senha = req.getParameter("senha")

        println senha

        //(String nome, String email, cpf, int idade, String estado, cep, String descricao)
        Pessoa candidato = new PessoaFisica(nome, email, cpf, idade as int, estado, cep, descricao, senha)

        candidatoDAO.inserir(candidato)

    }
}
