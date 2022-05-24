package model.factory.pessoas

import model.dao.PessoaDAO

abstract class PessoaFactory {

    public abstract PessoaDAO createPessoa()

}
