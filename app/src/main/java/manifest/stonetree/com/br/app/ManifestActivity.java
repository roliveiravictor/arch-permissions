package manifest.stonetree.com.br.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import manifest.stonetree.com.br.permissions.constants.Permission;
import manifest.stonetree.com.br.permissions.feature.IManifestCallback;
import manifest.stonetree.com.br.permissions.feature.Manifest;
import manifest.stonetree.com.br.permissions.feature.model.Device;

import static manifest.stonetree.com.br.permissions.constants.Permission.CAMERA;

public class ManifestActivity extends AppCompatActivity implements IManifestCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifest);

        final Device device = new Device.Builder()
                .setPermission(CAMERA)
                .setCallback(this)
                .build();

        Manifest.request(device, this);
    }

    @Override
    public void onPermissionGranted(Permission permission) {
        if (CAMERA.equals(permission))
            openCamera();
    }

    @Override
    public void onPermissionDenied(Permission permission) {

    }

    private void openCamera() {
        final Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
    }
}
