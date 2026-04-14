import java.lang.StringBuilder;

public class HelloAppUC5 {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (String arg : args) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(arg);
                first = false;
            }
            name = sb.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}