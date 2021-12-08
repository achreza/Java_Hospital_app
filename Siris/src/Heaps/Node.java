/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

/**
 *
 * @author 62852
 */
public class Node {
    private int NIK;
   private String nama;
   private int umur;
   private String jk;
   private String telpon;
   private String alamat;

    public Node(int NIK,String nama, int umur, String jk, String telpon, String alamat) {
        this.NIK = NIK;
        this.nama = nama;
        this.umur = umur;
        this.jk = jk;
        this.telpon = telpon;
        this.alamat = alamat;
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
   
   
    
}
