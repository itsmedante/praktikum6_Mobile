package com.modul_6.modul6_336;


public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.100.57/db_android/insert.php";
    public static final String URL_GET_ALL = "http://192.168.100.57/db_android/read.php";
    public static final String URL_GET_MHS = "http://192.168.100.57/db_android/select.php?id=";
    public static final String URL_UPDATE_MHS = "http://192.168.100.57/db_android/update.php";
    public static final String URL_DELETE_MHS = "http://192.168.100.57/db_android/delete.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_JURUSAN = "jurusan"; //desg itu variabel untuk posisi
    public static final String KEY_MHS_EMAIL = "email"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";


    public static final String MHS_ID = "mhs_id";
}
