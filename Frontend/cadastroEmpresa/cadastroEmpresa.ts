import PessoaJuridica from "../pessoas/pessoaJuridica.js"
import ListaDePessoas from "../pessoas/listaDePessoas.js"

const nome = <HTMLSelectElement>document.querySelector("#nome")
const email = <HTMLSelectElement>document.querySelector("#email")
const cnpj = <HTMLSelectElement>document.querySelector("#cnpj")
const pais = <HTMLSelectElement>document.querySelector("#pais")
const estado = <HTMLSelectElement>document.querySelector("#estado")
const cep = <HTMLSelectElement>document.querySelector("#cep")
const descricao = <HTMLSelectElement>document.querySelector("#descricao")
const competencias = <HTMLSelectElement>document.querySelector("#competencias")
let botaoCadastra = <HTMLElement>document.querySelector(".botao_cadastrar")
let link = document.querySelector("#link") as HTMLAnchorElement


botaoCadastra.addEventListener('click', () => {cadastraEmpresa()})

const lista = new ListaDePessoas([], [])

function validaEmpresa(novoNome:string, novoEmail:string, novoCnpj:string, 
    novoPais:string, novoEstado:string, novoCep:string, novaDescricao:string, novasCompetencias:Array<string>){

        const regexNome =  /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ][A-Z][a-z]+)*$/ // /[A-Z]{1}[a-z]{2,10} [A-Z]{1}[a-z]{2,10}/
        const regexEmail = /(\S+@\w+\.\w{2,6}(\.\w{2})?)/g
        const regexCnpj = /\d{3}\.?\d{3}\.?\d{3}-?\d{2}/
        const regexPais = /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$/
        const regexEstado = /(?=^.{2,60}$)^[A-Z][a-z]+(?:[ ](?:das?|dos?|de|e|[A-Z][a-z]+))*$/
        const regexCep = /^[0-9]{5}-?[0-9]{3}$/
        const regexDescricao = /\w{1,15}/g
        const regexComp = competencias.value.split(/,/)
    
        if(!regexNome.test(novoNome)){
            alert("Nome inválido!")
            return false
        }else if(!regexEmail.test(novoEmail)){
            alert("Email inválido!")
            return false
        }else if(!regexCnpj.test(novoCnpj)){
            alert("Cpf inválido!")
            return false
        }else if(!regexPais.test(novoPais){
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
            return true
        }
    
    
        
        //console.log(regexComp)
        //console.log(descricao.value.match(regexDescricao))
        //console.log(cep.value.match(regexCep))
        //console.log(estado.value.match(regexEstado))
        //console.log(idade.value.match(regexIdade))
        //console.log(cpf.value.match(regexCpf))
        //console.log(email.value.match(regexEmail))
        //console.log(nome.value.match(regexNome))
        //console.log("teste")
    }


    function cadastraEmpresa() {
        console.log("TESTE")
    
        let novoNome = nome.value
        let novoEmail = email.value
        let novoCnpj = cnpj.value
        let novoPais = pais.value
        let novoEstado = estado.value
        let novoCep = cep.value
        let novaDescricao = descricao.value
        let novasCompetencias = []
        novasCompetencias.push(competencias.value)
    
            const valida = validaEmpresa(novoNome, novoEmail, novoCnpj, novoPais, novoEstado, novoCep, novaDescricao, novasCompetencias);
    
            if(valida){
                const novaEmpresa = new PessoaJuridica(novoNome, novoEmail, novoCnpj, novoPais, novoEstado, novoCep, novaDescricao, novasCompetencias);
                lista.cadastraEmpresa(novaEmpresa)
                alert("Cadastro realizado com sucesso!")
            } 
           
    
    }
    export default function listaCandidatos() {
        console.log(lista)
    }
    console.log(lista.empresas)