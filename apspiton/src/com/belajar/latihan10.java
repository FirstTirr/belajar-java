package com.belajar;

import java.util.Scanner;

public class latihan10 {
    public static void main(String[] args) {

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
        double air_mineral = 2000;

        int stokGula = 17;
        int stokKopi = 23;
        int stokSusu = 20;
        int stokTeh = 23;
        int stokGaram = 20;
        int stokPena = 30;
        int stokPensil = 25;
        int stokPenghapus = 22;
        int stokPensilWarna = 30;
        int stokBotolMinum = 17;
        int stokAirMineral = 30;

        Scanner scanner = new Scanner(System.in);

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
        System.out.println("11. air mineral (stok: " + stokAirMineral + ")");
        System.out.println("00. Keluar");

        System.out.print("Pilih barang: ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("00")) {
            System.out.println("Terima kasih, sampai jumpa!");
            scanner.close();
            return;
        }

        double harga = 0;
        int stokBarang = 0;
        String namaBarang = "";

        if (pilihan.equals("01")) {
            harga = gula;
            stokBarang = stokGula;
            namaBarang = "Gula";
        } else if (pilihan.equals("02")) {
            harga = kopi;
            stokBarang = stokKopi;
            namaBarang = "Kopi";
        } else if (pilihan.equals("03")) {
            harga = susu;
            stokBarang = stokSusu;
            namaBarang = "Susu";
        } else if (pilihan.equals("04")) {
            harga = teh;
            stokBarang = stokTeh;
            namaBarang = "Teh";
        } else if (pilihan.equals("05")) {
            harga = garam;
            stokBarang = stokGaram;
            namaBarang = "Garam";
        } else if (pilihan.equals("06")) {
            harga = pena;
            stokBarang = stokPena;
            namaBarang = "Pena";
        } else if (pilihan.equals("07")) {
            harga = pensil;
            stokBarang = stokPensil;
            namaBarang = "Pensil";
        } else if (pilihan.equals("08")) {
            harga = penghapus;
            stokBarang = stokPenghapus;
            namaBarang = "Penghapus";
        } else if (pilihan.equals("09")) {
            harga = pensil_warna;
            stokBarang = stokPensilWarna;
            namaBarang = "Pensil Warna";
        } else if (pilihan.equals("10")) {
            harga = botol_minum;
            stokBarang = stokBotolMinum;
            namaBarang = "Botol Minum";
        } else if (pilihan.equals("11")) {
            harga = air_mineral;
            stokBarang = stokAirMineral;
            namaBarang = "Air Mineral";
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        System.out.println("Anda memilih: " + namaBarang);
        System.out.println("Harga: " + harga);
        System.out.println("Stok tersedia: " + stokBarang);

        System.out.print("Berapa banyak yang ingin dibeli? ");
        int jumlahBeli = scanner.nextInt();
        scanner.nextLine();

        if (jumlahBeli > stokBarang) {
            System.out.println("Stok tidak mencukupi. Stok yang tersedia: " + stokBarang);
            scanner.close();
            return;
        }

        double totalHarga = jumlahBeli * harga;
        System.out.println("Total harga: " + totalHarga);

        System.out.print("Bayar berapa? ");
        double payment = scanner.nextDouble();
        scanner.nextLine();

        double change = payment - totalHarga;

        if (change >= 0) {
            System.out.println("\n--- Struk Belanja ---");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Jumlah beli: " + jumlahBeli);
            System.out.println("Harga per item: " + harga);
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Bayar: " + payment);
            System.out.println("Kembalian: " + change);
            System.out.println("Pembelian berhasil!");

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
            } else if (pilihan.equals("11")) {
                stokAirMineral -= jumlahBeli;
            }

            System.out.println("Stok yang tersisa: " + getStokBarang(pilihan, stokGula, stokKopi, stokSusu, stokTeh, stokGaram, stokPena, stokPensil, stokPenghapus, stokPensilWarna, stokBotolMinum, stokAirMineral));
        } else {
            System.out.println("Pembayaran kurang. Kembalian tidak dapat dihitung.");
        }

        scanner.close();
    }

    private static int getStokBarang(String pilihan, int stokGula, int stokKopi, int stokSusu, int stokTeh, int stokGaram, int stokPena, int stokPensil, int stokPenghapus, int stokPensilWarna, int stokBotolMinum, int stokAirMineral) {
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
            case "11": return stokAirMineral;
            default: return 0;
        }
    }
}
