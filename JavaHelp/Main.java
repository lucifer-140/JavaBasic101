package JavaHelp;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


class Penjualan {

    static class Transaksi {
        private String nama;
        private int jml;
        private double harga;
        private double total;

   
        public Transaksi(String nama, int jml, double harga) {
            this.nama = nama;
            this.jml = jml;
            this.harga = harga;
            this.total = calculatetotal();
        }

      
        private double calculatetotal() {
            return jml * harga;
        }

    
        public String getnama() {
            return nama;
        }

       
        public double gettotal() {
            return total;
        }

     
        @Override
        public String toString() {
            return String.format("Nama Barang : %s, Jumlah : %d, Harga Satuan : %.2f, Total : %.2f", nama, jml, harga, total);
        }
    }
}

public class Main {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Penjualan.Transaksi> transaksiMap = new HashMap<>();

        while (true) {
            System.out.print("Nama Barang (or 'q' untuk Quit) : ");
            String nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("q")) {
                break; 
            }

            System.out.print("Jumlah Barang : ");
            int jml = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Harga Barang : ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Penjualan.Transaksi transaksi = new Penjualan.Transaksi(nama, jml, harga);
            transaksiMap.put(nama, transaksi); 
        }

        System.out.println("\nRingkasan Transaksi : ");
        for (Penjualan.Transaksi transaksi : transaksiMap.values()) {
            System.out.println(transaksi);
        }
    }
}
