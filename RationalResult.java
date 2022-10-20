
public class RationalResult implements ResultModel {
    
    int a, b, c, d;

    public RationalResult() {

    }

    @Override
    public String result(String action) {
        switch (action) {
            case "+":
                return a*d+c*b+"/"+b*d;
            case "-":
                return a*d-c*b+"/"+b*d;
            case "*":
                return a*c+"/"+b*d;
            case "/":
                return a*d+"/"+b*c;
        }
        return "0";
    }

    public void setA(int value) {
        this.a = value;
    }

    public void setB(int value) {
        this.b = value;
    }

    public void setC(int value) {
        this.c = value;
    }

    public void setD(int value) {
        this.d = value;
    }

}
