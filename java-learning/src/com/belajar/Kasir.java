package com.belajar;

import java.util.Scanner;

public class Kasir {
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

        // Penyimpanan untuk transaksi
        double totalHarga = 0;
        StringBuilder struk = new StringBuilder();

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
            System.out.println("11. air mineral (stok: " + stokAirMineral + ")");
            System.out.println("00. Keluar");

            // Pilihan barang
            while (true) {
                System.out.print("\nPilih barang : ");
                String pilihan = scanner.nextLine();

                if (pilihan.equals("00")) {
                    System.out.println("Terima kasih, sampai jumpa!");
                    scanner.close();
                    return;
                }

                // Pisahkan input berdasarkan spasi
                String[] barangYangDipilih = pilihan.split(" ");
                boolean semuaBarangTersedia = true;

                for (String kode : barangYangDipilih) {
                    double harga = 0;
                    int stokBarang = 0;
                    String namaBarang = "";

                    // Menentukan harga dan stok berdasarkan pilihan
                    if (kode.equals("01")) {
                        harga = gula;
                        stokBarang = stokGula;
                        namaBarang = "Gula";
                    } else if (kode.equals("02")) {
                        harga = kopi;
                        stokBarang = stokKopi;
                        namaBarang = "Kopi";
                    } else if (kode.equals("03")) {
                        harga = susu;
                        stokBarang = stokSusu;
                        namaBarang = "Susu";
                    } else if (kode.equals("04")) {
                        harga = teh;
                        stokBarang = stokTeh;
                        namaBarang = "Teh";
                    } else if (kode.equals("05")) {
                        harga = garam;
                        stokBarang = stokGaram;
                        namaBarang = "Garam";
                    } else if (kode.equals("06")) {
                        harga = pena;
                        stokBarang = stokPena;
                        namaBarang = "Pena";
                    } else if (kode.equals("07")) {
                        harga = pensil;
                        stokBarang = stokPensil;
                        namaBarang = "Pensil";
                    } else if (kode.equals("08")) {
                        harga = penghapus;
                        stokBarang = stokPenghapus;
                        namaBarang = "Penghapus";
                    } else if (kode.equals("09")) {
                        harga = pensil_warna;
                        stokBarang = stokPensilWarna;
                        namaBarang = "Pensil Warna";
                    } else if (kode.equals("10")) {
                        harga = botol_minum;
                        stokBarang = stokBotolMinum;
                        namaBarang = "Botol Minum";
                    } else if (kode.equals("11")) {
                        harga = air_mineral;
                        stokBarang = stokAirMineral;
                        namaBarang = "Air Mineral";
                    } else {
                        System.out.println("Kode barang " + kode + " tidak valid.");
                        semuaBarangTersedia = false;
                        break;
                    }

                    if (semuaBarangTersedia) {
                        System.out.println("Anda memilih: " + namaBarang);
                        System.out.println("Harga: " + harga);
                        System.out.println("Stok tersedia: " + stokBarang);

                        System.out.print("Berapa banyak yang ingin dibeli? ");
                        int jumlahBeli = scanner.nextInt();
                        scanner.nextLine();  // membersihkan buffer

                        if (jumlahBeli > stokBarang) {
                            System.out.println("Stok tidak mencukupi. Stok yang tersedia: " + stokBarang);
                            semuaBarangTersedia = false;
                            break;
                        }

                        // Update total harga dan struk
                        totalHarga += jumlahBeli * harga;
                        struk.append(namaBarang).append(" x").append(jumlahBeli).append(" = ").append(jumlahBeli * harga).append("\n");

                        // Update stok
                        if (kode.equals("01")) {
                            stokGula -= jumlahBeli;
                        } else if (kode.equals("02")) {
                            stokKopi -= jumlahBeli;
                        } else if (kode.equals("03")) {
                            stokSusu -= jumlahBeli;
                        } else if (kode.equals("04")) {
                            stokTeh -= jumlahBeli;
                        } else if (kode.equals("05")) {
                            stokGaram -= jumlahBeli;
                        } else if (kode.equals("06")) {
                            stokPena -= jumlahBeli;
                        } else if (kode.equals("07")) {
                            stokPensil -= jumlahBeli;
                        } else if (kode.equals("08")) {
                            stokPenghapus -= jumlahBeli;
                        } else if (kode.equals("09")) {
                            stokPensilWarna -= jumlahBeli;
                        } else if (kode.equals("10")) {
                            stokBotolMinum -= jumlahBeli;
                        } else if (kode.equals("11")) {
                            stokAirMineral -= jumlahBeli;
                        }
                    }
                }

                if (semuaBarangTersedia) {
                    break;
                } else {
                    System.out.println("Ada barang yang tidak tersedia, silakan pilih lagi.");
                }
            }

            // Cek apakah total belanja lebih dari 150.000
            double diskon = 0;
            if (totalHarga > 150000) {
                diskon = totalHarga * 0.10;  // Diskon 10%
                totalHarga -= diskon;
                System.out.println("Selamat! Anda mendapatkan diskon 10% sebesar: " + diskon);
            }

            // Menanyakan jika pengguna ingin membeli lagi
            System.out.print("\nIngin membeli lagi? (y/n): ");
            String repeat = scanner.nextLine();
            if (repeat.equalsIgnoreCase("n")) {
                // Menampilkan struk belanja dan total harga
                System.out.println("\n--- Struk Belanja ---");
                System.out.println(struk.toString());
                System.out.println("Total harga setelah diskon: " + totalHarga);

                // Proses pembayaran
                System.out.print("Bayar berapa? ");
                double payment = scanner.nextDouble();
                scanner.nextLine(); // membersihkan buffer

                double change = payment - totalHarga;

                if (change >= 0) {
                    System.out.println("Bayar: " + payment);
                    System.out.println("Kembalian: " + change);
                    System.out.println("Pembelian berhasil!");
                } else {
                    System.out.println("Pembayaran kurang. Kembalian tidak dapat dihitung.");
                }
                break;
            }
        }

        scanner.close();
    }
}
