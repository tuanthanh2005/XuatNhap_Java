/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Readtextfile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds =new ArrayList<>();
        try {
            FileReader rd = new FileReader("SanPham.txt");
            BufferedReader br = new BufferedReader(rd);
            String data=null;
            while((data = br.readLine())!=null){
               String[] arr = data.split(";");
               ds.add(new SanPham(arr[0],arr[1],Float.parseFloat(arr[2])));
            }
            br.close();
             System.out.println("Đã Đọc Xong");
            System.out.println("kết Quả Đọc");
            for (SanPham x : ds) {
                System.out.println("");
            }
        } catch (Exception ex) {
             System.out.println("Loi Xay Ra"+ex.toString());
            System.out.println("Ghi File That Bai");
        }
    }
}
