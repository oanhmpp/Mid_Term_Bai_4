import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ticket {
    private String name;
    private LocalDateTime date;
    private double price;

    public Ticket(String name, LocalDateTime date, double price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public Ticket() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ticket enterTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter information: ");
        System.out.print("Flight name: ");
        String name = sc.nextLine();
        System.out.print("Flight date by format d/M/yyyy HH:mm: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm");
        LocalDateTime date = LocalDateTime.parse(sc.nextLine(), formatter);
        System.out.print("Price: ");
        double price = sc.nextDouble();
        return new Ticket(name, date, price);
    }

    public String printTiket() {
        return "Name: " + getName() + "\tDate: " + getDate().toString() + "\tPrice: " + getPrice();
    }

}
