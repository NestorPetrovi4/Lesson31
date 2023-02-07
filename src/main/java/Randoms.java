import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    final int min;
    final int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return max - min > 0;
            }

            @Override
            public Integer next() {
                int diff = max - min;
                int i = random.nextInt(diff + 1);
                i += min;
                return i;
            }
        };
    }
}
