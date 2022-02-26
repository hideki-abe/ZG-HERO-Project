package Pessoas

import groovy.transform.Canonical

@Canonical
class PessoaFisica implements Pessoa{

    String nome
    String email
    def cpf
    int idade
    String estado
    def cep
    String descricao
    List<String> competencias = []


    @Override
    public String toString() {
        return "Candidato: \n" +
                "--------------------- \n" +
                "Nome: " + nome + '\n' +
                "Email: " + email + '\n' +
                "Cpf: " + cpf + '\n' +
                "Idade: " + idade + '\n' +
                "Estado: " + estado + '\n' +
                "Cep: " + cep + '\n' +
                "Descrição: " + descricao + '\n' +
                "Competências: " + competencias +
                "\n--------------------- \n"
                ;
    }

    @Override
    def cadastra(List lista) {
        lista.add(new PessoaFisica(this.nome, this.email, this.cpf,
                this.idade, this.estado, this.cep, this.descricao, this.competencias))
        println "Cadastro realizado com sucesso!\n"
    }

}
