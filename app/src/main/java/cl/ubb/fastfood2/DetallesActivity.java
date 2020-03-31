package cl.ubb.fastfood2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetallesActivity extends AppCompatActivity {
    private TextView tvNombre,tvDescripcion,tvcodigo;
    private ImageView tvimagen;
    private MSandwich2 mSandwich2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        try{
            mSandwich2=(MSandwich2)getIntent().getExtras().getSerializable("model");
        } catch (Exception e){
            finish();
        }

        tvNombre=(TextView)findViewById(R.id.ad_tv_nombre);
        tvDescripcion=(TextView)findViewById(R.id.ad_tv_descripcion);
        tvcodigo=(TextView)findViewById(R.id.ad_tv_codigo);
        tvimagen=(ImageView)findViewById(R.id.add_tv_imagen);


        tvNombre.setText(mSandwich2.getNombre());
        tvDescripcion.setText(mSandwich2.getDescripcion());
        tvcodigo.setText(mSandwich2.getCodigo());
        tvimagen.setImageResource(mSandwich2.getImagen());
    }

    //metoda retorna intent para llamar a esta actividad, (pasa modelo)
    public  static Intent getCallingIntent(Context context, MSandwich2 mDetalles){
        //clase actual
        Intent intent=new Intent(context, DetallesActivity.class);
        //etiqueta, pasa el modelo(tiene que estar serializable)
        intent.putExtra("model", mDetalles);
        return intent;
    }
}
