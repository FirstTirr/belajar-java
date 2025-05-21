package tugas_java.com.tugas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class timbanganEmas {
    // Constants
    private static final double HARGA_EMAS_PER_GRAM = 1050000.0; // Rp per gram (24K)
    
    // Properties
    private double beratGram;
    private int kadar;  // kadar dalam karat (24, 22, 18, etc)
    private double hargaTotal;
    
    // Constructor
    public timbanganEmas(double beratGram, int kadar) {
        this.beratGram = beratGram;
        this.kadar = kadar;
        hitungHarga();
    }
    
    // Methods
    private void hitungHarga() {
        double persentaseKemurnian = kadar / 24.0;
        hargaTotal = beratGram * HARGA_EMAS_PER_GRAM * persentaseKemurnian;
    }
    
    public double getBeratGram() {
        return beratGram;
    }
    
    public double getBeratOns() {
        return beratGram / 28.35; // 1 ons = 28.35 gram
    }
    
    public double getHargaTotal() {
        return hargaTotal;
    }
    
    public String getHargaFormatted() {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(hargaTotal);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM TIMBANGAN EMAS ===");
        System.out.println("------------------------------");
        
        // Input berat emas
        System.out.print("Masukkan berat emas (gram): ");
        double berat = scanner.nextDouble();
        
        // Input kadar emas
        System.out.print("Masukkan kadar emas (karat, 1-24): ");
        int kadar = scanner.nextInt();
        
        // Validasi input
        if (berat <= 0 || kadar <= 0 || kadar > 24) {
            System.out.println("Input tidak valid! Berat harus positif dan kadar antara 1-24 karat.");
            scanner.close();
            return;
        }
        
        // Buat objek timbangan
        timbanganEmas timbangan = new timbanganEmas(berat, kadar);
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL PENIMBANGAN ===");
        System.out.println("Berat emas: " + timbangan.getBeratGram() + " gram");
        System.out.println("Berat dalam ons: " + String.format("%.4f", timbangan.getBeratOns()) + " ons");
        System.out.println("Kadar kemurnian: " + kadar + " karat");
        System.out.println("Persentase kemurnian: " + String.format("%.2f", (kadar/24.0*100)) + "%");
        System.out.println("Harga emas murni (24K) per gram: Rp " + String.format("%,.0f", HARGA_EMAS_PER_GRAM));
        System.out.println("Total nilai emas: " + timbangan.getHargaFormatted());
        
        // Tambahkan opsi untuk menghitung biaya pembelian (tambahkan biaya produksi dan ongkos)
        System.out.print("\nIngin menghitung biaya pembelian dengan ongkos? (y/n): ");
        String jawaban = scanner.next();
        
        if (jawaban.equalsIgnoreCase("y")) {
            System.out.print("Masukkan persentase ongkos pembuatan (%): ");
            double persenOngkos = scanner.nextDouble();
            
            double ongkos = timbangan.getHargaTotal() * (persenOngkos / 100);
            double totalBiaya = timbangan.getHargaTotal() + ongkos;
            
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            System.out.println("\n=== TOTAL BIAYA PEMBELIAN ===");
            System.out.println("Nilai emas: " + timbangan.getHargaFormatted());
            System.out.println("Ongkos pembuatan (" + persenOngkos + "%): " + formatRupiah.format(ongkos));
            System.out.println("Total biaya: " + formatRupiah.format(totalBiaya));
        }
        
        scanner.close();
    }
}
