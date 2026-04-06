package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PrefetchScheduler_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PrefetchScheduler_androidKt$RobolectricImpl$1 f4987a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        f4987a = Intrinsics.d(lowerCase, "robolectric") ? new PrefetchScheduler_androidKt$RobolectricImpl$1() : null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.compose.foundation.lazy.layout.PrefetchScheduler} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.layout.PrefetchScheduler a(androidx.compose.runtime.Composer r3, int r4) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)"
            r2 = 1141871251(0x440f9293, float:574.2902)
            androidx.compose.runtime.ComposerKt.Y(r2, r4, r0, r1)
        L_0x000f:
            androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1 r4 = f4987a
            if (r4 == 0) goto L_0x001d
            r0 = 1213893039(0x485a89af, float:223782.73)
            r3.X(r0)
            r3.M()
            goto L_0x004d
        L_0x001d:
            r4 = 1213931944(0x485b21a8, float:224390.62)
            r3.X(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r4 = r3.C(r4)
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r3.W(r4)
            java.lang.Object r1 = r3.g()
            if (r0 != 0) goto L_0x003f
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0047
        L_0x003f:
            androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler r1 = new androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler
            r1.<init>(r4)
            r3.N(r1)
        L_0x0047:
            r4 = r1
            androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler r4 = (androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler) r4
            r3.M()
        L_0x004d:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0056
            androidx.compose.runtime.ComposerKt.X()
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt.a(androidx.compose.runtime.Composer, int):androidx.compose.foundation.lazy.layout.PrefetchScheduler");
    }
}
