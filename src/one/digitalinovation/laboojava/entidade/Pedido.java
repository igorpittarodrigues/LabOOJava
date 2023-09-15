package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a entidade pedido, qual é a compra dos produtos por um cliente.
 * @author thiago leite
 */
public class Pedido {

    //TODO Preencher esta classe

    //codigo
    private String codigo;
    //cliente
    private Cliente[] cliente;
    //produtos
    private List<Produto> produto;
    //total
    private int total;

    public Pedido(String codigo, Cliente cliente, Produto produto, int total) {
        this.codigo = codigo;
        this.cliente = new Cliente[]{cliente};
        this.produto = new ArrayList<>();
        this.total = total;
    }

    public Pedido() {

    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", cliente=" + cliente +
                ", produto=" + produto +
                ", total=" + total +
                '}';
    }
}
