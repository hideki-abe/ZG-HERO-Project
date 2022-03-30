import PessoaFisica from "../pessoas/pessoaFisica.js";
import ListaDePessoas from "../pessoas/listaDePessoas.js";
const nome = document.querySelector("#nome");
const email = document.querySelector("#email");
const cpf = document.querySelector("#cpf");
const idade = document.querySelector("#idade");
const estado = document.querySelector("#estado");
const cep = document.querySelector("#cep");
const descricao = document.querySelector("#descricao");
const competencias = document.querySelector("#competencias");
let botaoCadastra = document.querySelector(".botao_cadastrar");
botaoCadastra.addEventListener('click', () => { cadastraCandidato(); });
const lista = new ListaDePessoas([], []);
function cadastraCandidato() {
    let novoNome = nome.value;
    let novoEmail = email.value;
    let novoCpf = cpf.value;
    let novaIdade = idade.value;
    let novoEstado = estado.value;
    let novoCep = cep.value;
    let novaDescricao = descricao.value;
    let novasCompetencias = [];
    novasCompetencias.push(competencias.value);
    console.log("novoNome");
    const novoCandidato = new PessoaFisica(novoNome, novoEmail, novoCpf, novaIdade, novoEstado, novoCep, novaDescricao, novasCompetencias);
    lista.cadastraCandidato(novoCandidato);
}
export default function listaCandidatos() {
    console.log("Estou funcionando!");
    console.log(lista);
}
listaCandidatos();
