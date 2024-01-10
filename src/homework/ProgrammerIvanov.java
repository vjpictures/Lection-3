package homework;

import java.util.*;

public class ProgrammerIvanov {
    public static void main(String[] args) {
        Random rnd = new Random();
        int seconds = rnd.nextInt(28800), hours = seconds / 60 / 60;
        System.out.println("Секунд осталось " + seconds);
        String messageOnTheBoard = switch (hours) {
            case 0 -> "До конца рабочего дня осталось меньше часа";
            case 1 -> "До конца рабочего дня остался " + hours + " час";
            case 2, 3, 4 -> "До конца рабочего дня осталось " + hours + " часа";
            default -> "До конца рабочего дня осталось " + hours + " часов";
        };
        System.out.println(messageOnTheBoard);
    }
}
