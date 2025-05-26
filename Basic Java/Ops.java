class Calculate {
    public int add (int a , int b){
        return a+b;
    }
}

class Ops {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        int result = calc.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}