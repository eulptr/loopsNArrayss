public class Main {
    public static void main(String[] args) {
//        String name = "Eulalija";
//        System.out.println(name.contains("a"));
//        System.out.println(name.contains("h")); // true/false ar yra zodyje pvz raide a, h
//        System.out.println(name.toLowerCase()); // padaro vis1 zodi mazom raidem nepakeiciant originalo
//        System.out.println(name.charAt(7)); //paima zodi ir parodo jo (7) raide
//        System.out.println(name.length()); // nurodys zodzio raidziu skaiciu
//        System.out.println(name.repeat(10)); // parasys tiek kartu, koki skaiciu irasysi
//        System.out.println(name.equals("eulalija")); //tekstu lyginimui. galima naudoti if("a") =="A")
//        System.out.println(name.isEmpty());
//        System.out.println(name.trim()); //panaikina tarpus
//        System.out.println(name.substring()); // teksto fragmentas, galima naudoti nuo kurios vietos paimti zodi
//        System.out.println(name.replace()); //pakeicia raides, pazymejus is kurios (target) i kuria(replacement)
//        System.out.println(name.replaceFirst); // pakeicia pirma raide

        System.out.println();
        System.out.println("<1 uzduotis>");
        String name = "Liam";
        String surname = "Neeson";

        System.out.println(name.length());

        if (name.length() < surname.length()) {
            System.out.println(name);
        } else {
            System.out.println(surname);
        }
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        String in = name.charAt(0) + "" + surname.charAt(0);
        System.out.println(in); //3 uzduotis

        String in1 = name.substring(0,1) + surname.substring(0,1);
        System.out.println(in1); // 3 uzduotis 2 variantas


        System.out.println("<4 uzduotis>");
        String a = "Liam";
        String b = "Neeson";
        int ilgis = a.length();
        int ilgis2 = b.length();
        String result = "";

        if(a.length() < 3 ) {
            result += a;
        }else{
            result += a.substring(a.length() -3);
        }
        if(b.length() < 3) {
            result += b;
        }else{
            result += b.substring(b.length() -3);
        }
        System.out.println(result);

        System.out.println("<5 uzduotis>");

        String aaip = "An American In Paris";
        System.out.println(aaip.replaceAll("[a,A]", "*"));
        System.out.println();


        System.out.println("<6 uzduotis>");
        String balses = "An American in Paris";
        String bebalsiu = "";
        bebalsiu = balses.replaceAll ("[a,i,e,y,o]", "");
        System.out.println("Be balsiu:" + bebalsiu);

        balses = "Breakfast at Tiffany's";
        bebalsiu = balses.replaceAll("[a, e, i, y, o, u]", "");
        System.out.println("Be balsiu:" + bebalsiu);

        balses = "2001: A Space Odyssey";
        bebalsiu = "";
        bebalsiu = balses.replaceAll("[a, e,i,y, o, u]", "");
        System.out.println("Be balsiu:" + bebalsiu);

        balses = "It's a Wonderful Life";
        bebalsiu = "";
        bebalsiu = balses.replaceAll("[a, e, i, y, o, u]", "");
        System.out.println("Be balsiu:" + bebalsiu);

        System.out.println("<7 uzduotis>");
        String episode = "Star Wars: Episode "+ " ".repeat((int) Math.random() * 10)+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);
     //   String episodeno = episode.repeat((int) Math.random() * 10)+((int) (Math.random() * 7)+1);
     //   System.out.println("Episode number: " + episodeno);
        System.out.println(episode.replaceAll("[a-z, A-Z, --, :, ]", ""));
        System.out.println(episode.replaceAll("[^\\d]", ""));



    }
}