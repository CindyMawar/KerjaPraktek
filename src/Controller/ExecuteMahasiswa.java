/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A442UF
 */
public class ExecuteMahasiswa {
    public String InsertMahasiswa(Mahasiswa mhs){
        String query ="INSERT INTO mahasiswa(NRP_mhs , Nama_mhs , Alamat_mhs , Gender_mhs , Email_mhs , Nohp_mhs)" + " VALUES(?,?,?,?,?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mhs.getNRP());
            pstm.setString(2, mhs.getNama());
            pstm.setString(3, mhs.getAlamat());
            pstm.setString(4, mhs.getGender());
            pstm.setString(5, mhs.getEmail());
            pstm.setString(6, mhs.getNoHP());
            pstm.executeUpdate();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            ex.printStackTrace();
        }
        conMan.Logoff();
        return Respon;
    }
    
    public List<Mahasiswa> ListMhs(){
//        List<Mahasiswa> arlistmhs = new ArrayList<>();
        List<Mahasiswa> arrlist= new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNRP(rs.getString("NRP_mhs"));
                mhs.setNama(rs.getString("Nama_mhs"));
                mhs.setAlamat(rs.getString("Alamat_mhs"));
                mhs.setGender(rs.getString("Gender_mhs"));
                mhs.setEmail(rs.getString("Email_mhs"));
                mhs.setNoHP(rs.getString("Nohp_mhs"));
                
                arrlist.add(mhs);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        conMan.Logoff();
        return arrlist;
    }
    
    public String UpdateMahasiswa(Mahasiswa mhs){
          String hasil="";
         String query ="update mahasiswa SET Nama_mhs='"+mhs.getNama()+"',Alamat_mhs='"+mhs.getAlamat()+
                 "',Gender_mhs='"+mhs.getGender()+"',Email_mhs='"+mhs.getEmail()+
               "',Nohp_mhs='"+mhs.getNoHP()+"'where NRP='"+mhs.getNRP()+"'";
        // 
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
             stm.executeUpdate(query);
             hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;    
    }
    
     public String deletemahasiswa(String mhs){
        String hasil ="";
        String query="delete from tbl_mahasiswa where NRP='"+mhs+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;  
    }

}
