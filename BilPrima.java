import java.util.Scanner;
public class BilPrima {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Angka:");
        int angka = input.nextInt();
        boolean BilPrima = true;
        
        for(int index=2; index<=angka/2; index++){
            if(angka%index ==0){
                BilPrima = false;
                break;

            }
        }

        if(BilPrima && ((angka > 0 )&&(angka != 1)))
            System.out.println(angka+ " Angka Tersebut Adalah Bilangan Prima");
        else
            System.out.println(angka+ " Angka Tersebut Bukan Bilangan Prima");
    
    input.close();

    }
}