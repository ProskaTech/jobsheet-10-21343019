package Tugas;

import java.util.Scanner;

/*
 * Created By 21343019 Arafil Azmi
 */

public class NilaiMahasiswa {
    String nama_mhs, smt;
    int nim;
    float ip;
    
    public void inputdatanilai(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Mahasiswa        : ");
        nama_mhs = input.nextLine();
        System.out.print("Masukan Semester Mahasiswa    : ");
        smt = input.nextLine();
        System.out.print("Masukan NIM Mahasiswa         : ");
        nim = input.nextInt();
        System.out.print("Masukan IP Semester Mahasiswa saat ini    : ");
        ip = input.nextFloat();
    }

    public void infonilai(){
        System.out.println("Nama Mahasiswa  : " + nama_mhs);
        System.out.println("NIM             : " + nim);
        System.out.println("Semester        : " + smt);
        System.out.println("IP Semester ini : " + ip);

        if(ip >= 3.5){
            System.out.println("Anda berhak mengontrak 24 SKS pada Semester V");
        }
        else if((ip < 3.5) && (ip >=3.0)){
            System.out.println("Anda hanya berhak mengontrak 22 SKS pada Semester V");
        }
        else if((ip < 3.0) && (ip >= 2.5)){
            System.out.println("Anda hanya berhak mengontrak 20 SKS pada Semester V");
        }
        else if((ip < 2.5) && (ip >= 2.0)){
            System.out.println("Anda hanya berhak mengontrak 18 SKS pada Semester V");
        }
        else{
            System.out.println("Anda hanya berhak mengontrak 15+ SKS pada Semester V");
        }
    }

    public static void main(String[] args) {
        NilaiMahasiswa A = new NilaiMahasiswa();
        A.inputdatanilai();
        System.out.println("\n=====================================\n");
        A.infonilai();
    }
}