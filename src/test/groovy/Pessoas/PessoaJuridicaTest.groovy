package Pessoas

import ListaPessoas.ListaDePessoas
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class PessoaJuridicaTest {
    @Test
    void testCadastra() {
        println "Cadastrando..."
        ListaDePessoas lista = Mockito.mock(ListaDePessoas.class)

        PessoaJuridica pessoa = new PessoaJuridica()
        println pessoa.getNome()
        pessoa.cadastra(lista.getCandidatos())

        Assert.assertTrue(!lista.getCandidatos().isEmpty())

        println "Cadastro realizado com sucesso!"

    }
}
