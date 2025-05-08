package pertemuan701;

/**
 *
 * @author Febrianatha
 * TGL: 8 Mei 2025
 */
public class salam {
    String tx = "Menggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam() {
        System.out.println(this.tx);
    
    }
    public void tulisSalam(String txt) {
        System.out.println(txt);       
    }
    public void tulisSalam (int umur, String nama){
       System.out.println("Halo " + nama + "Kamu berusia " + umur + "tahun");
    
    }

    
}
