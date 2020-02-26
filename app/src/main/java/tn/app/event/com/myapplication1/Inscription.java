package tn.app.event.com.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inscription extends AppCompatActivity {
    Button buttonB;
    TextView lien_inscription;
    //Button buttonInscription;

    EditText etNom,etEmail,etPass;
    String Nom, Email,Pass;
    Context ctx = this;


    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id ==R.id.retour){
            Intent intent = new Intent(Inscription.this,Connecter.class);

            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        buttonB = (Button)findViewById(R.id.buttonB);
        lien_inscription = (TextView)findViewById(R.id.lien_inscription);
       // buttonInscription = (Button)findViewById(R.id.buttonInscription);
        etNom = (EditText)findViewById(R.id.nom);
        etEmail = (EditText)findViewById(R.id.mail);
        etPass = (EditText)findViewById(R.id.mdp);

        lien_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inscription.this, Connecter.class);
                startActivity(intent);

            }


        });
      /* buttonInscription.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Inscription.this, FormulaireAjout.class);
               startActivity(intent);

           }


       });*/
    }





    public void register_register(View v){
        Nom = etNom.getText().toString();
        Email = etEmail.getText().toString();
        Pass = etPass.getText().toString();

       //champs nn vide

        if (Nom.equals("")||Email.equals("")||Pass.equals("")){
            Toast.makeText(Inscription.this, "les champs ne doivent pas etre vide", Toast.LENGTH_SHORT).show();
            return;
        }

        //verifier adresse mail
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(Email);
        if (!m.matches()){
            etEmail.setError("verifier mail");
            return;
        }



        BackGround b = new BackGround();
        b.execute(Nom, Email, Pass);
        Intent intent = new Intent(Inscription.this,Connecter.class);
        startActivity(intent);

    }

    class BackGround extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... params) {
            String Nom = params[0];
            String Email = params[1];
            String pass = params[2];
            String data= "";
            int tmp;

            try{
               URL url = new URL("http://watchallenge.com/kaouther.php");

                String urlParams = "Nom="+Nom+"&Email="+Email+"&pass="+pass;

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoOutput(true);
                OutputStream os = httpURLConnection.getOutputStream();
                os.write(urlParams.getBytes());
                os.flush();
                os.close();
                InputStream is = httpURLConnection.getInputStream();
                while((tmp=is.read())!=-1){
                    data+= (char)tmp;
                }
                is.close();
                httpURLConnection.disconnect();

                return data;

            } catch (MalformedURLException e) {
                e.printStackTrace();
                return "Exception1:" +e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "Exception2:" +e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String s) {
            if (s.equals("")){
                s = "inscription réussie.";
            }
            Toast.makeText(ctx,s , Toast.LENGTH_SHORT).show();
        }
    }






}
