package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$BoolNullableType$1 extends NavType<Boolean> {
    public InternalNavType$BoolNullableType$1() {
        super(true);
    }

    public String b() {
        return "boolean_nullable";
    }

    /* renamed from: k */
    public Boolean a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    /* renamed from: l */
    public Boolean f(String str) {
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "null")) {
            return null;
        }
        return (Boolean) NavType.f22410n.f(str);
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, Boolean bool) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        if (bool == null) {
            bundle.putSerializable(str, (Serializable) null);
        } else {
            NavType.f22410n.h(bundle, str, bool);
        }
    }
}
