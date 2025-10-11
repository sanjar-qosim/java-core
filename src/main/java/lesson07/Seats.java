package lesson07;

import java.time.LocalDateTime;

public class Seats {

    private final int id;
    private final String seatClass;
    private String userName;
    private Status status;
    private final LocalDateTime whenFlight;
    private LocalDateTime whenHold;
    private LocalDateTime whenConfirmed;

    public Seats(int id, String seatClass, LocalDateTime whenFlight) {
        this.id = id;
        this.seatClass = seatClass;
        this.status = Status.FREE;
        this.userName = null;
        this.whenFlight = whenFlight;
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
    }

    public LocalDateTime getWhenHold() {
        return whenHold;
    }

    public void setWhenHold(LocalDateTime whenHold) {
        this.whenHold = whenHold;
    }

    public void setWhenConfirmed(LocalDateTime whenConfirmed) {
        this.whenConfirmed = whenConfirmed;
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
