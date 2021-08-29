package ku.cs.shop.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberCardListTest {
    @Test
    void testAddCard(){
        MemberCardList list = new MemberCardList();
        list.addCard(new MemberCard("A","081-554-1234"));
        list.addCard(new MemberCard("B","081-123-1234"));
        list.addCard(new MemberCard("C","081-456-1234"));
        assertEquals(3, list.countCard());

    }

}