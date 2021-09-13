package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.*;

public class BoaNoite extends Mensagem {
  public Mensagem mensagem;

  public BoaNoite (Mensagem mensagem) {
      this.mensagem = mensagem;
  }

  @Override
  public String getDescription() {
      return "Boa noite papai noel, " + mensagem.getDescription();
  }
}