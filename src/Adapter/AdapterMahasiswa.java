/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Controller.ExecuteMahasiswa;
import Model.Mahasiswa;
import java.util.List;

/**
 *
 * @author A442UF
 */
public class AdapterMahasiswa {
    public Object[][] getAllMhs(){
      ExecuteMahasiswa em = new ExecuteMahasiswa();
      List<Mahasiswa> lstmhs = em.ListMhs();
      Object[][] datamhs = new Object[lstmhs.size()][6];
      
      int mysize=0;
      for(Mahasiswa mhs:lstmhs){
          datamhs[mysize][0]=mhs.getNRP();
          datamhs[mysize][1]=mhs.getNama();
          datamhs[mysize][2]=mhs.getAlamat();
          datamhs[mysize][3]=mhs.getGender();
          datamhs[mysize][4]=mhs.getEmail();
          datamhs[mysize][5]=mhs.getNoHP();
          mysize++;
      }
      return datamhs;
    }  
}
