package manifest.stonetree.com.br.permissions.feature;

import manifest.stonetree.com.br.permissions.constants.Permission;

public interface IManifestCallback {

    void onPermissionGranted(Permission permission);

    void onPermissionDenied(Permission permission);

}
