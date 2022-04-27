package main


import dao.pessoas.PessoaDAO
import factory.pessoas.PessoaFisicaCC
import model.Pessoas.Pessoa
import model.Pessoas.PessoaFisica

class TesteCandidatoDAO {

    static void main(String[] args) {

        listagem()

        //INSERÇÃO DE CANDIDATOS
        List<String> competencia = new ArrayList<>()
        Pessoa candidato = new PessoaFisica("Alberto Sousa", "alberto@email.com",
                "11111", 30, "Brasil", "74455050", "Estudante de TI", null)
        competencia.add("React")
        inserir(candidato)

        //LISTAGEM DE CANDIDATOS
        listagem()

        //UPDATE
        PessoaFisica novoCandidato = new PessoaFisica("Alberto Silva", "alberto123@email.com",
                "12345678", 30, "EUA", "74455050", "Estudante de TI", null)
        alterar(novoCandidato, "11111")

        //LISTAGEM DE CANDIDATOS
        listagem()

        //REMOÇÃO DE CANDIDATOS
        remover("12345678")

    }

    def static listagem(){
        PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()
        println(candidatoDAO.listar())
    }

    def static inserir(Pessoa candidato){
        PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()
        candidatoDAO.inserir(candidato)

    }

    def static alterar(PessoaFisica candidato, String cpf){
        PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()
        candidatoDAO.alterar(candidato, cpf)

    }

    def static remover(String cpf){
        PessoaDAO candidatoDAO = new PessoaFisicaCC().createPessoa()
        candidatoDAO.remover(cpf)
    }

}
