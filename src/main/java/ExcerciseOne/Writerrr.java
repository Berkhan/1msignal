package ExcerciseOne;

import java.util.function.Consumer;

public class Writerrr implements Consumer<String> {

    @Override
    public void accept(String text) {
        System.out.println(text);
    }

    /*
    @Override
    public void accept(Article article) {
        System.out.println(article.getMonth() + " - " + article.getType() + " - " + article.getTitle());
    }*/
}
