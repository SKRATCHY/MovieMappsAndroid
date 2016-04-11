package moviemapps.gr12.compumovil.udea.edu.co.moviemapps;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import moviemapps.gr12.compumovil.udea.edu.co.moviemapps.model.Pelicula;

/**
 * Created by Camila on 11/04/2016.
 */
public class FragmentListaPeliculas extends Fragment {
    public static final int ID = 1;
    public RecyclerView rv;
    public LinearLayoutManager mLayoutManager;
    ArrayList<Pelicula> peliculas;

    public static FragmentListaPeliculas newInstance(){
        return new FragmentListaPeliculas();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lista_pelicula, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        mLayoutManager = new LinearLayoutManager(getContext());

        rv.setLayoutManager(mLayoutManager);


        MyAdapter adapter = new MyAdapter(peliculas);
        rv.setAdapter(adapter);
        //rv.setOnClickListener(this);
    }
}
