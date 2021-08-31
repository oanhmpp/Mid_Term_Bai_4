import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    Passenger[] listPas;

    public Main(Passenger[] listPas) {
        this.listPas = listPas;
    }

    public Main(){}

    public Passenger[] enterListPassenger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many passengers do you need to enter? - Enter number: ");
        int count = sc.nextInt();
        listPas = new Passenger[count];
        Passenger t = new Passenger();
        for (int i = 0; i < listPas.length; i++) {
            listPas[i] = t.enterPassenger();
        }
        return listPas;
    }

    public String printListPassenger() {
        Passenger t = new Passenger();
        String re = "------------------------[List passenger]------------------------\n";
        for (int i = 0; i < listPas.length; i++) {
            t = listPas[i];
            re += i + 1 + ". ";
            if (t.isSex()) {
                re += "Name: " + t.getName() + "\t\tSex: " + "Male" + "\t\tAge: " + t.getAge() + "\t\tTotal Price: " + t.price() + "\n" + t.printListTicket() + "\n";
            } else {
                re += "Name: " + t.getName() + "\t\tSex: " + "Female" + "\t\tAge: " + t.getAge() + "\t\tTotal Price: " + t.price() + "\n" + t.printListTicket() + "\n";
            }
        }
        return re;
    }

    public Passenger[] sortByPrice() {
        for (int i = 0; i < listPas.length - 1; i++) {
            if (listPas[i + 1].price() > listPas[i].price()) {
                Passenger temp = listPas[i];
                listPas[i] = listPas[i + 1];
                listPas[i + 1] = temp;
            }
        }
        return listPas;
    }

    public static void main(String[] args) {

        /**Thầy mở từng comment để chạy nha thầy*/
        /**Có mấy mảng em tạo sẵn để test cho nhanh nên không có xóa*/

        Ticket t = new Ticket();
        Passenger p = new Passenger();
        Ticket[] arr = new Ticket[3];
        Ticket[] arr2 = new Ticket[3];
        Ticket[] arr3 = new Ticket[3];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm");
        LocalDateTime date = LocalDateTime.parse("12/12/1999 12:02", formatter);
        arr[0] = new Ticket("Flight A", date, 12);
        arr[1] = new Ticket("Flight B", date, 13);
        arr[2] = new Ticket("Flight C", date, 14);
        arr2[0] = new Ticket("Flight A", date, 12);
        arr2[1] = new Ticket("Flight B", date, 15);
        arr2[2] = new Ticket("Flight C", date, 34);
        arr3[0] = new Ticket("Flight A", date, 17);
        arr3[1] = new Ticket("Flight B", date, 18);
        arr3[2] = new Ticket("Flight C", date, 19);

        /**Test print ticket*/
//        t = t.enterTicket();
//        System.out.println("[Ticket]\n");
//        System.out.println(t.printTiket());

        /**Test print list ticket of pasenger*/
//        p.setListTicket(p.enterListTicket());
//        p.setListTicket(arr); // em tạo để test nhanh khỏi nhập vào
//        System.out.println(p.printListTicket());

        /**Test print passenger*/
//        p = p.enterPassenger();
//        p = new Passenger("Oanh", true, 12, arr); // em tạo để test nhanh khỏi nhập vào
//        System.out.println(p.printPassenger());

        /**Test total price*/
//        System.out.print("Total price: ");
//        System.out.println(p.price());

        /**Enter list passenger*/
//        Passenger[] listPas = new Passenger[3]; // em tạo để test nhanh khỏi nhập vào
//        Main m = new Main(listPas); // em tạo để test nhanh khỏi nhập vào
        Main m2 = new Main();
//        listPas[0] = new Passenger("Oanh", true, 12, arr); // em tạo để test nhanh khỏi nhập vào
//        listPas[1] = new Passenger("Oanh2", false, 12, arr2); // em tạo để test nhanh khỏi nhập vào
//        listPas[2] = new Passenger("Oanh3", true, 12, arr3); // em tạo để test nhanh khỏi nhập vào

//        System.out.println(m.printListPassenger()); // em tạo để test nhanh khỏi nhập vào
        m2.enterListPassenger();
        System.out.println(m2.printListPassenger());

        /**Sort list by price*/
        System.out.println("***************** List passenger sort by price *****************");
//        m.sortByPrice(); // em tạo để test nhanh khỏi nhập vào
//        System.out.println(m.printListPassenger()); // em tạo để test nhanh khỏi nhập vào
        m2.sortByPrice();
        System.out.println(m2.printListPassenger());
    }
}
