public class Tugas_Sesi_4c {
    public static void main(String[] args) throws Exception {

        // Eko Memen Nuryaman
        // Tugas Sesi 4.c : 0 0 1 1 2 3 5 8 
        
        int bil1 = 0;
        int bil2 = 1;
        do {
            System.out.print(bil1 + " " + bil2 + " ");
            bil1 += bil2;
            bil2 += bil1;
            
        } while (bil2 <= 13); 
    }
}
