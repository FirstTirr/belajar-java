package com.belajar;

import java.util.Scanner;

public class latihan10 {
    public static void main(String[] args) {
        // Menyimpan harga dan stok barang
        double gula = 10000;
        double kopi = 15000;
        double susu = 16000;
        double teh = 5000;
        double garam = 2000;
        double pena = 3000;
        double pensil = 2000;
        double penghapus = 4000;
        double pensil_warna = 7500;
        double botol_minum = 30000;

        int stokGula = 10;
        int stokKopi = 5;
        int stokSusu = 8;
        int stokTeh = 15;
        int stokGaram = 20;
        int stokPena = 30;
        int stokPensil = 25;
        int stokPenghapus = 12;
        int stokPensilWarna = 10;
        int stokBotolMinum = 7;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu Belanja ---");
            System.out.println("01. gula (stok: " + stokGula + ")");
            System.out.println("02. kopi (stok: " + stokKopi + ")");
            System.out.println("03. susu (stok: " + stokSusu + ")");
            System.out.println("04. teh (stok: " + stokTeh + ")");
            System.out.println("05. garam (stok: " + stokGaram + ")");
            System.out.println("06. pena (stok: " + stokPena + ")");
            System.out.println("07. pensil (stok: " + stokPensil + ")");
            System.out.println("08. penghapus (stok: " + stokPenghapus + ")");
            System.out.println("09. pensil warna (stok: " + stokPensilWarna + ")");
            System.out.println("10. botol minum (stok: " + stokBotolMinum + ")");
            System.out.println("00. Keluar");

            System.out.print("Pilih barang: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("00")) {
                System.out.println("Terima kasih, sampai jumpa!");
                break; // Keluar dari loop
            }

            double harga = 0;
            int stokBarang = 0;

            // Menentukan harga dan stok berdasarkan pilihan
            if (pilihan.equals("01")) {
                harga = gula;
                stokBarang = stokGula;
            } else if (pilihan.equals("02")) {
                harga = kopi;
                stokBarang = stokKopi;
            } else if (pilihan.equals("03")) {
                harga = susu;
                stokBarang = stokSusu;
            } else if (pilihan.equals("04")) {
                harga = teh;
                stokBarang = stokTeh;
            } else if (pilihan.equals("05")) {
                harga = garam;
                stokBarang = stokGaram;
            } else if (pilihan.equals("06")) {
                harga = pena;
                stokBarang = stokPena;
            } else if (pilihan.equals("07")) {
                harga = pensil;
                stokBarang = stokPensil;
            } else if (pilihan.equals("08")) {
                harga = penghapus;
                stokBarang = stokPenghapus;
            } else if (pilihan.equals("09")) {
                harga = pensil_warna;
                stokBarang = stokPensilWarna;
            } else if (pilihan.equals("10")) {
                harga = botol_minum;
                stokBarang = stokBotolMinum;
            } else {
                System.out.println("Pilihan tidak valid.");
                continue; // Kembali ke awal loop
            }

            // Menampilkan rincian barang yang dipilih
            System.out.println("Anda memilih: " + pilihan);
            System.out.println("Harga: " + harga);
            System.out.println("Stok tersedia: " + stokBarang);

            // Meminta jumlah yang ingin dibeli
            System.out.print("Berapa banyak yang ingin dibeli? ");
            int jumlahBeli = scanner.nextInt();
            scanner.nextLine(); // Clear newline character after nextInt()

            if (jumlahBeli > stokBarang) {
                System.out.println("Stok tidak mencukupi. Stok yang tersedia: " + stokBarang);
                continue; // Kembali ke awal loop
            }

            // Menghitung total harga
            double totalHarga = jumlahBeli * harga;
            System.out.println("Total harga: " + totalHarga);

            // Meminta pembayaran
            System.out.print("Bayar berapa? ");
            double payment = scanner.nextDouble();
            scanner.nextLine(); // Clear newline character after nextDouble()

            // Menghitung kembalian
            double change = payment - totalHarga;

            // Menampilkan kembalian dan mengurangi stok
            if (change >= 0) {
                System.out.println("Kembalian: " + change);
                System.out.println("Pembelian berhasil!");
                // Mengurangi stok sesuai dengan jumlah yang dibeli
                if (pilihan.equals("01")) {
                    stokGula -= jumlahBeli;
                } else if (pilihan.equals("02")) {
                    stokKopi -= jumlahBeli;
                } else if (pilihan.equals("03")) {
                    stokSusu -= jumlahBeli;
                } else if (pilihan.equals("04")) {
                    stokTeh -= jumlahBeli;
                } else if (pilihan.equals("05")) {
                    stokGaram -= jumlahBeli;
                } else if (pilihan.equals("06")) {
                    stokPena -= jumlahBeli;
                } else if (pilihan.equals("07")) {
                    stokPensil -= jumlahBeli;
                } else if (pilihan.equals("08")) {
                    stokPenghapus -= jumlahBeli;
                } else if (pilihan.equals("09")) {
                    stokPensilWarna -= jumlahBeli;
                } else if (pilihan.equals("10")) {
                    stokBotolMinum -= jumlahBeli;
                }
                // Menampilkan stok barang yang tersisa
                System.out.println("Stok yang tersisa: " + getStokBarang(pilihan, stokGula, stokKopi, stokSusu, stokTeh, stokGaram, stokPena, stokPensil, stokPenghapus, stokPensilWarna, stokBotolMinum));
            } else {
                System.out.println("Pembayaran kurang. Kembalian tidak dapat dihitung.");
            }
        }

        scanner.close();
    }

    // Fungsi untuk mendapatkan stok barang yang tersisa
    private static int getStokBarang(String pilihan, int stokGula, int stokKopi, int stokSusu, int stokTeh, int stokGaram, int stokPena, int stokPensil, int stokPenghapus, int stokPensilWarna, int stokBotolMinum) {
        switch (pilihan) {
            case "01": return stokGula;
            case "02": return stokKopi;
            case "03": return stokSusu;
            case "04": return stokTeh;
            case "05": return stokGaram;
            case "06": return stokPena;
            case "07": return stokPensil;
            case "08": return stokPenghapus;
            case "09": return stokPensilWarna;
            case "10": return stokBotolMinum;
            default: return 0;
        }
    }
}
