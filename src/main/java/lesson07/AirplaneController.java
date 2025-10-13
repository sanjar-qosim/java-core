package lesson07;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AirplaneController {
    
    private List<Seats> seats;
    private static final String FILE_NAME="src/main/java/lesson07/seats.json";

    public AirplaneController() {
        this.seats = loadSeats();
        if (seats == null || seats.isEmpty()) {
            this.seats = createDefaultSeats();
            saveSeats();
        }
    }

    private List<Seats> createDefaultSeats() {
        List<Seats> list = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            String seatClass;
            if (i <= 10) {
                seatClass = "Business";
            } else {
                seatClass = "Economy";
            }
            list.add(new Seats(i, seatClass, (LocalDateTime.now()).plusDays(7)));
        }
        return list;
    }

    private List<Seats> loadSeats() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return null;

        try (Reader reader = new FileReader(file)) {
            Type listType = new TypeToken<List<Seats>>(){}.getType();
            return new Gson().fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private void saveSeats() {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            new Gson().toJson(seats, writer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private Seats findSeat(int id) {
        Seats foundSeat = null;

        for (Seats tmp : seats) {
            if (tmp.getId() == id) {
                foundSeat = tmp;
            }
        }

        return foundSeat;
    }

    public void findBooking(int id) {
        Seats seat = findSeat(id);
        if (seat == null) {
            System.out.println("There is no such place.");
        } else {
            if (isHoldAvailable(id)) {
                System.out.println(seat);
            } else {
                seat.cancel();
                System.out.println("Twelve hours have passed, and your reservation was overdue.");
            }
        }
    }

    public void holdSeat(int id, String name) {
        Seats seat = findSeat(id);
        if (seat == null) {
            System.out.println("There is no such place.");
        } else if (seat.status() == Status.CONFIRMED || seat.status() == Status.HOLD) {
            System.out.println("Sorry, this place is not free");
        } else {
            seat.setWhenHold(LocalDateTime.now());
            seat.book(name, Status.HOLD);
            saveSeats();
            System.out.println("The place is ordered successfully");
        }
    }

    public void confirmSeat(int id) {
        Seats seat = findSeat(id);

        if (isHoldAvailable(id)) {
            if (seat == null) {
                System.out.println("There is no such place.");
            } else if (seat.status() == Status.CONFIRMED) {
                System.out.println("Sorry, this place was confirmed before");
            } else if (seat.status() == Status.FREE) {
                System.out.println("Sorry, this place is not free");
            } else {
                seat.setWhenConfirmed(LocalDateTime.now());
                seat.book(seat.getUserName(), Status.CONFIRMED);
                saveSeats();
                System.out.println("The place is ordered successfully");
            }
        } else {
            seat.cancel();
            System.out.println("Twelve hours have passed, and your reservation was overdue.");
        }
    }

    public void showAllSeats() {
        for (Seats tmp : seats) {
            System.out.println(tmp);
        }
    }

    public void cancelBooking(int number) {
        Seats seat = findSeat(number);
        if (seat == null) {
            System.out.println("There is no such place.");
        } else if (seat.status() == Status.FREE) {
            System.out.println("The place is free.");
        } else {
            seat.cancel();
            saveSeats();
            System.out.println("Order cancelling was successfully.");
        }
    }

    public boolean isHoldAvailable(int id) {
        Duration difference = null;

        for (Seats tmp : seats) {
            if (tmp.getId() == id) {
                difference = Duration.between(tmp.getWhenHold(), LocalDateTime.now());
            }
        }

        try {
            return difference.compareTo(Duration.ofHours(12)) < 0;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
