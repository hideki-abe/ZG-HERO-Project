package Pessoas

import ListaPessoas.ListaDePessoas
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class PessoaFisicaTest {

    @Test
    void testCadastra() {
        println "Cadastrando..."
        ListaDePessoas lista = Mockito.mock(ListaDePessoas)
        List list = []

        PessoaFisica pessoa = new PessoaFisica("João","joao@email.com",
                "00000000000", 20, "Goiás", "00000000",
                "Goiano com muita vontade de trabalhar!")
        list = ["Java", "Spring Framework", "React"]
        pessoa.setCompetencias(list)

        println pessoa.getNome()

        pessoa.cadastra(lista.getEmpresas())

    }
}
