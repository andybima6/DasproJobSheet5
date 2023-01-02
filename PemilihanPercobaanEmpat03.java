import java.util.Scanner;
    public class PemilihanPercobaanEmpat03 {
        public static void main(String[] args) {
        Scanner andyNugraha03D = new Scanner(System.in);

        double angka1,angka2,hasil;
        char operator03D;
        System.out.println("Masukkan Angka Pertama: ");
        angka1 = andyNugraha03D.nextDouble();
        System.out.println("Masukkan angka Kedua");
        angka2 = andyNugraha03D.nextDouble();
        System.out.println("Masukkan Operator (+ - * /) : ");
        operator03D = andyNugraha03D.next().charAt(0);

        switch(operator03D) {         
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + "+" + angka2 + "=" +hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + "-" + angka2 + "=" +hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + "*" + angka2 + "=" +hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + "=" +hasil);
            break;

            default:
            System.out.println("Operator Yang Masukkan Salah: ");
        }
    }
}
