package Number;
public class Number {
    private double realNam;

    public double getRealPart() {
        return realNam;
    }

    Number(double real) {
        realNam = real;
    }

    public Number add(Number other) {
        double real = this.realNam + other.realNam;
        return new Number(real);
    }

    public Number subtract(Number other) {
        double real = this.realNam - other.realNam;
        return new Number(real);
    }

    public Number multiply(Number other) {
        double real = this.realNam * other.realNam;
        return new Number(real);
    }

    public Number divide(Number other) {
        if (other.realNam == 0) {
            throw new ArithmeticException("Делить на 0 нельзя!");
        }
        double real = this.realNam / other.realNam;
        return new Number(real);
    }



    @Override
    public String toString() {
       return String.valueOf(realNam);
    }
}
