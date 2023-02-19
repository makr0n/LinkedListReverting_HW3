import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedli = new LinkedList<String>();

        linkedli.add("Огонь");
        linkedli.add("Вода");
        linkedli.add("Земля");
        System.out.print("Элементы до реверсирования: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nЭлементы после реверсирования: " + linkedli);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {


            revLinkedList.add(llist.get(i));
        }

        return revLinkedList;
    }
}