package tn.app.event.com.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connecter extends AppCompatActivity {
    Button buttonB;
    TextView link_inscription;
    TextView connecter;
    EditText etEmail, etPass;


    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.retour) {
            Intent intent = new Intent(Connecter.this, MainActivity.class);

            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connecter);
        buttonB = (Button) findViewById(R.id.buttonB);
        link_inscription = (TextView) findViewById(R.id.link_inscription);
        connecter = (TextView) findViewById(R.id.connecter);
        // buttonInscription = (Button)findViewById(R.id.buttonInscription);

        etEmail = (EditText) findViewById(R.id.email);
        etPass = (EditText) findViewById(R.id.password);
        link_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Connecter.this, Inscription.class);
                startActivity(intent);

            }


        });}

        public void OnLogin(View view){
            String adresse =etEmail.getText().toString();
            String password =etPass.getText().toString();

            String type = "login";

// vérifier format adresse mail
            Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
            Matcher m = p.matcher(adresse);
            if (!m.matches()){
                etEmail.setError("vérfier votre adresse mail");
                return;

            }


            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type,adresse,password);

        }

    }











