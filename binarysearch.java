public class binarysearch {
    
    public static int main(int[] list, int nilai) {
        int Terbawah = 0; int Tertinggi = list.length - 1;

        while (Tertinggi >= Terbawah ) {
            int pertengahan = (Terbawah + Tertinggi) / 2;

            if ( nilai < list[pertengahan])
                Tertinggi = pertengahan - 1;
            else    
                if (nilai == list[pertengahan])
                return pertengahan;
            else
                Terbawah = pertengahan + 1;
        }
            return -1; 
    }

    public static void main(String args []) {
        int listarray [] = {10, 12, 14, 17, 21, 55, 78, 89, 101, 121, 144};
        int x = 121;

        int i = binarysearch.main(listarray, x); 
            
            System.out.println("Angka " + x + " merupakan index ke-" + i );  
        
    }
}