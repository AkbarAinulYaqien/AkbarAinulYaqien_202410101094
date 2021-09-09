public class ganjilgenap {
    
    public static void main(String[] args) {
        int nilai[] = { 1, 2, 3, 5, 22, 55, 66, 88, 111, 232, 1095, 1242, 5551, 177522 };
        
        System.out.println("");
        System.out.println("\t Ganjil & Genap  \n ");

        System.out.print("\n Genap : ");
            for (int x = 0; x < 14; x++) {
                if (nilai[x] % 2 == 0) {
                System.out.print(nilai[x] + ", ");
            }
        }
        System.out.print("\n Ganjil : ");
        for (int y = 0; y < 10; y++) {
            if (nilai[y] % 2 != 0) {
                System.out.print(nilai[y] + ", ");
            }     
        }
    }
}
