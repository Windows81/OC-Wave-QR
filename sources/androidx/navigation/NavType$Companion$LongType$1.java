package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata
public final class NavType$Companion$LongType$1 extends NavType<Long> {
    public NavType$Companion$LongType$1() {
        super(false);
    }

    public String b() {
        return "long";
    }

    public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
        m(bundle, str, ((Number) obj).longValue());
    }

    /* renamed from: k */
    public Long a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Object obj = bundle.get(str);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Long");
        return (Long) obj;
    }

    /* renamed from: l */
    public Long f(String str) {
        String str2;
        long j2;
        Intrinsics.i(str, "value");
        if (StringsKt.A(str, "L", false, 2, (Object) null)) {
            str2 = str.substring(0, str.length() - 1);
            Intrinsics.h(str2, "substring(...)");
        } else {
            str2 = str;
        }
        if (StringsKt.Q(str, "0x", false, 2, (Object) null)) {
            String substring = str2.substring(2);
            Intrinsics.h(substring, "substring(...)");
            j2 = Long.parseLong(substring, CharsKt.a(16));
        } else {
            j2 = Long.parseLong(str2);
        }
        return Long.valueOf(j2);
    }

    public void m(Bundle bundle, String str, long j2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        bundle.putLong(str, j2);
    }
}
