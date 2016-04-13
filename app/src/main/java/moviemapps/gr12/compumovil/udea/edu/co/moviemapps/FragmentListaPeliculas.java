package moviemapps.gr12.compumovil.udea.edu.co.moviemapps;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import moviemapps.gr12.compumovil.udea.edu.co.moviemapps.model.Movie;
import moviemapps.gr12.compumovil.udea.edu.co.moviemapps.rest.MovieMappsService;
import moviemapps.gr12.compumovil.udea.edu.co.moviemapps.rest.Resultado;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Camila on 11/04/2016.
 */
public class FragmentListaPeliculas extends Fragment {
    public static final int ID = 1;
    public RecyclerView rv;
    public String apiKey = "d4aadc42b63f7a1565bffa6dd41f1bfc";
    public LinearLayoutManager mLayoutManager;
    ArrayList<Movie> peliculas;

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
        new Download().execute();
        //rv.setOnClickListener(this);
    }

    private class Download extends AsyncTask<Void, Void, Response> {
        protected void onProgressUpdate(Integer... progress) {
                Log.e("rest", "" + progress);
        }

        protected void onPostExecute(Long result) {

        }

        @Override
        protected Response doInBackground(Void... params) {
            Call<Resultado> resultados = MovieMappsService.obtenerInstancia().top_peliculas(apiKey);
            resultados.enqueue(new Callback<Resultado>() {
                @Override
                public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                    setMovies(response.body());
                }

                @Override
                public void onFailure(Call<Resultado> call, Throwable t) {

                }
            });

            return null;
        }
    }

    public void setMovies(Resultado resultado){
        if(resultado != null) {
            Log.e("page",""+resultado.getPage());
            List<Movie> movies = resultado.getResults();
            MyAdapter adapter = new MyAdapter((ArrayList<Movie>) movies);
            rv.setAdapter(adapter);
        }
    }
}
