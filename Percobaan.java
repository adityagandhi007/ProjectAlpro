        import java.util.Scanner;
        import java.util.ArrayList;
        public class Percobaan {
            static Scanner scan = new Scanner(System.in);
            static String yn;
            // inisialisasi pembayaran awal
            static int harga = 0;
            // inisialisasi harga ketiga menu
            static int h1 = 3000, h2 = 5000, h3 = 4000, h4 = 2500, h5 = 10000, h6 = 4000;
            static int menu;
            
            static String[][] makanan = new String[5][2];
            static String[][] minuman = new String[5][2];
            static short i = 0, j = 0;
        
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
        
                        } else if (menu == 2) {
                            menu2();
                            i++;
                            j++;
                            
                        }else if (menu >=3){
                            System.out.println("Menu yang dipilih tidak ada di pilihan.");
                            break;
                        }
                        System.out.println(i + " " + j);
                        System.out.print("Ingin memesan lagi  ? ");
                        yn = scan.next();
        
                    } while ("y".equals(yn.toLowerCase()));
                    if (menu >=3){
                            break;
                    }
                    Pembayaran();
                    System.out.println("Terimakasih atas kunjungannya.");
                    System.out.println();
                    Array();
                    System.out.print("Ingin memesan lagi  ? ");
                        yn = scan.next();
                Total();
                } while ("y".equals(yn.toLowerCase()));
                
                
            }
        
            public static void menu1() {
                //        menampilkan menu makanan
                System.out.println("MENU MAKANAN : ");
                System.out.println("_______________________");
                System.out.println("No Nama             Harga");
                System.out.println("1. Batagor          Rp 3000,00");
                System.out.println("2. Kupat Tahu       Rp 5000,00");
                System.out.println("3. Lontong Kari     Rp 4000,00");
                System.out.println("");
        
                System.out.println("_______________________");
                // pengguna memasukkan nomor pesanan
                System.out.print("Masukkan Nomor Pesanan : ");
                int inNomor = scan.nextInt();
                System.out.println("_______________________");
        
                if (inNomor == 1) {
                    // jika nomor satu, maka menu yang dipilih adalah batagor, dan harganya adalah h1, yang merupakan harga menu pertama
                    makanan[i][j] = "Batagor";
                    System.out.println("Pilihan anda nomor " + inNomor + " Makanan " + makanan[i][j]);
                    harga = harga + h1;
                } else if (inNomor == 2) {
                    // jika nomor dua, maka menu yang dipilih adalah kupat tahu, dan harganya adalah h2, yang merupakan harga menu kedua
                    makanan[i][j] = " Kupat Tahu";
                    System.out.println("Pilihan anda nomor " + inNomor + " Makanan " + makanan[i][j]);
                    harga = harga + h2;
                } else if (inNomor == 3) {
                    //jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
                    makanan[i][j] = " Lontong Kari";
                    System.out.println("Pilihan anda nomor " + inNomor + " Makanan " + makanan[i][j]);
                    harga = harga + h3;
                } else {
                    System.out.println("Nomor yang dipilih tidak ada di menu.");
                }
        
            }
        
            public static void menu2() {
                //        menampilkan menu makanan
                System.out.println("MENU MINUMAN : ");
                System.out.println("_______________________");
                System.out.println("No Nama             Harga");
                System.out.println("1. Ice Teh               Rp 2500,00");
                System.out.println("2. Es Kopi Susu          Rp 10000,00");
                System.out.println("3. Es orange nutrisari   Rp 4000,00");
                System.out.println("_______________________");
                // pengguna memasukkan nomor pesanan
                System.out.print("Masukkan Nomor Pesanan : ");
                int inNomor2 = scan.nextInt();
                System.out.println("_______________________");
        
                if (inNomor2 == 1) {
                    // jika nomor satu, maka menu yang dipilih adalah batagor, dan harganya adalah h1, yang merupakan harga menu pertama
                    minuman[i][j] = "Ice Teh";
                    System.out.println("Pilihan anda nomor " + inNomor2 + " Minuman " + minuman[i][j]);
                    harga = harga + h4;
                } else if (inNomor2 == 2) {
                    // jika nomor dua, maka menu yang dipilih adalah kupat tahu, dan harganya adalah h2, yang merupakan harga menu kedua
                    minuman[i][j] = " Ice Kopi Susu";
                    System.out.println("Pilihan anda nomor " + inNomor2 + " Minuman " + minuman[i][j]);
                    harga = harga + h5;
                } else if (inNomor2 == 3) {
                    //jika nomor tiga, maka menu yang dipilih adalah lontong kari, dan harganya adalah h3, yang merupakan harga menu ketiga
                    minuman[i][j] = " Es orange Nutrisari";
                    System.out.println("Pilihan anda nomor " + inNomor2 + " Minuman " + minuman[i][j]);
                    harga = harga + h6;
                } else {
                    System.out.println("Nomor yang dipilih tidak ada di menu.");
                }
        
            }
        
            public static void Pembayaran() {
                System.out.println("_______________________");
                System.out.println("Total pembayaran sebesar " + harga + ".");
                System.out.print("Bayar : ");
                int bayar = scan.nextInt();
                bayar = bayar - harga;
                System.out.println("Kembalian : " + bayar);
                
            }
        
            public static void Array() {
                System.out.println("Makanan\t\t\t" + "Minuman");
                System.out.println("------------------------------------");
                for (int k = 0; k < makanan.length; k++) {
                    for (int l = 0; l < makanan[l].length; l++) {
                        if (makanan[k][l] != null) {
                            System.out.println(makanan[k][l] + "\t\t" + minuman[k][l]);
                            System.out.println();
                        }
        
                    }
                }
            }
            public static void Total(){
               int Total = harga;
                System.out.println("Total Harga : "+harga);
            }
        
        }