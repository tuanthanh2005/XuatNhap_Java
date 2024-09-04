/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

import BT09.SanPham;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class writeobject {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("SanPham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < 3; i++) {
                System.out.println("Thông tin San Pham "+(i+1));
                System.out.println("Nhap Ma");
                String maSo = sc.nextLine();
                System.out.println("Nhap ten");
                String ten = sc.nextLine();
                System.out.println("Nhap gia");
                float gia = sc.nextFloat();
                sc.nextLine();
                SanPham sp =new SanPham(maSo, ten, gia);
                        ds.add(sp);
            }
            oos.writeObject(ds);
            
            oos.close();
            System.out.println("Đã Ghi XOng");
        } catch (Exception e) {
            System.out.println("Loi Xay Ra"+e.toString());
        }
    }
}
