package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BuildCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final BuildCompat f19943a = new BuildCompat();

    /* renamed from: b  reason: collision with root package name */
    public static final int f19944b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f19945c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19946d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19947e;

    @Metadata
    public static final class Api30Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api30Impl f19948a = new Api30Impl();

        public final int a(int i2) {
            return SdkExtensions.getExtensionVersion(i2);
        }
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.CLASS)
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        f19944b = i2 >= 30 ? Api30Impl.f19948a.a(30) : 0;
        f19945c = i2 >= 30 ? Api30Impl.f19948a.a(31) : 0;
        f19946d = i2 >= 30 ? Api30Impl.f19948a.a(33) : 0;
        if (i2 >= 30) {
            i3 = Api30Impl.f19948a.a(1000000);
        }
        f19947e = i3;
    }

    public static final boolean a(String str, String str2) {
        Intrinsics.i(str, "codename");
        Intrinsics.i(str2, "buildCodename");
        if (Intrinsics.d("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        Intrinsics.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        Intrinsics.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            if (i2 >= 32) {
                String str = Build.VERSION.CODENAME;
                Intrinsics.h(str, "CODENAME");
                if (a("Tiramisu", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 35) {
            if (i2 >= 34) {
                String str = Build.VERSION.CODENAME;
                Intrinsics.h(str, "CODENAME");
                if (a("VanillaIceCream", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
