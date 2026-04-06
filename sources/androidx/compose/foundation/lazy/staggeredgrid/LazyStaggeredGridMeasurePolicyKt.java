package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class LazyStaggeredGridMeasurePolicyKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5110a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f5110a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.WhenMappings.<clinit>():void");
        }
    }

    public static final float d(PaddingValues paddingValues, Orientation orientation, boolean z2, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.f5110a[orientation.ordinal()];
        if (i2 == 1) {
            return z2 ? paddingValues.d() : paddingValues.a();
        }
        if (i2 == 2) {
            return z2 ? PaddingKt.g(paddingValues, layoutDirection) : PaddingKt.f(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float e(PaddingValues paddingValues, Orientation orientation, boolean z2, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.f5110a[orientation.ordinal()];
        if (i2 == 1) {
            return z2 ? paddingValues.a() : paddingValues.d();
        }
        if (i2 == 2) {
            return z2 ? PaddingKt.f(paddingValues, layoutDirection) : PaddingKt.g(paddingValues, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v53, resolved type: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1} */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.W(r16) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        if (r4 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00f1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function2 f(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r16, kotlin.jvm.functions.Function0 r17, androidx.compose.foundation.layout.PaddingValues r18, boolean r19, androidx.compose.foundation.gestures.Orientation r20, float r21, float r22, kotlinx.coroutines.CoroutineScope r23, androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider r24, androidx.compose.ui.graphics.GraphicsContext r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            r0 = r26
            r1 = r27
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0013
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:51)"
            r4 = 1630140849(0x6129f9b1, float:1.9596824E20)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0013:
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0025
            r2 = r16
            boolean r6 = r0.W(r2)
            if (r6 != 0) goto L_0x002b
            goto L_0x0027
        L_0x0025:
            r2 = r16
        L_0x0027:
            r6 = r1 & 6
            if (r6 != r3) goto L_0x002d
        L_0x002b:
            r3 = r5
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r10 = r17
            if (r6 <= r7) goto L_0x003e
            boolean r6 = r0.W(r10)
            if (r6 != 0) goto L_0x0042
        L_0x003e:
            r6 = r1 & 48
            if (r6 != r7) goto L_0x0044
        L_0x0042:
            r6 = r5
            goto L_0x0045
        L_0x0044:
            r6 = r4
        L_0x0045:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r11 = r18
            if (r6 <= r7) goto L_0x0056
            boolean r6 = r0.W(r11)
            if (r6 != 0) goto L_0x005a
        L_0x0056:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L_0x005c
        L_0x005a:
            r6 = r5
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r12 = r19
            if (r6 <= r7) goto L_0x006e
            boolean r6 = r0.d(r12)
            if (r6 != 0) goto L_0x0072
        L_0x006e:
            r6 = r1 & 3072(0xc00, float:4.305E-42)
            if (r6 != r7) goto L_0x0074
        L_0x0072:
            r6 = r5
            goto L_0x0075
        L_0x0074:
            r6 = r4
        L_0x0075:
            r3 = r3 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r1
            r6 = r6 ^ 24576(0x6000, float:3.4438E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            r8 = r20
            if (r6 <= r7) goto L_0x0088
            boolean r6 = r0.W(r8)
            if (r6 != 0) goto L_0x008c
        L_0x0088:
            r6 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r6 != r7) goto L_0x008e
        L_0x008c:
            r6 = r5
            goto L_0x008f
        L_0x008e:
            r6 = r4
        L_0x008f:
            r3 = r3 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r1
            r7 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 ^ r7
            r9 = 131072(0x20000, float:1.83671E-40)
            r13 = r21
            if (r6 <= r9) goto L_0x00a2
            boolean r6 = r0.h(r13)
            if (r6 != 0) goto L_0x00a6
        L_0x00a2:
            r6 = r1 & r7
            if (r6 != r9) goto L_0x00a8
        L_0x00a6:
            r6 = r5
            goto L_0x00a9
        L_0x00a8:
            r6 = r4
        L_0x00a9:
            r3 = r3 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r1
            r7 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 ^ r7
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r6 <= r9) goto L_0x00bc
            r6 = r22
            boolean r6 = r0.h(r6)
            if (r6 != 0) goto L_0x00c0
        L_0x00bc:
            r6 = r1 & r7
            if (r6 != r9) goto L_0x00c2
        L_0x00c0:
            r6 = r5
            goto L_0x00c3
        L_0x00c2:
            r6 = r4
        L_0x00c3:
            r3 = r3 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r1
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r6 ^ r7
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r14 = r24
            if (r6 <= r9) goto L_0x00d6
            boolean r6 = r0.W(r14)
            if (r6 != 0) goto L_0x00d9
        L_0x00d6:
            r1 = r1 & r7
            if (r1 != r9) goto L_0x00da
        L_0x00d9:
            r4 = r5
        L_0x00da:
            r1 = r3 | r4
            r3 = r25
            boolean r4 = r0.W(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r26.g()
            if (r1 != 0) goto L_0x00f1
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x010c
        L_0x00f1:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 r4 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
            r6 = r4
            r7 = r16
            r8 = r20
            r9 = r24
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r21
            r14 = r23
            r15 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.N(r4)
        L_0x010c:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0117
            androidx.compose.runtime.ComposerKt.X()
        L_0x0117:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.f(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, float, float, kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.runtime.Composer, int):kotlin.jvm.functions.Function2");
    }

    public static final float g(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i2 = WhenMappings.f5110a[orientation.ordinal()];
        if (i2 == 1) {
            return PaddingKt.g(paddingValues, layoutDirection);
        }
        if (i2 == 2) {
            return paddingValues.d();
        }
        throw new NoWhenBranchMatchedException();
    }
}
