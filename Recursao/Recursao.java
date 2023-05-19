public class Recursao {
    static int fib (int n) {
        if (n<=1) return 1;

        return fib(n-1) + fib(n-2);
    }

    static int fatorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * fatorial(n - 1);
        }
    }


    public static void main(String[] args) {
        for(int i = 0; i<30; i++) {
            System.out.println("fib em " + i + " = " + fib(i));
        }

        for(int i = 0; i < 30; i++) {
            System.out.println("Fatorial em " + i + " = " + fatorial(i));
        }
    }
}
