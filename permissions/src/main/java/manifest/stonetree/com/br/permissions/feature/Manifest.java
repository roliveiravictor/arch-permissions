package manifest.stonetree.com.br.permissions.feature;

import android.content.Context;
import android.content.Intent;

import manifest.stonetree.com.br.permissions.feature.model.Device;

public class Manifest {

    public static void request(Device device, Context context) {
        setSingleton(device);
        execute(context);
    }

    private static void execute(Context context) {
        final Intent intent = new Intent(context, Request.class);
        context.startActivity(intent);
    }

    private static void setSingleton(Device device) {
        Device.getInstance().setCallback(device.getCallback());
        Device.getInstance().setPermission(device.getPermission());
    }

}
