class Calculate {
    public int add (int a , int b){
        int res = a + b;
        System.out.println("The sum is Add fun: " + res);
        // System.out.println("The sum is from dd: " + a+b);
        return a+b;
    }
}


class swap extends Calculate {
    public void swapNum(int a , int b){
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

        add(5, 10); // Calling the add method from Calculate class
    }
}

class Ops  {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        swap sw = new swap();
        int result = sw.add(5, 10);
        System.out.println("The sum is: " + result);
        System.out.println("Before swapping: a = 5, b = 3");

        sw.swapNum(5,3);
    }
}
