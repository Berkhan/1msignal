package ExcerciseOne;

import java.util.function.Function;

public class FieldSelector implements Function<Article, String> {

    FIELD field = null;

    public FieldSelector(FIELD field) {
        this.field = field;
    }

    @Override
    public String apply(Article article) {

        if(this.field.toString().equals(FIELD.content.toString()))
            return article.getContent();
        if (this.field.toString().equals(FIELD.title.toString()))
            return article.getTitle();
        else
            return null;
    }
}
