package factory.pessoas

import dao.pessoas.JDBCPessoaJuridicaDAO
import dao.pessoas.PessoaDAO

class PessoaJuridicaCC extends PessoaFactory{

    @Override
    PessoaDAO createPessoa() {
        return new JDBCPessoaJuridicaDAO()
    }
}
