public class TestException extends RuntimeException {
    String name;


    TestException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestException {" +
                "методов \"" +name + "\" более одного" +
                '}';
    }
}
