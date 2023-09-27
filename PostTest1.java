/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;
import java.util.ArrayList;

/**
 *
 * @author donik
 */
public class PostTest1 {
    public static void main(String[] args) {
            // Buat ArrayList untuk Remot
            ArrayList<Remote> remotes = new ArrayList<>();

            // Isi ArrayList dengan objek Remot
            remotes.add(new Remote("Sony", true));
            remotes.add(new Remote("LG", false));
            remotes.add(new Remote("Samsung", true));
            remotes.add(new Remote("Panasonic", false));
            remotes.add(new Remote("Philips", true));

            // Tampilkan informasi tentang setiap Remot
            for (Remote remote : remotes) {
                System.out.println("Merek: " + remote.brand + ", Mahal: " + (remote.harga ? "Ya" : "Tidak"));
            }
        }
}
