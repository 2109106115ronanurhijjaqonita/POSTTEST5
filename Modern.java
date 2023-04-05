package posttest5;


// abstract class
public abstract class Data { 
    protected  final String provinsi = "Balikpapan, Kalimantan Timur"; // final pada atribut
    private  String Nama; 
    private  String TanggalLahir;
    String jenisKelamin;
    private  int NomorTelepon;
    

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String Nama, String tanggalLahir, String jenisKelamin, int NomorTelepon) {
        this.Nama = Nama; // untuk menginisialisasi atribut "name"
        this.TanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.NomorTelepon= NomorTelepon;
       
    }

    public String getProvinsi() {
        return provinsi;
    }

    public String getName() {
        return name;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getNomorTelepon() {
        return NomorTelepon;
    }
    
  

    
    
     //Overloading
    public void info(String name){
        System.out.println("\tData Kostum dengan Nama " + Nama + "  berhasil ditambahkan!" );
    }
    
    //Overloading
    public void info(int nik){
        System.out.println("\tData KTP dengan NIK " + nik + " berhasil diubah !");
    }
    
    
    // abstract method  
    public abstract void tampil();
  
}
