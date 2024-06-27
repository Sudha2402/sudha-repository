package sudhakumarichauhan.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



   public void SendNow(View view){

       Toast.makeText(this, "Sending data from App...", Toast.LENGTH_SHORT).show();
   } public void Accept(View view){

       Toast.makeText(this, "Accepting data from App...", Toast.LENGTH_SHORT).show();
   } public void Delete(View view){

       Toast.makeText(this, "deleting data from App...", Toast.LENGTH_SHORT).show();
   }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}