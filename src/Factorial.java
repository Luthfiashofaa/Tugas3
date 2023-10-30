import java.util.Scanner;

public class Factorial{
    /**
     *
     * @param n
     * @return rumus faktorial
     */
    public static int hitungFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*hitungFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        /**
         * Menginputkan nilai yang ingin dicari hasil faktorialnya
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin difaktorialkan: ");
        int angka = sc.nextInt();

        int faktorial = hitungFactorial(angka);

        System.out.println("Hasil faktorial: "+faktorial);

        System.out.println("....");

    }

}