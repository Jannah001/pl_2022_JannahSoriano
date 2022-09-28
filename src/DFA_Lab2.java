import java.util.Scanner;

public class DFA_Lab2 {
    public  static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int state;
        int trans;
        System.out.print("Enter No. of States: ");
        state = sc.nextInt();
        System.out.print("Enter No. of Transition: ");
        trans = sc.nextInt();

        int q[][] = new int[state][trans];
        System.out.println("Transition Table ");
        for (int x = 0; x < state; x++) {
            System.out.println("State " + (x));
            for (int y = 0; y < trans; y++) {
                q[x][y] = sc.nextInt();
            }
        }
        System.out.println("Enter input String: ");
        String a1;
        a1 = sc.next();
        String ip[] = a1.split(" ");

        int input[] = new int[ip.length];

        System.out.println("---------------------");
        int initial = 0;
        int current = initial;
        int fin = (state - 1);
        int inp, nextState;
        for (int f = 0; f < ip.length; f++) {
            initial = input[f];
            nextState = q[current][initial];
            if (f == (ip.length - 1))
                if (current != fin) {
                    System.out.println("ACCEPTED STRING!");
                } else {
                    System.out.println("NOT ACCEPTED STRING!");
                }
        }
    }
}
