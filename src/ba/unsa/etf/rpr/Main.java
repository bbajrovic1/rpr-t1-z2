package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = in.nextInt();
        System.out.println("Brojevi od 1 do " + n + " djeljivi sa sumom svojih cifara su: ");
        for(int i = 0; i <= n; i++) {
            if(i % sumaCifara(i) == 0)
                System.out.println(i + " ");
        }
    }

    public static int sumaCifara(int n) {
        int suma = 0;
        while(n != 0) {
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }
}
