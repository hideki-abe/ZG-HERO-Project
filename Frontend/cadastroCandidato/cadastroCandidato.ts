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
let link = document.querySelector("#link") as HTMLAnchorElement


const lista = new ListaDePessoas([], [])

console.log(link)

botaoCadastra.addEventListener('click', () => {cadastraCandidato()})

function validaCandidato(novoNome:string, novoEmail:string, novoCpf:string, 
    novaIdade:string, novoEstado:string, novoCep:string, novaDescricao:string, novasCompetencias:Array<string>){

        const regexNome =  /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ][A-Z][a-z]+)*$/ // /[A-Z]{1}[a-z]{2,10} [A-Z]{1}[a-z]{2,10}/
        const regexEmail = /(\S+@\w+\.\w{2,6}(\.\w{2})?)/g;
        const regexCpf = /\d{3}\.?\d{3}\.?\d{3}-?\d{2}/;
        const regexIdade = /\d{2}/;
        const regexEstado = /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$/
        const regexCep = /^[0-9]{5}-?[0-9]{3}$/
        const regexDescricao = /\w{1,15}/g
        const regexComp = competencias.value.split(/,/)

        link.href = "./cadastroCandidato.html"
        if(!regexNome.test(novoNome)){
            alert("Nome inválido!")
            return false
        }else if(!regexEmail.test(novoEmail)){
            alert("Email inválido!")
            return false
        }else if(!regexCpf.test(novoCpf)){
            alert("Cpf inválido!")
            return false
        }else if(!regexIdade.test(novaIdade)){
            alert("Idade inválida!")
            return false
        }else if(!regexEstado.test(novoEstado)){
            alert("Estado inválido!")
            return false
        }else if(!regexCep.test(novoCep)){
            alert("Cep inválido!")
            return false
        }else if(!regexDescricao.test(novaDescricao)){
            alert("Descrição inválida!")
        }
        else{
            link.href = "../perfilCandidato/perfilCandidato.html"
            return true
        }
    
        //console.log(regexComp)
        //console.log(descricao.value.match(regexDescricao))
        //console.log(cep.value.match(regexCep))
        //console.log(estado.value.match(regexEstado))
        //console.log(idade.value.match(regexIdade));
        //console.log(cpf.value.match(regexCpf));
        //console.log(email.value.match(regexEmail));
        //console.log(nome.value.match(regexNome));
        //console.log("teste");
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
    
            if(valida){
                const novoCandidato = new PessoaFisica(novoNome, novoEmail, novoCpf, novaIdade, novoEstado, novoCep, novaDescricao, novasCompetencias);
                lista.cadastraCandidato(novoCandidato);
                alert("Cadastro realizado com sucesso!")
            } 
           
    
    }
    export default function listaCandidatos() {
        console.log(lista);
    }
    listaCandidatos();
