package com.sau.flowcontrol;

public class MyClassCF01 {
    public static void main(String[] args) {
        // พิสูจน์ครั้งเดียวจริงทำ เท็จไม่ทำ
        int a = 50;
        if( a > 35 ){
            System.out.println("Hello...");
        }
        System.out.println("--------------------");
        String b = "xyz";
        if( b.equals("SAU")){
            System.out.println("Soutease Asia Univercity");
        }else {
            System.out.println("No no no...");
        }
    }
}
