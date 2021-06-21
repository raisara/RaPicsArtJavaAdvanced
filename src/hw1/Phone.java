package hw1;

public class Phone {
    private int number;
    private String country;

    public Phone() {
    }

    public Phone(int number, String country) {
        this.number = number;
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", country='" + country + '\'' +
                '}';
    }
}
