package tugas_java.com.tugas;

import java.util.Scanner;

public class pembayaranAir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistem Pembayaran Air Minum");
        System.out.println("-------------------------------");

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan jumlah pemakaian air (m3): ");
        double pemakaianAir = scanner.nextDouble();
        scanner.nextLine(); // Add this to consume the leftover newline
        
        System.out.print("masukkan alamat pelanggan: ");
        String alamatPelanggan = scanner.nextLine();

        System.out.print("masukkan nomor telepon pelanggan: ");
        String noTeleponPelanggan = scanner.nextLine(); // Changed to String

        double tarifAir = 0;
        if (pemakaianAir <= 10) {
            tarifAir = 1000;
        } else if (pemakaianAir <= 20) {
            tarifAir = 1500;
        } else {
            tarifAir = 2000;
        }

        double totalBiaya = pemakaianAir * tarifAir;
        double pajak = totalBiaya * 0.1;
        double totalPembayaran = totalBiaya + pajak;

        System.out.println("\nRincian Pembayaran:");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Alamat Pelanggan: " + alamatPelanggan);
        System.out.println("No Telepon Pelanggan: " + noTeleponPelanggan);
        System.out.println("Pemakaian Air: " + pemakaianAir + " m3");
        System.out.println("Tarif Air: Rp " + tarifAir + "/m3");
        System.out.println("Total Biaya: Rp " + totalBiaya);
        System.out.println("Pajak (10%): Rp " + pajak);
        System.out.println("Total Pembayaran: Rp " + totalPembayaran);
    }
}