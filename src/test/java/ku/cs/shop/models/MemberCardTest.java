package ku.cs.shop.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberCardTest {
    @Test
    @DisplayName("ยอดซื้อ 45 และ 65 รวม เป็น 110 บาท")
    void testAddPurchase(){
        MemberCard card = new MemberCard("john", "080-123-4567");
        card.addPurchase(45);
        card.addPurchase(65);
        double expected = 45 + 65; // คาดหวังว่า method ทำงานถูกต้อง แล้ว ให้ผลอย่างไร
        double actual = card.getCumulativePurchase(); // ค่าที่ได้จริงจากการคำนวณของ method
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ยอดซื้อ 49 และ 51 ได้แสตมป์ 1 ดวง")
    void testPointAfterAddPurchase() {
        MemberCard card = new MemberCard("John Smith", "080-123-4567");
        card.addPurchase(49);
        card.addPurchase(51);
        assertEquals(1, card.getStamp());
    }

    @Test
    @DisplayName("ยอดซื้อ -40 และ -15 ต้องไม่ถูกรวมในยอดซื้อรวม")
    void testAddNegativePurchase(){
        MemberCard card = new MemberCard("john","080-123-4567");
        card.addPurchase(-40);
        card.addPurchase(30.5);
        card.addPurchase(-15);
        assertEquals(30.5, card.getCumulativePurchase());
    }
//    @Test
//    void testUseEnoughStamp(){
//        MemberCard card = new MemberCard("john","080-123-4567");
//        card.addPurchase(500); // 10 stamp
//        card.useStamp(11);
//        assertEquals(true, card.getStamp(3));
//        assertEquals(7, card.getStamp());
//    }



}