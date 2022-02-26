package ListaPessoas

import Pessoas.PessoaFisica
import Pessoas.PessoaJuridica

class ListaDePessoas {

    ArrayList<PessoaFisica> candidatos = new ArrayList<>()
    ArrayList<PessoaJuridica> empresas = new ArrayList<>()

    //Construtor que popula automaticamente os arrays ao inicializar
    ListaDePessoas(){
        populaEmpresas()
        populaCandidatos()

    }

    def listaCandidatos(){
        println this.candidatos
    }

    def listaEmpresas(){
        println this.empresas
    }

    //Método para popular o Array de Candidatos simulando um Banco de Dados
    def populaCandidatos(){

        List list = []

        PessoaFisica pessoa1 = new PessoaFisica("João","joao@email.com",
                "00000000000", 20, "Goiás", "00000000",
                "Goiano com muita vontade de trabalhar!")
        list = ["Java", "Spring Framework", "React"]
        pessoa1.setCompetencias(list)


        PessoaFisica pessoa2 = new PessoaFisica("Maria","maria@email.com",
                "11111111111", 30, "São Paulo", "11111111",
                "Paulista com muita vontade de trabalhar!")
        list = ["Javascript", "React", "Angular"]
        pessoa2.setCompetencias(list)

        PessoaFisica pessoa3 = new PessoaFisica("Ricardo","ricardo@email.com",
                "22222222222", 35, "São Paulo", "22222222",
                "Paulista com muita vontade de trabalhar")
        list = ["Javascript", "Html", "Css"]
        pessoa3.setCompetencias(list)

        PessoaFisica pessoa4 = new PessoaFisica("Luana","luana@email.com",
                "33333333333", 40, "Minas Gerais", "33333333",
                "Mineira com muita vontade de trabalhar")
        list = ["Web Designer", "Javascript", "Html/Css", "Bootstrap"]
        pessoa4.setCompetencias(list)

        PessoaFisica pessoa5 = new PessoaFisica("Lucas","lucas@email.com",
                "44444444444", 24, "Goiás", "74455050",
                "Goiano com muita vontade de trabalhar")
        list = ["Javascript", "Angular", "Html/Css"]
        pessoa5.setCompetencias(list)

        this.candidatos << pessoa1
        this.candidatos << pessoa2
        this.candidatos << pessoa3
        this.candidatos << pessoa4
        this.candidatos << pessoa5


    }

    //Método para popular o Array de Empresas simulando um Banco de Dados
    def populaEmpresas(){

        List list = []

        PessoaJuridica empresa1 = new PessoaJuridica("Empresa 1","empresa1@email.com",
                "00000000000", "Brasil", "Goiás", "00000000",
                "Descrição da empresa 1!")
        list = ["Pacote Adobe", "Cooperativismo", "Pontualidade"]
        empresa1.setCompetencias(list)


        PessoaJuridica empresa2 = new PessoaJuridica("Empresa2","empresa2@email.com",
                "11111111111", "Brasil", "São Paulo", "11111111",
                "Descrição da empresa 2!")
        list = ["Html/Css", "Javascript", "Angular"]
        empresa2.setCompetencias(list)

        PessoaJuridica empresa3 = new PessoaJuridica("Empresa3","empresa3@email.com",
                "22222222222", "Brasil", "São Paulo", "22222222",
                "Descrição da empresa 3")
        list = ["Javascript", "Html", "Css"]
        empresa3.setCompetencias(list)

        PessoaJuridica empresa4 = new PessoaJuridica("Empresa4","empresa4@email.com",
                "33333333333", "Brasil", "Minas Gerais", "33333333",
                "Descrição da empresa 4")
        list = ["Web Designer", "Javascript", "Html/Css", "Bootstrap"]
        empresa4.setCompetencias(list)

        PessoaJuridica empresa5 = new PessoaJuridica("Empresa5","empresa5@email.com",
                "44444444444", "Brasil", "Goiás", "74455050",
                "Descrição da empresa 5")
        list = ["Javascript", "Angular", "Html/Css"]
        empresa5.setCompetencias(list)

        this.empresas << empresa1
        this.empresas << empresa2
        this.empresas << empresa3
        this.empresas << empresa4
        this.empresas << empresa5



    }

}
