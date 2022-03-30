import ListaDePessoas from "../pessoas/listaDePessoas.js";

const nome = <HTMLSelectElement>document.querySelector(".nome")
const email = <HTMLSelectElement>document.querySelector(".email")
const cpf = <HTMLSelectElement>document.querySelector(".cpf")
const idade = <HTMLSelectElement>document.querySelector(".idade")
const estado = <HTMLSelectElement>document.querySelector(".estado")
const cep = <HTMLSelectElement>document.querySelector(".cep")
const descricao = <HTMLSelectElement>document.querySelector(".descricao")
const competencias = <HTMLSelectElement>document.querySelector(".competencias")
const botaoLike = <HTMLSelectElement>document.querySelector(".botao_like")
const botaoDeslike = <HTMLSelectElement>document.querySelector(".botao_deslike")

const lista = new ListaDePessoas([],[])

console.log(lista)

botaoLike.addEventListener("click", ()=> trocaCandidato())
botaoDeslike.addEventListener("click", ()=> trocaCandidato())

trocaCandidato()

function trocaCandidato(){
    var numAleatorio:number = Math.floor(Math.random()*lista.candidatos.length)
    
    nome.textContent = "Nome: " + lista.candidatos[numAleatorio].nome
    email.textContent = "Email: " + lista.candidatos[numAleatorio].email
    cpf.textContent = "Cpf: " + lista.candidatos[numAleatorio].cpf
    idade.textContent = "Idade: " + lista.candidatos[numAleatorio].idade
    estado.textContent = "Estado: " + lista.candidatos[numAleatorio].estado
    cep.textContent = "Cep: " + lista.candidatos[numAleatorio].cep
    descricao.textContent = "Descrição: " + lista.candidatos[numAleatorio].descricao
    competencias.textContent = "Competências: " + lista.candidatos[numAleatorio].competencias

}
