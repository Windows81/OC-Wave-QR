package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DragGestureDetectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f3460a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f3461b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f3462c;

    static {
        float m2 = Dp.m((float) 0.125d);
        f3460a = m2;
        float m3 = Dp.m((float) 18);
        f3461b = m3;
        f3462c = m2 / m3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.ui.input.pointer.PointerInputChange r18, androidx.compose.ui.input.pointer.PointerEventPass r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) r1
            int r2 = r1.J
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.J = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.I
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.J
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r5) goto L_0x0045
            float r3 = r1.H
            int r6 = r1.G
            java.lang.Object r7 = r1.F
            androidx.compose.foundation.gestures.TouchSlopDetector r7 = (androidx.compose.foundation.gestures.TouchSlopDetector) r7
            java.lang.Object r8 = r1.E
            kotlin.jvm.internal.Ref$LongRef r8 = (kotlin.jvm.internal.Ref.LongRef) r8
            java.lang.Object r9 = r1.D
            androidx.compose.ui.input.pointer.PointerEventPass r9 = (androidx.compose.ui.input.pointer.PointerEventPass) r9
            java.lang.Object r10 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r0)
            r12 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r9
            goto L_0x009c
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            kotlin.ResultKt.b(r0)
            boolean r0 = androidx.compose.foundation.gestures.ForEachGestureKt.a(r17)
            if (r0 == 0) goto L_0x005b
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r0
        L_0x005b:
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            long r6 = r18.f()
            r0.f40907z = r6
            androidx.compose.ui.platform.ViewConfiguration r3 = r17.getViewConfiguration()
            int r6 = r18.n()
            float r3 = t(r3, r6)
            androidx.compose.foundation.gestures.TouchSlopDetector r12 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            r6 = r12
            r6.<init>(r7, r8, r10, r11)
            r8 = r0
            r6 = r3
            r7 = r4
            r0 = r17
            r3 = r1
            r1 = r19
        L_0x0085:
            r3.C = r0
            r3.D = r1
            r3.E = r8
            r3.F = r12
            r3.G = r7
            r3.H = r6
            r3.J = r5
            java.lang.Object r9 = r0.k0(r1, r3)
            if (r9 != r2) goto L_0x009a
            return r2
        L_0x009a:
            r10 = r0
            r0 = r9
        L_0x009c:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r9 = r0.c()
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r13 = r4
        L_0x00aa:
            if (r13 >= r11) goto L_0x00ca
            java.lang.Object r15 = r9.get(r13)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r4 = r16.f()
            r18 = r15
            long r14 = r8.f40907z
            boolean r4 = androidx.compose.ui.input.pointer.PointerId.c(r4, r14)
            if (r4 == 0) goto L_0x00c5
            r15 = r18
            goto L_0x00cb
        L_0x00c5:
            int r13 = r13 + 1
            r4 = 0
            r5 = 1
            goto L_0x00aa
        L_0x00ca:
            r15 = 0
        L_0x00cb:
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            if (r15 == 0) goto L_0x00eb
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.d(r15)
            if (r4 == 0) goto L_0x00d6
            goto L_0x00eb
        L_0x00d6:
            long r4 = r12.a(r15, r6)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r4 & r13
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0120
            r7 = 1
            goto L_0x0120
        L_0x00eb:
            java.util.List r4 = r0.c()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r9 = 0
        L_0x00f7:
            if (r9 >= r5) goto L_0x010b
            java.lang.Object r11 = r4.get(r9)
            r13 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            boolean r13 = r13.i()
            if (r13 == 0) goto L_0x0108
            r14 = r11
            goto L_0x010c
        L_0x0108:
            int r9 = r9 + 1
            goto L_0x00f7
        L_0x010b:
            r14 = 0
        L_0x010c:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            if (r14 != 0) goto L_0x011a
            if (r7 == 0) goto L_0x0114
            r4 = 1
            goto L_0x0115
        L_0x0114:
            r4 = 0
        L_0x0115:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r0
        L_0x011a:
            long r4 = r14.f()
            r8.f40907z = r4
        L_0x0120:
            java.util.List r0 = r0.c()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x012c:
            if (r5 >= r4) goto L_0x0142
            java.lang.Object r9 = r0.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.i()
            if (r9 == 0) goto L_0x013f
            r0 = r10
            r4 = 0
            r5 = 1
            goto L_0x0085
        L_0x013f:
            int r5 = r5 + 1
            goto L_0x012c
        L_0x0142:
            if (r7 == 0) goto L_0x0146
            r4 = 1
            goto L_0x0147
        L_0x0146:
            r4 = 0
        L_0x0147:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.k(r11) != false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) r3
            int r4 = r3.F
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.F = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.E
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.F
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.D
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            java.lang.Object r1 = r3.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r17.l0()
            boolean r2 = s(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r2.f40907z = r0
            r0 = r17
        L_0x005a:
            r3.C = r0
            r3.D = r2
            r3.F = r6
            java.lang.Object r1 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r5 = r2.c()
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = 0
            r10 = r9
        L_0x007b:
            if (r10 >= r8) goto L_0x0094
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            long r12 = r12.f()
            long r14 = r1.f40907z
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.c(r12, r14)
            if (r12 == 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r10 = r10 + 1
            goto L_0x007b
        L_0x0094:
            r11 = r7
        L_0x0095:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x009b
            r11 = r7
            goto L_0x00d2
        L_0x009b:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.d(r11)
            if (r5 == 0) goto L_0x00cc
            java.util.List r2 = r2.c()
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
        L_0x00ac:
            if (r9 >= r5) goto L_0x00bf
            java.lang.Object r8 = r2.get(r9)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            int r9 = r9 + 1
            goto L_0x00ac
        L_0x00bf:
            r8 = r7
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            long r8 = r8.f()
            r1.f40907z = r8
            goto L_0x00dc
        L_0x00cc:
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventKt.k(r11)
            if (r2 == 0) goto L_0x00dc
        L_0x00d2:
            if (r11 == 0) goto L_0x00db
            boolean r0 = r11.p()
            if (r0 != 0) goto L_0x00db
            r7 = r11
        L_0x00db:
            return r7
        L_0x00dc:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        if (r9 == 0) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) r3
            int r4 = r3.F
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.F = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.E
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.F
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.D
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            java.lang.Object r1 = r3.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r17.l0()
            boolean r2 = s(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r2.f40907z = r0
            r0 = r17
        L_0x005a:
            r3.C = r0
            r3.D = r2
            r3.F = r6
            java.lang.Object r1 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r5 = r2.c()
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = 0
            r10 = r9
        L_0x007b:
            if (r10 >= r8) goto L_0x0094
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            long r12 = r12.f()
            long r14 = r1.f40907z
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.c(r12, r14)
            if (r12 == 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r10 = r10 + 1
            goto L_0x007b
        L_0x0094:
            r11 = r7
        L_0x0095:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x009b
            r11 = r7
            goto L_0x00e0
        L_0x009b:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.d(r11)
            if (r5 == 0) goto L_0x00cc
            java.util.List r2 = r2.c()
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
        L_0x00ac:
            if (r9 >= r5) goto L_0x00bf
            java.lang.Object r8 = r2.get(r9)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            int r9 = r9 + 1
            goto L_0x00ac
        L_0x00bf:
            r8 = r7
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x00c5
            goto L_0x00e0
        L_0x00c5:
            long r8 = r8.f()
            r1.f40907z = r8
            goto L_0x00ea
        L_0x00cc:
            long r12 = androidx.compose.ui.input.pointer.PointerEventKt.h(r11)
            r2 = 32
            long r12 = r12 >> r2
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00de
            r9 = r6
        L_0x00de:
            if (r9 != 0) goto L_0x00ea
        L_0x00e0:
            if (r11 == 0) goto L_0x00e9
            boolean r0 = r11.p()
            if (r0 != 0) goto L_0x00e9
            r7 = r11
        L_0x00e9:
            return r7
        L_0x00ea:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.d(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, kotlin.jvm.functions.Function2 r24, kotlin.coroutines.Continuation r25) {
        /*
            r0 = r21
            r2 = r25
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0072
            if (r5 == r7) goto L_0x0053
            if (r5 != r6) goto L_0x004b
            float r0 = r3.H
            java.lang.Object r1 = r3.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r5 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r5 = (androidx.compose.foundation.gestures.TouchSlopDetector) r5
            java.lang.Object r9 = r3.E
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.C
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            kotlin.ResultKt.b(r2)
            r2 = r5
            r5 = r0
            r0 = r10
            goto L_0x017f
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0053:
            float r0 = r3.H
            java.lang.Object r1 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r9 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r3.C
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.b(r2)
            r11 = r5
            r5 = r3
            r3 = r1
            r1 = r10
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x00c0
        L_0x0072:
            kotlin.ResultKt.b(r2)
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r5.c()
            androidx.compose.ui.input.pointer.PointerEvent r5 = r20.l0()
            boolean r5 = s(r5, r0)
            if (r5 == 0) goto L_0x0089
            goto L_0x0187
        L_0x0089:
            androidx.compose.ui.platform.ViewConfiguration r5 = r20.getViewConfiguration()
            r11 = r23
            float r5 = t(r5, r11)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r11.f40907z = r0
            androidx.compose.foundation.gestures.TouchSlopDetector r0 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r0.<init>(r2, r9, r8)
            r1 = r24
            r2 = r0
            r0 = r20
        L_0x00a4:
            r3.C = r1
            r3.D = r0
            r3.E = r11
            r3.F = r2
            r3.G = r8
            r3.H = r5
            r3.J = r7
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r8, r3, r7, r8)
            if (r9 != r4) goto L_0x00b9
            return r4
        L_0x00b9:
            r19 = r3
            r3 = r2
            r2 = r9
            r9 = r5
            r5 = r19
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r10 = r2.c()
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r14 = 0
        L_0x00ce:
            if (r14 >= r12) goto L_0x00ec
            java.lang.Object r15 = r10.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r11.f40907z
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.c(r7, r13)
            if (r7 == 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00ce
        L_0x00ec:
            r15 = 0
        L_0x00ed:
            r7 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x00f5
        L_0x00f2:
            r8 = 0
            goto L_0x0187
        L_0x00f5:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x00fc
            goto L_0x00f2
        L_0x00fc:
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7)
            if (r8 == 0) goto L_0x012e
            java.util.List r2 = r2.c()
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r13 = 0
        L_0x010e:
            if (r13 >= r7) goto L_0x0121
            java.lang.Object r8 = r2.get(r13)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0121:
            r8 = 0
        L_0x0122:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x0127
            goto L_0x00f2
        L_0x0127:
            long r7 = r8.f()
            r11.f40907z = r7
            goto L_0x015b
        L_0x012e:
            long r12 = r3.a(r7, r9)
            r14 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r14 = r14 & r12
            r17 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0162
            r2 = 32
            long r12 = r12 >> r2
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.b(r2)
            r1.m(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x0158
            r8 = r7
            goto L_0x0187
        L_0x0158:
            r3.e()
        L_0x015b:
            r2 = r3
            r3 = r5
            r5 = r9
            r7 = 1
            r8 = 0
            goto L_0x00a4
        L_0x0162:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r5.C = r1
            r5.D = r0
            r5.E = r11
            r5.F = r3
            r5.G = r7
            r5.H = r9
            r5.J = r6
            java.lang.Object r2 = r0.k0(r2, r5)
            if (r2 != r4) goto L_0x0179
            return r4
        L_0x0179:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r11
            r11 = r1
            r1 = r7
        L_0x017f:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x0188
            goto L_0x00f2
        L_0x0187:
            return r8
        L_0x0188:
            r1 = r11
            r7 = 1
            r8 = 0
            r11 = r9
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.e(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, kotlin.jvm.functions.Function2 r23, kotlin.coroutines.Continuation r24) {
        /*
            r0 = r21
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0070
            if (r5 == r7) goto L_0x0054
            if (r5 != r6) goto L_0x004c
            float r0 = r3.H
            java.lang.Object r1 = r3.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r5 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r5 = (androidx.compose.foundation.gestures.TouchSlopDetector) r5
            java.lang.Object r9 = r3.E
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.C
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            kotlin.ResultKt.b(r2)
            r2 = r5
            r5 = r3
            r3 = r0
            r0 = r10
            goto L_0x0183
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            float r0 = r3.H
            java.lang.Object r1 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r9 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r3.C
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.b(r2)
            r11 = r5
            r5 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r10
            goto L_0x00c4
        L_0x0070:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r2 = r2.d()
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.geometry.Offset$Companion r9 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r9.c()
            androidx.compose.ui.input.pointer.PointerEvent r11 = r20.l0()
            boolean r11 = s(r11, r0)
            if (r11 == 0) goto L_0x008d
            goto L_0x018b
        L_0x008d:
            androidx.compose.ui.platform.ViewConfiguration r11 = r20.getViewConfiguration()
            float r2 = t(r11, r2)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r11.f40907z = r0
            androidx.compose.foundation.gestures.TouchSlopDetector r0 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r0.<init>(r5, r9, r8)
            r1 = r23
            r5 = r3
            r3 = r2
            r2 = r0
            r0 = r20
        L_0x00a8:
            r5.C = r1
            r5.D = r0
            r5.E = r11
            r5.F = r2
            r5.G = r8
            r5.H = r3
            r5.J = r7
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r8, r5, r7, r8)
            if (r9 != r4) goto L_0x00bd
            return r4
        L_0x00bd:
            r19 = r3
            r3 = r2
            r2 = r9
            r9 = r5
            r5 = r19
        L_0x00c4:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r10 = r2.c()
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r14 = 0
        L_0x00d2:
            if (r14 >= r12) goto L_0x00f0
            java.lang.Object r15 = r10.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r11.f40907z
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.c(r7, r13)
            if (r7 == 0) goto L_0x00eb
            goto L_0x00f1
        L_0x00eb:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00d2
        L_0x00f0:
            r15 = 0
        L_0x00f1:
            r7 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x00f9
        L_0x00f6:
            r8 = 0
            goto L_0x018b
        L_0x00f9:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x0100
            goto L_0x00f6
        L_0x0100:
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7)
            if (r8 == 0) goto L_0x0132
            java.util.List r2 = r2.c()
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r13 = 0
        L_0x0112:
            if (r13 >= r7) goto L_0x0125
            java.lang.Object r8 = r2.get(r13)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x0122
            goto L_0x0126
        L_0x0122:
            int r13 = r13 + 1
            goto L_0x0112
        L_0x0125:
            r8 = 0
        L_0x0126:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x012b
            goto L_0x00f6
        L_0x012b:
            long r7 = r8.f()
            r11.f40907z = r7
            goto L_0x015f
        L_0x0132:
            long r12 = r3.a(r7, r5)
            r14 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r14 = r14 & r12
            r17 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0166
            r2 = 32
            long r12 = r12 >> r2
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.b(r2)
            r1.m(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x015c
            r8 = r7
            goto L_0x018b
        L_0x015c:
            r3.e()
        L_0x015f:
            r2 = r3
            r3 = r5
            r5 = r9
            r7 = 1
            r8 = 0
            goto L_0x00a8
        L_0x0166:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r9.C = r1
            r9.D = r0
            r9.E = r11
            r9.F = r3
            r9.G = r7
            r9.H = r5
            r9.J = r6
            java.lang.Object r2 = r0.k0(r2, r9)
            if (r2 != r4) goto L_0x017d
            return r4
        L_0x017d:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r11
            r11 = r1
            r1 = r7
        L_0x0183:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x018c
            goto L_0x00f6
        L_0x018b:
            return r8
        L_0x018c:
            r1 = r11
            r7 = 1
            r8 = 0
            r11 = r9
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.f(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad A[Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.E
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r0.D
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r0.C
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            kotlin.ResultKt.b(r12)     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            goto L_0x00a9
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            kotlin.ResultKt.b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.l0()
            boolean r12 = s(r12, r10)
            if (r12 == 0) goto L_0x004d
            return r4
        L_0x004d:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.l0()
            java.util.List r12 = r12.c()
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L_0x005d:
            if (r5 >= r2) goto L_0x0074
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.f()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.c(r7, r10)
            if (r7 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x005d
        L_0x0074:
            r6 = r4
        L_0x0075:
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x007b
            return r4
        L_0x007b:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.f40908z = r11
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r2.<init>()     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r7.<init>(r2, r12, r10, r4)     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r0.C = r11     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r0.D = r10     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r0.E = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r0.G = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            java.lang.Object r9 = r9.S1(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            if (r9 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r9 = r2
        L_0x00a9:
            boolean r9 = r9.f40901z     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            if (r9 == 0) goto L_0x00be
            java.lang.Object r9 = r10.f40908z     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            r4 = r9
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x00b6 }
            if (r4 != 0) goto L_0x00be
        L_0x00b4:
            r4 = r11
            goto L_0x00be
        L_0x00b6:
            java.lang.Object r9 = r10.f40908z
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto L_0x00bd
            goto L_0x00b4
        L_0x00bd:
            r4 = r9
        L_0x00be:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, androidx.compose.foundation.gestures.Orientation r23, long r24, kotlin.jvm.functions.Function2 r26, kotlin.coroutines.Continuation r27) {
        /*
            r0 = r20
            r2 = r27
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0077
            if (r5 == r7) goto L_0x0055
            if (r5 != r6) goto L_0x004d
            float r0 = r3.H
            java.lang.Object r1 = r3.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r5 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r5 = (androidx.compose.foundation.gestures.TouchSlopDetector) r5
            java.lang.Object r9 = r3.E
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r3.D
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r11 = r3.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            kotlin.ResultKt.b(r2)
            r2 = r5
            r8 = r6
            r5 = r3
            r3 = r0
            r0 = r11
            goto L_0x0186
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            float r0 = r3.H
            java.lang.Object r1 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r9 = r3.D
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r10 = r3.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r2)
            r17 = r5
            r5 = r0
            r0 = r10
            r10 = r17
            r18 = r3
            r3 = r1
            r1 = r9
            r9 = r18
            goto L_0x00c4
        L_0x0077:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r19.l0()
            boolean r2 = s(r2, r0)
            if (r2 == 0) goto L_0x0085
            return r8
        L_0x0085:
            androidx.compose.ui.platform.ViewConfiguration r2 = r19.getViewConfiguration()
            r5 = r22
            float r2 = t(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f40907z = r0
            androidx.compose.foundation.gestures.TouchSlopDetector r0 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r1 = r23
            r9 = r24
            r0.<init>(r1, r9, r8)
            r1 = r26
            r9 = r5
            r5 = r3
            r3 = r2
            r2 = r0
            r0 = r19
        L_0x00a7:
            r5.C = r0
            r5.D = r1
            r5.E = r9
            r5.F = r2
            r5.G = r8
            r5.H = r3
            r5.J = r7
            java.lang.Object r10 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r8, r5, r7, r8)
            if (r10 != r4) goto L_0x00bc
            return r4
        L_0x00bc:
            r17 = r3
            r3 = r2
            r2 = r10
            r10 = r9
            r9 = r5
            r5 = r17
        L_0x00c4:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r11 = r2.c()
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r13 = 0
            r14 = r13
        L_0x00d3:
            if (r14 >= r12) goto L_0x00f4
            java.lang.Object r15 = r11.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r6 = r16.f()
            r19 = r9
            long r8 = r10.f40907z
            boolean r6 = androidx.compose.ui.input.pointer.PointerId.c(r6, r8)
            if (r6 == 0) goto L_0x00ec
            goto L_0x00f7
        L_0x00ec:
            int r14 = r14 + 1
            r6 = 2
            r7 = 1
            r9 = r19
            r8 = 0
            goto L_0x00d3
        L_0x00f4:
            r19 = r9
            r15 = 0
        L_0x00f7:
            r6 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x00fe
            r7 = 0
            return r7
        L_0x00fe:
            r7 = 0
            boolean r8 = r6.p()
            if (r8 == 0) goto L_0x0106
            return r7
        L_0x0106:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.d(r6)
            if (r7 == 0) goto L_0x0138
            java.util.List r2 = r2.c()
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
        L_0x0117:
            if (r13 >= r6) goto L_0x012a
            java.lang.Object r7 = r2.get(r13)
            r8 = r7
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = r8.i()
            if (r8 == 0) goto L_0x0127
            goto L_0x012b
        L_0x0127:
            int r13 = r13 + 1
            goto L_0x0117
        L_0x012a:
            r7 = 0
        L_0x012b:
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x0131
            r2 = 0
            return r2
        L_0x0131:
            long r6 = r7.f()
            r10.f40907z = r6
            goto L_0x015c
        L_0x0138:
            long r7 = r3.a(r6, r5)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r11 = r11 & r7
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0166
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.d(r7)
            r1.m(r6, r2)
            boolean r2 = r6.p()
            if (r2 == 0) goto L_0x0159
            return r6
        L_0x0159:
            r3.e()
        L_0x015c:
            r2 = r3
            r3 = r5
            r9 = r10
            r6 = 2
            r7 = 1
            r8 = 0
            r5 = r19
            goto L_0x00a7
        L_0x0166:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r7 = r19
            r7.C = r0
            r7.D = r1
            r7.E = r10
            r7.F = r3
            r7.G = r6
            r7.H = r5
            r8 = 2
            r7.J = r8
            java.lang.Object r2 = r0.k0(r2, r7)
            if (r2 != r4) goto L_0x0180
            return r4
        L_0x0180:
            r2 = r3
            r3 = r5
            r5 = r7
            r9 = r10
            r10 = r1
            r1 = r6
        L_0x0186:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x018e
            r1 = 0
            return r1
        L_0x018e:
            r6 = r8
            r1 = r10
            r7 = 1
            r8 = 0
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.h(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object i(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, kotlin.jvm.functions.Function2 r21, kotlin.coroutines.Continuation r22) {
        /*
            r0 = r19
            r2 = r22
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitTouchSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r7) goto L_0x0054
            if (r5 != r6) goto L_0x004c
            float r0 = r3.H
            java.lang.Object r1 = r3.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r5 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r5 = (androidx.compose.foundation.gestures.TouchSlopDetector) r5
            java.lang.Object r9 = r3.E
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.C
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            kotlin.ResultKt.b(r2)
            r2 = r5
            r5 = r3
            r3 = r0
            r0 = r10
            goto L_0x017f
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            float r0 = r3.H
            java.lang.Object r1 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r9 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r3.C
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.b(r2)
            r17 = r5
            r5 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r10
            r10 = r17
            goto L_0x00c7
        L_0x0073:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r2 = r2.d()
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r5.c()
            androidx.compose.ui.input.pointer.PointerEvent r5 = r18.l0()
            boolean r5 = s(r5, r0)
            if (r5 == 0) goto L_0x008e
            goto L_0x0187
        L_0x008e:
            androidx.compose.ui.platform.ViewConfiguration r5 = r18.getViewConfiguration()
            float r2 = t(r5, r2)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f40907z = r0
            androidx.compose.foundation.gestures.TouchSlopDetector r0 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r0.<init>(r8, r9, r8)
            r1 = r21
            r9 = r5
            r5 = r3
            r3 = r2
            r2 = r0
            r0 = r18
        L_0x00aa:
            r5.C = r1
            r5.D = r0
            r5.E = r9
            r5.F = r2
            r5.G = r8
            r5.H = r3
            r5.J = r7
            java.lang.Object r10 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r8, r5, r7, r8)
            if (r10 != r4) goto L_0x00bf
            return r4
        L_0x00bf:
            r17 = r3
            r3 = r2
            r2 = r10
            r10 = r9
            r9 = r5
            r5 = r17
        L_0x00c7:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r11 = r2.c()
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r14 = 0
        L_0x00d5:
            if (r14 >= r12) goto L_0x00f3
            java.lang.Object r15 = r11.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r10.f40907z
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.c(r7, r13)
            if (r7 == 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00d5
        L_0x00f3:
            r15 = 0
        L_0x00f4:
            r7 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x00fc
        L_0x00f9:
            r8 = 0
            goto L_0x0187
        L_0x00fc:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x0103
            goto L_0x00f9
        L_0x0103:
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7)
            if (r8 == 0) goto L_0x0135
            java.util.List r2 = r2.c()
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r13 = 0
        L_0x0115:
            if (r13 >= r7) goto L_0x0128
            java.lang.Object r8 = r2.get(r13)
            r11 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.i()
            if (r11 == 0) goto L_0x0125
            goto L_0x0129
        L_0x0125:
            int r13 = r13 + 1
            goto L_0x0115
        L_0x0128:
            r8 = 0
        L_0x0129:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x012e
            goto L_0x00f9
        L_0x012e:
            long r7 = r8.f()
            r10.f40907z = r7
            goto L_0x015a
        L_0x0135:
            long r11 = r3.a(r7, r5)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r13 = r13 & r11
            r15 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x0162
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.d(r11)
            r1.m(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x0157
            r8 = r7
            goto L_0x0187
        L_0x0157:
            r3.e()
        L_0x015a:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r10
        L_0x015e:
            r7 = 1
            r8 = 0
            goto L_0x00aa
        L_0x0162:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r9.C = r1
            r9.D = r0
            r9.E = r10
            r9.F = r3
            r9.G = r7
            r9.H = r5
            r9.J = r6
            java.lang.Object r2 = r0.k0(r2, r9)
            if (r2 != r4) goto L_0x0179
            return r4
        L_0x0179:
            r11 = r1
            r2 = r3
            r3 = r5
            r1 = r7
            r5 = r9
            r9 = r10
        L_0x017f:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x0188
            goto L_0x00f9
        L_0x0187:
            return r8
        L_0x0188:
            r1 = r11
            goto L_0x015e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.i(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (r9 == 0) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) r3
            int r4 = r3.F
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.F = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.E
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.F
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.D
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            java.lang.Object r1 = r3.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerEvent r2 = r17.l0()
            boolean r2 = s(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r2.f40907z = r0
            r0 = r17
        L_0x005a:
            r3.C = r0
            r3.D = r2
            r3.F = r6
            java.lang.Object r1 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r5 = r2.c()
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = 0
            r10 = r9
        L_0x007b:
            if (r10 >= r8) goto L_0x0094
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            long r12 = r12.f()
            long r14 = r1.f40907z
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.c(r12, r14)
            if (r12 == 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r10 = r10 + 1
            goto L_0x007b
        L_0x0094:
            r11 = r7
        L_0x0095:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x009b
            r11 = r7
            goto L_0x00e3
        L_0x009b:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.d(r11)
            if (r5 == 0) goto L_0x00cc
            java.util.List r2 = r2.c()
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
        L_0x00ac:
            if (r9 >= r5) goto L_0x00bf
            java.lang.Object r8 = r2.get(r9)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x00bc
            goto L_0x00c0
        L_0x00bc:
            int r9 = r9 + 1
            goto L_0x00ac
        L_0x00bf:
            r8 = r7
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x00c5
            goto L_0x00e3
        L_0x00c5:
            long r8 = r8.f()
            r1.f40907z = r8
            goto L_0x00ed
        L_0x00cc:
            long r12 = androidx.compose.ui.input.pointer.PointerEventKt.h(r11)
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00e1
            r9 = r6
        L_0x00e1:
            if (r9 != 0) goto L_0x00ed
        L_0x00e3:
            if (r11 == 0) goto L_0x00ec
            boolean r0 = r11.p()
            if (r0 != 0) goto L_0x00ec
            r7 = r11
        L_0x00ec:
            return r7
        L_0x00ed:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.j(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, kotlin.jvm.functions.Function2 r24, kotlin.coroutines.Continuation r25) {
        /*
            r0 = r21
            r2 = r25
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0072
            if (r5 == r7) goto L_0x0053
            if (r5 != r6) goto L_0x004b
            float r0 = r3.H
            java.lang.Object r1 = r3.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r5 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r5 = (androidx.compose.foundation.gestures.TouchSlopDetector) r5
            java.lang.Object r9 = r3.E
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.C
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            kotlin.ResultKt.b(r2)
            r2 = r5
            r5 = r0
            r0 = r10
            goto L_0x0182
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0053:
            float r0 = r3.H
            java.lang.Object r1 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r9 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r3.C
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.b(r2)
            r11 = r5
            r5 = r3
            r3 = r1
            r1 = r10
            r19 = r9
            r9 = r0
            r0 = r19
            goto L_0x00c0
        L_0x0072:
            kotlin.ResultKt.b(r2)
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r5.c()
            androidx.compose.ui.input.pointer.PointerEvent r5 = r20.l0()
            boolean r5 = s(r5, r0)
            if (r5 == 0) goto L_0x0089
            goto L_0x018a
        L_0x0089:
            androidx.compose.ui.platform.ViewConfiguration r5 = r20.getViewConfiguration()
            r11 = r23
            float r5 = t(r5, r11)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r11.f40907z = r0
            androidx.compose.foundation.gestures.TouchSlopDetector r0 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r0.<init>(r2, r9, r8)
            r1 = r24
            r2 = r0
            r0 = r20
        L_0x00a4:
            r3.C = r1
            r3.D = r0
            r3.E = r11
            r3.F = r2
            r3.G = r8
            r3.H = r5
            r3.J = r7
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r8, r3, r7, r8)
            if (r9 != r4) goto L_0x00b9
            return r4
        L_0x00b9:
            r19 = r3
            r3 = r2
            r2 = r9
            r9 = r5
            r5 = r19
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r10 = r2.c()
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r14 = 0
        L_0x00ce:
            if (r14 >= r12) goto L_0x00ec
            java.lang.Object r15 = r10.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r11.f40907z
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.c(r7, r13)
            if (r7 == 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00ce
        L_0x00ec:
            r15 = 0
        L_0x00ed:
            r7 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x00f5
        L_0x00f2:
            r8 = 0
            goto L_0x018a
        L_0x00f5:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x00fc
            goto L_0x00f2
        L_0x00fc:
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7)
            if (r8 == 0) goto L_0x012e
            java.util.List r2 = r2.c()
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r13 = 0
        L_0x010e:
            if (r13 >= r7) goto L_0x0121
            java.lang.Object r8 = r2.get(r13)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x011e
            goto L_0x0122
        L_0x011e:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0121:
            r8 = 0
        L_0x0122:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x0127
            goto L_0x00f2
        L_0x0127:
            long r7 = r8.f()
            r11.f40907z = r7
            goto L_0x015e
        L_0x012e:
            long r12 = r3.a(r7, r9)
            r14 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r14 = r14 & r12
            r17 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0165
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.b(r2)
            r1.m(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x015b
            r8 = r7
            goto L_0x018a
        L_0x015b:
            r3.e()
        L_0x015e:
            r2 = r3
            r3 = r5
            r5 = r9
            r7 = 1
            r8 = 0
            goto L_0x00a4
        L_0x0165:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r5.C = r1
            r5.D = r0
            r5.E = r11
            r5.F = r3
            r5.G = r7
            r5.H = r9
            r5.J = r6
            java.lang.Object r2 = r0.k0(r2, r5)
            if (r2 != r4) goto L_0x017c
            return r4
        L_0x017c:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r11
            r11 = r1
            r1 = r7
        L_0x0182:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x018b
            goto L_0x00f2
        L_0x018a:
            return r8
        L_0x018b:
            r1 = r11
            r7 = 1
            r8 = 0
            r11 = r9
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.k(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, kotlin.jvm.functions.Function2 r23, kotlin.coroutines.Continuation r24) {
        /*
            r0 = r21
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) r3
            int r4 = r3.J
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.J = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.J
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0070
            if (r5 == r7) goto L_0x0054
            if (r5 != r6) goto L_0x004c
            float r0 = r3.H
            java.lang.Object r1 = r3.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r5 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r5 = (androidx.compose.foundation.gestures.TouchSlopDetector) r5
            java.lang.Object r9 = r3.E
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r10 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            java.lang.Object r11 = r3.C
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            kotlin.ResultKt.b(r2)
            r2 = r5
            r5 = r3
            r3 = r0
            r0 = r10
            goto L_0x0186
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            float r0 = r3.H
            java.lang.Object r1 = r3.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r5 = r3.E
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r9 = r3.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r3.C
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.b(r2)
            r11 = r5
            r5 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r10
            goto L_0x00c4
        L_0x0070:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r2 = r2.d()
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.geometry.Offset$Companion r9 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r9.c()
            androidx.compose.ui.input.pointer.PointerEvent r11 = r20.l0()
            boolean r11 = s(r11, r0)
            if (r11 == 0) goto L_0x008d
            goto L_0x018e
        L_0x008d:
            androidx.compose.ui.platform.ViewConfiguration r11 = r20.getViewConfiguration()
            float r2 = t(r11, r2)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r11.f40907z = r0
            androidx.compose.foundation.gestures.TouchSlopDetector r0 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r0.<init>(r5, r9, r8)
            r1 = r23
            r5 = r3
            r3 = r2
            r2 = r0
            r0 = r20
        L_0x00a8:
            r5.C = r1
            r5.D = r0
            r5.E = r11
            r5.F = r2
            r5.G = r8
            r5.H = r3
            r5.J = r7
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r0, r8, r5, r7, r8)
            if (r9 != r4) goto L_0x00bd
            return r4
        L_0x00bd:
            r19 = r3
            r3 = r2
            r2 = r9
            r9 = r5
            r5 = r19
        L_0x00c4:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r10 = r2.c()
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r14 = 0
        L_0x00d2:
            if (r14 >= r12) goto L_0x00f0
            java.lang.Object r15 = r10.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r11.f40907z
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.c(r7, r13)
            if (r7 == 0) goto L_0x00eb
            goto L_0x00f1
        L_0x00eb:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00d2
        L_0x00f0:
            r15 = 0
        L_0x00f1:
            r7 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r7 != 0) goto L_0x00f9
        L_0x00f6:
            r8 = 0
            goto L_0x018e
        L_0x00f9:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x0100
            goto L_0x00f6
        L_0x0100:
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7)
            if (r8 == 0) goto L_0x0132
            java.util.List r2 = r2.c()
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r13 = 0
        L_0x0112:
            if (r13 >= r7) goto L_0x0125
            java.lang.Object r8 = r2.get(r13)
            r10 = r8
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x0122
            goto L_0x0126
        L_0x0122:
            int r13 = r13 + 1
            goto L_0x0112
        L_0x0125:
            r8 = 0
        L_0x0126:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x012b
            goto L_0x00f6
        L_0x012b:
            long r7 = r8.f()
            r11.f40907z = r7
            goto L_0x0162
        L_0x0132:
            long r12 = r3.a(r7, r5)
            r14 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r14 = r14 & r12
            r17 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0169
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r2 = (int) r12
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.b(r2)
            r1.m(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x015f
            r8 = r7
            goto L_0x018e
        L_0x015f:
            r3.e()
        L_0x0162:
            r2 = r3
            r3 = r5
            r5 = r9
            r7 = 1
            r8 = 0
            goto L_0x00a8
        L_0x0169:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r9.C = r1
            r9.D = r0
            r9.E = r11
            r9.F = r3
            r9.G = r7
            r9.H = r5
            r9.J = r6
            java.lang.Object r2 = r0.k0(r2, r9)
            if (r2 != r4) goto L_0x0180
            return r4
        L_0x0180:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r11
            r11 = r1
            r1 = r7
        L_0x0186:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x018f
            goto L_0x00f6
        L_0x018e:
            return r8
        L_0x018f:
            r1 = r11
            r7 = 1
            r8 = 0
            r11 = r9
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.l(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object m(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        Object n2 = n(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1), new DragGestureDetectorKt$detectDragGestures$6(function0), function02, DragGestureDetectorKt$detectDragGestures$7.f3469z, (Orientation) null, function2, continuation);
        return n2 == IntrinsicsKt.f() ? n2 : Unit.f40552a;
    }

    public static final Object n(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function0 function0, Function0 function02, Orientation orientation, Function2 function2, Continuation continuation) {
        PointerInputScope pointerInputScope2 = pointerInputScope;
        Object e2 = ForEachGestureKt.e(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, (Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public static /* synthetic */ Object o(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGestures$2.f3464z;
        }
        Function1 function12 = function1;
        if ((i2 & 2) != 0) {
            function0 = DragGestureDetectorKt$detectDragGestures$3.f3465z;
        }
        Function0 function03 = function0;
        if ((i2 & 4) != 0) {
            function02 = DragGestureDetectorKt$detectDragGestures$4.f3466z;
        }
        return m(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0124, code lost:
        if (((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.ui.geometry.Offset.k(r4)) == 0.0f) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object p(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, kotlin.jvm.functions.Function1 r22, androidx.compose.foundation.gestures.Orientation r23, kotlin.jvm.functions.Function1 r24, kotlin.coroutines.Continuation r25) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2) r1
            int r2 = r1.J
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.J = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$2
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.I
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.J
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0057
            if (r3 != r4) goto L_0x004f
            java.lang.Object r3 = r1.H
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r6 = r1.G
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            java.lang.Object r7 = r1.F
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r1.E
            androidx.compose.foundation.gestures.Orientation r8 = (androidx.compose.foundation.gestures.Orientation) r8
            java.lang.Object r9 = r1.D
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r0)
            r17 = r9
            r9 = r1
            r1 = r17
            r18 = r7
            r7 = r3
            r3 = r8
            r8 = r18
            goto L_0x0093
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            kotlin.ResultKt.b(r0)
            androidx.compose.ui.input.pointer.PointerEvent r0 = r19.l0()
            r6 = r20
            boolean r0 = s(r0, r6)
            if (r0 == 0) goto L_0x0067
            return r5
        L_0x0067:
            r0 = r19
            r3 = r23
            r8 = r24
            r9 = r1
            r1 = r22
        L_0x0070:
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r10.f40907z = r6
            r6 = r0
        L_0x0078:
            r9.C = r0
            r9.D = r1
            r9.E = r3
            r9.F = r8
            r9.G = r6
            r9.H = r10
            r9.J = r4
            java.lang.Object r7 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r6, r5, r9, r4, r5)
            if (r7 != r2) goto L_0x008d
            return r2
        L_0x008d:
            r17 = r10
            r10 = r0
            r0 = r7
            r7 = r17
        L_0x0093:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r11 = r0.c()
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r14 = 0
        L_0x00a1:
            if (r14 >= r12) goto L_0x00bf
            java.lang.Object r15 = r11.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r4 = r16.f()
            r16 = r14
            long r13 = r7.f40907z
            boolean r4 = androidx.compose.ui.input.pointer.PointerId.c(r4, r13)
            if (r4 == 0) goto L_0x00ba
            goto L_0x00c0
        L_0x00ba:
            int r14 = r16 + 1
            r4 = 1
            r5 = 0
            goto L_0x00a1
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            if (r15 != 0) goto L_0x00c6
            r15 = 0
            goto L_0x0126
        L_0x00c6:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.d(r15)
            if (r4 == 0) goto L_0x00f9
            java.util.List r0 = r0.c()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r13 = 0
        L_0x00d8:
            if (r13 >= r4) goto L_0x00eb
            java.lang.Object r5 = r0.get(r13)
            r11 = r5
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.i()
            if (r11 == 0) goto L_0x00e8
            goto L_0x00ec
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x00d8
        L_0x00eb:
            r5 = 0
        L_0x00ec:
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            if (r5 != 0) goto L_0x00f1
            goto L_0x0126
        L_0x00f1:
            long r4 = r5.f()
            r7.f40907z = r4
        L_0x00f7:
            r0 = 0
            goto L_0x014b
        L_0x00f9:
            long r4 = androidx.compose.ui.input.pointer.PointerEventKt.h(r15)
            if (r3 != 0) goto L_0x0104
            float r0 = androidx.compose.ui.geometry.Offset.k(r4)
            goto L_0x011c
        L_0x0104:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r3 != r0) goto L_0x0114
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r11
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L_0x011c
        L_0x0114:
            r0 = 32
            long r4 = r4 >> r0
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L_0x011c:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            r13 = 1
            goto L_0x0124
        L_0x0123:
            r13 = 0
        L_0x0124:
            if (r13 != 0) goto L_0x00f7
        L_0x0126:
            if (r15 != 0) goto L_0x012a
            r0 = 0
            return r0
        L_0x012a:
            r0 = 0
            java.lang.Object r4 = r8.invoke(r15)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0138
            return r0
        L_0x0138:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.d(r15)
            if (r4 == 0) goto L_0x013f
            return r15
        L_0x013f:
            r1.invoke(r15)
            long r6 = r15.f()
            r5 = r0
            r0 = r10
            r4 = 1
            goto L_0x0070
        L_0x014b:
            r5 = r0
            r0 = r10
            r4 = 1
            r10 = r7
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.p(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, androidx.compose.foundation.gestures.Orientation, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.D
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.b(r8)
            r7 = r4
            r4 = r5
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            kotlin.ResultKt.b(r8)
        L_0x003e:
            r0.C = r4
            r0.D = r7
            r0.F = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L_0x0055
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r4
        L_0x0055:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.d(r8)
            if (r5 == 0) goto L_0x0060
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r4
        L_0x0060:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.q(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0118, code lost:
        if ((r0 == 0.0f) == false) goto L_0x011a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, kotlin.jvm.functions.Function1 r21, kotlin.coroutines.Continuation r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.I = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.H
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.I
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004d
            if (r3 != r5) goto L_0x0045
            java.lang.Object r3 = r1.G
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r7 = r1.F
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            java.lang.Object r8 = r1.E
            androidx.compose.foundation.gestures.Orientation r8 = (androidx.compose.foundation.gestures.Orientation) r8
            java.lang.Object r9 = r1.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r1.C
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            kotlin.ResultKt.b(r0)
            r16 = r10
            r10 = r1
            r1 = r16
            goto L_0x0089
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            kotlin.ResultKt.b(r0)
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.input.pointer.PointerEvent r3 = r18.l0()
            r7 = r19
            boolean r3 = s(r3, r7)
            if (r3 == 0) goto L_0x0060
            goto L_0x012c
        L_0x0060:
            r3 = r0
            r9 = r1
            r0 = r18
            r1 = r21
        L_0x0066:
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r10.f40907z = r7
            r7 = r0
            r8 = r3
            r3 = r10
        L_0x0070:
            r9.C = r1
            r9.D = r0
            r9.E = r8
            r9.F = r7
            r9.G = r3
            r9.I = r5
            java.lang.Object r10 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r7, r6, r9, r5, r6)
            if (r10 != r2) goto L_0x0083
            return r2
        L_0x0083:
            r16 = r9
            r9 = r0
            r0 = r10
            r10 = r16
        L_0x0089:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r11 = r0.c()
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r13 = 0
        L_0x0097:
            if (r13 >= r12) goto L_0x00b6
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            long r4 = r15.f()
            r18 = r7
            long r6 = r3.f40907z
            boolean r4 = androidx.compose.ui.input.pointer.PointerId.c(r4, r6)
            if (r4 == 0) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            r7 = r18
            goto L_0x0097
        L_0x00b6:
            r18 = r7
            r14 = 0
        L_0x00b9:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            if (r14 != 0) goto L_0x00bf
            r14 = 0
            goto L_0x011a
        L_0x00bf:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.d(r14)
            if (r4 == 0) goto L_0x00f1
            java.util.List r0 = r0.c()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x00d1:
            if (r5 >= r4) goto L_0x00e4
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x00e1
            goto L_0x00e5
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x00ea
            goto L_0x011a
        L_0x00ea:
            long r4 = r6.f()
            r3.f40907z = r4
            goto L_0x0148
        L_0x00f1:
            long r4 = androidx.compose.ui.input.pointer.PointerEventKt.h(r14)
            if (r8 != 0) goto L_0x00fc
            float r0 = androidx.compose.ui.geometry.Offset.k(r4)
            goto L_0x0110
        L_0x00fc:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r8 != r0) goto L_0x010c
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
        L_0x0106:
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L_0x0110
        L_0x010c:
            r0 = 32
            long r4 = r4 >> r0
            goto L_0x0106
        L_0x0110:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0117
            r0 = 1
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            if (r0 != 0) goto L_0x0148
        L_0x011a:
            if (r14 != 0) goto L_0x011e
        L_0x011c:
            r6 = 0
            goto L_0x012c
        L_0x011e:
            boolean r0 = r14.p()
            if (r0 == 0) goto L_0x0125
            goto L_0x011c
        L_0x0125:
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.d(r14)
            if (r0 == 0) goto L_0x0136
            r6 = r14
        L_0x012c:
            if (r6 == 0) goto L_0x0130
            r4 = 1
            goto L_0x0131
        L_0x0130:
            r4 = 0
        L_0x0131:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r0
        L_0x0136:
            r1.invoke(r14)
            long r3 = r14.f()
            r0 = r9
            r9 = r10
            r5 = 1
            r6 = 0
            r16 = r3
            r3 = r8
            r7 = r16
            goto L_0x0066
        L_0x0148:
            r7 = r18
            r0 = r9
            r9 = r10
            r5 = 1
            r6 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.r(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean s(PointerEvent pointerEvent, long j2) {
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

    public static final float t(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.h(i2, PointerType.f16933b.b()) ? viewConfiguration.g() * f3462c : viewConfiguration.g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0118, code lost:
        if ((r0 == 0.0f) == false) goto L_0x011a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object u(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, kotlin.jvm.functions.Function1 r21, kotlin.coroutines.Continuation r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.I = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.H
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.I
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004d
            if (r3 != r5) goto L_0x0045
            java.lang.Object r3 = r1.G
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r7 = r1.F
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            java.lang.Object r8 = r1.E
            androidx.compose.foundation.gestures.Orientation r8 = (androidx.compose.foundation.gestures.Orientation) r8
            java.lang.Object r9 = r1.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            java.lang.Object r10 = r1.C
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            kotlin.ResultKt.b(r0)
            r16 = r10
            r10 = r1
            r1 = r16
            goto L_0x0089
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            kotlin.ResultKt.b(r0)
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.input.pointer.PointerEvent r3 = r18.l0()
            r7 = r19
            boolean r3 = s(r3, r7)
            if (r3 == 0) goto L_0x0060
            goto L_0x012c
        L_0x0060:
            r3 = r0
            r9 = r1
            r0 = r18
            r1 = r21
        L_0x0066:
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r10.f40907z = r7
            r7 = r0
            r8 = r3
            r3 = r10
        L_0x0070:
            r9.C = r1
            r9.D = r0
            r9.E = r8
            r9.F = r7
            r9.G = r3
            r9.I = r5
            java.lang.Object r10 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r7, r6, r9, r5, r6)
            if (r10 != r2) goto L_0x0083
            return r2
        L_0x0083:
            r16 = r9
            r9 = r0
            r0 = r10
            r10 = r16
        L_0x0089:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r11 = r0.c()
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r13 = 0
        L_0x0097:
            if (r13 >= r12) goto L_0x00b6
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            long r4 = r15.f()
            r18 = r7
            long r6 = r3.f40907z
            boolean r4 = androidx.compose.ui.input.pointer.PointerId.c(r4, r6)
            if (r4 == 0) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            r7 = r18
            goto L_0x0097
        L_0x00b6:
            r18 = r7
            r14 = 0
        L_0x00b9:
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            if (r14 != 0) goto L_0x00bf
            r14 = 0
            goto L_0x011a
        L_0x00bf:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.d(r14)
            if (r4 == 0) goto L_0x00f1
            java.util.List r0 = r0.c()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x00d1:
            if (r5 >= r4) goto L_0x00e4
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x00e1
            goto L_0x00e5
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L_0x00ea
            goto L_0x011a
        L_0x00ea:
            long r4 = r6.f()
            r3.f40907z = r4
            goto L_0x0148
        L_0x00f1:
            long r4 = androidx.compose.ui.input.pointer.PointerEventKt.h(r14)
            if (r8 != 0) goto L_0x00fc
            float r0 = androidx.compose.ui.geometry.Offset.k(r4)
            goto L_0x0110
        L_0x00fc:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r8 != r0) goto L_0x010c
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
        L_0x0106:
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L_0x0110
        L_0x010c:
            r0 = 32
            long r4 = r4 >> r0
            goto L_0x0106
        L_0x0110:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0117
            r0 = 1
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            if (r0 != 0) goto L_0x0148
        L_0x011a:
            if (r14 != 0) goto L_0x011e
        L_0x011c:
            r6 = 0
            goto L_0x012c
        L_0x011e:
            boolean r0 = r14.p()
            if (r0 == 0) goto L_0x0125
            goto L_0x011c
        L_0x0125:
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.d(r14)
            if (r0 == 0) goto L_0x0136
            r6 = r14
        L_0x012c:
            if (r6 == 0) goto L_0x0130
            r4 = 1
            goto L_0x0131
        L_0x0130:
            r4 = 0
        L_0x0131:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r0
        L_0x0136:
            r1.invoke(r14)
            long r3 = r14.f()
            r0 = r9
            r9 = r10
            r5 = 1
            r6 = 0
            r16 = r3
            r3 = r8
            r7 = r16
            goto L_0x0066
        L_0x0148:
            r7 = r18
            r0 = r9
            r9 = r10
            r5 = 1
            r6 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.u(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
