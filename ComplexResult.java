
public class ComplexResult implements ResultModel {
    
    double a1, b1, a2, b2;

    public ComplexResult() {

    }

    @Override
    public String result(String action) {
        switch (action) {
            case "+":
                return (a1+a2)+"+"+(b1+b2)+"i";
            case "-":
                return (a1-a2)+"+"+(b1-b2)+"i";
            case "*":
                return a1*a2-b1*b2+"+"+(b1*a2+a1*b2)+"i";
            case "/":
                return ((a1*a2+b1*b2)/(a2*a2+b2*b2))+"+"+((b1*a2-a1*b2)/(a2*a2+b2*b2))+"i";
        }
        return "0";
    }

    public void setA1(double value) {
        this.a1 = value;
    }

    public void setB1(double value) {
        this.b1 = value;
    }

    public void setA2(double value) {
        this.a2 = value;
    }

    public void setB2(double value) {
        this.b2 = value;
    }

}
