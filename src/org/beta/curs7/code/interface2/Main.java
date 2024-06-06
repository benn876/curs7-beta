package org.beta.curs7.code.interface2;

public class Main {
    public static void main(String[] args) {
        SomeAlgorithm someAlgorithm = new SomeAlgorithm(new HardCodedProvider());
        someAlgorithm.getStringsBiggerThan(4);

        SomeAlgorithm anotherAlgorithm = new SomeAlgorithm(new ScannerProvider(5));
        anotherAlgorithm.getStringsBiggerThan(3);
    }
}
