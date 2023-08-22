import java.util.Scanner;
import java.lang.Math;

public class PR_algo1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama dari segitiga itu: ");
        int sisia = Integer.parseInt(kb.nextLine());
        System.out.print("Masukkan sisi kedua dari segitiga itu: ");
        int sisib = Integer.parseInt(kb.nextLine());
        System.out.print("Masukkan sisi ketiga dari segitiga itu: ");
        int sisic = Integer.parseInt(kb.nextLine());
        int pitagoras_a = (int) Math.sqrt(sisic*sisic + sisib*sisib);
        int pitagoras_b = (int) Math.sqrt(sisia*sisia + sisic*sisic);
        int pitagoras_c = (int) Math.sqrt(sisia*sisia + sisib*sisib);

        if (sisia == sisib & sisia == sisic) {
            System.out.println("Segitiga ini adalah segitiga sama sisi");

        } else if (sisia == sisib || sisib == sisic || sisia == sisic) {
        System.out.println("Segitiga ini adalah segitiga sama kaki");

        } else if (sisia > sisic & sisia > sisib) {
            if (pitagoras_a == sisia){
                System.out.println(sisia);
                System.out.println("Segitiga ini adalah segitiga siku siku");
            }

        } else if (sisib > sisic) {
            if (pitagoras_b == sisib) {
                System.out.println(sisib);
                System.out.println("Segitiga ini adalah segitiga siku siku");
            }

        } else if (sisic > sisia & sisic > sisib) {
            if (pitagoras_c == sisic) {
                System.out.println(sisic);
                System.out.println("Segitiga ini adalah segitiga siku siku");
                }

        }else {
            System.out.println("Segitiga ini adalah segitiga sembarang");
        }

        // membuat aplikasi untuk menentukan jenis segitiga dari 3 sisi yang diinput
        //1. sama sisi (sisi sama semua)
        //2. sama kaki (2 sisi sama)
        //3. siku siku (a^2 + b^2 = c^2)
        //4. sembarang sisi beda semua
        // kirim ke lilian.@petra.ac.id
        // subject= APB segitiga
    }
}
