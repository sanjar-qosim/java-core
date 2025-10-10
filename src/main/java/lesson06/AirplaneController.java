package lesson06;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AirplaneController {
    
    private List<Seats> seats;
    private static final String FILE_NAME="src/main/java/lesson06/seats.json";

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
            list.add(new Seats(i, seatClass));
        }
        return list;
    }

    public void bookSeat(int number, String name) {
        Seats seat = findSeat(number);
        if (seat == null) {
            System.out.println("There is no such place.");
        } else if (!seat.isFree()) {
            System.out.println("Sorry, this place is not free");
        } else {
            seat.book(name);
            saveSeats();
            System.out.println("The place is ordered successfully");
        }
    }

    private Seats findSeat(int number) {
        return seats.stream()
            .filter(s -> s.getNumber() == number)
            .findFirst()
            .orElse(null);
    }

    public void findBooking(int number) {
        Seats seat = findSeat(number);
        if (seat == null) {
            System.out.println("There is no such place.");
        } else {
            System.out.println(seat);
        }
    }

    private void saveSeats() {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            new Gson().toJson(seats, writer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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

    public void showAllSeats() {
        for (Seats tmp : seats) {
            System.out.println(tmp);
        }
    }

    public void cancelBooking(int number) {
        Seats seat = findSeat(number);
        if (seat == null) {
            System.out.println("There is no such place.");
        } else if (seat.isFree()) {
            System.out.println("The place is free.");
        } else {
            seat.cancel();
            saveSeats();
            System.out.println("Order cancelling was successfully.");
        }
    }

}
