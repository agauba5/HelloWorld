package edu.cnm.bootcamp.gauba.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btnhelloworld = (Button) findViewById(R.id.btnHelloWorld);
    btnhelloworld.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.txtHelloWorld);
        String text = textView.getText().toString();
        String expected = getString(R.string.message_received);

        if (Objects.equals(text, expected)) {
          textView.setText(getString(R.string.hello_world));
        } else {
          textView.setText(getString(R.string.message_received));
        }
      }
    });


  }
}
