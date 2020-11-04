/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Dean
 */
public class Orang {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void tampilNama(){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + " ===");
    }
}