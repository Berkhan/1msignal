package ExcerciseOne;

import java.time.Month;
import java.util.function.Predicate;

public class MonthFilter implements Predicate<Article> {

    private Month month = null;

    public MonthFilter(Month month) {
        this.month = month;
    }

    @Override
    public boolean test(Article article) {
        return article.getMonth().toString().equals(this.month.toString());
    }

}
