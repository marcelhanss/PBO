public class MyData <A, B, C> {
    private A a;
    private B b;
    private C c;

    public void set(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.println(a + " " + b + " " + c);
    }
}
