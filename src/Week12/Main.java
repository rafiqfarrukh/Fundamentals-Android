package Week12;
import java.util.*;
class QuenEmptyException extends Exception{}
class QuenFullException extends Exception{}

class Queue<E> {
    List<E> elements = new ArrayList<>();
    int size;


     Queue(int size) {
        this.size = size;
    }

    public void enqueue(E element) throws QuenFullException {
        if (elements.size() >= size) {
            throw new QuenFullException();
        }
        elements.add(element);
    }

    public E dequeue() throws QuenEmptyException {
        if (elements.size() == 0) {
            throw new QuenEmptyException();

        }
        return elements.remove(0);
    }
}




public class Main {
    public static void main(String[] args) {
        Queue<String> names = new Queue<>(3);
        try {
            names.enqueue("123");
            names.enqueue("456");
            System.out.println(names.dequeue());
            System.out.println(names.dequeue());
        }
        catch (QuenEmptyException | QuenFullException e){
            e.getStackTrace();
        }


    }
}
