import java.util.List;

public class FirstClass {
    public List<String> list;

    private static int ab = 1;

    public static void staticMethod(){
    }

    public static void main(String[] args){
        System.out.println(FirstClass.ab);
    }


}

class SecondClass {
    public static void main(String[] args) {
        System.out.println(new FirstClass().list);
        FirstClass.staticMethod();
        String x = null;
        String s = x + "";
    }
}
