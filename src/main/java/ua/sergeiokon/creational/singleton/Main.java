package ua.sergeiokon.creational.singleton;

public class Main {
    public static void main(String[] args) {

        Thread firstTread = new Thread(new FirstTreadSingleton());
        Thread secondTread = new Thread(new SecondTreadSingleton());
        firstTread.start();
        secondTread.start();

    }

    static class FirstTreadSingleton implements Runnable {

        @Override
        public void run() {
            Connection first = Connection.getConnection("I am singleton");
            System.out.println(first.getValue());
        }
    }

    static class SecondTreadSingleton implements Runnable {

        @Override
        public void run() {
            Connection second = Connection.getConnection("I am not singleton");
            System.out.println(second.getValue());
        }
    }
}
