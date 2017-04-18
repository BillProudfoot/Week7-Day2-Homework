package example.codeclan.com.wordcount;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 18/04/2017.
 */

public class countWordTest {
//    @Test
//    public void getWordCountTest(){
//        Phrase phrase = new Phrase ();
//        assertNotNull(phrase);
//    }

    @Test
    public void getWordCountTest(){
        Phrase phrase = new Phrase ( "Word count is four");
        assertEquals( 4, wordCount());
    }
}
