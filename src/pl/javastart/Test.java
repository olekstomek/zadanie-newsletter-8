package pl.javastart;

class Test {
    public static void main(String[] args) {
        try {
            Foo.foo();
        } catch(Throwable e) {
            System.out.println("B");
        }
        System.out.println("C");
    }
}
