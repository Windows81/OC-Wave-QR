package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavType$Companion$FloatType$1 extends NavType<Float> {
    public NavType$Companion$FloatType$1() {
        super(false);
    }

    public String b() {
        return "float";
    }

    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).floatValue());
    }

    /* renamed from: k */
    public Float a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Float");
        return (Float) obj;
    }

    /* renamed from: l */
    public Float f(String str) {
        Intrinsics.i(str, "value");
        return Float.valueOf(Float.parseFloat(str));
    }

    public void m(Bundle bundle, String str, float f2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putFloat(str, f2);
    }
}
