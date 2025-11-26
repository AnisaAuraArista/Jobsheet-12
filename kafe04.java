import java.util.Scanner;

public class Kafe04 { 
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    
    public static void Menu() {
        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15000");
        System.out.println("2. Cappuccino   - Rp 20000");
        System.out.println("3. Latte        - Rp 22000");
        System.out.println("4. Teh Tarik    - Rp 12000");
        System.out.println("5. Roti Bakar   - Rp 10000");
        System.out.println("6. Mie Goreng   - Rp 18000");
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();
        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            int totalPerMenu = hitungTotalHarga(pilihanMenu, banyakItem);
            System.out.println("Total harga menu ini: Rp " + totalPerMenu);
            totalKeseluruhan += totalPerMenu;
        }

        System.out.println("\n====================================");
        System.out.println("TOTAL KESELURUHAN PESANAN: Rp " + totalKeseluruhan);
        System.out.println("====================================");

        sc.close();
    }
}