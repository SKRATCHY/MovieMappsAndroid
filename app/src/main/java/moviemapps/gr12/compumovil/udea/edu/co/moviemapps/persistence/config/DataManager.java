package moviemapps.gr12.compumovil.udea.edu.co.moviemapps.persistence.config;

import android.content.Context;


public class DataManager {
    protected DataBaseHelper helper;
    //private List<OnDataChangeListener> listeners;

    public DataManager(Context context) {
        //listeners = new ArrayList<>();
        helper = new DataBaseHelper(context, DataBaseHelper.DB_NAME, DataBaseHelper.DB_ACTUAL_VERSION);
    }

  /*  public void addListener(OnDataChangeListener listener) {
        listeners.add(listener);
    }

    public void removeListener(OnDataChangeListener listener) {
        listeners.remove(listener);
    }*/

    /*public static void eliminarInformacion() {
        DataManager dm = new DataManager();
        SQLiteDatabase db = dm.helper.getWritableDatabase();
        db.execSQL("DELETE FROM usuario");
        db.execSQL("DELETE FROM peso");
        db.execSQL("DELETE FROM consumocalorico");
        db.execSQL("DELETE FROM receta");
        db.execSQL("DELETE FROM ingredienteporreceta");
        db.execSQL("DELETE FROM ingrediente");
        db.close();
        dm.helper.close();
    }*/

   /* public void notifyDataChanged() {
        for (OnDataChangeListener listener : listeners) {
            listener.onDataChange();
        }
    }
*/
}
