package amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alex");
        linkedList.add("Alexa");
        linkedList.addFirst("Ali");
        ListIterator<String> nameList = linkedList.listIterator();
        while(nameList.hasNext()){
            System.out.println(nameList.next());
        }
        System.out.println();
        while(nameList.hasPrevious()){
            System.out.println(nameList.previous());
        }

    }

    private static void queues(){
        Queue<String> supermarket = new LinkedList<>();
        supermarket.add("Alex");
        supermarket.add("Mariam");
        supermarket.add("Ali");

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
}
