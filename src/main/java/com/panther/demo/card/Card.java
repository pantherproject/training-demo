//package com.panther.demo.card;
//
//import java.io.Serializable;
//
///**
// * Created by panther.dongdong on 2016/4/13.
// */
//
//public class Card implements Serializable {
//    private static final long serialVersionUID = -6547791242956428424L;
//
//
//    private int suit; //花色
//    private int face; //大小
//
//    public int getSuit() {
//        return suit;
//    }
//
//    public void setSuit(int suit) {
//        this.suit = suit;
//    }
//
//    public int getFace() {
//        return face;
//    }
//
//    public void setFace(int face) {
//        this.face = face;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Card card = (Card) o;
//
//        if (face != card.face) return false;
//        if (suit != card.suit) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = suit;
//        result = 31 * result + face;
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Card{" +
//                "suit=" + suit +
//                ", face=" + face +
//                '}';
//    }
//
//    public String display() {
//        return new StringBuilder("card:[suit:").append(this.suit).append(",face:").append(this.face).append("]").toString();
//    }
//}
