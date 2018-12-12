public class SnackJarRunner
{
    public static final int MIDNIGHT = 0;
    public static final int DAYLIGHT = 7;
    public static final int FULL_JAR_COUNT = 100;
    public static final int HANDFULL = 20;

    public static void main(String[] args)
    {
        SnackJar jar42 = new SnackJar ("M&M's", true, FULL_JAR_COUNT);
        /* The command above creates a new SnackJar instance called jar42
         * jar42 contains M&M's.  The contents of the jar is specified in the first parameter
         * for the constructor.  The jar is full as specified by true in the second parameter
         * for the constructor.  The last parameter for the constructor specifies how may items
         * are contained in the SnackJar instance.     */

        for (int timeOfDay = MIDNIGHT; timeOfDay < DAYLIGHT; timeOfDay++)
        {
            if (jar42.getSnackJarIsFull())
                System.out.println("Oh happy day, our snack jar is full.");

            if (timeOfDay == MIDNIGHT)
                System.out.println("It is Midnight.  Time to get started.");
            else
                System.out.println("The time is " + timeOfDay + " o'clock.");

            System.out.println ("Grab a handfull of " +
                    jar42.getSnackJarContents() + " from the jar and enjoy the snack.");
            int itemsInJar = jar42.getSnackJarContentsCount();

            if (itemsInJar - HANDFULL <= 0)
            {
                System.out.println ("The snack jar is empty.  Time to refill the jar.");
                jar42.fillTheJar(FULL_JAR_COUNT);
            }
            else
            {
                jar42.setSnackJarContentsCount (itemsInJar - HANDFULL);
                jar42.setSnackJarIsNotFull ();
            }
            System.out.println ("There are now " + jar42.getSnackJarContentsCount() + " " +
                    jar42.getSnackJarContents() + " in the snack jar.\n");
        }
    }
}

