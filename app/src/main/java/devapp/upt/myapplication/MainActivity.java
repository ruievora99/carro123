package devapp.upt.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Carro> ListaCarros;
    MyAdapter myadapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insereCarros();

        myadapter = new MyAdapter(ListaCarros);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(myadapter);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void insereCarros() {
        ListaCarros = new ArrayList<>();
        ListaCarros.add(new Carro("Audi", R.drawable.audi));
        ListaCarros.add( new Carro("Bentley", R.drawable.bentley));
        ListaCarros.add( new Carro("BMW", R.drawable.bmw));
        ListaCarros.add( new Carro("Citroen", R.drawable.citroen));
        ListaCarros.add(new Carro("Jaguar", R.drawable.jaguar));
        ListaCarros.add(new Carro("Jeep", R.drawable.jeep));
        ListaCarros.add(new Carro("Mercedes", R.drawable.mercedes));
        ListaCarros.add(new Carro("Mini", R.drawable.mini));
        ListaCarros.add(new Carro("Opel", R.drawable.opel));
        ListaCarros.add(new Carro("Porshe", R.drawable.porsche));
        ListaCarros.add(new Carro("Toyota", R.drawable.toyota));
        ListaCarros.add(new Carro("VolksWagen", R.drawable.volkswagen));
    }
}