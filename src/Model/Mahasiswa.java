/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author A442UF
 */
public class Mahasiswa {
    private String NRP, Nama, Alamat, Email, Gender, NoHP;

    public Mahasiswa() {
    }

    public Mahasiswa(String NRP, String Nama, String Alamat, String Gender, String NoHP) {
        this.NRP = NRP;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Email = Email;
        this.Gender = Gender;
        this.NoHP = NoHP;
    }

    public Mahasiswa(String NRP, String Nama, String Alamat, String Gender, String NoHP, String aktif) {
        this.NRP = NRP;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Email = Email;
        this.Gender = Gender;
        this.NoHP = NoHP;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }
    

    @Override
    public String toString() {
        return "Mahasiswa{" + "NRP=" + NRP + ", Nama=" + Nama + ", Alamat=" + Alamat + ",Email="+ Email + ", Gender=" + Gender + ", NoHP=" + NoHP + '}';
    }
    
}
