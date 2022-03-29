"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class listaDePessoas {
    constructor(empresas, candidatos) {
        this.empresas = empresas;
        this.candidatos = candidatos;
    }
    cadastraEmpresa(empresa) {
        this.empresas.push(empresa);
    }
    cadastraCandidato(candidato) {
        this.candidatos.push(candidato);
    }
}
exports.default = listaDePessoas;
