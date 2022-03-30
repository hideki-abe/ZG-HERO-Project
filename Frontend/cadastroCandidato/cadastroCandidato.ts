import PessoaFisica from "../pessoas/pessoaFisica.js"
import ListaDePessoas from "../pessoas/listaDePessoas.js"

const nome = <HTMLSelectElement>document.querySelector("#nome")
const email = <HTMLSelectElement>document.querySelector("#email")
const cpf = <HTMLSelectElement>document.querySelector("#cpf")
const idade = <HTMLSelectElement>document.querySelector("#idade")
const estado = <HTMLSelectElement>document.querySelector("#estado")
const cep = <HTMLSelectElement>document.querySelector("#cep")
const descricao = <HTMLSelectElement>document.querySelector("#descricao")
const competencias = <HTMLSelectElement>document.querySelector("#competencias")
let botaoCadastra = <HTMLElement>document.querySelector(".botao_cadastrar")


botaoCadastra.addEventListener('click', () => {cadastraCandidato()})

const lista = new ListaDePessoas([], [])

function cadastraCandidato(){

    let novoNome = nome.value
    let novoEmail = email.value
    let novoCpf = cpf.value
    let novaIdade = idade.value
    let novoEstado = estado.value
    let novoCep = cep.value
    let novaDescricao = descricao.value
    let novasCompetencias: Array<string> = []
    novasCompetencias.push(competencias.value)

    console.log("novoNome")
    const novoCandidato = new PessoaFisica(novoNome, novoEmail, novoCpf, novaIdade, 
        novoEstado, novoCep, novaDescricao, novasCompetencias)    

    lista.cadastraCandidato(novoCandidato)

}

export default function listaCandidatos(){
    console.log("Estou funcionando!")
    console.log(lista)
}

listaCandidatos()
