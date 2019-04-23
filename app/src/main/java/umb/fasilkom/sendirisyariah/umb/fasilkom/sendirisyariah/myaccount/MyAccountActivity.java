package umb.fasilkom.sendirisyariah.umb.fasilkom.sendirisyariah.myaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import umb.fasilkom.sendirisyariah.CustomAdapter;
import umb.fasilkom.sendirisyariah.DashboardActivity;
import umb.fasilkom.sendirisyariah.R;
/*
* author by sendirisyariah
* 23-04-2019
* */
public class MyAccountActivity extends AppCompatActivity {
    //declaration
    ImageButton btnDashboard;
    ImageButton btnContactUs;

    ListView simpleList;
    //My Account get list data
    String[] myAccountItem = {"My Balance", "Account Mutation", "Credit Card Info"};
    int icons[] = {R.drawable.my_balance_icon, R.drawable.mutation_icon, R.drawable.credit_card_info};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_account);
        getSupportActionBar().hide();
        final Context context = this;

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
                Toast.makeText(MyAccountActivity.this, "Contact Us!", Toast.LENGTH_SHORT).show();
            }
        });


        //list menu my account
        simpleList = (ListView) findViewById(R.id.my_account_list) ;
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), myAccountItem, icons);
        simpleList.setAdapter(customAdapter);


        //navigate to other activity
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id)
            {
                // In the following line "v" refers to the View returned by the `getView()` method; meaning the clicked View.
                TextView txtName = (TextView)v.findViewById(R.id.custom_list_text);
                String name = txtName.getText().toString();
                switch(name)
                {
                    case "My Balance":
                        Intent intent = new Intent(MyAccountActivity.this, MyBalanceActivity.class);
                        startActivity(intent);
                        break;
                    case "Account Mutation":
                        Intent intent1 = new Intent(MyAccountActivity.this, MyBalanceActivity.class);
                        startActivity(intent1);
                        break;
                }

            }
        });


    }



}
