import java.util.ArrayList;
import java.util.List;

public class ProdutoComposite implements Produto {
	    private String nome;
	    private List<Produto> produtos = new ArrayList<>();

	    public ProdutoComposite(String nome) {
	        this.nome = nome;
	    }

	    public void adicionarProduto(Produto produto) {
	        produtos.add(produto);
	    }

	    public void removerProduto(Produto produto) {
	        produtos.remove(produto);
	    }
	    
	    @Override
	    public double obterPrecoTotal() {
	        double total = 0;
	        for (Produto produto : produtos) {
	            total += produto.obterPrecoTotal();
	        }
	        return total;
	    }

}
