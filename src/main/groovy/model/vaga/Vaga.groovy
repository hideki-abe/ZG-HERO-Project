package model.vaga

class Vaga {

    private String nome
    private String desc
    private String lugar
    private int id_empresas
    private int id_competencais

    public Vaga(){
    }

    public Vaga(String nome, String descricao, String lugar, int id_empresas, int id_competencias){
        this.nome = nome
        this.desc = descricao
        this.lugar = lugar
        this.id_empresas = id_empresas
        this.id_competencais = id_competencias
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getDesc() {
        return desc
    }

    void setDesc(String desc) {
        this.desc = desc
    }

    String getLugar() {
        return lugar
    }

    void setLugar(String lugar) {
        this.lugar = lugar
    }

    int getId_empresas() {
        return id_empresas
    }

    void setId_empresas(int id_empresas) {
        this.id_empresas = id_empresas
    }

    int getId_competencais() {
        return id_competencais
    }

    void setId_competencais(int id_competencais) {
        this.id_competencais = id_competencais
    }

    @Override
    String toString() {
        return "Vaga " + "\nNome: " + this.nome + "\nDescrição: " + this.desc + "\nLugar: " + this.lugar + "\n"
    }
}
