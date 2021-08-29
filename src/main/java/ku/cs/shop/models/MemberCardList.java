package ku.cs.shop.models;
import java.util.ArrayList;

public class MemberCardList {
    private ArrayList<MemberCard> cards;

    public MemberCardList() {
        // ใช้ new เพื่อสร้าง instance ของ ArrayList
        cards = new ArrayList<>();
    }
    public void addCard(MemberCard card) {
        // เรียก method add จาก ArrayList เพื่อเพิ่มข้อมูล
        cards.add(card);
    }
    public ArrayList<MemberCard> getAllCards() {
        return cards;
    }

    public  int countCard(){
        return  cards.size();
    }

    public double totalStamp(){
        int total = 0;
        for (MemberCard card: cards) {
            total += card.getStamp();
        }
        return total;
    }

    public MemberCard searchMemberCardByPhone(String phone){
        MemberCard card = null;
        for (MemberCard c:cards
             ) {if (c.checkPhone(phone)){
                 card = c;
                 break;
            }
        }
        return card;
    }

    public void addPurchase(String phone,double purchase){
        MemberCard card = searchMemberCardByPhone(phone);
        card.addPurchase(purchase);
    }

    public void useStamp(String phone,int stamp){
        MemberCard card = searchMemberCardByPhone(phone);
        card.useStamp(stamp);
    }



}
