package tn.app.event.com.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    ListView evenementList;
    Button buttonB;

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id ==R.id.retour){
            Intent intent = new Intent(Activity2.this,MainActivity.class);

            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    public static final String KEY_POSITION = "keyPosition";
    EvenementCustomAdapter evenementAdapter;
    ArrayList<Evenement> evenementArray = new ArrayList<Evenement>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);


        /**
         * add item in arraylist
         */
        evenementArray.add(new Evenement("11 ÈME EDITION DU FESTIVAL DES ARTS NUMÉRIQUES 2016","Les industries culturelles et créatives connaissent aujourd’hui un fort engouement sur la scène internationale et offrent un réel potentiel pour relever les défis et contribuer à la stratégie «Tunisie Digitale 2030».",R.drawable.aa,"20_05_2016"));
        evenementArray.add(new Evenement("Versailles", "Versailles le vendredi 27 mai 2016 à 14h à l'Institut français de Tunisie", R.drawable.vv, "27_05_2016"));
        evenementArray.add(new Evenement("CARTHAGODS RELEASE SHOW", "CARTHAGODS RELEASE SHOW le samedi 28 mai 2016 à 17h au Mad'art Carthage", R.drawable.carth, "28_05_2016"));
        evenementArray.add(new Evenement("Holi festival of Colors Monastir","Jeunesse events prod vous informe que Holi festival of colors se tiendra le samedi 28 mai 2016 à partir de 14h30 à Monastir",R.drawable.monastira,"28_05_2016"));
        evenementArray.add(new Evenement("ZAGHOUANE ELECTRONIC ZE2016","ZAGHOUANE ELECTRONIC #ZE2016 se tiendra le samedi 28 mai 2016 à partir de 19h au Temple Des Eaux de Zaghouane",R.drawable.fes,"28_05_2016"));

        evenementArray.add(new Evenement("Zumba International","Zumba International, le dimanche 29 mai à partir de 21h au Casino Djerba",R.drawable.zumba,"28_05_2016"));
        evenementArray.add(new Evenement("Randonnée CAP FARINA","Amoureux des Randonnées, nous revoilà Alors on tours en plein souffle commençant la saison d'été par une randonnée dans l'un des plus fameux plage de bizerte : CAP FARINA ",R.drawable.raf,"29_05_2016"));
        evenementArray.add(new Evenement("لمّة رمضانية مليونيّة","بعيدا عن المسلسلات و التلافز",R.drawable.arja,"16_06_2016"));
        evenementArray.add(new Evenement("Jaafour Show De Jaafer Guesmi","Lundi 20 juin à 22h30. Rendez-vous au Festival Founoun Al Bouhayra pour un \"Jaafour Show\" Exceptionnel",R.drawable.jaaf,"20_06_2016"));




        /**
         * set item into adapter
         */
        evenementAdapter = new EvenementCustomAdapter(Activity2.this, R.layout.row,
                evenementArray);
        evenementList = (ListView) findViewById(R.id.listView);
        evenementList.setItemsCanFocus(false);
        evenementList.setAdapter(evenementAdapter);
        /**
         * get on item click listener
         */
        evenementList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* Intent intent = new Intent(Activity2.this,Activity3.class);
                intent.putExtra(KEY_POSITION,position); */
                CallFunc(position);
               /* startActivity(intent); */
            }
        });
    }
    /*ajout activité selon item */
    private void CallFunc(int position) {
        Intent intent = null ;
        switch (position) {
            case 0:
                intent = new Intent(getBaseContext() , festival.class);

                break;
            case 1 :
                intent = new Intent(getBaseContext() ,details2.class);
                break;
            case 2:
                intent = new Intent(getBaseContext() , Activity3.class);
                break;
            case 3 :
                intent = new Intent(getBaseContext() , holi.class);
                break;
            case 4:
                intent = new Intent(getBaseContext() , electro.class);
                break;
            case 5:
                intent = new Intent(getBaseContext() , Zumba.class);
                break;
            case 6:
                intent = new Intent(getBaseContext() , Randonnee.class);
                break;
            case 7:
                intent = new Intent(getBaseContext() , harja.class);
                break;
            case 8:
                intent = new Intent(getBaseContext() , jaaf.class);
                break;


        }
// pour éviter le if tu peux faire un return sur default du switch
        if(intent != null)
            startActivity(intent);
    }
}