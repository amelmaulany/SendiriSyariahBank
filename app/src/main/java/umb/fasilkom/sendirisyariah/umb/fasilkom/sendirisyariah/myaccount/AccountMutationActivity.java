package umb.fasilkom.sendirisyariah.umb.fasilkom.sendirisyariah.myaccount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import umb.fasilkom.sendirisyariah.R;

/*
* author by SendiriSyariah
* 23-april-2019
* */
public class AccountMutationActivity extends AppCompatActivity {
    private Spinner spinnerTransType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_account);
        getSupportActionBar().hide();

    }
}
