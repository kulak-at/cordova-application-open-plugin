package technology.kulak.cordova.appopen;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.content.Intent;
import android.content.Context;
import android.content.pm.PackageManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;


public class OpenApplication extends CordovaPlugin {
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d("kulak", "EXECUTING");
        Context context = this.cordova.getActivity().getApplicationContext();
        Intent i = new Intent(Intent.ACTION_MAIN);
        PackageManager manager = context.getPackageManager();
        i = manager.getLaunchIntentForPackage(action);
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        context.startActivity(i);
        return true;
    }
}