package io.realm.internal;

import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.log.RealmLog;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Util {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f40241a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f40242b;

    public static void a(String str) {
        if (new AndroidCapabilities().b()) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException("Nonnull '" + str + "' required.");
        }
    }

    public static boolean c(String str, File file, String str2) {
        boolean z2;
        File file2 = new File(file, str2 + ".management");
        File file3 = new File(str);
        File file4 = new File(str + ".note");
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file5 : listFiles) {
                if (!file5.delete()) {
                    RealmLog.g(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", new Object[]{file5.getAbsolutePath()}), new Object[0]);
                }
            }
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.g(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", new Object[]{file2.getAbsolutePath()}), new Object[0]);
        }
        if (file3.exists()) {
            z2 = file3.delete();
            if (!z2) {
                RealmLog.g(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", new Object[]{file3.getAbsolutePath()}), new Object[0]);
            }
        } else {
            z2 = true;
        }
        if (file4.exists() && !file4.delete()) {
            RealmLog.g(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", new Object[]{file4.getAbsolutePath()}), new Object[0]);
        }
        return z2;
    }

    public static Class d(Class cls) {
        if (!cls.equals(RealmModel.class)) {
            Class<RealmObject> cls2 = RealmObject.class;
            if (!cls.equals(cls2)) {
                Class superclass = cls.getSuperclass();
                return (superclass.equals(Object.class) || superclass.equals(cls2)) ? cls : superclass;
            }
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }

    public static String e() {
        return nativeGetTablePrefix();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean f() {
        /*
            java.lang.Class<io.realm.internal.Util> r0 = io.realm.internal.Util.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f40242b     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x0012
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x000e }
            f40242b = r1     // Catch:{ ClassNotFoundException -> 0x000e }
            goto L_0x0012
        L_0x000c:
            r1 = move-exception
            goto L_0x001a
        L_0x000e:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x000c }
            f40242b = r1     // Catch:{ all -> 0x000c }
        L_0x0012:
            java.lang.Boolean r1 = f40242b     // Catch:{ all -> 0x000c }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x000c }
            monitor-exit(r0)
            return r1
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.Util.f():boolean");
    }

    public static boolean g(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean h() {
        /*
            java.lang.Class<io.realm.internal.Util> r0 = io.realm.internal.Util.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f40241a     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "io.reactivex.Flowable"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0013 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0013 }
            f40241a = r1     // Catch:{ ClassNotFoundException -> 0x0013 }
            goto L_0x0017
        L_0x0011:
            r1 = move-exception
            goto L_0x001f
        L_0x0013:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0011 }
            f40241a = r1     // Catch:{ all -> 0x0011 }
        L_0x0017:
            java.lang.Boolean r1 = f40241a     // Catch:{ all -> 0x0011 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)
            return r1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.Util.h():boolean");
    }

    public static Set i(Object... objArr) {
        if (objArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : objArr) {
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static native String nativeGetTablePrefix();
}
