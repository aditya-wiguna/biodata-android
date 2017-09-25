package me.adityawiguna.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edNama, edEmail;
    RadioButton lakilaki, perempuan;
    CheckBox membaca, menulis;
    Button btnSubmit;
    TextView vNama, vEmail, vJeniskelamin, vHobi;

    String nama, email, jkelamin, hobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUi();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupSys();
            }
        });

    }

    public void setupUi(){
        edNama = (EditText) findViewById(R.id.nama);
        edEmail = (EditText) findViewById(R.id.email);
        lakilaki = (RadioButton) findViewById(R.id.lakilaki);
        perempuan = (RadioButton) findViewById(R.id.perempuan);
        membaca = (CheckBox) findViewById(R.id.membaca);
        menulis = (CheckBox) findViewById(R.id.menulis);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        vNama = (TextView) findViewById(R.id.vnama);
        vEmail = (TextView) findViewById(R.id.vemail);
        vJeniskelamin = (TextView) findViewById(R.id.vjeniskelamin);
        vHobi = (TextView) findViewById(R.id.vhobi);
    }

    public void setupSys(){
        nama = edNama.getText().toString();
        vNama.setText(nama);
        email = edEmail.getText().toString();
        vEmail.setText(email);

        if (lakilaki.isChecked()){
            jkelamin = "Laki-Laki";
            vJeniskelamin.setText(jkelamin);
        } else{
            jkelamin = "Perempuan";
            vJeniskelamin.setText(jkelamin);
        }

        if(membaca.isChecked()){
            if (menulis.isChecked()){
                vHobi.setText("Membaca dan Menulis");
            } else{
                vHobi.setText("Membaca");
            }
        } else if(menulis.isChecked()){
            if (membaca.isChecked()){
                vHobi.setText("Membaca dan Menulis");
            } else{
                vHobi.setText("Menulis");
            }
        }
    }
}
