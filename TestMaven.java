import java.nio.file.*;

import java.nio.file.*;

public class TestMaven {
    public static void test(String str) {
        System.out.println("--- Testing: " + str + " ---");
        try {
            Path p = Paths.get(str);
            System.out.println("p: " + p);
            System.out.println("parent: " + p.getParent());
            System.out.println("toRealPath: " + p.toRealPath());
        } catch (Throwable t) {
            System.out.println("Caught: " + t);
        }
    }

    public static void main(String[] args) {
        test("e:\\New folder (6)");
        test("e:\\");
        test("c:\\");
        test("c:\\Users\\sssaa");
    }
}
