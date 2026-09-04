class User extends Thread {
    int number;
    String name;

    User(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void run() {
        System.out.println(name + " - Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println();
    }
}

public class calculator {
    public static void main(String[] args) {

        User user1 = new User(5, "User-1");
        User user2 = new User(7, "User-2");

        user1.start();
        user2.start();
    }
}

