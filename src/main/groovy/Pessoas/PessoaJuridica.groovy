package Pessoas

import groovy.transform.Canonical

@Canonical
class PessoaJuridica {

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
        return "Candidato: \n" +
                "--------------------- \n" +
                "Empresa: " + nome + '\n' +
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

}
