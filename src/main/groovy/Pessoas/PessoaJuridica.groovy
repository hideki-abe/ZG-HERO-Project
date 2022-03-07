package Pessoas

import groovy.transform.Canonical

@Canonical
class PessoaJuridica implements Pessoa{

    String nome
    String email
    def cnpj
    String pais
    String estado
    def cep
    String descricao
    List<String> competencias = []


    @Override
    public String toString() {
        return "Empresa: \n" +
                "--------------------- \n" +
                "Nome: " + nome + '\n' +
                "Email: " + email + '\n' +
                "Cnpj: " + cnpj + '\n' +
                "País: " + pais + '\n' +
                "Estado: " + estado + '\n' +
                "Cep: " + cep + '\n' +
                "Descrição: " + descricao + '\n' +
                "Competências: " + competencias +
                "\n--------------------- \n"
        ;
    }

    @Override
    def cadastra(List lista) {
        lista.add(new PessoaJuridica(this.nome, this.email, this.cnpj,
                this.pais, this.estado, this.cep, this.descricao, this.competencias))
        println "Cadastro realizado com sucesso!\n"
    }
}
