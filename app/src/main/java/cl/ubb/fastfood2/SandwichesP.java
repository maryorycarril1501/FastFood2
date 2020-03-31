package cl.ubb.fastfood2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

public class SandwichesP extends AppCompatActivity {
    private ListView lista;
    private Adaptador adaptador;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        context=this;

        ArrayList<MSandwich> model=new ArrayList<>();
        MSandwich m=new MSandwich();
        m.setNombre("SANDWICH ITALIANO");
        m.setDescripcion("Sándwich de carne mechada, una palta grande, un tomate mediano, mayonesa y 2 panes de hamburguesa clásicos.");
        m.setCodigo("Precio: $4990");
        m.setImagen(R.drawable.italiano);
        model.add(m);

        m=new MSandwich();
        m.setNombre("SANDWICH BARROS LUCO");
        m.setDescripcion("Sándwich de churrasco de vacuno, 2 láminas de queso derretido, opcionalmente mayonesa y 2 panes de hamburguesa clásicos.");
        m.setCodigo("Precio: $3990");
        m.setImagen(R.drawable.barrosluco);
        model.add(m);

        m=new MSandwich();
        m.setNombre("SANDWICH CHACARERO");
        m.setDescripcion("Sándwich de churrasco de vacuno, porotos verdes , un tomate mediano, ají verde y 2 panes de hamburguesa clásicos.");
        m.setCodigo("Precio: $4990");
        m.setImagen(R.drawable.chacarero);
        model.add(m);

        m=new MSandwich();
        m.setNombre("SANDWICH LOMO CHACARERO");
        m.setDescripcion("Sándwich de lomito de cerdo, porotos verdes , un tomate mediano, ají verde y 2 panes de hamburguesa clásicos.");
        m.setCodigo("Precio: $3990");
        m.setImagen(R.drawable.lomochacarero);
        model.add(m);

        m=new MSandwich();
        m.setNombre("SANDWICH LOMO LUCO");
        m.setDescripcion("Sándwich de lomito de cerdo, 2 láminas de queso derretido, opcionalmente mayonesa y 2 panes de hamburguesa clásicos.");
        m.setCodigo("Precio: $3990");
        m.setImagen(R.drawable.lomoluco);
        model.add(m);

        m=new MSandwich();
        m.setNombre("SANDWICH POLLO GRANJERO");
        m.setDescripcion("Sándwich de pollo, churrasco o lomito, con un tomate grande y lechuga morada y lechuga clásica, y 2 panes de hamburguesa clásica.");
        m.setCodigo("Precio: $3990");
        m.setImagen(R.drawable.pollogranjero);
        model.add(m);

        adaptador=new Adaptador(this,model);

        lista=(ListView)findViewById(R.id.ma_lv_lista);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MSandwich mDuvatec=(MSandwich)adaptador.getItem(position);

                MSandwich2 mDetalles=new MSandwich2();
                mDetalles.setNombre(mDuvatec.getNombre());
                mDetalles.setDescripcion(mDuvatec.getDescripcion());
                mDetalles.setCodigo(mDuvatec.getCodigo());
                mDetalles.setImagen(mDuvatec.getImagen());
                startActivity(DetallesActivity.getCallingIntent(context, mDetalles));
            }
        });

    }
}


