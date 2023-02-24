package HWs.HW1;

public class Branch {
    private Persons per1;
    private Relations rs;
    private Persons per2;

    public Branch(Persons per1, Relations rs, Persons per2){
        this.per1 = per1;
        this.rs = rs;
        this.per2 = per2;
    }

    public Persons getPer1() {
        return per1;
    }

    public Relations getRs() {
        return rs;
    }

    public Persons getPer2() {
        return per2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s >", per1, rs, per2);
    }
}
