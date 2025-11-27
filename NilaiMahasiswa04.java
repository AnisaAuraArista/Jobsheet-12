import java.util.Scanner;

public class NilaiMahasiswa04 {

    static void isianArray(int[] arr, Scanner input) {
        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();
        int[] nilaiMahasiswa = new int[N];
        
        isianArray(nilaiMahasiswa, input);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}
