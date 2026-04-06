package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata
public final class NavType$Companion$ReferenceType$1 extends NavType<Integer> {
    public NavType$Companion$ReferenceType$1() {
        super(false);
    }

    public String b() {
        return "reference";
    }

    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).intValue());
    }

    /* renamed from: k */
    public Integer a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) obj;
    }

    /* renamed from: l */
    public Integer f(String str) {
        int i2;
        Intrinsics.i(str, "value");
        if (StringsKt.Q(str, "0x", false, 2, (Object) null)) {
            String substring = str.substring(2);
            Intrinsics.h(substring, "substring(...)");
            i2 = Integer.parseInt(substring, CharsKt.a(16));
        } else {
            i2 = Integer.parseInt(str);
        }
        return Integer.valueOf(i2);
    }

    public void m(Bundle bundle, String str, int i2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putInt(str, i2);
    }
}
