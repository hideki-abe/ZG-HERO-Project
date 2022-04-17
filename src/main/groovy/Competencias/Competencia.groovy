package Competencias

class Competencia {

    String nome

    public Competencia(){

    }

    public Competencia(String nome){
        this.nome = nome
    }

    @Override
    String toString() {
        return this.nome
    }
}
