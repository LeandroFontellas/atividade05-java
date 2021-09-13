package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.Mensagem;

public class GostariaDe extends Mensagem {

  public Mensagem mensagem;

  public GostariaDe (Mensagem mensagem) {
      this.mensagem = mensagem;
  }

  @Override
  public String getDescription() {
      return " gostaria de pedir " + mensagem.getDescription();
  }
}