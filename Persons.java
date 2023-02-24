package HWs.HW1;

public class Persons {
    private String fullName;
    private String sex;

    public Persons(String fullName, String sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public String getName() {
        return fullName;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Persons{" + "fullName='" + fullName + '\'' + '}';
    }
}
