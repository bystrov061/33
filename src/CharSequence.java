public interface CharSequence {                    //  реализовывать интерфейс java.lang.CharSequence;
    public void jCharSequence();
                                       // oпределять методы length(), charAt(), subSequence() и toString()
    public int length() ;
   //public char charAt();

   char charAt(int index);

    public java.lang.CharSequence subSequence(int start, int end);
}
