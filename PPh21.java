import java.util.Scanner;

public class PPh21 { 
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // input data   
            System.out.print("Masukkan Penghasilan anda: ");
            double penghasilanAnda = input.nextDouble();
            System.out.print("Masukkan jumlah anak: ");
            int jumlahAnak = input.nextInt();

            // Hitung PTKP
            double PTKP=54000000 + 4500000 * jumlahAnak;

            // Hitung PTKP
            double PKP = penghasilanAnda - PTKP;

            // Hitung PPh
            double PPh;
            if (PKP <= 50000000){
                PPh = PKP* 0.05;
            } else if (PKP <= 250000000) {
                PPh = 2500000 + (PKP - 500000000) * 0.15;
            } else if (PKP <= 500000000) {
                PPh = 32500000 + (PKP - 250000000) * 0.25;
            } else if (PKP <= 1000000000) {
                PPh = 95000000 + (PKP - 500000000) * 0.30;
            } else {
                PPh = 245000000 + (PKP - 1000000000) * 0.35;
            }

            // Output hasil
            System.out.println("PTKP: " + PTKP);
            System.out.println("PKP : " + PKP");
            System.out.println("PPh : " + PPh");
        }
    }
}