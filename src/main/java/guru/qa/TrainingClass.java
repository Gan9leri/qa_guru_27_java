package guru.qa;

public class TrainingClass {
    public static void main(String... args) {

        System.out.println("\nУпражнения с математическими операторами");
        int numb1 = 3;
        int numb2 = 5;
        System.out.println("3 + 5 = " + (numb1 + numb2) );
        System.out.println("3 - 5 = " + (numb1 - numb2) );
        System.out.println("3 / 5 = " + (numb1 / numb2) );
        System.out.println("3 * 5 = " + (numb1 * numb2) );
        System.out.println("3 % 5 = " + (numb1 % numb2) );
        numb1++;
        System.out.println("3++ = " + (numb1) );
        numb1--;
        System.out.println("4-- = " + (numb1) );

        System.out.println("\nУпражнения с логическими операторами");
        System.out.println("true && false = " + (true && false) );
        System.out.println("5 & 3 = " + (5 & 3) );
        System.out.println("true && false = " + (true || false) );
        System.out.println("5 & 3 = " + (5 | 3) );
        System.out.println("!true = " + (!true) );

        System.out.println("\nПереполнения при вычислениях");
        System.out.println("Для типа byte");
        byte aByte1 = 127; // 8b   -128 + 127
        byte aByte2 = 1;
        byte aByte3 = (byte) (aByte1 + aByte2);
        System.out.println(aByte3);

        System.out.println("Для типа short");
        short aShort = 32767; // 16b -32768 +32767
        short aShort1 = (short) (aShort + 3);
        System.out.println(aShort1);

        System.out.println("Для типа int");
        int aInt = 2147483647;
        int aInt1 = aInt + 1;
        System.out.println(aInt1);

        System.out.println("Для типа long");
        long aLong = 9223372036854775807L;
        long aLong1 = aLong + 1;
        System.out.println(aLong1);

        System.out.println("Для типа float");
        float aFloat = (float) (3.4 * Math.pow(10,38));
        float aFloat1 = aFloat + aFloat;
        System.out.println(aFloat1);

        System.out.println("\nВычисления комбинаций типов данных (int и double)");
        int a = 3;
        double b = 7;
        System.out.println(a + b);

    }
}
