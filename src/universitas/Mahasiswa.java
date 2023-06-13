
package universitas;

public class Mahasiswa {
    String NPM;
    String Nama;
    String Prodi;
    
    void getDetail(){
        System.out.println("NPM : " + this.NPM);
        System.out.println("Nama : " + this.Nama);
        System.out.println("Prodi: " + this.Prodi);
    }
    public Mahasiswa(){
        this.NPM = "2110010449";
        this.Nama = "Muhammad Anshari";
        this.Prodi = "Ti";
    }
    
    //getter
    public String getNama(){
        return this.Nama;
    }
    //setter
    public void setProdi(){
        this.Prodi = "Ti";
    }
    
}