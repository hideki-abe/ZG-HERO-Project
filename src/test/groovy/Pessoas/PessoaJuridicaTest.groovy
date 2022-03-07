package Pessoas

import ListaPessoas.ListaDePessoas
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class PessoaJuridicaTest {
    @Test
    void testCadastra() {
        println "Cadastrando..."
        ListaDePessoas lista = Mockito.mock(ListaDePessoas)
        List list = []

        PessoaJuridica pessoa = new PessoaJuridica("Empresa 1","empresa1@email.com",
                "00000000000", "Brasil", "Goiás", "00000000",
                "Descrição da empresa 1!")
        list = ["Pacote Adobe", "Cooperativismo", "Pontualidade"]
        pessoa.setCompetencias(list)

        println pessoa.getNome()

        pessoa.cadastra(lista.getEmpresas())

    }
}
