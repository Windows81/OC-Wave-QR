package androidx.compose.ui.scrollcapture;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
final class RelativeScroller {

    /* renamed from: a  reason: collision with root package name */
    public final int f18006a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f18007b;

    /* renamed from: c  reason: collision with root package name */
    public float f18008c;

    public RelativeScroller(int i2, Function2 function2) {
        this.f18006a = i2;
        this.f18007b = function2;
    }

    public final float b() {
        return this.f18008c;
    }

    public final int c(int i2) {
        return RangesKt.o(i2 - MathKt.d(this.f18008c), 0, this.f18006a);
    }

    public final void d() {
        this.f18008c = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(float r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.ui.scrollcapture.RelativeScroller) r5
            kotlin.ResultKt.b(r6)
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f18007b
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.b(r5)
            r0.C = r4
            r0.F = r3
            java.lang.Object r6 = r6.m(r5, r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r5 = r4
        L_0x004a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f18008c
            float r0 = r0 + r6
            r5.f18008c = r0
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.e(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(int i2, int i3, Continuation continuation) {
        if (i2 <= i3) {
            int i4 = i3 - i2;
            int i5 = this.f18006a;
            if (i4 <= i5) {
                float f2 = (float) i2;
                float f3 = this.f18008c;
                if (f2 >= f3 && ((float) i3) <= ((float) i5) + f3) {
                    return Unit.f40552a;
                }
                if (f2 >= f3) {
                    i2 = i3 - i5;
                }
                Object g2 = g((float) i2, continuation);
                return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
            }
            throw new IllegalArgumentException(("Expected range (" + i4 + ") to be ≤ viewportSize=" + this.f18006a).toString());
        }
        throw new IllegalArgumentException(("Expected min=" + i2 + " ≤ max=" + i3).toString());
    }

    public final Object g(float f2, Continuation continuation) {
        Object e2 = e(f2 - this.f18008c, continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
