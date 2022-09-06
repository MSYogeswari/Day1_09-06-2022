class 1_Left_Shift {
    public static void main(String[] args) {
        int a = -69;
        int b= 2;
        int c = a<<b;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("c = " + Integer.toBinaryString(c));
        System.out.println("a>>b = " + c);
    }
}
