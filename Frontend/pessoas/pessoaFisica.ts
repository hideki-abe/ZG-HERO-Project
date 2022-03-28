class PessoaFisica{
    nome: string
    email: number
    cpf: number
    idade: number
    estado: string
    descricao: string
    competencias: []


    constructor(nome: string, email: number, cpf: number, idade: number, estado:string,
        descricao: string, competencias: []){
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.idade = idade
        this.estado = estado
        this.descricao = descricao
        this.competencias = competencias
    }

}