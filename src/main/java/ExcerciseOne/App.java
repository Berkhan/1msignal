package ExcerciseOne;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Month;
import java.util.IntSummaryStatistics;

/**
 * Hello world!
 *
 */
public class App {

    private static final String jsonFilePath = System.getProperty("user.dir")+"\\json\\sample_1M.jsonl";


    @Option(name = "-field", usage="Option", required = true)
    public FIELD field;

    @Option(name = "-month", usage="Option", required = true)
    public String month;

    @Option(name = "-type", usage = "Option", required = true)
    public TYPE type;

    @Option(name = "-file", usage = "Option", required = true)
    public String file;


    private int run(String[] args) throws IOException {
        CmdLineParser p = new CmdLineParser(this);
        try {
            p.parseArgument(args);
            run();
            return 0;
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            p.printUsage(System.err);
            return 1;
        }

    }

    private void run() {
        try {
            Helper.printStats(file, field, Month.valueOf(month),type);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {

        System.exit(new App().run(args));


        //Helper.printStats(file, FIELD.content, Month.AUGUST,TYPE.Blog);



       /* int x = 0;
        Files.lines(Paths.get(jsonFilePath), StandardCharsets.US_ASCII)
                .map(Article::getMonth)
                .distinct()
                .forEach(System.out::println);*/

        /*Files.lines(Paths.get(jsonFilePath), StandardCharsets.UTF_8)
                .map(new JSonMapper())
                .filter(new TypeFilter(TYPE.Blog))
                .filter(new MonthFilter(Month.AUGUST))
                .map(new FieldSelector(FIELD.content))
                .forEach(new Writerrr());
            */


    }
}
