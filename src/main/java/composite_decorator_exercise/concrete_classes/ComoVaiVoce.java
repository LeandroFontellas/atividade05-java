package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.Mensagem;

public class ComoVaiVoce extends Mensagem {

  public Mensagem mensagem;

  public ComoVaiVoce (Mensagem mensagem) {
      this.mensagem = mensagem;
  }

  @Override
  public String getDescription() {
      return " como vai você? " + mensagem.getDescription();
  }
}
