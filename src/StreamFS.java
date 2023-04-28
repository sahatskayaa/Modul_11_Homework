import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamFS {

    public static <T> Stream<T> zip (Stream <T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        List<T> list = new ArrayList<>();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            list.add(firstIterator.next());
            list.add(secondIterator.next());
        }

        return list.stream();
    }

}
