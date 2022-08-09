public class Main {
    public static void main(String[] args) {
        MagicBox <String> stringMagicBox = new MagicBox<>(5);
        stringMagicBox.add("John");
        stringMagicBox.add("Carl");
        stringMagicBox.add("Stan");
        stringMagicBox.add("Dave");
        stringMagicBox.add("Barry");
        stringMagicBox.add("Jack");
        System.out.println(stringMagicBox.pick());
        MagicBox <Integer> integerMagicBox = new MagicBox<>(8);
        integerMagicBox.add(50);
        integerMagicBox.add(40);
        integerMagicBox.add(20);
        integerMagicBox.add(9);
        integerMagicBox.add(82);
        integerMagicBox.add(11);
        integerMagicBox.add(38);
        integerMagicBox.add(45);
        System.out.println(integerMagicBox.pick());

    }
}
