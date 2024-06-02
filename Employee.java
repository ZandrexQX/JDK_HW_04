package homework04;

public class Employee {
    private static int id = 1;
    private int tabel;
    private Integer telNumber;
    private String name;
    private int experience;

    public Employee(int telNumber, String name, int experience) {
        this.tabel = id++;
        this.telNumber = telNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getTabel() {
        return tabel;
    }

    public Integer getTelNumber() {
        return telNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tabel=" + tabel +
                ", telephone=" + telNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
