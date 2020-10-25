package lad3.ss7;

public class PassByRef {

    public void calcArea(Circle objPi, double rad){
            double Area = objPi.getPI() * rad *rad;
            System.out.println("Area of the circle is: " + Area);
        }
        public static void main(String[] args) {
            lad3.ss7.PassByRef p1 = new lad3.ss7.PassByRef();
            p1.calcArea(new Circle(),2);
        }

}
