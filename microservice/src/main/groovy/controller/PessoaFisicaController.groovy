package controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import model.dao.PessoaDAO
import model.factory.pessoas.PessoaFisicaCC
import model.pessoas.Pessoa
import model.pessoas.PessoaFisica

@WebServlet("/cadastroCandidato")
class PessoaFisicaController extends HttpServlet{

    PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        println "Página de cadastro de Candidato"

        RequestDispatcher rd = req.getRequestDispatcher("./cadastroCandidato.jsp")
        rd.forward(req, resp)

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

        //(String nome, String email, cpf, int idade, String estado, cep, String descricao)
        Pessoa candidato = new PessoaFisica(nome, email, cpf, idade as int, estado, cep, descricao, senha)

        candidatoDAO.inserir(candidato)


    }

    void imprime(){
        println candidatoDAO.listar()
    }

    void insere(Pessoa candidato){
        candidatoDAO.inserir(candidato)

    }

    void altera(PessoaFisica candidato, String cpf) {
        candidatoDAO.alterar(candidato, cpf)
    }

    void remove(String cpf){
        candidatoDAO.remover(cpf)
    }

}
