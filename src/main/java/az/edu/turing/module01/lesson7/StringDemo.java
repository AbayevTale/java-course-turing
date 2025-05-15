package az.edu.turing.module01.lesson7;

public class StringDemo  {

    public static void main(String[] args) {

        String s1 = new String("GFG");
        String s4 = "GFGGFG";
        String s2 = s1.concat("GFG"); // GFGGFG

        String s3 = s2.intern();

        System.out.println(s2 == s3);
        System.out.println(s3 == s4);




    }


}
