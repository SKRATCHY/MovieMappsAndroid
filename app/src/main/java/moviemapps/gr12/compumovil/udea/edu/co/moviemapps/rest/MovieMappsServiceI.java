package moviemapps.gr12.compumovil.udea.edu.co.moviemapps.rest;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Samuel Arenas
 * @version 1.0.0
 * @date 04/2016
 */
public interface MovieMappsServiceI {

    @GET("movie/top_rated")
    Call<Resultado> top_peliculas(@Query("api_key") String apiKey);


/*
    @POST("/autenticacion/{usuario}/{contrasena}")
    void iniciarSesion(@Path("usuario") String usuario,
                       @Path("contrasena") String contrasena,
                       Callback<Resultado> cb);

    @PUT("/autenticacion/{correo}/{contrasena}")
    void cambiarContrasena(@Header("TOKEN") String token,
                           @Path("correo") String correo,
                           @Path("contrasena") String contrasena,
                           Callback<Resultado> cb);

    @DELETE("/autenticacion/{token}")
    void cerrarSesion(@Path("token") String token,
                      Callback<Resultado> cb);*/


}
