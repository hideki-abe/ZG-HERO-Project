package main


import model.dao.PessoaDAO
import model.factory.pessoas.PessoaJuridicaCC
import model.pessoas.PessoaJuridica

class TestePessoaJuridicaDAO {

    static void main(String[] args) {

        //LISTA EMPRESAS
        listar()

        //INSERE EMPRESA
        PessoaJuridica empresa1 = new PessoaJuridica("Empresa2","empresa2@email.com",
                "11111111111", "Brasil", "São Paulo", "11111111",
                "Descrição da empresa 2!")
        def list = ["Html/Css", "Javascript", "Angular"]
        inserir(empresa1)

        PessoaJuridica novaEmpresa = new PessoaJuridica("Creme Mel","empresa2@email.com",
                "11111111111", "Brasil", "Goiás", "11111111",
                "Descrição da Creme Mel!")
        list = ["Html/Css", "Javascript", "Angular"]

        //ALTERA EMPRESA
        alterar(novaEmpresa,"11111111111")

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
