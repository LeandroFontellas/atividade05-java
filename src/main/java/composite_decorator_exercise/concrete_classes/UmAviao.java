package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.*;

public class UmAviao extends Mensagem {

  public Mensagem mensagem;

  public UmAviao (Mensagem mensagem) {
      this.mensagem = mensagem;
  }

  @Override
  public String getDescription() {
      return " um avião de presente! " + mensagem.getDescription();
  }
}
