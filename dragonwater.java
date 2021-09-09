import java.util.Arrays;

public class dragonwater {
    public static void main(String[] args){
        int[] Aether = {1, 5, 7};
        int[] Dvalin = {7, 4, 9 };
        Arrays.sort(Aether);
        Arrays.sort(Dvalin);

        int indeksDvalin = 0;
        int power = 0;
        for (int p : Aether) {
            if (indeksDvalin < Dvalin.length) {
                if(p >= Dvalin[indeksDvalin]) {
                    power += p;
                    indeksDvalin++;
                }
            }
        }
        if(indeksDvalin == Dvalin.length) {
            System.out.println("Minimum Height :" + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}