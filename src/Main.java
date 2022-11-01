import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> attraction = new LinkedList<>(generateClients());

        while (!attraction.isEmpty()) {
            Person person = attraction.pollFirst();
            if (person.getTickets() > 1) {
                attraction.offerLast(person);
                person.useTicket();
                System.out.println(person.getName() + " " + person.getSurName() + " скатился с горки, осталось " + +person.getTickets() + " раз(а)");

            } else if (person.getTickets() == 1) {
                System.out.println(person.getName() + " " + person.getSurName() +
                        " скатился с горки последний раз");
                System.out.println("На горке осталось " + attraction.size() + " чел.");
            }
        }
    }

    public static List<Person> generateClients() {
        return List.of(
                new Person("Камаз", "Отходов", 4),
                new Person("Рулон", "Обоев", 3),
                new Person("Угон", "Харлеев", 3),
                new Person("Ушат", "Помоев", 6),
                new Person("Квартет", "Гобоев", 1));
    }
}
