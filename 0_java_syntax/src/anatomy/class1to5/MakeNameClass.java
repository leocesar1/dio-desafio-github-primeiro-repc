package src.anatomy.class1to5;

public class MakeNameClass {
    public static String makeFullName(String firstName, String lastName){
        // 'final' is a reserved word that makes variable unchangeable  
        // for convention, variables in Caps Lock is also unchangeable
        return "The result is: ".concat(firstName.concat(" ").concat(lastName));
    }
}
