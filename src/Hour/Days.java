package Hour;
public class Days {
    public static void main(String[] args) {
    float a = 1865;
    float hour = a%24;
    float day = (a - hour)/24;
    System.out.println ("было дано 1865 часов" + " " + "это равно"+ " " + hour + " " + day +" ");
}
}
