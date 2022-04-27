package factory.pessoas

import dao.pessoas.PessoaDAO

abstract class PessoaFactory {

    public abstract PessoaDAO createPessoa()

}
