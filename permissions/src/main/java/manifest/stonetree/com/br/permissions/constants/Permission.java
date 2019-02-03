package manifest.stonetree.com.br.permissions.constants;

import android.Manifest;

public class Permission {

    private String key;

    private int value;

    public Permission(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public static final Permission CAMERA = new Permission(Manifest.permission.CAMERA, 0);
    public static final Permission CALL_PHONE = new Permission(Manifest.permission.CALL_PHONE, 1);
    public static final Permission ACCESS_WIFI_STATE = new Permission(Manifest.permission.CALL_PHONE, 2);
    public static final Permission CHANGE_WIFI_STATE = new Permission(Manifest.permission.CHANGE_WIFI_STATE, 3);
    public static final Permission INTERNET = new Permission(Manifest.permission.INTERNET, 4);
    public static final Permission ACCESS_NETWORK_STATE = new Permission(Manifest.permission.ACCESS_NETWORK_STATE, 5);
    public static final Permission WRITE_EXTERNAL_STORAGE = new Permission(Manifest.permission.WRITE_EXTERNAL_STORAGE, 6);
    public static final Permission ACCESS_COARSE_LOCATION = new Permission(Manifest.permission.ACCESS_COARSE_LOCATION, 7);
    public static final Permission ACCESS_FINE_LOCATION = new Permission(Manifest.permission.ACCESS_FINE_LOCATION, 8);
    public static final Permission READ_PHONE_STATE = new Permission(Manifest.permission.READ_PHONE_STATE, 9);
    public static final Permission READ_CONTACTS = new Permission(Manifest.permission.READ_CONTACTS, 10);
    public static final Permission WRITE_CONTACTS = new Permission(Manifest.permission.WRITE_CONTACTS, 11);
    public static final Permission RECORD_AUDIO = new Permission(Manifest.permission.RECORD_AUDIO, 12);
    public static final Permission READ_SMS = new Permission(Manifest.permission.READ_SMS, 13);
    public static final Permission RECEIVE_SMS = new Permission(Manifest.permission.RECEIVE_SMS, 14);
    public static final Permission READ_EXTERNAL_STORAGE = new Permission(Manifest.permission.READ_EXTERNAL_STORAGE, 15);
    public static final Permission WAKE_LOCK = new Permission(Manifest.permission.WAKE_LOCK, 16);
    public static final Permission SYSTEM_ALERT_WINDOW = new Permission(Manifest.permission.SYSTEM_ALERT_WINDOW, 17);
    public static final Permission RECEIVE_BOOT_COMPLETED = new Permission(Manifest.permission.RECEIVE_BOOT_COMPLETED, 18);
    public static final Permission BLUETOOTH = new Permission(Manifest.permission.BLUETOOTH, 19);
}
