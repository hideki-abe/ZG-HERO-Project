package controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import model.dao.PessoaDAO
import model.factory.pessoas.PessoaJuridicaCC
import model.pessoas.PessoaJuridica

@WebServlet("/cadastroEmpresa")
class PessoaJuridicaController extends HttpServlet{

    PessoaDAO empresaDAO = new PessoaJuridicaCC().createPessoa()

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("./cadastroEmpresa.jsp")
        rd.forward(req, resp)
    }

    void imprime(){
        println empresaDAO.listar()
    }

    void insere(PessoaJuridica empresa){
        empresaDAO.inserir(empresa)

    }

    void altera(PessoaJuridica empresa, String cnpj){
        empresaDAO.alterar(empresa, cnpj)

    }

    void remove(String cnpj){
        empresaDAO.remover(cnpj)
    }
}
