/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public final class Posttest5 { // final class
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Modern> listModern = new ArrayList<>();
    static ArrayList<Tradisional> listTradis = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    static final void display() { // final method
        System.out.println("\n=================================================");
        System.out.println("|                   List Data                   |");
    }
    
    
    public static void tambahData() throws IOException {
        System.out.println("Pilih Jenis Kostum yang ingin di tambahkan");
        System.out.println("1. Kostum Tradisional");
        System.out.println("2. Kostum Modern");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Kostum Tradisional ==========");
            System.out.print("Masukkan Nama                      : ");
            String Nama = input.readLine();
            System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
            String TanggalLahir = input.readLine();
            System.out.print("Masukkan Jenis Kelamin             : ");
            String JenisKelamin = input.readLine();
            System.out.print("Masukkan Nomor Telepon             : ");
            int NomorTelepon = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Kostum                    : ");
            String KostumTradisional = input.readLine();
            System.out.println("Masukkan Ukuran Kostum           :");
            int UkuranKostum = Integer.parseInt(input.readLine());
            System.out.println("======================================================");

            Tradisional Tradisi = new Tradisional (Nama, TanggalLahir, JenisKelamin, NomorTelelpon, NamaKostum, UkuranKostum);
            listTradisi.add(Tradisi);
            Tradisi.info(Nama);

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Kostum Modern ===============");
            System.out.print("Masukkan Nama                      : ");
            String Nama = input.readLine();
            System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
            String TanggalLahir = input.readLine();
            System.out.print("Masukkan Jenis Kelamin             : ");
            String JenisKelamin = input.readLine();
            System.out.print("Masukkan Nomor Telepon             : ");
            int NomorTelepon = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Kostum                    : ");
            String KostumTradisional = input.readLine();
            System.out.println("Masukkan Ukuran Kostum           :");
            int UkuranKostum = Integer.parseInt(input.readLine());
            System.out.println("======================================================");

            Modern Modern = new Modern (Nama, TanggalLahir, JenisKelamin, NomorTelepon, NamaKostum, UkuranKostum);
            listModern.add(Modern);
            Modern.info(Nama);
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("Jenis Kostum");
        System.out.println("1. Kostum Tradisional");
        System.out.println("2. Kostum Modern");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            display();
            System.out.println("|                    Tradisional                |");
            System.out.println("=================================================");
            if (listTradisi.isEmpty()){
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listTradisi.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listTradisi.get(i).tampil();
                    }
                }
                System.out.println("=================================================");
        }else if(pil == 2){
            display();
            System.out.println("|                      Modern                   |");
            System.out.println("=================================================");
            if (listModern.isEmpty()){
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listModern.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listModern.get(i).tampil();
                }
            }
                System.out.println("=================================================");
        }else{
            System.out.println("Pilihan salah");

        }
    } 
    
     
    public static void editData() throws IOException{
        System.out.println("Jenis Kostum yang ingin di ubah :");
        System.out.println("1. Kostum Tradisional");
        System.out.println("2. Kostum Modern     ");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listTradisi.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listTradisi.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listTradisi.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data Kostum yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if(index <= listTradisi.size() || index > 0){
                    System.out.println("======= Masukkan data Kostum yang baru =======");

                    System.out.print("Masukkan Nama                      : ");
                    String Nama = input.readLine();
                    listTradisi.get(index-1).setName(Nama);

                    System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
                    String tanggalLahir = input.readLine();
                    listTradisi.get(index-1).setTanggalLahir(TanggalLahir);

                    System.out.print("Masukkan Jenis Kelamin             : ");
                    String jenisKelamin = input.readLine();
                    listTradisi.get(index-1).setJenisKelamin(JenisKelamin);

                    System.out.print("Masukkan Nomor Telepon             : ");
                    int NomorTelepon = Integer.parseInt(input.readLine());
                    listTradisi.get(index-1).setNomorTelepon(NomorTelepon);
                    
                    System.out.print("Masukkan Nama Kostum         : ");
                    String NamaKostum = input.readLine();
                    listTradisi.get(index-1).setNamaKostum(NamaKostum);

                    System.out.println("Masukkan Ukuran Kostum           :");
                    int UkuranKostum = Integer.parseInt(input.readLine());
                    listTradisi.get(index-1).setUkuranKostum(UkuranKostum);
                    listTradisi.get(index-1).info(Nama);
                    System.out.println("================================================");
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }  
        }else if(pil == 2){
            if (listModern.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listModern.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listModern.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data Kostum yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listModern.size() || index > 0){
                     System.out.println("======= Masukkan data Kostum yang baru =======");

                    System.out.print("Masukkan Nama                      : ");
                    String Nama = input.readLine();
                    listModern.get(index-1).setName(Nama);

                    System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
                    String tanggalLahir = input.readLine();
                    listModern.get(index-1).setTanggalLahir(TanggalLahir);

                    System.out.print("Masukkan Jenis Kelamin             : ");
                    String jenisKelamin = input.readLine();
                    listModern.get(index-1).setJenisKelamin(JenisKelamin);

                    System.out.print("Masukkan Nomor Telepon             : ");
                    int NomorTelepon = Integer.parseInt(input.readLine());
                    listModern.get(index-1).setNomorTelepon(NomorTelepon);
                    
                    System.out.print("Masukkan Nama Kostum         : ");
                    String NamaKostum = input.readLine();
                    listModern.get(index-1).setNamaKostum(NamaKostum);

                    System.out.println("Masukkan Ukuran Kostum           :");
                    int UkuranKostum = Integer.parseInt(input.readLine());
                    listModern.get(index-1).setUkuranKostum(UkuranKostum);
                    listModern.get(index-1).info(Nama);
                    System.out.println("================================================");
                    }else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    
    public static void hapusData() throws IOException{
        System.out.println("Masukkan indeks data Kostum yang ingin dihapus : ");
        System.out.println("1. Kostum Tradisional");
        System.out.println("2. Kostum Modern");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){ 
        if (listPdk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
            for(int i = 0; i < listTradisi.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listTradisi.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data Kostum yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listTradisi.size() || index > 0) 
                {
                    listTradisi.remove(index-1);
                    System.out.println("Data Kostum dengan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (listModern.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listModern.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listModern.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data Kostum yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listModern.size() || index > 0) 
                {
                    listModern.remove(index-1);
                    System.out.println("Data Kostum dengan indeks " + index + " berhasil dihapus:");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
        
        
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           Program Pendataan Pemyewaan Kostum
                           ====================================
                           | 1. Menambah Data                 |
                           | 2. Melihat Data                  |
                           | 3. Mengubah Data                 |
                           | 4. Menghapus Data                |
                           | 5. Keluar Program                |
                           ====================================""");
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan program ini!");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah!");
                froze();
                break;
            }
        }
    }  
}
