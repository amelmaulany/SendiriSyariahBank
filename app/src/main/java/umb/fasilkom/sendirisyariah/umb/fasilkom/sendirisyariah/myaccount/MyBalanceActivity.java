package umb.fasilkom.sendirisyariah.umb.fasilkom.sendirisyariah.myaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import umb.fasilkom.sendirisyariah.DashboardActivity;
import umb.fasilkom.sendirisyariah.R;

public class MyBalanceActivity extends AppCompatActivity {

    Button ok;
    ImageButton btnDashboard;
    ImageButton btnContactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_account_my_balance);
        getSupportActionBar().hide();
        final Context context = this;

        //get element from xml
        ok = (Button)findViewById(R.id.btn_ok);

        //get element from xml
        btnDashboard = (ImageButton)findViewById(R.id.btn_dashboard);
        btnContactUs = (ImageButton)findViewById(R.id.btn_contact_us);

        //toolbar button
        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDashboard = new Intent(context, DashboardActivity.class);
                startActivity(intentDashboard);
            }
        });

        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyBalanceActivity.this, "Contact Us!", Toast.LENGTH_SHORT).show();
            }
        });

        //toolbar button
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDashboard = new Intent(context, MyAccountActivity.class);
                startActivity(intentDashboard);
            }
        });


    }
}
