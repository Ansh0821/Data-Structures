class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DLL {
    private static Node arr2Dll(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        tail.back = null;
        prev.next = null;

        return head;
    }

    private static Node deleteKth(Node head, int k) {
        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            if (cnt == k) break;

            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        } else {
            prev.next = front;
            front.back = prev;
            temp.back = null;
            temp.next = null;
        }
        return head;
    }

    private static Node insertBeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node insertBeforeTail(Node head, int val) {
        if (head.next == null) {
            insertBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);

        prev.next = newNode;
        tail.back = newNode;

        return head;
    }

    private static Node insertBeforeKth(Node head, int val, int k) {
        if (k == 1) {
            insertBeforeHead(head, val);
        }

        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 8, 15, 20, 25};
        Node head = arr2Dll(arr);
        print(head);
        System.out.println();
//        head = deleteHead(head);
//        head = deleteTail(head);
//        head = deleteKth(head, 2);
//        head = insertBeforeHead(head, 56);
//        head = insertBeforeTail(head, 22);
        head = insertBeforeKth(head, 11, 3);
        print(head);
    }
}
