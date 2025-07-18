 class Q6 {
    public static void main(String[] args) {
    double a = 10;
    double b = 9;
    double perimeter = 36;
    double c;
    double area;
    double s;
 
    c =(perimeter-a-b);
     s = (a+b+c)/2; 
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("side c " + c);
    System.out.println("side " +s);
    System.out.println("area " +area);
     
    }
    
}
