class ABC {

    ABC(String name, int rollNo, double salary) {

        System.out.println("Hello " + name + ", Your Roll Number: " 
                + rollNo + ", & Your salary: " + salary);

        System.out.println("Hello constructor");
    }
}

public class bus {

    public static void main(String[] args) {

        ABC obj = new ABC("vishnu", 61, 9000.89);

    }
}