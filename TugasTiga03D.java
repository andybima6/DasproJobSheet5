import java.util.Scanner;
    public class TugasTiga03D {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int nilaiUas03D,nilaiUts03D,nilaiKuis03D,nilaiTugas03D;
        System.out.println("Masukkan nilai UAS anda: ");
        nilaiUas03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan nilai UTS anda: ");
        nilaiUts03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan nilai KUIS anda: ");
        nilaiKuis03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan nilai TUGAS anda: ");
        nilaiTugas03D = andyNugraha03D.nextInt();

        int hasilUas03D, hasilUts03D, hasilKuis03D, hasilTugas03D,rataRata03D;
        hasilUas03D = 40 * nilaiUas03D / 100;
        hasilUts03D = 30 * nilaiUts03D / 100;
        hasilKuis03D = 10 * nilaiKuis03D / 100;
        hasilTugas03D = 20 * nilaiTugas03D / 100;
        rataRata03D = (hasilUas03D+hasilUts03D+hasilKuis03D+hasilTugas03D);
        System.out.println("nilai rata rata = " + rataRata03D);
        

        if(rataRata03D >65) {
            System.out.println("siswa tidak mendapatkan remidi");
        }
        else if(rataRata03D <65) {
        System.out.println("siswa mendapatkan remidi");
        }
        else{
            System.out.println("nilai yang anda masukkan tidak valid");
        }
    }
}

