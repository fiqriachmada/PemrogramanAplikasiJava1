import java.util.Scanner;

public class main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
       int data[][];
       //data = new int[2][5];

       System.out.print("\nMasukkan bilangan bulat positif yang ingin dimasukkan: ");
       int inputan = input.nextInt();
       System.out.println("\nMasukan kolom");
       int kolom = input.nextInt();
        data = new int[kolom][inputan];

       //int a = 0;
       //if(a < inputan){
           //a++;
           System.out.println();
           for (int i = 0; i < inputan; i++) {
               for(int a = 0; a< kolom; a++){
                   System.out.print("\nMasukkan bilangan bulat positif: ");
                   int angka = input.nextInt();
                   data[a][i] = angka;
               }
           }
       //}
       for (int i = 0; i < inputan; i++) {
           for(int a=0; a < kolom; a++){
           System.out.println("\n"+data[a][i]);
           int hasil = data[a][i] % 2;
            if (hasil == 0) {
                System.out.println("\nMerupakan Bilangan Genap\n");
            } else {
                System.out.println("\nMerupakan Bilangan Ganjil\n");
            }
        }
       }
   }
}
