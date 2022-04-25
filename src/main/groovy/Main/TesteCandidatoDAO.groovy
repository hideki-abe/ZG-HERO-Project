package Main

import DAO.PessoaFisicaDAO
import Pessoas.PessoaFisica

class TesteCandidatoDAO {

    static void main(String[] args) {

        //INSERÇÃO DE CANDIDATOS

        List<String> competencia = new ArrayList<>()
        PessoaFisica candidato = new PessoaFisica("Alberto Sousa", "alberto@email.com",
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
        PessoaFisicaDAO candidatoDAO = new PessoaFisicaDAO()
        List<PessoaFisica> lista = candidatoDAO.listar()
        println(candidatoDAO.listar())
    }

    def static inserir(PessoaFisica candidato){
        PessoaFisicaDAO candidatoDAO = new PessoaFisicaDAO()
        candidatoDAO.inserir(candidato)

    }

    def static alterar(PessoaFisica candidato, String cpf){
        PessoaFisicaDAO candidatoDAO = new PessoaFisicaDAO()
        candidatoDAO.alterar(candidato, cpf)

    }

    def static remover(String cpf){
        PessoaFisicaDAO candidatoDao = new PessoaFisicaDAO()
        candidatoDao.remover(cpf)
    }

}
