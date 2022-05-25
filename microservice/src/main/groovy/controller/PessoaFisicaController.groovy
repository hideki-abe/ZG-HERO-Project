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
        super.doPost(req, resp)
    }

    void imprime(){
        println candidatoDAO.listar()
    }

    void insere(Pessoa candidato){
        candidatoDAO.inserir(candidato)

    }

    void altera(PessoaFisica candidato, String cpf){
        candidatoDAO.alterar(candidato, cpf)

    }

    void remove(String cpf){
        candidatoDAO.remover(cpf)
    }

}
