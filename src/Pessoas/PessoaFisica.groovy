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





}
