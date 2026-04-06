package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ScrollableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f3563a = ScrollableKt$CanDragCalculation$1.f3567z;

    /* renamed from: b  reason: collision with root package name */
    public static final ScrollScope f3564b = new ScrollableKt$NoOpScrollScope$1();

    /* renamed from: c  reason: collision with root package name */
    public static final MotionDurationScale f3565c = new ScrollableKt$DefaultScrollMotionDurationScale$1();

    /* renamed from: d  reason: collision with root package name */
    public static final ScrollableKt$UnityDensity$1 f3566d = new ScrollableKt$UnityDensity$1();

    public static final MotionDurationScale f() {
        return f3565c;
    }

    public static final boolean g(FlingBehavior flingBehavior) {
        return false;
    }

    public static final Modifier h(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        Modifier modifier2 = modifier;
        return modifier.o0(new ScrollableElement(scrollableState, orientation, overscrollEffect, z2, z3, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static final Modifier i(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        return j(modifier, scrollableState, orientation, (OverscrollEffect) null, z2, z3, flingBehavior, mutableInteractionSource, (BringIntoViewSpec) null, 128, (Object) null);
    }

    public static /* synthetic */ Modifier j(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i2, Object obj) {
        int i3 = i2;
        return h(modifier, scrollableState, orientation, overscrollEffect, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? null : flingBehavior, (i3 & 64) != 0 ? null : mutableInteractionSource, (i3 & 128) != 0 ? null : bringIntoViewSpec);
    }

    public static /* synthetic */ Modifier k(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            z3 = false;
        }
        return i(modifier, scrollableState, orientation, z4, z3, (i2 & 16) != 0 ? null : flingBehavior, (i2 & 32) != 0 ? null : mutableInteractionSource);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(androidx.compose.foundation.gestures.ScrollingLogic r11, long r12, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r11 = r0.D
            kotlin.jvm.internal.Ref$FloatRef r11 = (kotlin.jvm.internal.Ref.FloatRef) r11
            java.lang.Object r12 = r0.C
            androidx.compose.foundation.gestures.ScrollingLogic r12 = (androidx.compose.foundation.gestures.ScrollingLogic) r12
            kotlin.ResultKt.b(r14)
            r14 = r11
            r11 = r12
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            kotlin.ResultKt.b(r14)
            kotlin.jvm.internal.Ref$FloatRef r14 = new kotlin.jvm.internal.Ref$FloatRef
            r14.<init>()
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r10 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.C = r11
            r0.D = r14
            r0.F = r3
            java.lang.Object r12 = r11.z(r2, r10, r0)
            if (r12 != r1) goto L_0x005c
            return r1
        L_0x005c:
            float r12 = r14.f40905z
            long r11 = r11.G(r12)
            androidx.compose.ui.geometry.Offset r11 = androidx.compose.ui.geometry.Offset.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.l(androidx.compose.foundation.gestures.ScrollingLogic, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
