public class MyLinkedList {


    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.print("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) System.out.print("->");
                else System.out.println();
            }
        }

    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) return newNode;
        else {
            Node temp = headNode;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return headNode;
        }
    }

    public static Node add(Node headNode, int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) return addToHead(headNode, value);
        else {
            Node temp = headNode;
            int count = 0;
            while (temp != null) {
                count++;
                if (count == index) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
            if (count < index) System.out.println("unable to add to LinkedList!");
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) return headNode.next;
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) return null;

        Node lastNode = headNode;
        Node preNode = null;

        while (lastNode.next != null) {
            preNode = lastNode;
            lastNode = lastNode.next;
        }
        if (preNode == null) return null;
        else {
            preNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAt(Node headNode, int index) {
        if (headNode == null) return null;
        if (index == 0) return removeAtHead(headNode);
        Node lastNode = headNode;
        Node preNode = null;
        int count = 0;
        while (lastNode.next != null) {
            count++;
            preNode = lastNode;
            lastNode = lastNode.next;
            if (count == index) {
                preNode.next = lastNode.next;
            }
        }
        if (count < index) System.out.println("index is higher than length");
        if (preNode == null) return null;
        return headNode;
    }

    public static Node reverse(Node headNode) {
        Node cur = headNode;
        while (cur != null && cur.next != null) {
            Node curnext = cur.next;
            cur.next = curnext.next;
            curnext.next = headNode;
            headNode = curnext;
        }
        return headNode;
    }
}


