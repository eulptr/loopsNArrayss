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


        System.out.print(name.charAt(0));
        System.out.print(surname.charAt(0)); //nr3

        System.out.println(name.substring(1));
        System.out.println(surname.substring(3));

        String aaip = "An American In Paris"; //5uzd
        System.out.println(aaip.replace("a", "*"));










    }
}