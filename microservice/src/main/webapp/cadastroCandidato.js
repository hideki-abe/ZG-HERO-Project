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
let link = document.querySelector("#link");

const lista = new ListaDePessoas([], []);
console.log(link);
botaoCadastra.addEventListener('click', () => { cadastraCandidato(); });

function validaCandidato(novoNome, novoEmail, novoCpf, novaIdade, novoEstado, novoCep, novaDescricao, novasCompetencias) {
    const regexNome = /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ][A-Z][a-z]+)*$/;
    const regexEmail = /(\S+@\w+\.\w{2,6}(\.\w{2})?)/g;
    const regexCpf = /\d{3}\.?\d{3}\.?\d{3}-?\d{2}/;
    const regexIdade = /\d{2}/;
    const regexEstado = /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$/;
    const regexCep = /^[0-9]{5}-?[0-9]{3}$/;
    const regexDescricao = /\w{1,15}/g;

    if (!regexNome.test(novoNome)) {
        alert("Nome inválido!");
        return false;
    } else if (!regexEmail.test(novoEmail)) {
        alert("Email inválido!");
        return false;
    } else if (!regexCpf.test(novoCpf)) {
        alert("Cpf inválido!");
        return false;
    } else if (!regexIdade.test(novaIdade)) {
        alert("Idade inválida!");
        return false;
    } else if (!regexEstado.test(novoEstado)) {
        alert("Estado inválido!");
        return false;
    } else if (!regexCep.test(novoCep)) {
        alert("Cep inválido!");
        return false;
    } else if (!regexDescricao.test(novaDescricao)) {
        alert("Descrição inválida!");
    } else {

        return true;
    }
}
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
    const valida = validaCandidato(novoNome, novoEmail, novoCpf, novaIdade, novoEstado, novoCep, novaDescricao, novasCompetencias);
    if (valida) {
        const novoCandidato = new PessoaFisica(novoNome, novoEmail, novoCpf, novaIdade, novoEstado, novoCep, novaDescricao, novasCompetencias);
        lista.cadastraCandidato(novoCandidato);
        alert("Cadastro realizado com sucesso!");
    }
}
export default function listaCandidatos() {
    console.log(lista);
}
listaCandidatos();
