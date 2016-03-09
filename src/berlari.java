package lari;
public class berlari {
    private int total,jumlahputaran,jumlahwaktu,panjang,lebar,tercepat,win;
    //berlari (){
      //this.panjang = panjang;
        //this.lebar = lebar;
        //this.jumlahwaktu =jumlahwaktu;
        //this.jumlahputaran = jumlahputaran;
    
  public void setpanjang (int panjang){
       this.panjang = panjang;
   }public void setlebar (int lebar){
       this.lebar = lebar;
   }
   public void setjumlahwaktu(int jumlahwaktu){
       this.jumlahwaktu = jumlahwaktu;
   }public void setjumlahputaran (int jumlahputaran ){
      this.jumlahputaran = jumlahputaran;
   }public int getjumlahputaran (){
    return jumlahputaran;
}public int getjumlahwaktu (){
    return jumlahwaktu;
}
   public void settotal (){
       total = (2*(panjang+lebar)*jumlahputaran);
   }public int gettotal (){
       return total;
      
   }
}
