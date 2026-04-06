package androidx.compose.material3.internal;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class DragGestureDetectorCopyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12214a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f12215b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f12216c;

    static {
        float m2 = Dp.m((float) 0.125d);
        f12214a = m2;
        float m3 = Dp.m((float) 18);
        f12215b = m3;
        f12216c = m2 / m3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, kotlin.jvm.functions.Function2 r24, kotlin.coroutines.Continuation r25) {
        /*
            r0 = r21
            r2 = r25
            boolean r3 = r2 instanceof androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0074
            if (r5 == r8) goto L_0x0054
            if (r5 != r7) goto L_0x004c
            float r0 = r3.H
            float r1 = r3.G
            java.lang.Object r5 = r3.F
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            java.lang.Object r10 = r3.E
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref.LongRef) r10
            java.lang.Object r11 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            java.lang.Object r12 = r3.C
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            kotlin.ResultKt.b(r2)
            r2 = r0
            r0 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r12
            goto L_0x016c
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            float r0 = r3.H
            float r1 = r3.G
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r10 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.C
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            kotlin.ResultKt.b(r2)
            r18 = r3
            r3 = r0
            r0 = r10
            r10 = r18
            r19 = r5
            r5 = r1
            r1 = r11
            r11 = r19
            goto L_0x00b9
        L_0x0074:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r20.l0()
            boolean r2 = b(r2, r0)
            if (r2 == 0) goto L_0x0083
            goto L_0x018b
        L_0x0083:
            androidx.compose.ui.platform.ViewConfiguration r2 = r20.getViewConfiguration()
            r5 = r23
            float r2 = c(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f40907z = r0
            r0 = r20
            r1 = r24
            r10 = r5
            r5 = r3
            r3 = r2
            r2 = 0
        L_0x009c:
            r5.C = r1
            r5.D = r0
            r5.E = r10
            r5.F = r9
            r5.G = r3
            r5.H = r2
            r5.J = r8
            java.lang.Object r11 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r9, r5, r8, r9)
            if (r11 != r4) goto L_0x00b1
            return r4
        L_0x00b1:
            r18 = r3
            r3 = r2
            r2 = r11
            r11 = r10
            r10 = r5
            r5 = r18
        L_0x00b9:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r12 = r2.c()
            r13 = r12
            java.util.Collection r13 = (java.util.Collection) r13
            int r13 = r13.size()
            r14 = 0
            r15 = r14
        L_0x00c8:
            if (r15 >= r13) goto L_0x00e5
            java.lang.Object r16 = r12.get(r15)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.ui.input.pointer.PointerInputChange) r17
            long r8 = r17.f()
            long r6 = r11.f40907z
            boolean r6 = androidx.compose.ui.input.pointer.PointerId.c(r8, r6)
            if (r6 == 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            int r15 = r15 + 1
            r7 = 2
            r8 = 1
            r9 = 0
            goto L_0x00c8
        L_0x00e5:
            r16 = 0
        L_0x00e7:
            kotlin.jvm.internal.Intrinsics.f(r16)
            r6 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r7 = r6.p()
            if (r7 == 0) goto L_0x00f7
        L_0x00f4:
            r9 = 0
            goto L_0x018b
        L_0x00f7:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.d(r6)
            if (r7 == 0) goto L_0x0130
            java.util.List r2 = r2.c()
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
        L_0x0108:
            if (r14 >= r6) goto L_0x011b
            java.lang.Object r7 = r2.get(r14)
            r8 = r7
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = r8.i()
            if (r8 == 0) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            int r14 = r14 + 1
            goto L_0x0108
        L_0x011b:
            r7 = 0
        L_0x011c:
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x0121
            goto L_0x00f4
        L_0x0121:
            long r6 = r7.f()
            r11.f40907z = r6
            r2 = r3
            r3 = r5
            r5 = r10
            r10 = r11
            r7 = 2
        L_0x012c:
            r8 = 1
            r9 = 0
            goto L_0x009c
        L_0x0130:
            long r7 = r6.h()
            long r12 = r6.k()
            r2 = 32
            long r7 = r7 >> r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r8 = r12 >> r2
            int r2 = (int) r8
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r7 = r7 - r2
            float r2 = r3 + r7
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0176
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r10.C = r1
            r10.D = r0
            r10.E = r11
            r10.F = r6
            r10.G = r5
            r10.H = r2
            r7 = 2
            r10.J = r7
            java.lang.Object r3 = r0.k0(r3, r10)
            if (r3 != r4) goto L_0x016a
            return r4
        L_0x016a:
            r3 = r5
            r5 = r6
        L_0x016c:
            boolean r5 = r5.p()
            if (r5 == 0) goto L_0x0173
            goto L_0x00f4
        L_0x0173:
            r5 = r10
            r10 = r11
            goto L_0x012c
        L_0x0176:
            r7 = 2
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r5
            float r2 = r2 - r3
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.b(r2)
            r1.m(r6, r2)
            boolean r2 = r6.p()
            if (r2 == 0) goto L_0x018c
            r9 = r6
        L_0x018b:
            return r9
        L_0x018c:
            r3 = r5
            r5 = r10
            r10 = r11
            r2 = 0
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DragGestureDetectorCopyKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean b(PointerEvent pointerEvent, long j2) {
        Object obj;
        List c2 = pointerEvent.c();
        int size = c2.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = c2.get(i2);
            if (PointerId.c(((PointerInputChange) obj).f(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null && pointerInputChange.i()) {
            z2 = true;
        }
        return true ^ z2;
    }

    public static final float c(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.h(i2, PointerType.f16933b.b()) ? viewConfiguration.g() * f12216c : viewConfiguration.g();
    }
}
