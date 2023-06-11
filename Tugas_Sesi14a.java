public class Tugas_Sesi14a {
    public static void main(String[] args) {
        // mencari pangkat
        int hasil = pangkat(2, 4);
        System.out.println(hasil);

        // hitung mundur
        countDown(5);

        // faktorial
        int faktorial = factorial(4);
        System.out.println(faktorial);


    }

    public static int pangkat(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * pangkat(x, n - 1);
        }
    }

    public static void countDown(int n) {
        if (n <= 0) {
            System.out.println("Selesai");
        } else {
            try {
                Thread.sleep(1000);
                System.out.println(n);
                countDown(n - 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}