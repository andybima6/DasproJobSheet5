import java.util.Scanner;
    public class PemilihanPercobaanTiga03 {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int umur03D;
        System.out.println("Masuk Umur Anda: ");
        umur03D = andyNugraha03D.nextInt();

        if(umur03D>60) {
            System.out.println("Lansia");
        }
        else if(umur03D>45) {
            System.out.println("Tua");
        }
        else if (umur03D >17) {
            System.out.println("Dewasa");
        }
        else if (umur03D>5){
            System.out.println("Anak Anak");
        }
        else if(umur03D>0) {
            System.out.println("Balita");
        }
        else {
            System.out.println("Maaf umur yang anda masukkan salah");
        }
    }
    }