public class Bank {

    public static void main(String[] args) {

        
        Nasabah n=new Nasabah();
        n.nasabah("Ayu amaliyah");
        n.tabungan(5000000);
        n.ambilUang(2000000);
        n.ambilUang(50000,"Uang buat Makan");

        System.out.println(n.getSaldo());
       
        System.out.println();
        Nasabah n1=new Nasabah();
        n1.nasabah("Sheli indriani");
        n1.tabungan(1000000);
        n1.ambilUang(400000);
        n1.ambilUang(100000,"Uang buat makan");
        
        System.out.println("\nTotal Transaksi Ambil Uang : ");

        n1.getNamaNasabah();
        
    }
    
}
