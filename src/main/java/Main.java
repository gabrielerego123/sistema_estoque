import edu.urfrn.webii.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Cliente cliente = new Cliente(1L, "cliente@gmail.com",  "Cliente 1", new Date(), "453434");
        Funcionario funcionario = new Funcionario(1L,"funcionario@gmail.com",  "Funcionario 1", new Date(), "453434" ,loja );

        Produto produto = new Produto();
        produto.setNome("Parafusos");
        produto.setPrecoVenda(10.00);
        produto.setUnidadeMedida("100 unidades");
        produto.setQuantidadeEstoque(400L);
        produto.setValorMinimoEstoque(100L);

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setFuncionario(funcionario);
        List<ItemVenda> itemVendaList = new ArrayList<ItemVenda>();
        ItemVenda itemVenda1 = new ItemVenda();
        itemVenda1.setDesconto(0.1);
        itemVenda1.setProduto(produto);
        itemVenda1.setQuantidade(200L);
        itemVendaList.add(itemVenda1);
        var valorSemDesconto = (produto.getPrecoVenda() *((double) itemVenda1.getQuantidade() /100));
        var desconto = (produto.getPrecoVenda() *itemVenda1.getDesconto())* itemVenda1.getDesconto();
        venda.setValorTotal(valorSemDesconto - desconto);
        venda.setFormaPagamento("DEBITO");
        venda.setStatus("CONCLUIDA");
        venda.setData(new Date());
        venda.setItens(itemVendaList);
        System.out.println(produto.toString());
        System.out.println(venda.toString());


    }
}