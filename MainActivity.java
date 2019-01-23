package basico.android.cftic.edu.colorbox;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int cont,colorB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cont=0;
        colorB = getResources().getColor(R.color.tocado);
        }

    public void fClic0(View view) {
        int colorId;
        LinearLayout l1= (LinearLayout) view;
        ColorDrawable colorOrigen=(ColorDrawable)l1.getBackground();

        colorId=colorOrigen.getColor();

        if (colorId!=colorB) {
            l1.setBackgroundColor(colorB);
            cont++;
            if (cont==12) {
                cerrar();
            }
        }
    }
    private void cerrar() {
        Toast toast=Toast.makeText(this,"TODO EN NEGRO - Cerrando la aplicación",Toast.LENGTH_LONG);
        toast.show();
        finish();
    }
    public void fClic(View view) {

        LinearLayout l1= (LinearLayout) view;

        String b="";

        Object tag= l1.getTag();

        if (tag==null)
        {l1.setTag(true);
            l1.setBackgroundColor(colorB);
            Toast t=Toast.makeText(this,"Otro Para la saca",Toast.LENGTH_SHORT);
            t.show();
        }

        }
}
