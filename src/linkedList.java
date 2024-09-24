class Node1 {
    int data;
    Node1 next;

    Node1(int data, Node1 next, Node1 back) {
        this.data = data;
        this.next = next;
    }

    Node1(int data) {
        this.data = data;
        this.next = null;
    }

}

public class linkedList {
    private static Node1 arrToLl(int[] arr){
        Node1 head = new Node1(arr[0]);
        Node1 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthOfLl(Node1 head){
        int cnt = 0;
        Node1 temp = head;
        while (temp != null){
//            System.out.print(temp.data + " ");
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    private static int ifPresent(Node1 head, int val){
        Node1 temp = head;
        while (temp != null){
//            System.out.print(temp.data + " ");
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
//        Node y = new Node(arr[0]);
//        System.out.println(y.data);
        Node1 head = arrToLl(arr);
//        System.out.println(head.data);
//        Node temp = head; ----> TRAVERSAL
//        while (temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println(lengthOfLl(head));
        System.out.println(ifPresent(head, 15));
    }
}
