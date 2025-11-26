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

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        int totalBayar = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("\nTotal yang harus dibayar: Rp " + totalBayar);

        sc.close();
    }
}