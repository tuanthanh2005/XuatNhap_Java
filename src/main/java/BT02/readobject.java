/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BT02;
import BT09.SanPham;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class readobject {
    public static void main(String[] args) {
          ArrayList<SanPham> ds ;
        try {
            FileInputStream rd = new FileInputStream("SanPham.bin");
            ObjectInputStream br = new ObjectInputStream(rd);
            ds = (ArrayList<SanPham>)br.readObject();
          br.close();
          
             System.out.println("Đã Đọc Xong");
     
            for (SanPham sp : ds) {
                System.out.println(sp);
            }
        } catch (Exception ex) {
             System.out.println("Loi Xay Ra"+ex.toString());
            System.out.println("Ghi File That Bai");
        }
    
    }
}
