public class StringBuild {

    public static void main(String[] args) {

        String helloWorld = "hello " + "world";
        helloWorld.concat(" and goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("hello " + "world");
        helloWorldBuilder.append(" and goodbye");

        printInfo(helloWorld);
        printInfo(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(50));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(50));

        printInfo(emptyStart);
        printInfo(emptyStart32);
    }

    public static void printInfo(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }
    public static void printInfo(StringBuilder builder) {

        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("string builder capacity is " + builder.capacity());
    }
}
