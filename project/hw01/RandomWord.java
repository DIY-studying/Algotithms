import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String word = "";
        while (!StdIn.isEmpty())
        {
            String cache = StdIn.readString();
            if (StdRandom.bernoulli(1/(double) i))
                word = cache;
            i++;
        }
        StdOut.println(word);
    }
}
