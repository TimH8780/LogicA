package unknown.logica;

public class RandomNumberGenerators {

    public static int randomNumber(int maxValue) {

        // Seems to work
        //return  generator.nextInt(MAX_FUNCTIONS + 1);

        //Seems to only increment based on time, but computer time is very fast, so might work in real time
        //return (int) (((long) System.currentTimeMillis()) % maxValue);

        return (int)(Math.random() * maxValue);
    }
}