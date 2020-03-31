package cl.ubb.fastfood2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<MSandwich> arrayList;

    public Adaptador(Context context, ArrayList<MSandwich> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.item,null);
        }
        TextView nombre=(TextView)convertView.findViewById(R.id.i_tv_nombre);
        TextView descripcion=(TextView)convertView.findViewById(R.id.i_tv_descripcion);
        TextView codigo=(TextView)convertView.findViewById(R.id.i_tv_codigo);
        ImageView imagen=(ImageView)convertView.findViewById(R.id.i_tv_imagen);

        nombre.setText(arrayList.get(position).getNombre());
        descripcion.setText(arrayList.get(position).getDescripcion());
        codigo.setText(arrayList.get(position).getCodigo());
        imagen.setImageResource(arrayList.get(position).getImagen());

        return convertView;
    }
}