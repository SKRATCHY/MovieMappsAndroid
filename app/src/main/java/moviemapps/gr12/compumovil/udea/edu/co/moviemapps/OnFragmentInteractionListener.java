package moviemapps.gr12.compumovil.udea.edu.co.moviemapps;

/**
 * Created by Camila on 11/04/2016.
 */
import android.os.Bundle;

public interface OnFragmentInteractionListener {

    void onFragmentInteraction(Bundle parametros, int accion);

    void setFragment(int fragmentId, Bundle parametros, boolean addStack);
}