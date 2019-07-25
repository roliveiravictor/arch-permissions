package manifest.stonetree.com.br.permissions.feature.model;

import android.app.Activity;

import manifest.stonetree.com.br.permissions.constants.Permission;
import manifest.stonetree.com.br.permissions.feature.IManifestCallback;

public interface IComponentBuilder {

    Device build();

    IComponentBuilder setPermission(Permission permission);

    IComponentBuilder setCallback(IManifestCallback callback);

}
