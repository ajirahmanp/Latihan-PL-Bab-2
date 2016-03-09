
package lari;
import java.util.Scanner;
public class Lari {
    public static void main(String[] args) {
        int t,jml,panjang,lebar,max=0;
        Scanner input = new Scanner (System.in);
        Scanner in = new Scanner (System.in); 
        System.out.println("Jumlah Mahasiswa : ");
        jml = in.nextInt();
        System.out.println("Ukuran Lapangan (Meter)(P*L) : ");
        panjang = in.nextInt();
        lebar = in.nextInt();
        mahasiswa [] m = new mahasiswa[jml];
        berlari [] b = new berlari [jml];
        System.out.println("NIM,Nama_Mahasiswa,Jumlah_Putaran,Jumlah_waktu");
        System.out.println("##Input##");
        for (int x = 0;x<jml;x++){
        b[x] = new berlari();
        b[x].setpanjang(panjang);
        b[x].setlebar(lebar);
        String nama = in.next();
        String nim = in.next();
        m[x] = new mahasiswa(nim,nama);
        b[x].setjumlahputaran(in.nextInt());
        b[x].setjumlahwaktu(in.nextInt());
        b[x].settotal();
        }
        System.out.println("##Output##");
        for (int x =0;x<jml;x++){
        System.out.println(""+m[x].getnama());
        System.out.println(""+b[x].gettotal());
        }
        int almat=0;
        for (int x =0;x<jml;x++){
            if ((b[x].gettotal()/b[x].getjumlahwaktu())>max){
                max = b[x].gettotal();
                almat = x;
            }
        }
        System.out.println("Max : "+ m[almat].getnama());
    }
    
}
