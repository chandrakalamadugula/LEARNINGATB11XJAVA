package Ex_01_JAVA_BASIC;

public class Lab21_CharacterLiterals {
    public static void main(String[] args) {
        char c1 = 'A';
        //char c2 = "A";  //this is not a character, this is a string
        char c3 = ' '; //space is also a character
        char c4 = '@';
        char c5 = '_';
        char c6 = '1';
        char c7 = '(';


        //escape sequences
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_Return = '\r';
        System.out.println("chandra" + new_line + "Kala");
        System.out.println("chandra" + tab_line + "Kala");
        System.out.println("chandra" + carriage_Return + "Kala");
    }
}
