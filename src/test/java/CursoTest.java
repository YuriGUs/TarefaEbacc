import dao.CursoDAO;
import dao.ICursoDAO;
import domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDAO cursoDAO;

    public CursoTest() {
        cursoDAO = new CursoDAO();
    }

    @Test // cadastrando curso
    public void cadastrarTeste() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de java Backend");
        curso = cursoDAO.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());

    }
}
