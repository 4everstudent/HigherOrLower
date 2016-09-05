package a4everstudent.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int generated_number;


    public void guessNumber(View view){

        EditText user_guess_text = (EditText) findViewById(R.id.user_guess);
        int  user_guess = Integer.parseInt(user_guess_text.getText().toString());
        String message = "";



        if(user_guess == generated_number){
            message = "You rock, that's correct!";
        }
        else{
            if(user_guess < generated_number){
                message = "Too low!";
            }
            else{
                if(user_guess > generated_number){
                    message = "Too high!";
                }
                else{
                    message = "Something strange happened, please inform my developer, maybe you'll get a chocolate";
                }

            }

        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random randomGenerator = new Random();
        generated_number = randomGenerator.nextInt(100)+1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
