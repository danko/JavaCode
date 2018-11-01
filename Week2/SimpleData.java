public class SimpleData {

    public static void main(String[] args) {

        byte b = 2; // 8 bits
        short s = 55; // 16
        int i = 36543; // 32
        long l = 9000000000L; // 64
        float f = 3.14F; // 32
        double d = 1.5E24; // 64
        boolean bo = true; // 1
        char ch = 'a'; // 16

        System.out.println("byte:" + b);
        System.out.println("short:" + s);
        System.out.println("int:" + i);
        System.out.println("long:" + l);
        System.out.println("float:" + f);
        System.out.println("double:" + d);
        System.out.println("boolean:" + bo);
        System.out.println("char:" + ch);
        System.out.println();

        b += (byte) 0B00001010;
        s += (short) 1;
        i += 1;
        l += 1;
        f += 1;
        d += 1;
        bo = false;
        ch = 'b';

        System.out.println("byte:" + b);
        System.out.println("short:" + s);
        System.out.println("int:" + i);
        System.out.println("long:" + l);
        System.out.println("float:" + f);
        System.out.println("double:" + d);
        System.out.println("boolean:" + bo);
        System.out.println("char:" + ch);
        System.out.println();

        i = 0;
        while (i < 10) {
            System.out.print("i:" + i);

            if ((i % 2) == 0) {
                System.out.print("even");
            } else {
                System.out.print("odd");
            }
            System.out.println();
            i++;
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.print(j + ", ");
        }
        System.out.println();

        mySum();
        System.out.println();
        myFactorial();
        System.out.println();
        funPrint1();
        System.out.println();
        funPrint2();
        System.out.println();
    }

    public static void mySum() {
        int total = 0;
        for (int j = 0; j < 100; j++)
            if (j % 2 != 0)
                total += j;
        System.out.println("sum of odds from 0 to 100 " + total);
    }

    public static void myFactorial() {
        int i = 10;
        int fact = 1;

        while (i > 0) {
            fact = fact * i;
            i--;
        }
        System.out.println("10 factorial " + fact);
    }

    public static void funPrint1() {
        for (int i = 0; i < 8; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void funPrint2() {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

};
