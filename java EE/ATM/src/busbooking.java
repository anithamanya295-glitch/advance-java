class BusBooking {
    int seats = 5;

    synchronized void bookTicket(String name, int numberOfSeats) {
        System.out.println(name + " is trying to book " + numberOfSeats + " seats.");

        if (seats >= numberOfSeats) {
            System.out.println("Seats available for " + name);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            seats = seats - numberOfSeats;

            System.out.println(name + " successfully booked " +
                    numberOfSeats + " seats.");
            System.out.println("Remaining seats: " + seats);
        } else {
            System.out.println("Sorry " + name +
                    ", not enough seats available.");
        }

        System.out.println();
    }
}

class Customer extends Thread {
    BusBooking bus;
    String name;
    int seats;

    Customer(BusBooking bus, String name, int seats) {
        this.bus = bus;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        bus.bookTicket(name, seats);
    }
}

public class busbooking {
    public static void main(String[] args) {

        BusBooking bus = new BusBooking();

        Customer c1 = new Customer(bus, "Rahul", 2);
        Customer c2 = new Customer(bus, "Priya", 2);
        Customer c3 = new Customer(bus, "Arun", 2);

        c1.start();
        c2.start();
        c3.start();
    }
}
