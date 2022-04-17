package Main

import DAO.PessoaFisicaDAO
import DAO.PessoaJuridicaDAO
import Pessoas.PessoaJuridica

class TestePessoaJuridicaDAO {

    static void main(String[] args) {

        //LISTA EMPRESAS
        listar()

        //INSERE EMPRESA
        PessoaJuridica empresa1 = new PessoaJuridica("Empresa2","empresa2@email.com",
                "11111111111", "Brasil", "São Paulo", "11111111",
                "Descrição da empresa 2!")
        def list = ["Html/Css", "Javascript", "Angular"]
        empresa1.setCompetencias(list)
        insere(empresa1)

        PessoaJuridica empresa2 = new PessoaJuridica("Creme Mel","empresa2@email.com",
                "11111111111", "Brasil", "Goiás", "11111111",
                "Descrição da Creme Mel!")
        list = ["Html/Css", "Javascript", "Angular"]
        empresa2.setCompetencias(list)

        //ALTERA EMPRESA
        altera(empresa2,"11111111111")

        //REMOVE EMPRESA
        remove("11111111111")

    }

    def static listar(){
        PessoaJuridicaDAO empresa = new PessoaJuridicaDAO()
        println(empresa.listar())
    }

    def static insere(PessoaJuridica empresa){
        PessoaJuridicaDAO empresaDAO = new PessoaJuridicaDAO()
        empresaDAO.inserir(empresa)

    }

    def static altera(PessoaJuridica empresa, String cnpj){
        PessoaJuridicaDAO empresaDAO = new PessoaJuridicaDAO()
        empresaDAO.alterar(empresa, cnpj)

    }

    def static remove(String cnpj){
        PessoaJuridicaDAO empresaDAO = new PessoaJuridicaDAO()
        empresaDAO.remover(cnpj)
    }


}
