
import org.apache.commons.lang3.StringUtils;

// javac Main.java
// java Main
// jar cf myjar.jar Main.class
// java -classpath myjar.jar Main

// lib
// javac -classpath ./lib/* Main.java
// java -classpath ./lib/*:./ Main

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        System.out.println(StringUtils.capitalize("hello world!") );
    }
}
