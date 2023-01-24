public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            System.out.println("b" + result+" + "+a +"="+add(result,a));
            result += add(result, a);
            System.out.println("c = " + result);
        }
        System.out.println("d" + result);
        return result;
    }
}
