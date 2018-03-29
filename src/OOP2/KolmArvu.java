package OOP2;

public class KolmArvu {

    static int ylesanne4(int a, int b){
        return a+b;
    }
    static double ylesanne4(double a){
        return Math.round(a*a);
    }
    static void ylesanne4(String[] args, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(args);
        }
    }

    static void valjasta(int a, int b, double c, String[] args){
        System.out.println("Antud arvud: " + a + ", " + b + ", " + c);

            }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        double z = 3.5;
        int m = 3;
        String[] s = {"tere"};
        valjasta(x, y, z, s);
        System.out.println("Summa: " + ylesanne4(x,y) + " Ruut:" + ylesanne4(z));
        ylesanne4(s,m);

    }
}
