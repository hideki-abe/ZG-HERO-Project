import ListaDePessoas from "../pessoas/listaDePessoas.js";
const nome = document.querySelector(".nome");
const email = document.querySelector(".email");
const cpf = document.querySelector(".cpf");
const idade = document.querySelector(".idade");
const estado = document.querySelector(".estado");
const cep = document.querySelector(".cep");
const descricao = document.querySelector(".descricao");
const competencias = document.querySelector(".competencias");
const botaoLike = document.querySelector(".botao_like");
const botaoDeslike = document.querySelector(".botao_deslike");
const lista = new ListaDePessoas([], []);
console.log(lista);
botaoLike.addEventListener("click", () => trocaCandidato());
botaoDeslike.addEventListener("click", () => trocaCandidato());
trocaCandidato();
function trocaCandidato() {
    var numAleatorio = Math.floor(Math.random() * lista.candidatos.length);
    nome.textContent = "Nome: " + lista.candidatos[numAleatorio].nome;
    email.textContent = "Email: " + lista.candidatos[numAleatorio].email;
    cpf.textContent = "Cpf: " + lista.candidatos[numAleatorio].cpf;
    idade.textContent = "Idade: " + lista.candidatos[numAleatorio].idade;
    estado.textContent = "Estado: " + lista.candidatos[numAleatorio].estado;
    cep.textContent = "Cep: " + lista.candidatos[numAleatorio].cep;
    descricao.textContent = "Descrição: " + lista.candidatos[numAleatorio].descricao;
    competencias.textContent = "Competências: " + lista.candidatos[numAleatorio].competencias;
}
