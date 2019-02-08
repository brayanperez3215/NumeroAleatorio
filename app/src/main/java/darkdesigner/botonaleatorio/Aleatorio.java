package darkdesigner.botonaleatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Aleatorio extends AppCompatActivity {

    int adivina = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio);

        Random miRandom = new Random();
        adivina = miRandom.nextInt();

    }

    public void boton (View vista){

        EditText miTexto = (EditText) findViewById(R.id.cuadro);
        TextView mietiqueta = (TextView)findViewById(R.id.texto);


        int numero = Integer.parseInt(miTexto.getText().toString());

        if (numero == adivina){
            mietiqueta.setText("GANO");

        }else{

            if (numero > adivina){
                mietiqueta.setText("SE PASO"+ numero + "INTENTA DE NUEVO");
                miTexto.setText("");

            }else{

                if (numero < adivina){
                    mietiqueta.setText("LE FALTA"+ numero + "intentar de nuevo");
                    miTexto.setText("");
                }

            }
        }

        adivina ++;

    }
}
