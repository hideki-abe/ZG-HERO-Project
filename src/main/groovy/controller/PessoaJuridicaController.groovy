package controller

import model.dao.pessoas.PessoaDAO
import model.factory.pessoas.PessoaFisicaCC
import model.factory.pessoas.PessoaJuridicaCC
import model.pessoas.PessoaFisica
import model.pessoas.PessoaJuridica

class PessoaJuridicaController {

    PessoaDAO empresaDAO = new PessoaJuridicaCC().createPessoa()

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
