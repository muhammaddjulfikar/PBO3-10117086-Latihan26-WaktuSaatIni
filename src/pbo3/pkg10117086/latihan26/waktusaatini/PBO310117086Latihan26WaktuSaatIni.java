/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM : program mengetahui data waktu
 */
public class PBO310117086Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka

//     format tanggal dan waktu
        SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

//     data array -> nama hari Indonesia
        String[] strDays = new String[]{"Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
             "Kamus", "Jumat"};

//     menampilkannya sesuai format
        System.out.println("Hari ini adalah hari : " + (strDays[daysOfWeek]) + " ,"
                + formatIndo.format(date));

    }

}
