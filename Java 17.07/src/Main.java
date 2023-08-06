public class Main {
    public static void main(String[] args) {
       Constriction constriction = new Constriction();

        constriction.byteVar = (byte)constriction.intVar;  //сужение
        constriction.floatVar=(float)constriction.doubleVar; // сужение

        System.out.println(constriction.byteVar);
        System.out.println(constriction.floatVar);

        Extension extension = new Extension();
            extension.intVar = extension.byteVar;
            extension.doubleVar = extension.floatVar;

            System.out.println(extension.intVar);
            System.out.println(extension.doubleVar);

    }
    }
