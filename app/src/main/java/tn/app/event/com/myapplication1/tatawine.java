package tn.app.event.com.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class tatawine extends AppCompatActivity {
    Button buttonB;
    ListView evenementList;
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id ==R.id.retour){
            Intent intent = new Intent(tatawine.this,parville.class);

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

        setContentView(R.layout.activity_tatawine);

        /**
         * add item in arraylist
         */
        evenementArray.add(new Evenement("Le festival international des Ksours sahariens de Tataouine ","La 37ème édition du festival international des ksours sahariens se tiendra à Tataouine",R.drawable.tata,"24_03_2016"));


        /**
         * set item into adapter
         */
        evenementAdapter = new EvenementCustomAdapter(tatawine.this, R.layout.row,
                evenementArray);
        evenementList = (ListView) findViewById(R.id.listView);
        evenementList.setItemsCanFocus(false);
        evenementList.setAdapter(evenementAdapter);
        /**
         * get on item click listener
         */
        evenementList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                intent = new Intent(getBaseContext() , tata.class);

                break;


        }
// pour éviter le if tu peux faire un return sur default du switch
        if(intent != null)
            startActivity(intent);
    }
}
