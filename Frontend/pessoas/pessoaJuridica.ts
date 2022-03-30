export default class PessoaJuridica{
    nome: string
    email: string
    cnpj: any
    pais: string
    estado: string
    descricao: string
    competencias: Array<string>


    constructor(nome: string, email: string, cnpj: any, pais: string, estado:string,
        descricao: string, competencias: Array<string>){
        this.nome = nome
        this.email = email
        this.cnpj = cnpj
        this.pais = pais
        this.estado = estado
        this.descricao = descricao
        this.competencias = competencias
    }

}