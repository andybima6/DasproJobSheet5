import java.util.Scanner;
    public class PemilihanPercobaanSatu03 {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int bil03D;
        System.out.println("Masukkan Sabuah Bilangan: ");
        bil03D = andyNugraha03D.nextInt();
        
        String output03D=(bil03D%2==0)?"Bilangan Genap":"Bilangan Ganjil";
        System.out.println(output03D);
        }
}
