package com.sau.flowcontrol;

public class MyClassCF02 {
    public static void main(String[] args) {
        // พิสูจน์หลายครั้ง ; if-else-if ใช้ได้ทุกกรณ๊
        // switch-case ใช้ได้เฉพาะพิสูจน์เท่่ากันหรือไม่เท่ากัน
        int score = 75;
        if( score > 88 ){
            System.out.println("Grade A");
        }else if(score > 78){
            System.out.println("Grade B");
        }else if(score > 60){
            System.out.println("Grade C");
        }else if(score > 50){
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
        System.out.println("-------------------------");
        //switch-case ใช้ได้เฉพาะพิสูจน์ว่าเท่ากันหรือไม่เท่านั้น และใช้ไม่ได้กับทศนิยม

        int busNumber = 84;
        switch (busNumber){
            case 80 :
                System.out.println("Go to PATA");
                break;
            case 81 :
                System.out.println("Go to Siriraj");
                break;
            case 84 :
                System.out.println("Go to Wat rai khing");
                break;
            case 123 :
                System.out.println("Go to Central Pinkhao");
                break;
            default:
        }
    }
}
