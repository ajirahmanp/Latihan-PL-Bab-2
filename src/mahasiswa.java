package lari;
public class mahasiswa {
    private String nama,nim;
    private int jumlahmhs;
    mahasiswa(String n,String nim){
        nama = n;
        this.nim = nim;
        this.getjumlahmhs();
    }
    //public void setnama(String n){
    //   nama = n;
    //}
    //public void setnim (String nim){
     //   this.nim = nim;
    //}
    
    public void setjumlahmhs (int jumlahmhs){
        this.jumlahmhs = jumlahmhs;
    }
    public int getjumlahmhs (){
        return jumlahmhs;
    }public String getnama (){
        return nama;
    }public String getnim(){
        return nim;
    }//public double getwin (){
    //  return total/jumlahwaktu;
    
}
