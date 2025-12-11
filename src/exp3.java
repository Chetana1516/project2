public class exp3
{
    public static void main(String[] args) {
        try
        {
            String name="chetu"; //possibility
            System.out.println(name);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally  // this is also a keyword bcz the block of code will be excuted if tht try and catch does not give also the finally will give output bcz its mandatory
        {
            System.out.println("mandatory");
        }
    }
}
