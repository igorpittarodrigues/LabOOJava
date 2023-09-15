package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materia;

public class Caderno extends Produto {

  private Materia tipo;


  public Materia getTipo() {
    return tipo;
  }

  public void setTipo(Materia tipo) {
    this.tipo = tipo;
  }

  private Materia materia;

  @Override
  public double calcularFrete() {
    return (getPreco()*getQuantidade()*(1 + materia.getFator()));
  }
}
