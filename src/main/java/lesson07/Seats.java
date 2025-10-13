package lesson07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Seats {

    private final int id;
    private final String seatClass;
    private String userName;
    private Status status;
    private final String whenFlight;
    private String whenHold;
    private String whenConfirmed;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public Seats(int id, String seatClass, LocalDateTime whenFlight) {
        this.id = id;
        this.seatClass = seatClass;
        this.status = Status.FREE;
        this.userName = null;
        this.whenFlight = whenFlight.format(FORMATTER);
    }

    public int getId() {
        return id;
    }

    public Status status() {
        return this.status;
    }

    public String getUserName() {
        return userName;
    }

    public void book(String userName, Status status){
        this.userName = userName;
        this.status = status;
    }

    public void cancel() {
        this.status = Status.FREE;
        this.userName = null;
        this.whenHold = null;
        this.whenConfirmed = null;
    }

    public LocalDateTime getWhenHold() {
        return LocalDateTime.parse(this.whenHold);
    }

    public void setWhenHold(LocalDateTime whenHold) {
        this.whenHold = whenHold.format(FORMATTER);
    }

    public void setWhenConfirmed(LocalDateTime whenConfirmed) {
        this.whenConfirmed = whenConfirmed.format(FORMATTER);
    }

    @Override
    public String toString() {
        return "Seats{" +
            "id=" + id +
            ", seatClass='" + seatClass + '\'' +
            ", userName='" + userName + '\'' +
            ", status=" + status +
            ", whenFlight=" + whenFlight +
            ", whenHold=" + whenHold +
            ", whenConfirmed=" + whenConfirmed +
            '}';
    }
}
