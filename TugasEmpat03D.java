import java.util.Scanner;
    public class TugasEmpat03D {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        int hargaBarangA03D,hargaBarangB03D,hargaBarangC03D,jumlahBarangA03D,jumlahBarangB03D,jumlahBarangC03D,totalHargaA03D=0,totalHargaB03D=0,totalHargaC03D=0;
        
        System.out.println("Masukkan harga barang A anda: ");
        hargaBarangA03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan jumlah barang A anda: ");
        jumlahBarangA03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan harga barang B anda: ");
        hargaBarangB03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan jumlah barang B anda: ");
        jumlahBarangB03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan harga barang C anda: ");
        hargaBarangC03D = andyNugraha03D.nextInt();
        System.out.println("Masukkan jumlah barang C anda: ");
        jumlahBarangC03D = andyNugraha03D.nextInt();
        
        int totalHarga03D,diskon03D = 0, totalBayar03D;
        totalHargaA03D = hargaBarangA03D * jumlahBarangA03D;
        totalHargaB03D = hargaBarangB03D * jumlahBarangB03D;
        totalHargaC03D = hargaBarangC03D * jumlahBarangC03D;
        totalHarga03D = totalHargaA03D + totalHargaB03D + totalHargaC03D;
            if (totalHarga03D > 1000000) {
                diskon03D = totalHarga03D * 10 / 100;
            }
            else if (totalHarga03D > 500000) {
                diskon03D = totalHarga03D * 5 / 100;
            }
            else if (totalHarga03D > 200000) {
                diskon03D = totalHarga03D * 2 / 100;
            }
            totalBayar03D = totalHarga03D - diskon03D;
        
        System.out.println("---------------------------");
        System.out.println("        Struk Nota         ");
        System.out.println("---------------------------");
        System.out.println("Nama Barang |   Harga   |   jumlah   |   Total   ");
        System.out.println("barang A         " +  hargaBarangA03D +  "      " +jumlahBarangA03D +  "        " + totalHargaA03D);
        System.out.println("barang B         " + hargaBarangB03D + "      " + jumlahBarangB03D +  "         " +totalHargaB03D );
        System.out.println("barang C         " + hargaBarangC03D + "      " + jumlahBarangC03D + "         " + totalHargaC03D);
        System.out.println("total  " + totalHarga03D );
        System.out.println("total diskon " + diskon03D);
        System.out.println("total bayar " + totalBayar03D);
            
        }
    }