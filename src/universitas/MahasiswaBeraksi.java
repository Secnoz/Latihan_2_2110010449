package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa aan = new Mahasiswa();
        aan.getDetail(); 
        
        System.out.println("Nama : " + aan.getNama());
        System.out.println("NPM : " + aan.NPM);
        System.out.println("Prodi : " + aan.Prodi);
    }
}
