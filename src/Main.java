import java.util.Scanner;

public class Main {
    public static void testExp() throws MyNewException {
        throw new MyNewException();
    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            StackTraceElement[] stack = e.getStackTrace();
            if (stack.length > 2){
                return stack[2].getClass().getPackageName() + "." + stack[2].getClassName() + "#" + stack[2].getMethodName();
            } else {
                return null;
            }
        }
    }

    public static void lololo(){
        lolololo();
    }
     public static void lolololo() {
         System.out.println(getCallerClassAndMethodName());
     }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        lololo();
        //System.out.println(Integer.parseInt(str));
    }
}
