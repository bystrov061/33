import java.util.Arrays;

class main{
    public static void main(String[] args) {

    byte[] examplet = {72, 101, 108, 108, 111,33};
        AsciiCharSequence answer = new AsciiCharSequence(examplet);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(0));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 4));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer);//Hello!
        examplet[0] = 74;
        System.out.println(answer);//Hello!
        System.out.println( Arrays.toString( examplet) + " gg");
    }
}
public class AsciiCharSequence implements CharSequence {
    byte[] example;                          // класс реализующий компактное хранение последовательности ASCII-символовв массиве байт
    String exe = Arrays.toString(example);
    @Override
    public void jCharSequence(){
        System.out.println("gagaga");
    }
   // String ex = Arrays.toString(example);

    public AsciiCharSequence(byte[] exampl) {               //иметь конструктор, принимающий массив байт;

        this.example = exampl;
        System.out.println("тут  ");

    }

    @Override
    public String toString() {return Arrays.toString(example);}
    @Override                                       // oпределять методы length(), charAt(), subSequence() и toString()
    public int length() {return example.length;}
    @Override
    public char charAt(int index) {
        return (char) example[index] ;
        
    }
    @Override
    public java.lang.CharSequence subSequence(int start, int end) {return exe.subSequence(start, end);}



}
