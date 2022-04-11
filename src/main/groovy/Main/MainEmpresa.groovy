package Main

import DAO.PessoaFisicaDAO
import DAO.PessoaJuridicaDAO
import Pessoas.PessoaJuridica

class MainEmpresa {

    static void main(String[] args) {

        listar()

        PessoaJuridica empresa = new PessoaJuridica("Empresa2","empresa2@email.com",
                "11111111111", "Brasil", "São Paulo", "11111111",
                "Descrição da empresa 2!")
        def list = ["Html/Css", "Javascript", "Angular"]
        empresa.setCompetencias(list)

        insere(empresa)

    }

    def static listar(){
        PessoaJuridicaDAO empresa = new PessoaJuridicaDAO()
        println(empresa.listar())
    }

    def static insere(PessoaJuridica empresa){
        PessoaJuridicaDAO empresaDAO = new PessoaJuridicaDAO()
        empresaDAO.inserir(empresa)

    }


}
