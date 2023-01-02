import java.util.Scanner;
    public class PemilihanPercobaanDua03 {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int nilai1,nilai2,rataRata03D;
        System.out.println("Masukkan Nilai Pertama: ");
        nilai1 = andyNugraha03D.nextInt();
        System.out.println("Masukkan Nilai Kedua");
        nilai2 = andyNugraha03D.nextInt();

        rataRata03D = ((nilai1+nilai2)/2);

        if(rataRata03D >=100){
            rataRata03D-=5;
        }
    

            System.out.println("rata rata dari nilai kesatu dan kedua = " + rataRata03D );
        }
    }

    