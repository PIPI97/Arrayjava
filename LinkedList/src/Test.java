import javax.sound.midi.Soundbank;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList.Node n1 = new MyLinkedList.Node(1);
        MyLinkedList.Node n2 = new MyLinkedList.Node(2);
        MyLinkedList.Node n3 = new MyLinkedList.Node(3);
        MyLinkedList.Node n4 = new MyLinkedList.Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        MyLinkedList.printLinkedList(MyLinkedList.newlink(2, 3, 4, 5, 6, 7, 8, 9));
//        MyLinkedList.printLinkedList(n1);
//        System.out.println(MyLinkedList.size(n1));;
//      MyLinkedList.printLinkedList(MyLinkedList.reverse(n1));
//       MyLinkedList.printLinkedList( MyLinkedList.addToHead(n1,0));
//       MyLinkedList.printLinkedList( MyLinkedList.addToTail(n1,3));
//       MyLinkedList.printLinkedList( MyLinkedList.add(n1,5,99));
//       MyLinkedList.printLinkedList( MyLinkedList.removeAtHead(n1));
//        MyLinkedList.printLinkedList(MyLinkedList.removeAtTail(n1));
//        MyLinkedList.printLinkedList(MyLinkedList.removeAtTail(n1));
//      MyLinkedList.printLinkedList(MyLinkedList.removeAt(n1,1));

    }
}
