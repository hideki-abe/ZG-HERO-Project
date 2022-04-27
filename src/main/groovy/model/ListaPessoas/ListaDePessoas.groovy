package model.ListaPessoas

import model.Pessoas.PessoaFisica
import model.Pessoas.PessoaJuridica

class ListaDePessoas {

    ArrayList<PessoaFisica> candidatos = new ArrayList<>()
    ArrayList<PessoaJuridica> empresas = new ArrayList<>()

    def listaCandidatos(){
        println this.candidatos
    }

    def listaEmpresas(){
        println this.empresas
    }

}
