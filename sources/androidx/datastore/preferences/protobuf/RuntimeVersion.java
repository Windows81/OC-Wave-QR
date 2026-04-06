package androidx.datastore.preferences.protobuf;

import java.util.logging.Logger;

public final class RuntimeVersion {

    /* renamed from: a  reason: collision with root package name */
    public static final RuntimeDomain f21126a;

    /* renamed from: b  reason: collision with root package name */
    public static final RuntimeDomain f21127b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f21128c = a(4, 28, 2, "");

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f21129d = Logger.getLogger(RuntimeVersion.class.getName());

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        f21126a = runtimeDomain;
        f21127b = runtimeDomain;
    }

    public static String a(int i2, int i3, int i4, String str) {
        return String.format("%d.%d.%d%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str});
    }
}
