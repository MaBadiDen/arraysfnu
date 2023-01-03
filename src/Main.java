import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StringList stringList = new StringListImpl();

        stringList.add("Hello");

        stringList.add(" World");

        stringList.add(" dude");

        System.out.println(Arrays.toString(stringList.toArray()));

        stringList.add(1, " crtak ");

        System.out.println(Arrays.toString((stringList.toArray())));

        stringList.clear();
        System.out.println(Arrays.toString((stringList.toArray())));
        System.out.println(stringList.size());

    }

}
