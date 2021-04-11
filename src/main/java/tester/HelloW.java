package tester;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class HelloW {

    @Option(name = "-i")
    private String input ;

    public static void main(String[] args) {

        HelloW helloW = new HelloW();

        CmdLineParser parser = new CmdLineParser(helloW);

        try {
            parser.parseArgument(args);
            } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            return;
        }

        System.out.println("c="+helloW.input);
    }
}
