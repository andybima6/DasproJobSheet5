import java.util.Scanner;
    public class TugasDua03D {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int umur03D;
        System.out.println("Masukkan umur anda: ");
        umur03D = andyNugraha03D.nextInt();

        if(umur03D >= 17){
            System.out.println("boleh berkendara ");
        }
        else if(umur03D <17){
            System.out.println("tidak boleh berkendara ");
        }
        else{
            System.out.println("Maaf umur yang anda masukkan salah ");
        }
    }
}