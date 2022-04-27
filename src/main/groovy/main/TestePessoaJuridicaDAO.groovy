package main


import dao.pessoas.PessoaDAO
import factory.pessoas.PessoaJuridicaCC
import model.Pessoas.PessoaJuridica

class TestePessoaJuridicaDAO {

    static void main(String[] args) {

        //LISTA EMPRESAS
        listar()

        //INSERE EMPRESA
        PessoaJuridica empresa1 = new PessoaJuridica("Empresa2","empresa2@email.com",
                "11111111111", "Brasil", "São Paulo", "11111111",
                "Descrição da empresa 2!", null)
        def list = ["Html/Css", "Javascript", "Angular"]
        empresa1.setCompetencias(list)
        inserir(empresa1)

        PessoaJuridica empresa2 = new PessoaJuridica("Creme Mel","empresa2@email.com",
                "11111111111", "Brasil", "Goiás", "11111111",
                "Descrição da Creme Mel!", null)
        list = ["Html/Css", "Javascript", "Angular"]
        empresa2.setCompetencias(list)

        //ALTERA EMPRESA
        alterar(empresa2,"11111111111")

        //REMOVE EMPRESA
        remover("11111111111")

    }

    def static listar(){
        PessoaDAO empresa = new PessoaJuridicaCC().createPessoa()
        println(empresa.listar())
    }

    def static inserir(PessoaJuridica empresa){
        PessoaDAO empresaDAO = new PessoaJuridicaCC().createPessoa()
        empresaDAO.inserir(empresa)

    }

    def static alterar(PessoaJuridica empresa, String cnpj){
        PessoaDAO empresaDAO = new PessoaJuridicaCC().createPessoa()
        empresaDAO.alterar(empresa, cnpj)

    }

    def static remover(String cnpj){
        PessoaDAO empresaDAO = new PessoaJuridicaCC().createPessoa()
        empresaDAO.remover(cnpj)
    }


}
