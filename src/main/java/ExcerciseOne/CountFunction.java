package ExcerciseOne;

import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

public class CountFunction implements ToIntFunction<String> {

    private static final Pattern pattern = Pattern.compile("\\s+");

    @Override
    public int applyAsInt(String value) {
        return pattern.split(value).length;
    }
}
