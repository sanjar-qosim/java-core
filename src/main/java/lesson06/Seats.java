package lesson06;

public class Seats {

    private int number;
    private String seatClass;
    private boolean isFree;
    private String userName;
    private String status;

    public Seats(int number, String seatClass) {
        this.number = number;
        this.seatClass = seatClass;
        this.isFree = true;
        this.userName = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void book(String userName){
        this.isFree = false;
        this.userName = userName;
    }

    public void cancel() {
        this.isFree = true;
        this.userName = null;
    }

    @Override
    public String toString() {
        return "Seats{" +
            "number=" + number +
            ", seatClass='" + seatClass + '\'' +
            ", isFree=" + isFree +
            ", userName='" + userName + '\'' +
            '}';
    }
}
