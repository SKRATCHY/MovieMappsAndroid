package moviemapps.gr12.compumovil.udea.edu.co.moviemapps;

/**
 * Created by Camila on 11/04/2016.
 */
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import moviemapps.gr12.compumovil.udea.edu.co.moviemapps.model.Movie;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Movie> movies;
    //private OnItemCarreraListener listener;


    //public MyAdapter(ArrayList<Movie> myDataset, OnItemCarreraListener listener) {
    public MyAdapter(ArrayList<Movie> myDataset) {
        movies = myDataset;
        //this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_pelicula, parent, false);
        return new ViewHolder(v);
    }



    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        if(movies.get(position) != null) {
            holder.tvNombre.setText(movies.get(position).getTitle());
            holder.tvDuracion.setText(String.valueOf(movies.get(position).getReleaseDate()));
            holder.tvGenero.setText(String.valueOf(movies.get(position).getId()));
            if (movies.get(position).getPosterPath() != null) {
                holder.ivPoster.setImageURI(Uri.parse(movies.get(position).getPosterPath()));
            }

        }
        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null){
                    listener.onItemClick(peliculas.get(position), holder.itemView, position);
                }
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    /* public String getItem(int position) {
        return peliculas.get(position).getNombre();
    }
    */

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvDuracion,tvGenero;
        ImageView ivPoster;

        public ViewHolder(View itemView) {
            super(itemView);
            ivPoster = (ImageView) itemView.findViewById(R.id.iv_poster);
            tvNombre = (TextView) itemView.findViewById(R.id.tv_nombre_pelicula);
            tvDuracion = (TextView) itemView.findViewById(R.id.tv_duracion);
            tvGenero= (TextView) itemView.findViewById(R.id.tv_genero);

        }
    }

}
