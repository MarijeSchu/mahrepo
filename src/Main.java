import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

     Cards card = new Cards(11,1);
        System.out.println(card);


        Cards[] kaart = new Cards[52];
        if (kaart[0] == null) {
            System.out.println("No card yet!");
        }
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                kaart[index] = new Cards(rank, suit);
                index++;
            } }
        System.out.println(Arrays.toString(kaart));


    }

}
