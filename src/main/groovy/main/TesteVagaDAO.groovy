package main


import dao.vaga.VagaDAO
import factory.vaga.VagaCC
import model.Vaga.Vaga

class TesteVagaDAO {
    static void main(String[] args) {

        //LISTANDO VAGAS
        listar()

        //INSERINDO VAGAS
        Vaga vaga = new Vaga("Engenheiro de Software", "Arquiteto de BD", "Goiânia", 1, 2)
        inserir(vaga)

        //ALTERANDO VAGA
        vaga.setNome("Data Scientist")
        alterar(vaga, "Engenheiro de Software")

        //REMOVENDO VAGA
        remover("Data Scientist")

    }

    def static listar(){
        VagaDAO vagasDAO = new VagaCC().createVagas()
        println(vagasDAO.listar())
    }

    def static inserir(Vaga vaga){
        VagaDAO vagasDAO = new VagaCC().createVagas()
        vagasDAO.inserir(vaga)
    }

    def static alterar(Vaga vaga, String nome){
        VagaDAO vagasDAO = new VagaCC().createVagas()
        vagasDAO.alterar(vaga, nome)
    }

    def static remover(String nome){
        VagaDAO vagasDAO = new VagaCC().createVagas()
        vagasDAO.remover(nome)
    }
}
