package manifest.stonetree.com.br.permissions.feature;

import android.app.Activity;
import android.content.Intent;

import manifest.stonetree.com.br.permissions.feature.model.Device;

public class Manifest {

    public static void request(Device device) {
        setSingleton(device);
        execute();
    }

    private static void execute() {
        final Activity mActivity = Device.getInstance().getActivity();
        final Intent intent = new Intent(mActivity, Request.class);
        mActivity.startActivity(intent);
    }

    private static void setSingleton(Device device) {
        Device.getInstance().setActivity(device.getActivity());
        Device.getInstance().setCallback(device.getCallback());
        Device.getInstance().setPermission(device.getPermission());
    }

}
