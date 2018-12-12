public class SnackJar
{
    private String contents;
    private boolean full;
    private int count;


    public SnackJar (String jarContents, boolean jarFull, int jarCount)
    {
        contents = jarContents;
        full = jarFull;
        count = jarCount;
    }

    public boolean getSnackJarIsFull()
    {
        return full;
    }

    public String getSnackJarContents()
    {
        return contents;
    }

    public int getSnackJarContentsCount()
    {
        return count;
    }

    public void setSnackJarContentsCount( int jarCount)
    {
        count = jarCount;
    }

    public void fillTheJar (int jarCount)
    {
        count = jarCount;
    }

    public void setSnackJarIsNotFull ()
    {
        full = false;
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}



