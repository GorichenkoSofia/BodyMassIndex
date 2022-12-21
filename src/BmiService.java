public class BmiService {
    public int calculate (double height,double wight) {
        double result = wight/(height*height);
        int result1=(int) result;
        return result1;
    }
}
