public class Hello {
    public static void main(String[] args) {
       Color color1, color2;       // Объявление переменной
       color1 = Color.RED;
       color2 = Color.BLACK;
       if (color1 == Color.RED) {  // Проверка значения
          System.out.println("color1 == RED");
       }
       if (color1 != color2) {     // Проверка значения
          System.out.println("color1 != color2");
       }
       System.out.println(color1); // Выведет: RED
    }
 }
 
 // Объявление перечисления
 enum Color { RED, BLUE, GREEN, BLACK };