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
public class Warna {
    private String warna;
    
    public static void setMerah(){
        System.out.println("\u001B[0m" + "Warna Favoritmu adalah " + "\u001b[31m" + "MERAH");
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang Sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    } 
    
    public static void setHijau(){
        System.out.println("\u001B[0m" + "Warna Favoritmu adalah " + "\u001b[32m" + "HIJAU");
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Tegus pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    
    public static void setKuning(){
        System.out.println("\u001B[0m" + "Warna Favoritmu adalah " + "\u001b[33m" + "KUNING");
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    
    public static void setBiru(){
        System.out.println("\u001B[0m" + "Warna Favoritmu adalah " + "\u001b[34m" + "BIRU");
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }
    
    public static void setUngu(){
        System.out.println("\u001B[0m" + "Warna Favoritmu adalah " + "\u001b[35m" + "UNGU");
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }
    
    public void setWarna(String warna) {
        String strUpper = warna.toUpperCase();
        this.warna = strUpper;
    }

    public String getWarna() {
        return warna;
    }
    
    public void pilihWarna(){
        switch(getWarna()) {
            case "MERAH":
                setMerah();
                break;
            case "HIJAU":
                setHijau();
                break;
            case "KUNING":
                setKuning();
                break;
            case "BIRU":
                setBiru();
                break;
            case "UNGU":
                setUngu();
                break;
            default:
                System.out.println("Oops.. Belum teridentifikasi");
        }
    }
    
}