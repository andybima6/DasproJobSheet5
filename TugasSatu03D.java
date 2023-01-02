import java.util.Scanner;
    public class TugasSatu03D {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int bilangan1,bilangan2;
        System.out.println("Masukkan Nilai Pertama: ");
        bilangan1 = andyNugraha03D.nextInt();
        System.out.println("Masukkan Nilai Kedua");
        bilangan2 = andyNugraha03D.nextInt();

        if(bilangan1 > bilangan2) {
        System.out.println("Bilangan yang paling besar adalah " + bilangan1);
        }
        else if(bilangan1 < bilangan2) {
            System.out.println("Bilangan yang paling besar adalah " + bilangan2);
        }
        else if(bilangan1 == bilangan2) {
            System.out.println("memiliki bilangan yang sama " );
        }
        else {
            System.out.println("Bilangan yang tidak tercantum maka tidak valid");
        }
    }
}