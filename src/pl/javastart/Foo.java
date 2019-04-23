package pl.javastart;

class Foo {

    static {
        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            System.out.print("");
        }
    }

    static void foo() {
        System.out.print("A");
    }

}
