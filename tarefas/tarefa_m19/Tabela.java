package tarefa_m19;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Tabela {
    String value(); 
}
