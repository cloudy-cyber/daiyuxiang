package club.banyuan.June18.doudizhu;
import java.util.Arrays;
public class Player {
    private Card[] cards;
    private String role;
    private int cardLeft;
    private String name;

    public Player(String name,String role) {
        this.name = name;
        this.role = role;
        int cardsTotal=17;
        if("地主".equals(role)){
        cardsTotal=20;
        }
        cards=new Card[cardsTotal];
    }
    public void receiveCard(Card card) {
        cards[cardLeft++] = card;
    }

    public String toString() {
        return name + Arrays.toString(cards);
    }

    public boolean isFull() {
        return cards.length == cardLeft;
    }
}
