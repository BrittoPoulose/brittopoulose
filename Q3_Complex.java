import java.io.*;
import java.util.Scanner;

class Q3_Complex {
    int real, img;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Enter the real part:");
        this.real = sc.nextInt();
        System.out.println("Enter the imaginary part:");
        this.img = sc.nextInt();
    }

    void display() {
        System.out.println("the complex number: " + this.real + "+" + this.img + "i");
        System.out.println("\n");
    }

    void add(Q3_Complex c1, Q3_Complex c2) {
        real = c1.real + c2.real;
        img = c1.img + c2.img;
        System.out.println("The sum of Complex number is: " + real + "+" + img + "i");
    }

    public static void main(String args[]) throws IOException {
        Q3_Complex c1 = new Q3_Complex();
        Q3_Complex c2 = new Q3_Complex();
        Q3_Complex c3 = new Q3_Complex();
        c1.read();
        c1.display();
        c2.read();
        c2.display();
        c3.add(c1, c2);
    }

}

