public class Recursion {
    static int count = 0;

    static void one() {
//        if (count == 4) return;
//        System.out.println(count);
//        count++;
        System.out.println(1);
        one();
    }
    static void name(int i, int n) {
        if (i > n) return;
        else {
            System.out.println("name");
            i++;
            name(i, n);
        }
    }
    static void number(int j, int n) {
        if (j > n) return;
        else {
            System.out.println(j);
            j++;
            number(j, n);
        }
    }
    static void revNum(int i, int n) {
        if (i < 1) return;
        else {
            System.out.println(i);
            revNum(i - 1, n);
        }
    }
    static void numBack(int i, int n){
        if (i<1) return;
        numBack(i-1,n);
        System.out.println(i);
    }
    static void revNumBack(int i, int n){
        if(i > n) return;
        revNumBack(i + 1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
//        one();
//        name(1, 100);
//        number(1, 100);
//        revNum(10, 10);
//        numBack(10, 10);
        revNumBack(1,30);
    }
}
