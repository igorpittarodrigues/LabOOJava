package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;

import java.util.Optional;

/**
 * Classe para manipular a entidade {@link Cliente}.
 * @author thiago leite
 */
public class ClienteNegocio {

    /**
     * {@inheritDoc}.
     */
    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para ter acesso aos clientes cadastrados
     */
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Consulta o cliente pelo seu CPF.
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado.
     */
    public Optional<Cliente> consultar(String cpf) {

        for(Cliente cliente : bancoDados.getCliente()) {
            if (cliente.getCpf().equals(cpf)) {
                return Optional.of(cliente);
            }

            }return Optional.empty();
    }

    /**
     * Cadastra um novo cliente.

     */
    //TODO Fazer a inclusão de cliente
    public void novoCliente(Cliente novoCliente){
        boolean clienteNovo=false;
        for(Cliente cliente : bancoDados.getCliente()){
            if(cliente.getNome().equals(novoCliente)){
                clienteNovo=true;
                break;
            }
        }
        if(!clienteNovo){
            bancoDados.adicionarCliente(novoCliente);
        }

    }

    /**
     * Exclui um cliente específico.

     */
    //TODO Fazer a exclusão de cliente

    public void excluirCliente(String cpf){
       int achado=-1;

        for(int i =0; i<bancoDados.getCliente().length; i++){
            Cliente cliente= bancoDados.getCliente()[i];
            if(cliente.getCpf().equals(cpf)){
                achado=i;
                break;
            }

        }
       if(achado!= -1){
           bancoDados.excluirCliente(achado);
       }





    }

}
