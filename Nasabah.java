public class Nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    int nomerAntrian=0;
    
    public void nasabah(String nama){
         namaNasabah=nama;
        // System.out.println("Nama Nasabah " + nama);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("Saldo tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Penarikan sukses.");
            nomerAntrian++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println("Saldo tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Penarikan " + uang + " sukses.");
            nomerAntrian++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }

    public void getNamaNasabah(){
        System.out.println("Nama Nasabah :" + namaNasabah);
    }
   
}
