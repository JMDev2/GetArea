package models;

public class calculateArea {

        static final Double pi = 3.142;
        public double getArea(Triangle mTriangle) {
            return 0.5*mTriangle.getBase()*mTriangle.getHeight();
        }
        public  double getArea(Circle mCircle){
            return pi*mCircle.getRadius()*mCircle.getRadius();

    }
    public  Integer getArea(Rectangle mRectangle){
            return  mRectangle.getLength()*mRectangle.getWidth();
    }

}
