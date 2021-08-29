package ku.cs.shop.services;

import ku.cs.shop.models.MemberCard;
import ku.cs.shop.models.MemberCardList;

public class MemberCardListHardCodeDataSource {
    private MemberCardList cardList;

    public MemberCardListHardCodeDataSource() {
        cardList = new MemberCardList();
        readData();
    }

    public void readData() {
        MemberCard john = new MemberCard("John Smith", "081-222-8888");
        MemberCard anna = new MemberCard("Anna Frost", "082-333-9999", 135);
        MemberCard harry = new MemberCard("Harry Potter", "083-444-0000", 40000);
        cardList.addCard(john);
        cardList.addCard(anna);
        cardList.addCard(harry);
        cardList.addCard(new MemberCard("Charles Babbage", "091-777-6543", 800));
        // นิสิตสามารถเพิ่มข้อมูล Card ได้เอง ให้เพิ่มอีก 5 cards
        // โดยมี 1 ใน 5 cards กำหนดชื่อนิสิตเอง และกำหนดเบอร์โทรเป็นรหัสนิสิตของนิสิต
        // และกำหนด stamp ตามที่นิสิตต้องการ
        cardList.addCard(new MemberCard("Rawipas Damdenngam", "6310451367", 999));
        cardList.addCard(new MemberCard("Bobo Putanginamo", "087-515-9999", 400));
        cardList.addCard(new MemberCard("Cyaka Blyat", "084-841-4451", 8000));
        cardList.addCard(new MemberCard("Wind Ranger", "089-969-5412", 4000));
        cardList.addCard(new MemberCard("Joker Omlet", "094-865-9421", 500));

    }

    public MemberCardList getCardList() {
        return cardList;
    }

}
