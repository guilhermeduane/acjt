package acjavatest;

import acjavatest.singletonpattern.SingletonPattern;

public class Singleton {
    public static void main(String[] args) {
        SingletonPattern singleton = SingletonPattern.getInstance();

        singleton.showMessage();
        SingletonPattern anotherSingleton = SingletonPattern.getInstance();

        System.out.println(singleton == anotherSingleton);
    }
}
