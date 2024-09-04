/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT09;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham ("SP1","Gạo", 25000));
         ds.add(new SanPham ("SP2","Đường", 55000));
         ds.add(new SanPham ("SP3","Kẹo", 69000));
        try {
            // toạ luong ghi du lieu ra tap tin van ban
            FileWriter fv = new FileWriter("SanPham.txt");
            for (SanPham sp : ds) {
                // ghi du lieu ra file
                fv.write(sp.getMaSo() + ";" + sp.getTen() + ";" + sp.getGia()+"\n");
                
            }
            fv.close();
            System.out.println("Ghi Thành Công");
        } catch (Exception ex) {
            System.out.println("Loi Xay Ra"+ex.toString());
            System.out.println("Ghi File That Bai");
        }
    }
}
