import PessoaJuridica from "./pessoaJuridica";
import PessoaFisica from "./pessoaFisica";

export default class listaDePessoas{

    empresas: Array<PessoaJuridica>
    candidatos: Array<PessoaFisica>

    constructor(empresas: Array<PessoaJuridica>, candidatos: Array<PessoaFisica>){
        this.empresas = empresas
        this.candidatos = candidatos
    }

    cadastraEmpresa(empresa:PessoaJuridica){
        this.empresas.push(empresa)
    }

    cadastraCandidato(candidato:PessoaFisica){
        this.candidatos.push(candidato)
    }


}