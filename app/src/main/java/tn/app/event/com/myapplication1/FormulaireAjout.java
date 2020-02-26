package tn.app.event.com.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormulaireAjout extends AppCompatActivity {
    Button buttonB;
    Button soumettre;


    EditText etNom,etdate,etdescription,etville,etlieu;
    Context ctx = this;
    String      Nom, Date,Lieu,descript,ville;



    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id ==R.id.retour){
            Intent intent = new Intent(FormulaireAjout.this,welcome.class);

            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire_ajout);
        buttonB = (Button)findViewById(R.id.buttonB);
        soumettre = (Button)findViewById(R.id.soumettre);


      soumettre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormulaireAjout.this, welcome.class);
                startActivity(intent);

            }


        });





    }



}
