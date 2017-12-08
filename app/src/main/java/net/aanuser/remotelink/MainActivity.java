package net.aanuser.remotelink;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void search(View view) {
        Toast.makeText(this, "Search Devices", Toast.LENGTH_SHORT).show();
    }

    public void wifi(View view) {
        Toast.makeText(this, "Wi-Fi", Toast.LENGTH_SHORT).show();
    }

    public void bluetooth(View view) {
        Toast.makeText(this, "Bluetooth", Toast.LENGTH_SHORT).show();
    }
}
