package examples.aaronhoskins.com.unittesting;

public class Util {

    public static String someMethod() {
        return "";
    }

    public String getName() {
        return "Bob";
    }

    public String getModName(String s1, boolean toMod) {
        if(toMod) {
            return s1 + " moded";

        } else {
            return s1;
        }
    }

}
