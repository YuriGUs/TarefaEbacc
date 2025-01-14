import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Curso;
import domain.Produto;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrarProduto() {
        Produto produto = new Produto();

        produto.setNome("Computador");
        produto.setDescricao("computador i5");
        produto.setPreco(2000d);
        produto.setDataCriacao(Instant.now());
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

    }
}
