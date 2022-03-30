import PessoaJuridica from "./pessoaJuridica.js";
import PessoaFisica from "./pessoaFisica.js";
export default class ListaDePessoas {
    constructor(empresas, candidatos) {
        this.empresas = empresas;
        this.candidatos = candidatos;
        this.populaEmpresas();
        this.populaCandidatos();
    }
    cadastraEmpresa(empresa) {
        this.empresas.push(empresa);
    }
    cadastraCandidato(candidato) {
        this.candidatos.push(candidato);
    }
    populaEmpresas() {
        const empresa1 = new PessoaJuridica("Empresa 1", "empresa1@email.com", "12345678", "Brasil", "Goiaś", "Empresa que procura desenvolvedores pleno/senior. Salário: 1 pão de queijo. (Remoto)", ["Javascript", "Typescript"]);
        const empresa2 = new PessoaJuridica("Empresa 2", "empresa2@email.com", "12345678", "Brasil", "Mato-Grosso", "Empresa procura aprendizes. Salário: Aprendizado (Presencial)", ["Python", "Go"]);
        const empresa3 = new PessoaJuridica("Empresa 3", "empresa3@email.com", "12345678", "Brasil", "São Paulo", "Empresa procura desenvolvedor senior com 30 anos de experiência.(Remoto)", ["Java", "Groovy"]);
        const empresa4 = new PessoaJuridica("Empresa 4", "empresa4@email.com", "12345678", "Brasil", "Rio de Janeiro", "Procuramos desenvolvedor front-end focado no design.(Remoto)", ["Html", "Css", "Javascript"]);
        const empresa5 = new PessoaJuridica("Empresa 5", "empresa5@email.com", "12345678", "Brasil", "Goiaś", "Procuro dev Full Stack (Presencial)", ["Javascript ", "Typescript ", "Html", "Css", "Python", "Php"]);
        this.empresas.push(empresa1);
        this.empresas.push(empresa2);
        this.empresas.push(empresa3);
        this.empresas.push(empresa4);
        this.empresas.push(empresa5);
    }
    populaCandidatos() {
        const pessoa1 = new PessoaFisica("Pessoa 1", "pessoa1@email.com", "12345678", "18", "Goiaś", "123456789", "Iniciante em programação. Sem experiência.", ["Javascript", "Typescript"]);
        const pessoa2 = new PessoaFisica("Pessoa 2", "pessoa2@email.com", "12345678", "22", "Rio de Janeiro", "123456789", "Procuro emprego remoto. Sou dev pleno", ["Java", "Groovy"]);
        const pessoa3 = new PessoaFisica("Pessoa 3", "pessoa3@email.com", "12345678", "30", "Santa Catarina", "123456789", "Estudante da UFG procurando estágio", ["Python", "GO"]);
        const pessoa4 = new PessoaFisica("Pessoa 4", "pessoa4@email.com", "12345678", "55", "Acre", "123456789", "Procuro emprego CLT, sou senior. Pretensão salarial: R$10.000,00", ["Html", "Css", "Javascript", "Impressoras"]);
        const pessoa5 = new PessoaFisica("Pessoa 5", "pessoa5@email.com", "12345678", "43", "Bahia", "123456789", "Preciso de um emprego, por favor!!!", ["Fortran", "Portugol"]);
        this.candidatos.push(pessoa1);
        this.candidatos.push(pessoa2);
        this.candidatos.push(pessoa3);
        this.candidatos.push(pessoa4);
        this.candidatos.push(pessoa5);
    }
}
