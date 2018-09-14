package beanConvert;

public class Bean2 {
    Boolean f1;
    int a;
    Integer b;
    String s;

    Boolean isAA;
    public Boolean getF1() {
        return f1;
    }

    public void setF1(Boolean f1) {
        this.f1 = f1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Boolean getAA() {
        return isAA;
    }

    public void setAA(Boolean AA) {
        isAA = AA;
    }

    @Override
    public String toString() {
        return "Bean2{" +
                "f1=" + f1 +
                ", a=" + a +
                ", b=" + b +
                ", s='" + s + '\'' +
                ", isAA=" + isAA +
                '}';
    }
}
