/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listmahasiswa;

/**
 *
 * @author master
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private float IPK;
    
    public void sebutkanNIM(){
        System.out.println("NIM saya adalah : " + getNim());
    }
    
    public void sebutkanNama(){
        System.out.println("Nama saya adalah : " + getNama());
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAngkatan(){
        String angkatan;
        
        angkatan="20" + nim.substring(0, 2);
        return angkatan;
    }
    
    public String getJurusan(){
        String jurusan;
        String namaJurusan;
        
        jurusan=nim.substring(2, 4);
        switch(jurusan){
            case "10":
                namaJurusan="Manajemen Informatika";
                break;
            case "11":
                namaJurusan= "Sistem Informasi";
                break;
            case "21":
                namaJurusan= "Teknik Informatika";
                break;
            default :
                namaJurusan="Salah Jurusan";
        }
        return namaJurusan;
    }

    /**
     * @return the IPK
     */
    public float getIPK() {
        return IPK;
    }

    /**
     * @param IPK the IPK to set
     */
    public void setIPK(float IPK) {
        if ((IPK>4) || (IPK<0)){
            System.out.println("Range IPK antara 0 - 4");
            IPK=0;
        }
        else
        this.IPK = IPK;
    }
    
    public String getGrade(){
        if (IPK>3)
            return "A";
        else if (IPK>2)
            return "B";
        else if (IPK>1)
            return "C";
        else
            return "D";
    }
}
