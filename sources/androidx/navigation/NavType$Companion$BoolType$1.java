package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$BoolType$1 extends NavType<Boolean> {
    public NavType$Companion$BoolType$1() {
        super(false);
    }

    public String b() {
        return "boolean";
    }

    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Boolean) obj).booleanValue());
    }

    /* renamed from: k */
    public Boolean a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return (Boolean) bundle.get(str);
    }

    /* renamed from: l */
    public Boolean f(String str) {
        boolean z2;
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "true")) {
            z2 = true;
        } else if (Intrinsics.d(str, "false")) {
            z2 = false;
        } else {
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
        return Boolean.valueOf(z2);
    }

    public void m(Bundle bundle, String str, boolean z2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putBoolean(str, z2);
    }
}
