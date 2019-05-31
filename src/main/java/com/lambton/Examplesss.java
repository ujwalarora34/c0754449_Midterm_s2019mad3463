package com.lambton;

public class Examplesss {
    public static void main(String[] args) {
        System.out.println(reverse("Ujwal") );

        //-----------------binary to decimal
        btod("1010");
        //---------------
        initials("Ujwal Arora Arorra");

    }
    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
    public static String btod(String binaryString){
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
        return new String(binaryString);
    }

    public static String initials(String name){
        String[] words = name.split("\\s+");
        if (name == null || name.isEmpty()) {
            return null;
        }
        else if (words.length<3){
            System.out.println("Invalid");
        }
        else{

            String[] myName = name.split(" ");
            for (int i = 0; i < 2; i++) {
                String s = myName[i];
                System.out.println(s.charAt(0));

            }
            System.out.println(myName[2]);
        }



        return new String(name);
    }
}
}
