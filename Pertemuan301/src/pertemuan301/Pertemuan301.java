
package pertemuan301;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aw=0;
        Scanner dtIN = new Scanner(System.in);
        System.out.print("Nilai Awal: ");
        aw = Integer.parseInt( dtIN.nextLine() );
        
        
                
        int awa1 = aw;
        int akhir = 10;
        System .out.print ("Nilai Akhir: ");
        akhir = Integer.parseInt(dtIN.nextLine());
        
        System.out.println ("Perulangan While");
        while(awa1<akhir){
            System.out.println("Perulangan ke-"+awa1);
            awa1++;  //awal=awa1+1
        }
        System.out.println("Perulangan do .. while");
        awa1 = aw;
        do{
            System.out.println("Perulangan ke-"+awa1);
            awa1++;
        }while(awa1<akhir);
        
        System.out.println("Perulangan for");
        for(awa1= aw;awa1<akhir;awa1++){
            System.out.println("Perulangan ke-"+awa1);
        }
        
        
    }
    
}
