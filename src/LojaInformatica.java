
public class LojaInformatica {
	public static void main(String[] args) {
        // Produtos individuais
        Produto mouse = new ProdutoIndividual("Mouse", 20);
        Produto teclado = new ProdutoIndividual("Teclado", 30);
        Produto monitor = new ProdutoIndividual("Monitor", 200);
        Produto impressora = new ProdutoIndividual("Impressora", 100);
        Produto cpu = new ProdutoIndividual("CPU", 300);
        Produto fonte = new ProdutoIndividual("Fonte", 50);
        Produto processador = new ProdutoIndividual("Processador", 150);
        Produto memoriaRam = new ProdutoIndividual("Memória RAM", 80);
        Produto hd = new ProdutoIndividual("HD", 100);
        Produto ssd = new ProdutoIndividual("SSD", 120);

        // Composições
        ProdutoComposite computador = new ProdutoComposite("Computador");
        computador.adicionarProduto(cpu);
        computador.adicionarProduto(memoriaRam);
        computador.adicionarProduto(hd);
        computador.adicionarProduto(ssd);
        computador.adicionarProduto(fonte);

        ProdutoComposite perifericos = new ProdutoComposite("Periféricos");
        perifericos.adicionarProduto(mouse);
        perifericos.adicionarProduto(teclado);
        perifericos.adicionarProduto(monitor);
        perifericos.adicionarProduto(impressora);
        
        ProdutoComposite pedido = new ProdutoComposite("Pedido");
        pedido.adicionarProduto(computador);
        pedido.adicionarProduto(perifericos);

        // Calculando o preço total do pedido
        double precoTotal = pedido.obterPrecoTotal();
        System.out.println("Preço total do pedido: R$" + precoTotal);

}
}
