package sg.edu.rp.c346.id22016809.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.discountBox);
        btnCheck = findViewById(R.id.check);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                if(cbEnabled.isChecked()) {
                    double pay = calcPay(100, 20);
                    tvShow.setText("The discount is given. You need to pay " + pay);
                }
                else {
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay " + pay);
                }

                Toast.makeText(getApplicationContext(), "Button Click", Toast.LENGTH_LONG).show();
            }
        });

    }
    private double calcPay(double price, double discount) {
        return (price * (1-discount/100));
    }
}

