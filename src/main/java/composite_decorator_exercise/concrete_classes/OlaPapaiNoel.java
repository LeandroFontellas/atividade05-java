package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.*;

public class OlaPapaiNoel extends Mensagem {
  public Mensagem mensagem;

  public OlaPapaiNoel (Mensagem mensagem) {
      this.mensagem = mensagem;
  }

  @Override
  public String getDescription() {
      return "Ola Papai Noel " + mensagem.getDescription();
  }
}
