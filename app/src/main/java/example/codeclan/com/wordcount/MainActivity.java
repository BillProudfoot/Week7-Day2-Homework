package example.codeclan.com.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextView = (EditText) findViewById(R.id.phrase);
    }

    public void onPhraseButtonClicked(View view) {
        String phrase = editTextView.getText().toString();

        Intent intent = new Intent(this, CountWordActivity.class);
        intent.putExtra("phrase", phrase);
        startActivity(intent);


    }
}
