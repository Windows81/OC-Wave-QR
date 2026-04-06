package io.realm.internal;

import io.realm.RealmConfiguration;
import javax.annotation.Nullable;

public class OsObjectStore {
    public static boolean a(RealmConfiguration realmConfiguration, Runnable runnable) {
        return nativeCallWithLock(realmConfiguration.k(), runnable);
    }

    public static String b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.e() + str);
    }

    public static long c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static void d(OsSharedRealm osSharedRealm, long j2) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j2);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    @Nullable
    private static native String nativeGetPrimaryKeyForObject(long j2, String str);

    private static native long nativeGetSchemaVersion(long j2);

    private static native void nativeSetSchemaVersion(long j2, long j3);
}
