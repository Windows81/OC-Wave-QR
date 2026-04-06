package io.realm.internal.android;

import android.os.Looper;
import io.realm.internal.Capabilities;

public class AndroidCapabilities implements Capabilities {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f40243c = false;

    /* renamed from: a  reason: collision with root package name */
    public final Looper f40244a = Looper.myLooper();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f40245b = e();

    public static boolean e() {
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }

    public boolean a() {
        return d() && !this.f40245b;
    }

    public boolean b() {
        Looper looper = this.f40244a;
        return looper != null && (f40243c || looper == Looper.getMainLooper());
    }

    public void c(String str) {
        String str2 = "";
        if (!d()) {
            if (str != null) {
                str2 = str + " " + "Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        } else if (this.f40245b) {
            if (str != null) {
                str2 = str + " " + "Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }

    public final boolean d() {
        return this.f40244a != null;
    }
}
