package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$StringType$1 extends NavType<String> {
    public NavType$Companion$StringType$1() {
        super(true);
    }

    public String b() {
        return "string";
    }

    /* renamed from: k */
    public String a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (String) bundle.get(str);
    }

    /* renamed from: l */
    public String f(String str) {
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "null")) {
            return null;
        }
        return str;
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, String str2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putString(str, str2);
    }

    /* renamed from: n */
    public String i(String str) {
        String encode = str != null ? Uri.encode(str) : null;
        return encode == null ? "null" : encode;
    }
}
