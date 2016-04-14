package com.panther.demo.card;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by panther.dongdong on 2016/4/13.
 */
interface Play {
    public void shuffle(); //洗牌

    public void dealCard(PlayingCards.Card[] east, PlayingCards.Card[] south, PlayingCards.Card[] west,
                         PlayingCards.Card[] north); //发牌

    public void sort(PlayingCards.Card[] cards); //排牌
}

public class PlayingCards implements Play {
    private Card[] cards;

    public PlayingCards() {
        cards = new Card[52];
        int cur = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 13; ++j) {
                Card card = new Card();
                card.setSuit(i);
                card.setFace(j);
                cards[cur++] = card;
            }
        }
    }


    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public void shuffle() {
        for (int i = 0; i < 200; ++i) {
            Random rand = new Random();
            int index1 = rand.nextInt(52);//52内的随机数
            int index2 = rand.nextInt(52);//52内的随机数
            Card middle = cards[index1];
            cards[index1] = cards[index2];
            cards[index2] = middle;
        }
    }

    @Override
    public void dealCard(Card[] east, Card[] south, Card[] west, Card[] north) {
        int cur = 0;
        for (Card card : cards) {
            if (cur >= 0 && cur < 13) {
                east[cur++] = card;
            } else if (cur >= 13 && cur < 26) {
                south[cur - 13] = card;
                ++cur;
            } else if (cur >= 26 && cur < 39) {
                west[cur - 26] = card;
                ++cur;
            } else {
                north[cur - 39] = card;
                ++cur;
            }
        }
    }

    @Override
    public void sort(Card[] cards) {
        for (int i = 0; i < cards.length; ++i) {
            for (int j = i; j < cards.length; ++j) {
                if (cards[i].compareTo(cards[j]) > 0) {
                    Card middle = cards[i];
                    cards[i] = cards[j];
                    cards[j] = middle;
                }
            }
        }
    }

    interface Paper {
        public String display();
    }

    public class Card implements Paper, Comparable<Card>, Serializable {
        private static final long serialVersionUID = -6547791242956428424L;


        private int suit; //花色
        private int face; //大小

        public int getSuit() {
            return suit;
        }

        public void setSuit(int suit) {
            this.suit = suit;
        }

        public int getFace() {
            return face;
        }

        public void setFace(int face) {
            this.face = face;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Card card = (Card) o;

            if (face != card.face) return false;
            return suit == card.suit;

        }

        @Override
        public int hashCode() {
            int result = suit;
            result = 31 * result + face;
            return result;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "suit=" + suit +
                    ", face=" + face +
                    '}';
        }

        @Override
        public String display() {
            return "card:[" + Suit.getSuitByCode(this.suit).desc + Face.getFaceByCode(this.face).desc + "]";
        }

        @Override
        public int compareTo(Card card) {
            return this.getFace() - card.getFace() >= 0 ? 1 : -1;
        }
    }

    enum Suit {
        block(0, "方块"),
        plum(1, "梅花"),
        heart(2, "红桃"),
        spade(3, "黑桃");
        int code;
        String desc;

        Suit(int code, String desc) {
            this.desc = desc;
            this.code = code;
        }

        public static Suit getSuitByCode(int code) {
            Suit[] suits = Suit.values();
            for (Suit suit : suits) {
                if (suit.code == code) {
                    return suit;
                }
            }
            return null;
        }
    }


    enum Face {
        A3(0, "3"),
        A4(1, "4"),
        A5(2, "5"),
        A6(3, "6"),
        A7(4, "7"),
        A8(5, "8"),
        A9(6, "9"),
        A10(7, "10"),
        A11(8, "J"),
        A12(9, "Q"),
        A13(10, "K"),
        A14(11, "A"),
        A15(12, "2");

        int code;
        String desc;

        Face(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static Face getFaceByCode(int code) {
            Face[] faces = Face.values();
            for (Face face : faces) {
                if (face.code == code) {
                    return face;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Play play = new PlayingCards();
        Card[] east = new Card[13], south = new Card[13], west = new Card[13], north = new Card[13];
        play.shuffle(); //洗牌
        play.dealCard(east, south, west, north); //发牌
        play.sort(east); //排牌
        play.sort(south); //排牌
        play.sort(west); //排牌
        play.sort(north); //排牌

        System.out.println("-----------------------------------");
        System.out.println("east card:");
        //输出east
        for (Card card : east) {
            System.out.println(card.display());
        }

        System.out.println("\n\n-----------------------------------");
        System.out.println("south card:");
        //输出east
        for (Card card : south) {
            System.out.println(card.display());
        }

        System.out.println("\n\n-----------------------------------");
        System.out.println("west card:");
        //输出east
        for (Card card : west) {
            System.out.println(card.display());
        }

        System.out.println("\n\n-----------------------------------");
        System.out.println("north card:");
        //输出east
        for (Card card : north) {
            System.out.println(card.display());
        }
    }
}
