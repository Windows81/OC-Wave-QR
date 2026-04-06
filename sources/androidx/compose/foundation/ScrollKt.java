package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class ScrollKt {
    public static final Modifier a(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3) {
        return e(modifier, scrollState, z3, flingBehavior, z2, false, true, (OverscrollEffect) null, 64, (Object) null);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        return a(modifier, scrollState, z2, flingBehavior, z3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.ScrollState c(int r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 == 0) goto L_0x0006
            r11 = r1
        L_0x0006:
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0015
            r14 = -1
            java.lang.String r2 = "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)"
            r3 = -1464256199(0xffffffffa8b93939, float:-2.0563942E-14)
            androidx.compose.runtime.ComposerKt.Y(r3, r13, r14, r2)
        L_0x0015:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            androidx.compose.foundation.ScrollState$Companion r14 = androidx.compose.foundation.ScrollState.f3164i
            androidx.compose.runtime.saveable.Saver r5 = r14.a()
            r14 = r13 & 14
            r14 = r14 ^ 6
            r2 = 4
            if (r14 <= r2) goto L_0x002a
            boolean r14 = r12.i(r11)
            if (r14 != 0) goto L_0x0030
        L_0x002a:
            r13 = r13 & 6
            if (r13 != r2) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            java.lang.Object r13 = r12.g()
            if (r0 != 0) goto L_0x003e
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r13 != r14) goto L_0x0046
        L_0x003e:
            androidx.compose.foundation.ScrollKt$rememberScrollState$1$1 r13 = new androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
            r13.<init>(r11)
            r12.N(r13)
        L_0x0046:
            r7 = r13
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r9 = 0
            r10 = 4
            r6 = 0
            r8 = r12
            java.lang.Object r11 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.foundation.ScrollState r11 = (androidx.compose.foundation.ScrollState) r11
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x005c
            androidx.compose.runtime.ComposerKt.X()
        L_0x005c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt.c(int, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.ScrollState");
    }

    public static final Modifier d(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4, boolean z5, OverscrollEffect overscrollEffect) {
        boolean z6 = z4;
        return ScrollingContainerKt.b(modifier, scrollState, z6 ? Orientation.Vertical : Orientation.Horizontal, z3, z2, flingBehavior, scrollState.l(), z5, overscrollEffect, (BringIntoViewSpec) null, 256, (Object) null).o0(new ScrollingLayoutElement(scrollState, z2, z6));
    }

    public static /* synthetic */ Modifier e(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4, boolean z5, OverscrollEffect overscrollEffect, int i2, Object obj) {
        return d(modifier, scrollState, z2, flingBehavior, z3, z4, z5, (i2 & 64) != 0 ? null : overscrollEffect);
    }

    public static final Modifier f(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3) {
        return e(modifier, scrollState, z3, flingBehavior, z2, true, true, (OverscrollEffect) null, 64, (Object) null);
    }

    public static /* synthetic */ Modifier g(Modifier modifier, ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        return f(modifier, scrollState, z2, flingBehavior, z3);
    }
}
