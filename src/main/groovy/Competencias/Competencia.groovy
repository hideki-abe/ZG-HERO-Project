package Competencias

class Competencia {

    String nome

    public Competencia(String nome){
        this.nome = nome
    }

    public Competencia(){

    }

    @Override
    String toString() {
        return this.nome
    }
}
