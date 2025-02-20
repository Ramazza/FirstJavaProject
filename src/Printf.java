public class Printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // flags
        // + = output a plus
        // , = comma groupping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        // width
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        String name =  "Spongebob";
        char fisrtLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", fisrtLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 9000.99;
        double price2 = 100.23;
        double price3 = -23.45;

        System.out.printf("% .1f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% (.3f\n", price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 345;
        int id4 = 4536;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
