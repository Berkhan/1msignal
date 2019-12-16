package ExcerciseOne;

import java.lang.reflect.Type;
import java.util.function.Predicate;;

public class TypeFilter implements Predicate<Article> {

    TYPE type = null;
    public TypeFilter(TYPE type) {
        this.type = type;
    }

    @Override
    public boolean test(Article article) {
        return article.getType().toString().equals(type.toString());
    }

}
