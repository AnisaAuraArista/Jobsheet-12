import java.util.Scanner;

public class Kafe04 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
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
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
        sc.close(); 
    }
}