import dao.IMatriculaDAO;
import dao.MatriculaDAO;
import domain.Matricula;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest  {

    private IMatriculaDAO matriculaDAO;

    public MatriculaTest() {
        matriculaDAO = new MatriculaDAO();
    }

    @Test
    public void cadastrarMatriculaTeste() {
        Matricula mat = new Matricula();
        mat.setCodigo("A!");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat = matriculaDAO.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
    }
}
