package dao.competencias

import model.Competencia.Competencia

interface CompetenciaDAO {

    public List<Competencia> listar()
    public boolean inserir(Competencia comp)
    public boolean alterar(Competencia comp, String nome)
    public void remover(String nome)

}