package moayad.Guessing_Game.pages;

import java.util.Random;
import org.apache.tapestry5.annotations.*;

/**
 * Start page of application Guessing-Game.
 */
public class Index
{	
	private final Random random = new Random(System.nanoTime());

    @InjectPage
    private Guess guess;

    @Log
    Object onActionFromStart()
    {
        int target = random.nextInt(10) + 1;

        guess.setup(target);
        return guess;
    }
}
