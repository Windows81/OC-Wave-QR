package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$DoubleType$1 extends NavType<Double> {
    public InternalNavType$DoubleType$1() {
        super(false);
    }

    public String b() {
        return "double";
    }

    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).doubleValue());
    }

    /* renamed from: k */
    public Double a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Double");
        return (Double) obj;
    }

    /* renamed from: l */
    public Double f(String str) {
        Intrinsics.i(str, "value");
        return Double.valueOf(Double.parseDouble(str));
    }

    public void m(Bundle bundle, String str, double d2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putDouble(str, d2);
    }
}
