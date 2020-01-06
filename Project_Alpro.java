
package project_prakalpro.resto;

import java.util.Scanner;

public class Project_PrakAlproResto {

    static Scanner scan = new Scanner(System.in);
    static String yn;
    // inisialisasi pembayaran awal
    static int harga = 0;
    // inisialisasi harga ketiga menu
    static int h1 = 3000, h2 = 5000, h3 = 4000, h4 = 2500, h5 = 10000, h6 = 4000;
    static int menu;
    static int[][] jumlah1 = new int[15][10];
    static int[][] jumlah2 = new int[15][10];

    static String[][] makanan = new String[15][10];
    static String[][] minuman = new String[15][10];
    static int[] inNomor = new int[10];
    static short i = 0, j = 0, m = 0;

    public static void main(String[] args) {

        // inisialisasi java library scanner
        do {
            do {
                System.out.println("Pilih menu ");
                System.out.println("1. Makanan");
                System.out.println("2. Minuman");
                System.out.print("Masukan Pilhan Pesanan : ");
                menu = scan.nextInt();
                if (menu == 1) {
                    menu1();
                    i++;
                    j++;
                } else if (menu == 2) {
                    menu2();
                    i++;
                    j++;

                } else if (menu >= 3) {
                    System.out.println("Menu yang dipilih tidak ada di pilihan.");
                    break;
                }

                System.out.print("Ingin memesan lagi  ? ");
                yn = scan.next();
                m++;

            } while ("y".equals(yn.toLowerCase()));
            if (menu >= 3) {
                break;
            }
            Array();
            Pembayaran();
            Total();
            System.out.println("Terimakasih atas kunjungannya.");
            System.out.println();
            System.out.print("Ingin memesan lagi  ? ");
            yn = scan.next();

        } while ("y".equals(yn.toLowerCase()));

    }

    public static void menu1() {
        //        menampilkan menu makanan
        System.out.println("MENU MAKANAN : ");
        System.out.println("_________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Batagor          Rp 3000,00");
        System.out.println("2. Kupat Tahu       Rp 5000,00");
        System.out.println("3. Lontong Kari     Rp 4000,00");
        System.out.println("");

        System.out.println("_________");
        // pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        inNomor[m] = scan.nextInt();
        System.out.print("Jumlah Pesanan : ");
        jumlah1[i][j] = scan.nextInt();
        System.out.println("_________");

        if (inNomor[m] == 1) {
            // jika nomor satu, maka menu yang dipilih adalah batagor, dan harganya adalah h1, yang merupakan harga menu pertama
            makanan[i][j] = "Batagor";
            System.out.println("Pilihan anda nomor " + inNomor[m] + " Makanan " + makanan[i][j]);
            harga = harga + h1 * jumlah1[i][j];
        } else if (inNomor[m] == 2) {
            // jika nomor dua, maka menu yang dipilih adalah kupat tahu, dan harganya adalah h2, yang merupakan harga menu kedua
            makanan[i][j] = " Kupat Tahu";
            System.out.println("Pilihan anda nomor " + inNomor[m] + " Makanan " + makanan[i][j]);
            harga = harga + h2 * jumlah1[i][j];
        } else if (inNomor[m] == 3) {
            //jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
            makanan[i][j] = " Lontong Kari";
            System.out.println("Pilihan anda nomor " + inNomor[m] + " Makanan " + makanan[i][j]);
            harga = harga + h3 * jumlah1[i][j];
        } else {
            System.out.println("Nomor yang dipilih tidak ada di menu.");
        }

    }

    public static void menu2() {
        //        menampilkan menu makanan
        System.out.println("MENU MINUMAN : ");
        System.out.println("_________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Ice Teh               Rp 2500,00");
        System.out.println("2. Es Kopi Susu          Rp 10000,00");
        System.out.println("3. Es orange nutrisari   Rp 4000,00");
        System.out.println("_________");
        // pengguna memasukkan nomor pesanan
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor2 = scan.nextInt();
        System.out.print("Jumlah Pesanan : ");
        jumlah2[i][j] = scan.nextInt();
        System.out.println("_________");

        if (inNomor2 == 1) {
            // jika nomor satu, maka menu yang dipilih adalah batagor, dan harganya adalah h1, yang merupakan harga menu pertama
            minuman[i][j] = "Ice Teh";
            System.out.println("Pilihan anda nomor " + inNomor2 + " Minuman " + minuman[i][j]);
            harga = harga + h4 * jumlah2[i][j];
        } else if (inNomor2 == 2) {
            // jika nomor dua, maka menu yang dipilih adalah kupat tahu, dan harganya adalah h2, yang merupakan harga menu kedua
            minuman[i][j] = " Ice Kopi Susu";
            System.out.println("Pilihan anda nomor " + inNomor2 + " Minuman " + minuman[i][j]);
            harga = harga + h5 * jumlah2[i][j];
        } else if (inNomor2 == 3) {
            //jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
            minuman[i][j] = " Es orange Nutrisari";
            System.out.println("Pilihan anda nomor " + inNomor2 + " Minuman " + minuman[i][j]);
            harga = harga + h6 * jumlah2[i][j];
        } else {
            System.out.println("Nomor yang dipilih tidak ada di menu.");
        }

    }

    public static void Pembayaran() {
        System.out.println("_________");
        System.out.println("Total pembayaran sebesar " + harga + ".");
        System.out.print("Bayar : ");
        int bayar = scan.nextInt();
        bayar = bayar - harga;
        System.out.println("Kembalian : " + bayar);

    }

    public static void Array() {
        System.out.println("\n\n  Daftar Barang Pembelian");
        System.out.println(" ==================================== ");
        System.out.println(" ||   Nama Menu   ||   Jumlah  ||");
        System.out.println(" =====================================");
        for (int k = 0; k < makanan.length; k++) {
            for (int l = 0; l < makanan[l].length; l++) {
                if (makanan[k][l] != null) {
                    System.out.println("    " + makanan[k][l] + "\t\t" + jumlah1[k][l]);                   
                }
                if(minuman[k][l] != null){
                    System.out.println("    " + minuman[k][l] + "\t\t" + jumlah2[k][l]);
                }
            }
        
        }
    }

    public static void Total() {
        int Total = harga;
        System.out.println("Total Harga : " + harga);
    }
}
