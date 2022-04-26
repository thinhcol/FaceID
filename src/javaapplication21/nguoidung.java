/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author Admin
 */
public class nguoidung {
    int id;
    String ten,sdt,email,hinh;

    public nguoidung(String ten, String email, String hinh) {
        this.ten = ten;
        this.email = email;
        this.hinh = hinh;
    }
    
    public nguoidung(int id, String ten, String sdt, String email) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public nguoidung() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
