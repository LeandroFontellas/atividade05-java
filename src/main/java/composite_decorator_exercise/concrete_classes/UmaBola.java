package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.*;

public class UmaBola extends Mensagem {

  public Mensagem mensagem;

  public UmaBola (Mensagem mensagem) {
      this.mensagem = mensagem;
  }

  @Override
  public String getDescription() {
      return " uma bola de presente. " + mensagem.getDescription();
  }
}
