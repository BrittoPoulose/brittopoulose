import java.io.*;
import java.util.Scanner;

class Q1_Product {
    int pcode;
    String pname;
    Float price;

    void read() throws IOException {
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Product code: ");
        pcode = sc.nextInt();

        System.out.print("Enter the product name: ");
        pname = sc.next();

        System.out.print("Enter the product price: ");
        price = sc.nextFloat();
    }
    void Display() throws IOException {
        System.out.print("Product code: " + pcode);
        System.out.print("\n");
        System.out.print("Name of the Product: " + pname);
        System.out.print("\n");
        System.out.print("Price of the product: " + price);
        System.out.print("\n");

    }

    public static void main(String args[]) throws IOException {
        Q1_Product obj1[] = new Q1_Product[4];
        for (int i = 1; i <= 3; i++) {
            obj1[i] = new Q1_Product();
            obj1[i].read();
        }

        int min = 1;
        for (int i = 1; i <= 3; i++) {

            if (obj1[min].price > obj1[i].price) {
                min = i;
            }
        }
        System.out.print("\nProduct details of product having least price \n\n");
        obj1[min].Display();

    }

}