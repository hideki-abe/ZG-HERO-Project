package Main

import DAO.VagasDAO
import Vagas.Vaga

class MainVagas {
    static void main(String[] args) {

        //LISTANDO VAGAS
        lista()

        //INSERINDO VAGAS
        Vaga vaga = new Vaga("Engenheiro de Software", "Arquiteto de BD", "Goiânia", 1, 2)
        inserir(vaga)

        //ALTERANDO VAGA
        vaga.setNome("Data Scientist")
        alterar(vaga, "Engenheiro de Software")

        //REMOVENDO VAGA
        remove("Data Scientist")

    }

    def static lista(){
        VagasDAO vagasDAO = new VagasDAO()
        println(vagasDAO.listar())
    }

    def static inserir(Vaga vaga){
        VagasDAO vagasDAO = new VagasDAO()
        vagasDAO.inserir(vaga)
    }

    def static alterar(Vaga vaga, String nome){
        VagasDAO vagasDAO = new VagasDAO()
        vagasDAO.alterar(vaga, nome)
    }

    def static remove(String nome){
        VagasDAO vagasDAO = new VagasDAO()
        vagasDAO.remover(nome)
    }
}
