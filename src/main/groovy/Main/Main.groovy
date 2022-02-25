package Main

import ListaPessoas.ListaDePessoas
import Pessoas.PessoaFisica
import Pessoas.PessoaJuridica

/*
  @Author Lucas Hideki Abe
 */
class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in)

        ListaDePessoas lista = new ListaDePessoas();

        println "Você é um candidato ou uma empresa?"
        def pessoa = sc.nextLine().toLowerCase()

        while(!pessoa.contains("candidato") && !pessoa.contains("empresa")){
            println "Resposta inválida! Digite novamente!"
            pessoa = sc.nextLine().toLowerCase()
        }

        if(pessoa.equals("candidato")){
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

        }else {
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

        sc.close()
    }

}
