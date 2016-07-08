package app.com.myapp.rebecca.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    /** Called when the user touches the button */
    public void sendMessageBt1(View view) {
        Toast.makeText(this, "This button will launch: Popular Movies", Toast.LENGTH_SHORT).show();
    }

    public void sendMessageBt2(View view) {
        Toast.makeText(this, "This button will launch: Stock Hawk", Toast.LENGTH_SHORT).show();
    }

    public void sendMessageBt3(View view) {
        Toast.makeText(this, "This button will launch: Build it Bigger", Toast.LENGTH_SHORT).show();
    }

    public void sendMessageBt4(View view) {
        Toast.makeText(this, "This button will launch: Make your App Material", Toast.LENGTH_SHORT).show();
    }

    public void sendMessageBt5(View view) {
        Toast.makeText(this, "This button will launch: Go Ubiquitous", Toast.LENGTH_SHORT).show();
    }

    public void sendMessageBt6(View view) {
        Toast.makeText(this, "This button will launch: Capstone", Toast.LENGTH_SHORT).show();
    }


}
