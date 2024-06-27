package tarefa_m19;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;


public class Tarefa {

    public static void main(String[] args) {
        Class<?> clazz = Nomes.class;
        System.out.println(clazz);

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Annotation tabela = clazz.getAnnotation(Tabela.class);
            
            String nome = tabela.toString();
            System.out.println(nome);
        } else {
            System.out.println("Deu erro");
        }
    } 
}
