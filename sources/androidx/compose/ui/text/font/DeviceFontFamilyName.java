package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class DeviceFontFamilyName {

    /* renamed from: a  reason: collision with root package name */
    public final String f18689a;

    public static boolean a(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && Intrinsics.d(str, ((DeviceFontFamilyName) obj).e());
    }

    public static final boolean b(String str, String str2) {
        return Intrinsics.d(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public final /* synthetic */ String e() {
        return this.f18689a;
    }

    public boolean equals(Object obj) {
        return a(this.f18689a, obj);
    }

    public int hashCode() {
        return c(this.f18689a);
    }

    public String toString() {
        return d(this.f18689a);
    }
}
