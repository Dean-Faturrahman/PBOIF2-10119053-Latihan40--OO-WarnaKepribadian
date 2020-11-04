/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan40.oo.warnakepribadian;

import java.util.Scanner;
import data.Orang;
import data.Warna;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program warna kepribadian
 */
public class PBOIF210119053Latihan40OOWarnaKepribadian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Orang person = new Orang();
        Warna colour = new Warna();
        
        System.out.println("\u001b[31m" + "YUK" + "\u001b[32m" + " CEK" + "\u001b[33m" + " KEPRIBADIANMU" + "\u001b[36m" + " DARI" + "\u001b[35m" + " WARNA" + "\u001b[34m" + " FAVORITMU");
        System.out.println("");
        System.out.println("\u001B[41m" + "\u001b[37m" + "          MERAH          ");
        System.out.println("\u001B[42m" + "\u001b[37m" + "          HIJAU          ");
        System.out.println("\u001B[43m" + "\u001b[37m" + "          KUNING         ");
        System.out.println("\u001B[44m" + "\u001b[37m" + "          BIRU           ");
        System.out.println("\u001B[45m" + "\u001b[37m" + "          UNGU           ");
        System.out.println("\u001b[30m");
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        colour.setWarna(input.next());
        System.out.print("NAMA KAMU : ");
        person.setNama(input.next());
        System.out.println("");
        
        person.tampilNama();
        colour.pilihWarna();
    }
     
}