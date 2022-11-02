import java.lang.Math;
public class LinearEquation {
    //variables
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    //constructors
    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //methods
    public String lineInfo() {
        String Info = "Equation: " + this.equation() + "\n Slope: " + this.slope() +
                "\n Y-intercept:" + this.yIntercept() + "\n Distance: " + this.distance();
        return Info;
    }

    public double distance() {
        double distanceFormula = Math.sqrt((double) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return Math.round(distanceFormula * 100) / 100;
    }

    public double slope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public double yIntercept() {
        return y1 - (this.slope() * x1);
    }

    public String equation() {
        int yResult = y2 - y1;
        int xResult = x2 - x1;
        String mResult = "";
        String bResult = "";
        boolean negY_Inter = false;
        //Slope
        //anti-double negative
        if (xResult < 0 && yResult < 0) {
            yResult *= -1;
            xResult *= -1;
        }
        if (yResult % xResult != 0) {
            mResult = yResult + "/" + xResult;
        }
        if (yResult % xResult == 0) {
            mResult = "" + (yResult / xResult);
        }

        //y-intercept

        //if intercept = 0
        double tempB_Result = y1 - (this.slope() * x1);
        if (tempB_Result == 0) {
            bResult = "0";
        }
        else bResult = "" + (y1 - (this.slope() * x1));
        //if intercept is negative
        if (tempB_Result < 0) {
            negY_Inter = true;
        }

        //actual equation
        if (negY_Inter == true) {
            return ("y = " + mResult + "x - " + bResult);}
        if (bResult == "0") {
            return "y = " + mResult + "x";}
        return ("y = " + mResult + "x - " + bResult);
    }
}


