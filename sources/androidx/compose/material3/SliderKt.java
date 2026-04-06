package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class SliderKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11068a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f11069b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11070c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f11071d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f11072e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f11073f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f11074g = Dp.m((float) 2);

    /* renamed from: h  reason: collision with root package name */
    public static final VerticalAlignmentLine f11075h = new VerticalAlignmentLine(SliderKt$CornerSizeAlignmentLine$1.I);

    static {
        SliderTokens sliderTokens = SliderTokens.f14009a;
        f11068a = sliderTokens.n();
        float l2 = sliderTokens.l();
        f11069b = l2;
        float j2 = sliderTokens.j();
        f11070c = j2;
        f11071d = DpKt.b(l2, j2);
        f11072e = DpKt.b(j2, l2);
        f11073f = sliderTokens.a();
    }

    public static final long b(float f2, float f3) {
        if ((!Float.isNaN(f2) || !Float.isNaN(f3)) && f2 > f3) {
            throw new IllegalArgumentException(("start(" + f2 + ") must be <= endInclusive(" + f3 + ')').toString());
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return SliderRange.c((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.E = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.D
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.E
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            java.lang.Object r8 = r6.C
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.b(r12)
            goto L_0x0055
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.b(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.q6 r5 = new androidx.compose.material3.q6
            r5.<init>(r12)
            r6.C = r12
            r6.E = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.internal.DragGestureDetectorCopyKt.a(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r7 = r12
            r12 = r8
            r8 = r7
        L_0x0055:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L_0x0064
            float r8 = r8.f40905z
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.b(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.a(r12, r8)
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.l(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Unit m(Ref.FloatRef floatRef, PointerInputChange pointerInputChange, float f2) {
        pointerInputChange.a();
        floatRef.f40905z = f2;
        return Unit.f40552a;
    }

    public static final float n(float f2, float f3, float f4) {
        float f5 = f3 - f2;
        return RangesKt.n(f5 == 0.0f ? 0.0f : (f4 - f2) / f5, 0.0f, 1.0f);
    }

    public static final VerticalAlignmentLine o() {
        return f11075h;
    }

    public static final float p() {
        return f11068a;
    }

    public static final boolean q(long j2) {
        return j2 != SliderRange.f11132b.a();
    }

    public static final float r(float f2, float f3, float f4, float f5, float f6) {
        return MathHelpersKt.b(f5, f6, n(f2, f3, f4));
    }

    public static final long s(boolean z2, float f2, float f3, long j2, float f4, float f5) {
        float r2 = r(f2, f3, SliderRange.g(j2), f4, f5);
        float r3 = r(f2, f3, SliderRange.f(j2), f4, f5);
        return z2 ? b(RangesKt.i(r2, r3), r3) : b(r2, RangesKt.d(r3, r2));
    }

    public static final float t(float f2, float[] fArr, float f3, float f4) {
        Float f5;
        if (fArr.length == 0) {
            f5 = null;
        } else {
            float f6 = fArr[0];
            int j0 = ArraysKt.j0(fArr);
            if (j0 == 0) {
                f5 = Float.valueOf(f6);
            } else {
                float abs = Math.abs(MathHelpersKt.b(f3, f4, f6) - f2);
                int i2 = 1;
                if (1 <= j0) {
                    while (true) {
                        float f7 = fArr[i2];
                        float abs2 = Math.abs(MathHelpersKt.b(f3, f4, f7) - f2);
                        if (Float.compare(abs, abs2) > 0) {
                            f6 = f7;
                            abs = abs2;
                        }
                        if (i2 == j0) {
                            break;
                        }
                        i2++;
                    }
                }
                f5 = Float.valueOf(f6);
            }
        }
        return f5 != null ? MathHelpersKt.b(f3, f4, f5.floatValue()) : f2;
    }
}
