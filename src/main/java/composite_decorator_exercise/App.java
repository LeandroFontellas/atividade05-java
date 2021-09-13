package composite_decorator_exercise;
import composite_decorator_exercise.abstract_classes.*;
import composite_decorator_exercise.concrete_classes.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main (String args[]) {
        Mensagem cartao = new Cartao();
        cartao = new UmAviao(cartao);
        cartao = new GostariaDe(cartao);
        cartao = new ComoVaiVoce(cartao);
        cartao = new BoaNoite(cartao);
        System.out.println(cartao.getDescription());
    }
}
