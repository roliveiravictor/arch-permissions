package manifest.stonetree.com.br.permissions.feature;

import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import manifest.stonetree.com.br.permissions.R;
import manifest.stonetree.com.br.permissions.constants.Permission;
import manifest.stonetree.com.br.permissions.feature.model.Device;

public class Request extends AppCompatActivity {

    private IManifestCallback callback;

    private Permission permission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        setRequest();
        fetchPermission();
    }

    public void setRequest() {
        this.callback = Device.getInstance().getCallback();
        this.permission = Device.getInstance().getPermission();
    }

    protected void fetchPermission() {
        if (isPermissionAlreadyGranted())
            callback.onPermissionGranted(permission);
        else
            ActivityCompat.requestPermissions(this, new String[]{permission.getKey()}, permission.getValue());
    }

    private boolean isPermissionAlreadyGranted() {
        return ActivityCompat.checkSelfPermission(this, permission.getKey()) == PackageManager.PERMISSION_GRANTED;
    }


    @Override
    public void onRequestPermissionsResult(int id, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(id, permissions, grantResults);
        this.finish();
        executeCallback(id, grantResults);
    }

    private void executeCallback(int id, int[] grantResults) {
        if (id == permission.getValue()) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED)
                callback.onPermissionGranted(permission);
            else
                callback.onPermissionDenied(permission);
        }
    }

}