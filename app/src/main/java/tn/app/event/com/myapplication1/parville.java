package tn.app.event.com.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class parville extends AppCompatActivity {
    Button buttonB;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;
    Button b19;
    Button b20;
    Button b21;
    Button b22;
    Button b23;
    Button b24;

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu1_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id ==R.id.retour){
            Intent intent = new Intent(parville.this,MainActivity.class);

            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parville);
        buttonB = (Button)findViewById(R.id.buttonB);
       b1= (Button)findViewById(R.id.b1);
        b1= (Button)findViewById(R.id.b1);
        b2= (Button)findViewById(R.id.b2);
        b3= (Button)findViewById(R.id.b3);
        b4= (Button)findViewById(R.id.b4);
        b5= (Button)findViewById(R.id.b5);
        b6= (Button)findViewById(R.id.b6);
        b7= (Button)findViewById(R.id.b7);
        b8= (Button)findViewById(R.id.b8);
        b9= (Button)findViewById(R.id.b9);
        b10= (Button)findViewById(R.id.b10);
        b11= (Button)findViewById(R.id.b11);
        b12= (Button)findViewById(R.id.b12);
        b13= (Button)findViewById(R.id.b13);
        b14= (Button)findViewById(R.id.b14);
        b15= (Button)findViewById(R.id.b15);
        b16= (Button)findViewById(R.id.b16);
        b17= (Button)findViewById(R.id.b17);
        b18= (Button)findViewById(R.id.b18);
        b24= (Button)findViewById(R.id.b24);
        b19= (Button)findViewById(R.id.b19);
        b20= (Button)findViewById(R.id.b20);
        b21= (Button)findViewById(R.id.b21);
        b22= (Button)findViewById(R.id.b22);
        b23= (Button)findViewById(R.id.b23);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, tunis.class);
                startActivity(intent);

            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, tatawine.class);
                startActivity(intent);

            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, sfax.class);
                startActivity(intent);

            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, beja.class);
                startActivity(intent);

            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, sousse.class);
                startActivity(intent);

            }


        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, nabeul.class);
                startActivity(intent);

            }


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, karwen.class);
                startActivity(intent);

            }


        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, mahdia.class);
                startActivity(intent);

            }


        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, gabes.class);
                startActivity(intent);

            }


        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this, kef.class);
                startActivity(intent);

            }


        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,bizerte.class);
                startActivity(intent);

            }


        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,jendouba.class);
                startActivity(intent);

            }


        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,ariana.class);
                startActivity(intent);

            }


        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,sidibouzid.class);
                startActivity(intent);

            }


        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,zaghoune.class);
                startActivity(intent);

            }


        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,mednine.class);
                startActivity(intent);

            }


        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,kbeli.class);
                startActivity(intent);

            }


        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,monastir.class);
                startActivity(intent);

            }


        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,seliana.class);
                startActivity(intent);

            }


        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,arous.class);
                startActivity(intent);

            }


        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,manouba.class);
                startActivity(intent);

            }


        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,kas.class);
                startActivity(intent);

            }


        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,tozeur.class);
                startActivity(intent);

            }


        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parville.this,nabeul.class);
                startActivity(intent);

            }


        });
    }


}
