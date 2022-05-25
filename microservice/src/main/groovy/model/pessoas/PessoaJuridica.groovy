package model.pessoas

import groovy.transform.Canonical

@Canonical
class PessoaJuridica implements Pessoa{

    private String nome
    private String email
    private def cnpj
    private String pais
    private String estado
    private def cep
    private String descricao

    PessoaJuridica(){
    }

    PessoaJuridica(String nome, String email, cnpj, String pais,
                   String estado, cep, String descricao) {
        this.nome = nome
        this.email = email
        this.cnpj = cnpj
        this.pais = pais
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    def getCnpj() {
        return cnpj
    }

    void setCnpj(cnpj) {
        this.cnpj = cnpj
    }

    String getPais() {
        return pais
    }

    void setPais(String pais) {
        this.pais = pais
    }

    String getEstado() {
        return estado
    }

    void setEstado(String estado) {
        this.estado = estado
    }

    def getCep() {
        return cep
    }

    void setCep(cep) {
        this.cep = cep
    }

    String getDescricao() {
        return descricao
    }

    void setDescricao(String descricao) {
        this.descricao = descricao
    }

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
                "\n--------------------- \n"
        ;
    }

}