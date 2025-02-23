package collections.list;

public class LinkedListScratch {
    Node head;
    int size;

    // static so that main can access it
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     // -------------------- methods --------------- //
    public int getSize() {
        return size;
    }

    public void add(int newData) {
        // create a new node
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        ++size;
    }

    public void addFirst(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        ++size;
    }

    public boolean remove(int key) {
        if (head == null) {
            return false;
        }

        if (head.data == key ) {
            head = head.next;
            return true;
        }

        Node curr = head;
        Node prev = null;
        while(curr.next != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.next == null) {
            return false;
        }

        prev.next = curr.next;
        --size;
        return true;
    }


    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            head = head.next;
            --size;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node curr = head;

            while(curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
        --size;
    }

    // Get element at a specific index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void printList() {
        if (head != null) {
            Node curr = head;
            while(curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        LinkedListScratch list = new LinkedListScratch();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.printList(); // 5 -> 10 -> 20 -> 30 -> null

        list.removeFirst();
        list.printList(); // 10 -> 20 -> 30 -> null

        list.removeLast();
        list.printList(); // 10 -> 20 -> null
    }
}
