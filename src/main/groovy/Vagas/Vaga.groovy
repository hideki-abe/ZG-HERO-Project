package Vagas

class Vaga {

    String nome
    String desc
    String lugar
    int id_empresas
    int id_competencais

    public Vaga(){

    }

    public Vaga(String nome, String descricao, String lugar, int id_empresas, int id_competencias){
        this.nome = nome
        this.desc = descricao
        this.lugar = lugar
        this.id_empresas = id_empresas
        this.id_competencais = id_competencias
    }

    @Override
    String toString() {
        return this.nome + "\n " + this.desc + "\n" + this.lugar + "\n"
    }
}
