package io.sewah.jacocomavenplugindemo.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {
    @Test
    public void shouldGreet(){
        DemoController controller = new DemoController();
        var expected = "Hello Emmanuel!";
        var actual = controller.greet("Emmanuel");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGreet(){
        DemoController controller = new DemoController();
        var expected = "Name is not specified!";
        var actual = controller.greet("");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotGreet2(){
        DemoController controller = new DemoController();
        var expected = "Name is not specified!";
        var actual = controller.greet(" ");

        assertEquals(expected, actual);
    }

}