package controller

import model.dao.PessoaDAO
import model.factory.pessoas.PessoaFisicaCC
import model.pessoas.Pessoa
import model.pessoas.PessoaFisica

class PessoaFisicaController {

    PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()

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
