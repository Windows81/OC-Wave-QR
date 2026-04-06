package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$DoubleNullableType$1 extends NavType<Double> {
    public InternalNavType$DoubleNullableType$1() {
        super(true);
    }

    public String b() {
        return "double_nullable";
    }

    /* renamed from: k */
    public Double a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    /* renamed from: l */
    public Double f(String str) {
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "null")) {
            return null;
        }
        return (Double) InternalNavType.f22587a.d().f(str);
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, Double d2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        if (d2 == null) {
            bundle.putSerializable(str, (Serializable) null);
        } else {
            InternalNavType.f22587a.d().h(bundle, str, d2);
        }
    }
}
