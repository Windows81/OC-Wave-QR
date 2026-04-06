package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$LongNullableType$1 extends NavType<Long> {
    public InternalNavType$LongNullableType$1() {
        super(true);
    }

    public String b() {
        return "long_nullable";
    }

    /* renamed from: k */
    public Long a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    /* renamed from: l */
    public Long f(String str) {
        Intrinsics.i(str, "value");
        if (Intrinsics.d(str, "null")) {
            return null;
        }
        return (Long) NavType.f22404h.f(str);
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, Long l2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        if (l2 == null) {
            bundle.putSerializable(str, (Serializable) null);
        } else {
            NavType.f22404h.h(bundle, str, l2);
        }
    }
}
