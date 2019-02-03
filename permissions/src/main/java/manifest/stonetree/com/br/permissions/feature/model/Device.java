package manifest.stonetree.com.br.permissions.feature.model;

import android.app.Activity;
import android.support.annotation.NonNull;

import manifest.stonetree.com.br.permissions.constants.Permission;
import manifest.stonetree.com.br.permissions.feature.IManifestCallback;

public class Device {

    private static Device instance;

    private IManifestCallback callback;

    private Activity activity;

    private Permission permission;

    public IManifestCallback getCallback() {
        return callback;
    }

    public void setCallback(@NonNull IManifestCallback callback) {
        this.callback = callback;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(@NonNull Activity activity) {
        this.activity = activity;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(@NonNull Permission permission) {
        this.permission = permission;
    }

    public static Device getInstance() {
        if (instance == null)
            instance = new Device();

        return instance;
    }

    public static class Builder implements IComponentBuilder {

        private Device device;

        public Builder() {
            this.device = new Device();
        }


        @Override
        public Device build() {
            return this.device;
        }

        @Override
        public IComponentBuilder setPermission(@NonNull Permission permission) {
            this.device.setPermission(permission);
            return this;
        }

        @Override
        public IComponentBuilder setCallback(@NonNull IManifestCallback callback) {
            this.device.setCallback(callback);
            return this;
        }

        @Override
        public IComponentBuilder setActivity(@NonNull Activity activity) {
            this.device.setActivity(activity);
            return this;
        }
    }

}
