package course.methods;

public class Main04 {public static void main(String[] args) {

    System.out.println(createName("Marta", "Piotrowska", "Martu"));
}

    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }
}
