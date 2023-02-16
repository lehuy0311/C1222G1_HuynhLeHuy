package ss1_introduction_to_java.bai_tap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
