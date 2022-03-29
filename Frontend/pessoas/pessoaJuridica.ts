export default class PessoaJuridica{
    nome: string
    email: number
    cnpj: number
    pais: string
    estado: string
    descricao: string
    competencias: []


    constructor(nome: string, email: number, cnpj: number, pais: string, estado:string,
        descricao: string, competencias: []){
        this.nome = nome
        this.email = email
        this.cnpj = cnpj
        this.pais = pais
        this.estado = estado
        this.descricao = descricao
        this.competencias = competencias
    }

}