package example.codeclan.com.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountWordActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_word);

        textView = (TextView) findViewById(R.id.wordCount);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String phrase = bundle.getString("phrase");
        int countWords = countWords(phrase);
        textView.setText("The count was: " + countWords);
    }



    public static int countWords(String phrase){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = phrase.length() - 1;

        for ( int i = 0; i < phrase.length(); i++) {

            if (Character.isLetter(phrase.charAt(i)) && i != endOfLine) {
                word = true;

            } else if (!Character.isLetter(phrase.charAt(i)) && word ) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(phrase.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
