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



}
