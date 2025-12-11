public class exp4
{
    public static void main(String[] args) {
        int[] a={3,5,6,2};  // this an array
        try
        {
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)  // if v dont no v can take exceptipn e
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
