public class Tugas_Sesi_4e {
    public static void main(String[] args) throws Exception {

        // Eko Memen Nuryaman
        // Tugas Sesi 4.e

        System.out.println();

        for (int a = 1; a <= 4; a++) {
            String word = "A";
            for (int b = 1; b <= 4; b++) {
                System.out.print(word + " ");
                if (word == "A") {
                    word = "B";
                } else {
                    word = "A";
                }
            }
            System.out.println("");
        }
    }
}