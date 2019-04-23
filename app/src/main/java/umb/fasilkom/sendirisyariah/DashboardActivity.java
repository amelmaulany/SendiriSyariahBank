package umb.fasilkom.sendirisyariah;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import umb.fasilkom.sendirisyariah.umb.fasilkom.sendirisyariah.myaccount.MyAccountActivity;

/*
 * author by sendirisyariah
 * 21-apr-2019
 * */
public class DashboardActivity extends AppCompatActivity {
    //declaration
    ImageButton btnDashboard;
    ImageButton btnContactUs;
    ImageButton btnMyAccount;
    ImageButton btnTransfer;
    ImageButton btnMPayment;
    ImageButton btnMCommerce;
    ImageButton btnCashWithdrawal;
    ImageButton btnInbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        getSupportActionBar().hide();

        final Context context = this;

        //get element from xml
        btnDashboard = (ImageButton)findViewById(R.id.btn_dashboard);
        btnContactUs = (ImageButton)findViewById(R.id.btn_contact_us);
        btnMyAccount = (ImageButton)findViewById(R.id.btn_my_account);
        btnTransfer = (ImageButton)findViewById(R.id.btn_transfer);
        btnMPayment = (ImageButton)findViewById(R.id.btn_m_payment);
        btnMCommerce = (ImageButton)findViewById(R.id.btn_m_commerce);
        btnCashWithdrawal = (ImageButton)findViewById(R.id.btn_cash_withdrawal);
        btnInbox = (ImageButton)findViewById(R.id.btn_inbox);


        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DashboardActivity.class);
                startActivity(intent);
            }
        });

        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Contact Us!", Toast.LENGTH_SHORT).show();
            }
        });

        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MyAccountActivity.class);
                startActivity(intent);
            }
        });


    }
}

