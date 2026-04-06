package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$FloatNullableType$1 extends NavType<Float> {
    public InternalNavType$FloatNullableType$1() {
        super(true);
    }

    public String b() {
        return "float_nullable";
    }

    /* renamed from: k */
    public Float a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return null;
    }

    /* renamed from: l */
    public Float f(String str) {
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "null")) {
            return null;
        }
        return (Float) NavType.f22407k.f(str);
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, Float f2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        if (f2 == null) {
            bundle.putSerializable(str, (Serializable) null);
        } else {
            NavType.f22407k.h(bundle, str, f2);
        }
    }
}
