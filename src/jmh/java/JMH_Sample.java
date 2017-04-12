import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Created by anna on 12.04.17.
 */
public class JMH_Sample {
    @Benchmark

    public void wellHelloThere() {

        System.out.println("hello");

    }
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(JMH_Sample.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();

    }
}
