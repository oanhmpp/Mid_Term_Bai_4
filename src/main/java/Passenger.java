import java.util.Scanner;
import java.util.SortedMap;

public class Passenger {
    private String name;
    private boolean sex;
    private int age;
    private Ticket[] listTicket;

    public Passenger(String name, boolean sex, int age, Ticket[] listTicket) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.listTicket = listTicket;
    }

    public Passenger() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ticket[] getListTicket() {
        return listTicket;
    }

    public void setListTicket(Ticket[] listTicket) {
        this.listTicket = listTicket;
    }

    public Passenger enterPassenger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter information: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Sex (Male - true/Female - false): ");
        boolean sex = sc.nextBoolean();
        System.out.print("Age: ");
        int age = sc.nextInt();
        Ticket[] arr = enterListTicket();
        return new Passenger(name, sex, age, arr);
    }

    public Ticket[] enterListTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many tickets do you need to enter? - Enter number: ");
        int count = sc.nextInt();
        Ticket[] arr = new Ticket[count];
        Ticket t = new Ticket();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = t.enterTicket();
        }
        return arr;
    }

    public String printListTicket() {
        Ticket t = new Ticket();
        String re = "------------[List ticket]------------\n";
        re += "   Flight Name\tDate\t\t\t\tPrice" + "\n";
        for (int i = 0; i < getListTicket().length; i++) {
            t = getListTicket()[i];
            re += i + 1 + ". ";
            re += t.getName() + "\t\t" + t.getDate().toString() + "\t" + t.getPrice() + "\n";
        }
        return re;
    }

    public String printPassenger() {
        return "Name: " + getName() + "\tSex: " + isSex() + "\tAge: " + getAge() + "\n" + printListTicket();
    }

    public double price() {
        double price = 0;
        for (int i = 0; i < getListTicket().length; i++)
            price += getListTicket()[i].getPrice();
        return price;
    }
}
