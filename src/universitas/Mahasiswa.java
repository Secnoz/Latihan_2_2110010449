
package universitas;

public class Mahasiswa {
    String NPM;
    String Nama;
    String Prodi;
    
    public Mahasiswa(){
        this.NPM = "2110010449";
        this.Nama = "Muhammad Anshari";
        this.Prodi = "TI";
    }
    
    public String getDetail(){
       return this.NPM;
    }
    
    public String getMhs(){
        return this.Nama;
    }
}