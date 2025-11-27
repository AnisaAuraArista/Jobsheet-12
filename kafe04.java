import java.util.Scanner;

public class Kafe04 { 
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaDasar = hargaItems[pilihanMenu - 1] * banyakItem;
        int totalHarga = hargaDasar;
       
        if (kodePromo.equals("DISKON50")) {
            totalHarga = totalHarga / 2; 
            System.out.println("Kode promo diterima! Diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            totalHarga = totalHarga - (totalHarga * 30 / 100); 
            System.out.println("Kode promo diterima! Diskon 30%.");
        } else if (kodePromo.equals("")) {
            System.out.println("Tidak menggunakan kode promo.");
        } else {
            System.out.println("Kode promo invalid / tidak ada diskon.");
        }
        return totalHarga;
    }
 
    public static void Menu() {
        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15000");
        System.out.println("2. Cappuccino   - Rp 20000");
        System.out.println("3. Latte        - Rp 22000");
        System.out.println("4. Teh Tarik    - Rp 12000");
        System.out.println("5. Roti Bakar   - Rp 10000");
        System.out.println("6. Mie Goreng   - Rp 18000");
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = sc.nextInt();
        sc.nextLine();
        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("\n=== Pesanan ke-" + i + " ===");

            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Masukkan kode promo (DISKON50 / DISKON30 atau kosongkan): ");
            String kodePromo = sc.nextLine();
         
            int totalPerMenu = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total untuk pesanan ini: Rp " + totalPerMenu);
            totalKeseluruhan += totalPerMenu;
        }
        
        System.out.println("\n===== TOTAL KESELURUHAN =====");
        System.out.println("Total yang harus dibayar: Rp " + totalKeseluruhan);

        sc.close();
    }
}