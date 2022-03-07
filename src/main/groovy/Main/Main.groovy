package Main

import ListaPessoas.ListaDePessoas
import Pessoas.Pessoa
import Pessoas.PessoaFisica
import Pessoas.PessoaJuridica

/*
  @Author Lucas Hideki Abe
 */
class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in)

        ListaDePessoas lista = new ListaDePessoas();


        //verifica se a pessoa é física ou jurídica
        def pessoa = verificaPessoa(sc)
        //função que realiza cadastro caso a pessoa queira
        cadastro(sc, pessoa, lista)

        if(pessoa.contains("candidato")){
            def x = 's'
            loop:
            for(;;){
                if(x == 's'){
                    Random random = new Random()
                    int num = lista.empresas.size()
                    num = random.nextInt(num)
                    PessoaJuridica empresa = lista.empresas.get(num)

                    println empresa

                    println "Dar like na empresa? [s/n]"

                    def like = sc.nextLine()
                    if(0){
                        //codigo para curtidas aqui
                    }

                    println "Deseja continuar? [s/n]"
                    x = sc.nextLine().toLowerCase()


                    while(!x.equals("s") && !x.equals("n")){
                        println "Resposta inválida! Digite novamente!"
                        x = sc.nextLine().toLowerCase()
                    }



                }else {
                    println "Fim de programa"
                    break loop
                }


            }

        }
        if(pessoa.contains("empresa")){
            def x = 's'
            loop:
            for(;;){
                if(x == 's'){
                    Random random = new Random()
                    int num = lista.candidatos.size()
                    num = random.nextInt(num)
                    PessoaFisica candidato = lista.candidatos.get(num)


                    println candidato

                    println "Dar like no candidato? [s/n]"

                    def like = sc.nextLine()
                    if(0){
                        //codigo para curtidas aqui
                    }

                    println "Deseja continuar? (s/n)"
                    x = sc.nextLine().toLowerCase()


                    while(!x.equals("s") && !x.equals("n")){
                        println "Resposta inválida! Digite novamente!"
                        x = sc.nextLine().toLowerCase()
                    }



                }else {
                    println "Fim de programa"
                    break loop
                }
            }
        }
        //Para conferir se o cadastro foi bem sucedido
        lista.listaCandidatos()
        //lista.listaEmpresas()

        sc.close()
    }

    static cadastro(Scanner sc, String pessoa, ListaDePessoas lista){
        println "Deseja realizar o cadastro? [s/n]"
        def cadastro = sc.nextLine().toLowerCase()
        while(!cadastro.equals("s") && !cadastro.equals("n")){
            println "Resposta inválida! Digite novamente!"
            cadastro = sc.nextLine().toLowerCase()
        }
        if(cadastro.equals("n")) return

        if(pessoa.contains("candidato")){
            println "Cadastro de novo candidato: "
            print "Nome:"
            def nome = sc.nextLine()
            print "Email:"
            def email = sc.nextLine()
            print "Cpf: "
            def cpf = sc.nextLine()
            print "Idade:"
            def idade = sc.nextInt()
            sc.nextLine()
            print "Estado:"
            def estado = sc.nextLine()
            print "Cep:"
            def cep = sc.nextLine()
            print "Descrição:"
            def descricao = sc.nextLine()
            //print "Competências: "
            //def competencias = sc.nextLine()

            PessoaFisica candidato = new PessoaFisica(nome, email, cpf,
                    idade, estado, cep, descricao, null)
            candidato.cadastra(lista.getCandidatos())

        }
        if(pessoa.contains("empresa")){
            println "Cadastro de nova empresa: "
            print "Nome:"
            def nome = sc.nextLine()
            print "Email:"
            def email = sc.nextLine()
            print "Cnpj: "
            def cnpj = sc.nextLine()
            print "País:"
            def pais = sc.nextLine()
            print "Estado:"
            def estado = sc.nextLine()
            print "Cep:"
            def cep = sc.nextLine()
            print "Descrição:"
            def descricao = sc.nextLine()
            //print "Competências: "
            //def competencias = sc.nextLine()

            PessoaJuridica empresa = new PessoaJuridica(nome, email, cnpj,
                    pais, estado, cep, descricao, null)
            empresa.cadastra(lista.getEmpresas())
        }

    }

    static verificaPessoa(Scanner sc){
        println "Você é um candidato ou uma empresa?"
        def pessoa = sc.nextLine().toLowerCase()

        while(!pessoa.contains("candidato") && !pessoa.contains("empresa")){
            println "Resposta inválida! Digite novamente!"
            pessoa = sc.nextLine().toLowerCase()
        }
        return pessoa
    }

}
