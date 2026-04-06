package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$IntNullableType$1 extends NavType<Integer> {
    public InternalNavType$IntNullableType$1() {
        super(true);
    }

    public String b() {
        return "integer_nullable";
    }

    /* renamed from: k */
    public Integer a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    /* renamed from: l */
    public Integer f(String str) {
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "null")) {
            return null;
        }
        return (Integer) NavType.f22400d.f(str);
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, Integer num) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        if (num == null) {
            bundle.putSerializable(str, (Serializable) null);
        } else {
            NavType.f22400d.h(bundle, str, num);
        }
    }
}
