"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class PessoaFisica {
    constructor(nome, email, cpf, idade, estado, descricao, competencias) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.estado = estado;
        this.descricao = descricao;
        this.competencias = competencias;
    }
}
exports.default = PessoaFisica;
