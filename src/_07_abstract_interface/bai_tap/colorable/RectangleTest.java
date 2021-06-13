package _07_abstract_interface.bai_tap.colorable;

import _07_abstract_interface.bai_tap.resizeable.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        _07_abstract_interface.bai_tap.resizeable.Rectangle rectangle = new _07_abstract_interface.bai_tap.resizeable.Rectangle();
        System.out.println(rectangle);

        rectangle = new _07_abstract_interface.bai_tap.resizeable.Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
