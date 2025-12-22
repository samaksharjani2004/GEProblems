package AlgorithmPrograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomizeMessage {

    public static void main(String[] args) {

        String message =
                "Hello <<name>>, We have your full name as <<full name>> in our system.\n" +
                        "your contact number is 91-xxxxxxxxxx.\n" +
                        "Please, let us know in case of any clarification.\n" +
                        "Thank you BridgeLabz 01/01/2016.";

        String firstName = "Samaksh";
        String fullName = "Samaksh Arjani";
        String mobile = "91-9876543210";

        String currentDate = LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        message = message.replaceAll("<<name>>", firstName);
        message = message.replaceAll("<<full name>>", fullName);
        message = message.replaceAll("91-xxxxxxxxxx", mobile);
        message = message.replaceAll("\\d{2}/\\d{2}/\\d{4}", currentDate);

        System.out.println(message);
    }
}

