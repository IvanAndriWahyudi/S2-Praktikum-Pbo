package OOP;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String text = "Belajar OOP Programming";
	    String text2 = "Programming";
        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.length());
        System.out.println(text.substring(0,7));
        System.out.println(text.contains(text2));

        //Single IF
        if("Belajar OOP Programming".equals(text)){
            System.out.println("Iya Sama");
        }

        //Nested IF
        if(text2.equals("Belajar")){
            System.out.println("Isinya Belajar");
        }else if (text2.equals("Programming")){
            System.out.println("Isinya Programming");
        }else{
            System.out.println("ALTERNATIF");
        }

        //Nested IF
        if (text2.equals("Belajar")){
            System.out.println("Isinya Belajar");
        }else if(text2.equals("Programming")){
            if (text.equals("")){
                System.out.println("ISI TEXT KOSONG");
            }else{
                System.out.println("ISI TEXT ADA");
            }
        }else{
            System.out.println("ALTERNATIF");
        }

        //Switch case
        String pilih  = "s";
        switch(pilih){
            case "a":
                System.out.println("ISINYA A");
                break;
            case "b":
                System.out.println("ISINYA B");
                break;
            default:
                System.out.println("GAK ADA YANG BENAR");
                break;
        }

    }
}
