class Calculate {
    public int add (int a , int b){
        int res = a + b;
        System.out.println("The sum is Add fun: " + res);
        // System.out.println("The sum is from dd: " + a+b);
        return a+b;
    }

    public boolean isEven(int num){
        return num % 2 == 0;
    }

    public void fibonaci(){
       int n = 10;
        int first = 0, second = 1;

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

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
        sw.fibonaci();
        Boolean isEven = calc.isEven(10);
        System.out.println("Is 10 even? " + isEven);
    }
}
