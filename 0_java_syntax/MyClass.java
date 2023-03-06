import src.anatomy.class1to5.MakeNameClass;

public class MyClass {
    // if my class is executable, it's necessary to have this class
    public static void main(String[] args){
        // 'final' is a reserved word that makes variable unchangeable  
        // for convention, variables in Caps Lock is also unchangeable
        // final String BR = "Brasil";

        String firstName =  "Leonardo";
        String lastName = "Marques";
        System.out.println(MakeNameClass.makeFullName(firstName, lastName));
    }

    // public static String makeFullName(String firstName, String lastName){
    //     // 'final' is a reserved word that makes variable unchangeable  
    //     // for convention, variables in Caps Lock is also unchangeable
    //     return "The result is: ".concat(firstName.concat(" ").concat(lastName));
    // }
}
