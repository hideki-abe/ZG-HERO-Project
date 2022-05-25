package controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import model.dao.PessoaDAO
import model.factory.pessoas.PessoaJuridicaCC
import model.pessoas.Pessoa
import model.pessoas.PessoaFisica
import model.pessoas.PessoaJuridica

@WebServlet("/cadastroEmpresa")
class PessoaJuridicaController extends HttpServlet{

    PessoaDAO empresaDAO = new PessoaJuridicaCC().createPessoa()

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("./cadastroEmpresa.jsp")
        rd.forward(req, resp)
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        println "Cadastrando nova empresa!"
        String nome = req.getParameter("nome")
        String email = req.getParameter("email")
        String cnpj = req.getParameter("cnpj")
        String pais = req.getParameter("pais")
        String estado = req.getParameter("estado")
        String cep = req.getParameter("cep")
        String descricao = req.getParameter("descricao")
        String senha = req.getParameter("senha")

        Pessoa empresa = new PessoaJuridica(nome, email, cnpj, pais, estado, cep, descricao, senha)

        empresaDAO.inserir(empresa)

        RequestDispatcher rd = req.getRequestDispatcher("./cadastroEmpresa.jsp")
        rd.forward(req, resp)


    }

}
