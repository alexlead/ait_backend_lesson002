package app;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {


    // 1. Проверяем, действительно ли метод выдаёт ошибку при отриц.значении.
    // 2. Проверим, правильный ли размер массива.
    // 3. Проверим работу метода при граничных значениях (0).
    // 4. Проверим, действительно ли соседние элементы отличаются на 1.
    // 5. Точечно проверим внутренние значения в массиве.
    // 6. Проверим, что метод возвращает не null.


    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {

        Main.getArray(-1);
    }

    @Test
    public void checkArrayCorrectSize () {
        int[] result  = Main.getArray(7);
        int expectedSize = 7;
        int actualSize = result.length;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkArrayZeroSize () {
        int expected = 0;
        int actual = Main.getArray(0).length;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void checkArrayValues () {
        int [] expected = new int[]{1, 2, 3, 4, 5};
        int [] actual = Main.getArray(5);
        Assert.assertArrayEquals( expected, actual );
    }

@Test
public void checkArrayElementsStep () {
        int expected = 1;
        int actual = 0;
        int [] array = Main.getArray(20);
        for( int i = 1; i < array.length; i++ ) {
            int differ = array[i] - array[i-1];
            if ( differ > actual) {
                actual = differ;
            }
        }
        Assert.assertEquals(expected, actual);
}

    @Test
    public void checkMethodNotReturnNull () {
        Assert.assertNotNull( Main.getArray(0) );
    }

}