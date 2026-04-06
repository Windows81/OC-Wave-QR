package io.realm.internal;

import android.content.Context;
import com.getkeepsafe.relinker.ReLinker;
import java.io.File;

public class RealmCore {

    /* renamed from: a  reason: collision with root package name */
    public static final String f40222a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f40223b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f40224c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f40225d = false;

    static {
        String str = File.separator;
        f40222a = str;
        String str2 = File.pathSeparator;
        f40223b = str2;
        f40224c = "lib" + str2 + ".." + str + "lib";
    }

    public static synchronized void a(Context context) {
        synchronized (RealmCore.class) {
            if (!f40225d) {
                ReLinker.a(context, "realm-jni", "10.19.0");
                f40225d = true;
            }
        }
    }
}
