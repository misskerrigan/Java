package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
 * @author Anastacia Boiko (miss.kerrigan@yandex.ru)
 * @version 1.1
 * @since 1.0
*/
public class CalculateTest {
/**
* Test echo.
*/ @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Anastacia Boiko";
    String expect = "Echo, echo, echo : Anastacia Boiko"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}
 