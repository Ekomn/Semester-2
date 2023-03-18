public class Tugas_Sesi_4f {
    public static void main(String[] args) throws Exception {

        // Eko Memen Nuryaman
        // Tugas Sesi 4.f : 24 22 20 18 16 14 12
  
    System.out.println();
        for (int a = 1; a <= 4; a++) {
            String word = "A";
            for (int b = 4; b >= a; b--) {
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