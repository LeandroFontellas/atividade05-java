package composite_decorator_exercise.concrete_classes;

import composite_decorator_exercise.abstract_classes.Mensagem;

public class Cartao extends Mensagem {
  @Override
  public String getDescription(){
    return description;
  }
}
