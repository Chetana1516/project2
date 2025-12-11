public class exp1 {
    public static void main(String[] args) {
        int a=20;
        int b=2;
        try{
            int c = a/ b;    // it ll throw the exception
            System.out.println(c);
        }
        catch(Exception e)  //it will catch the exception
        {
            System.out.println(e);
        }
    }
}
