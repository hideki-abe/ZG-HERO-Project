"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class PessoaJuridica {
    constructor(nome, email, cnpj, pais, estado, descricao, competencias) {
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
        this.pais = pais;
        this.estado = estado;
        this.descricao = descricao;
        this.competencias = competencias;
    }
}
exports.default = PessoaJuridica;
