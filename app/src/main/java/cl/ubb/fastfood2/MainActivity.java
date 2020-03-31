package cl.ubb.fastfood2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    private ImageView imagenprincipal;
    private Button sandwiches;
    private Button sobreempresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenprincipal=findViewById(R.id.imagenprincipal);
        sandwiches=findViewById(R.id.boton1);
        sobreempresa=findViewById(R.id.boton2);
    }

    public void PantallaSobreNosotros(View view) {
        //clase java a la que se quiere ver
        Intent login=new Intent(this, SobreNosotros.class);
        startActivity(login);
    }

    public void PantallaSandwiches(View view) {
        //clase java a la que se quiere ver
        Intent login=new Intent(this, SandwichesP.class);
        startActivity(login);
    }
}