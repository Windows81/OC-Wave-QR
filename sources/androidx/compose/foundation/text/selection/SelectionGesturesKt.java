package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SelectionGesturesKt {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[SYNTHETIC] */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.b(r8)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.ResultKt.b(r8)
        L_0x0038:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.C = r7
            r0.E = r3
            java.lang.Object r8 = r7.k0(r8, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x0053:
            if (r5 >= r4) goto L_0x0065
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.b(r6)
            if (r6 != 0) goto L_0x0062
            goto L_0x0038
        L_0x0062:
            int r5 = r5 + 1
            goto L_0x0053
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.h(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean i(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.k(Offset.p(pointerInputChange.h(), pointerInputChange2.h())) < DragGestureDetectorKt.t(viewConfiguration, pointerInputChange.n());
    }

    public static final boolean j(PointerEvent pointerEvent) {
        List c2 = pointerEvent.c();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!PointerType.h(((PointerInputChange) c2.get(i2)).n(), PointerType.f16933b.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.foundation.text.selection.MouseSelectionObserver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.Object r8 = r0.E
            kotlin.jvm.internal.Ref$BooleanRef r8 = (kotlin.jvm.internal.Ref.BooleanRef) r8
            java.lang.Object r9 = r0.D
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = (androidx.compose.foundation.text.selection.MouseSelectionObserver) r9
            java.lang.Object r10 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r12)
            goto L_0x0107
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            java.lang.Object r8 = r0.D
            r9 = r8
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = (androidx.compose.foundation.text.selection.MouseSelectionObserver) r9
            java.lang.Object r8 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r12)
            goto L_0x0085
        L_0x004f:
            kotlin.ResultKt.b(r12)
            r10.d(r11)
            java.util.List r12 = r11.c()
            java.lang.Object r12 = r12.get(r3)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r11 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.b(r11)
            if (r11 == 0) goto L_0x00b5
            long r10 = r12.h()
            boolean r10 = r9.e(r10)
            if (r10 == 0) goto L_0x0139
            long r10 = r12.f()
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$1 r12 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$1
            r12.<init>(r9)
            r0.C = r8
            r0.D = r9
            r0.G = r5
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r8, r10, r12, r0)
            if (r12 != r1) goto L_0x0085
            return r1
        L_0x0085:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L_0x00b0
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.l0()
            java.util.List r8 = r8.c()
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
        L_0x009c:
            if (r3 >= r10) goto L_0x00b0
            java.lang.Object r11 = r8.get(r3)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.c(r11)
            if (r12 == 0) goto L_0x00ad
            r11.a()
        L_0x00ad:
            int r3 = r3 + 1
            goto L_0x009c
        L_0x00b0:
            r9.c()
            goto L_0x0139
        L_0x00b5:
            int r10 = r10.a()
            if (r10 == r5) goto L_0x00cb
            if (r10 == r4) goto L_0x00c4
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r10 = r10.n()
            goto L_0x00d1
        L_0x00c4:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r10 = r10.o()
            goto L_0x00d1
        L_0x00cb:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r10 = r10.m()
        L_0x00d1:
            long r6 = r12.h()
            boolean r11 = r9.b(r6, r10)
            if (r11 == 0) goto L_0x0139
            kotlin.jvm.internal.Ref$BooleanRef r11 = new kotlin.jvm.internal.Ref$BooleanRef
            r11.<init>()
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r2 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r2 = r2.m()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r10, r2)
            r2 = r2 ^ r5
            r11.f40901z = r2
            long r5 = r12.f()
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2 r12 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
            r12.<init>(r9, r10, r11)
            r0.C = r8
            r0.D = r9
            r0.E = r11
            r0.G = r4
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r8, r5, r12, r0)
            if (r12 != r1) goto L_0x0105
            return r1
        L_0x0105:
            r10 = r8
            r8 = r11
        L_0x0107:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L_0x0136
            boolean r8 = r8.f40901z
            if (r8 == 0) goto L_0x0136
            androidx.compose.ui.input.pointer.PointerEvent r8 = r10.l0()
            java.util.List r8 = r8.c()
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
        L_0x0122:
            if (r3 >= r10) goto L_0x0136
            java.lang.Object r11 = r8.get(r3)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.c(r11)
            if (r12 == 0) goto L_0x0133
            r11.a()
        L_0x0133:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0136:
            r9.c()
        L_0x0139:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.k(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: androidx.compose.foundation.text.selection.MouseSelectionObserver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            java.lang.Object r8 = r0.E
            kotlin.jvm.internal.Ref$BooleanRef r8 = (kotlin.jvm.internal.Ref.BooleanRef) r8
            java.lang.Object r9 = r0.D
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = (androidx.compose.foundation.text.selection.MouseSelectionObserver) r9
            java.lang.Object r10 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0113
        L_0x003a:
            r8 = move-exception
            goto L_0x0146
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            java.lang.Object r8 = r0.D
            r9 = r8
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = (androidx.compose.foundation.text.selection.MouseSelectionObserver) r9
            java.lang.Object r8 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x0052 }
            goto L_0x008a
        L_0x0052:
            r8 = move-exception
            goto L_0x00ba
        L_0x0054:
            kotlin.ResultKt.b(r12)
            java.util.List r12 = r11.c()
            java.lang.Object r12 = r12.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r11 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.b(r11)
            if (r11 == 0) goto L_0x00be
            long r10 = r12.h()
            boolean r10 = r9.e(r10)
            if (r10 == 0) goto L_0x014a
            r12.a()     // Catch:{ all -> 0x0052 }
            long r10 = r12.f()     // Catch:{ all -> 0x0052 }
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1 r12 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1     // Catch:{ all -> 0x0052 }
            r12.<init>(r9)     // Catch:{ all -> 0x0052 }
            r0.C = r8     // Catch:{ all -> 0x0052 }
            r0.D = r9     // Catch:{ all -> 0x0052 }
            r0.G = r5     // Catch:{ all -> 0x0052 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r8, r10, r12, r0)     // Catch:{ all -> 0x0052 }
            if (r12 != r1) goto L_0x008a
            return r1
        L_0x008a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0052 }
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x0052 }
            if (r10 == 0) goto L_0x00b5
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.l0()     // Catch:{ all -> 0x0052 }
            java.util.List r8 = r8.c()     // Catch:{ all -> 0x0052 }
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x0052 }
            int r10 = r10.size()     // Catch:{ all -> 0x0052 }
        L_0x00a1:
            if (r4 >= r10) goto L_0x00b5
            java.lang.Object r11 = r8.get(r4)     // Catch:{ all -> 0x0052 }
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch:{ all -> 0x0052 }
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.c(r11)     // Catch:{ all -> 0x0052 }
            if (r12 == 0) goto L_0x00b2
            r11.a()     // Catch:{ all -> 0x0052 }
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x00a1
        L_0x00b5:
            r9.c()
            goto L_0x014a
        L_0x00ba:
            r9.c()
            throw r8
        L_0x00be:
            int r10 = r10.a()
            if (r10 == r5) goto L_0x00d4
            if (r10 == r3) goto L_0x00cd
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r10 = r10.n()
            goto L_0x00da
        L_0x00cd:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r10 = r10.o()
            goto L_0x00da
        L_0x00d4:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a
            androidx.compose.foundation.text.selection.SelectionAdjustment r10 = r10.m()
        L_0x00da:
            long r6 = r12.h()
            boolean r11 = r9.b(r6, r10)
            if (r11 == 0) goto L_0x014a
            r12.a()     // Catch:{ all -> 0x003a }
            kotlin.jvm.internal.Ref$BooleanRef r11 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ all -> 0x003a }
            r11.<init>()     // Catch:{ all -> 0x003a }
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r2 = androidx.compose.foundation.text.selection.SelectionAdjustment.f6782a     // Catch:{ all -> 0x003a }
            androidx.compose.foundation.text.selection.SelectionAdjustment r2 = r2.m()     // Catch:{ all -> 0x003a }
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r10, r2)     // Catch:{ all -> 0x003a }
            r2 = r2 ^ r5
            r11.f40901z = r2     // Catch:{ all -> 0x003a }
            long r5 = r12.f()     // Catch:{ all -> 0x003a }
            androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2 r12 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2     // Catch:{ all -> 0x003a }
            r12.<init>(r9, r10, r11)     // Catch:{ all -> 0x003a }
            r0.C = r8     // Catch:{ all -> 0x003a }
            r0.D = r9     // Catch:{ all -> 0x003a }
            r0.E = r11     // Catch:{ all -> 0x003a }
            r0.G = r3     // Catch:{ all -> 0x003a }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r8, r5, r12, r0)     // Catch:{ all -> 0x003a }
            if (r12 != r1) goto L_0x0111
            return r1
        L_0x0111:
            r10 = r8
            r8 = r11
        L_0x0113:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x003a }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x003a }
            if (r11 == 0) goto L_0x0142
            boolean r8 = r8.f40901z     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x0142
            androidx.compose.ui.input.pointer.PointerEvent r8 = r10.l0()     // Catch:{ all -> 0x003a }
            java.util.List r8 = r8.c()     // Catch:{ all -> 0x003a }
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x003a }
            int r10 = r10.size()     // Catch:{ all -> 0x003a }
        L_0x012e:
            if (r4 >= r10) goto L_0x0142
            java.lang.Object r11 = r8.get(r4)     // Catch:{ all -> 0x003a }
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch:{ all -> 0x003a }
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.c(r11)     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x013f
            r11.a()     // Catch:{ all -> 0x003a }
        L_0x013f:
            int r4 = r4 + 1
            goto L_0x012e
        L_0x0142:
            r9.c()
            goto L_0x014a
        L_0x0146:
            r9.c()
            throw r8
        L_0x014a:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.l(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier m(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.d(modifier, mouseSelectionObserver, textDragObserver, new SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver));
    }

    public static final Object n(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation continuation) {
        Object e2 = ForEachGestureKt.e(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, (Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: androidx.compose.foundation.text.TextDragObserver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ CancellationException -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1 A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object o(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r8 = r0.D
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00a1
        L_0x0035:
            r8 = move-exception
            goto L_0x00d7
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.E
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.D
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            r7 = r10
            r10 = r8
            r8 = r7
            goto L_0x0073
        L_0x0053:
            kotlin.ResultKt.b(r11)
            java.util.List r10 = r10.c()     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r10 = kotlin.collections.CollectionsKt.e0(r10)     // Catch:{ CancellationException -> 0x0035 }
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch:{ CancellationException -> 0x0035 }
            long r5 = r10.f()     // Catch:{ CancellationException -> 0x0035 }
            r0.C = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.D = r9     // Catch:{ CancellationException -> 0x0035 }
            r0.E = r10     // Catch:{ CancellationException -> 0x0035 }
            r0.G = r4     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.g(r8, r5, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x0073
            return r1
        L_0x0073:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch:{ CancellationException -> 0x0035 }
            if (r11 == 0) goto L_0x00d4
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = i(r2, r10, r11)     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00d4
            long r4 = r11.h()     // Catch:{ CancellationException -> 0x0035 }
            r9.n(r4)     // Catch:{ CancellationException -> 0x0035 }
            long r10 = r11.f()     // Catch:{ CancellationException -> 0x0035 }
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch:{ CancellationException -> 0x0035 }
            r2.<init>(r9)     // Catch:{ CancellationException -> 0x0035 }
            r0.C = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.D = r9     // Catch:{ CancellationException -> 0x0035 }
            r4 = 0
            r0.E = r4     // Catch:{ CancellationException -> 0x0035 }
            r0.G = r3     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r8, r10, r2, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = r11.booleanValue()     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00d1
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.l0()     // Catch:{ CancellationException -> 0x0035 }
            java.util.List r8 = r8.c()     // Catch:{ CancellationException -> 0x0035 }
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ CancellationException -> 0x0035 }
            int r10 = r10.size()     // Catch:{ CancellationException -> 0x0035 }
            r11 = 0
        L_0x00b9:
            if (r11 >= r10) goto L_0x00cd
            java.lang.Object r0 = r8.get(r11)     // Catch:{ CancellationException -> 0x0035 }
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch:{ CancellationException -> 0x0035 }
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.c(r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r1 == 0) goto L_0x00ca
            r0.a()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00ca:
            int r11 = r11 + 1
            goto L_0x00b9
        L_0x00cd:
            r9.l()     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00d4
        L_0x00d1:
            r9.onCancel()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00d4:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        L_0x00d7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.o(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: androidx.compose.foundation.text.TextDragObserver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ CancellationException -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1 A[Catch:{ CancellationException -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object p(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r8 = r0.D
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00a1
        L_0x0035:
            r8 = move-exception
            goto L_0x00d7
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.E
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.D
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.ResultKt.b(r11)     // Catch:{ CancellationException -> 0x0035 }
            r7 = r10
            r10 = r8
            r8 = r7
            goto L_0x0073
        L_0x0053:
            kotlin.ResultKt.b(r11)
            java.util.List r10 = r10.c()     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r10 = kotlin.collections.CollectionsKt.e0(r10)     // Catch:{ CancellationException -> 0x0035 }
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch:{ CancellationException -> 0x0035 }
            long r5 = r10.f()     // Catch:{ CancellationException -> 0x0035 }
            r0.C = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.D = r9     // Catch:{ CancellationException -> 0x0035 }
            r0.E = r10     // Catch:{ CancellationException -> 0x0035 }
            r0.G = r4     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.g(r8, r5, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x0073
            return r1
        L_0x0073:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch:{ CancellationException -> 0x0035 }
            if (r11 == 0) goto L_0x00d4
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = i(r2, r10, r11)     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00d4
            long r4 = r11.h()     // Catch:{ CancellationException -> 0x0035 }
            r9.n(r4)     // Catch:{ CancellationException -> 0x0035 }
            long r10 = r11.f()     // Catch:{ CancellationException -> 0x0035 }
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch:{ CancellationException -> 0x0035 }
            r2.<init>(r9)     // Catch:{ CancellationException -> 0x0035 }
            r0.C = r8     // Catch:{ CancellationException -> 0x0035 }
            r0.D = r9     // Catch:{ CancellationException -> 0x0035 }
            r4 = 0
            r0.E = r4     // Catch:{ CancellationException -> 0x0035 }
            r0.G = r3     // Catch:{ CancellationException -> 0x0035 }
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r8, r10, r2, r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r11 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ CancellationException -> 0x0035 }
            boolean r10 = r11.booleanValue()     // Catch:{ CancellationException -> 0x0035 }
            if (r10 == 0) goto L_0x00d1
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.l0()     // Catch:{ CancellationException -> 0x0035 }
            java.util.List r8 = r8.c()     // Catch:{ CancellationException -> 0x0035 }
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ CancellationException -> 0x0035 }
            int r10 = r10.size()     // Catch:{ CancellationException -> 0x0035 }
            r11 = 0
        L_0x00b9:
            if (r11 >= r10) goto L_0x00cd
            java.lang.Object r0 = r8.get(r11)     // Catch:{ CancellationException -> 0x0035 }
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch:{ CancellationException -> 0x0035 }
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.c(r0)     // Catch:{ CancellationException -> 0x0035 }
            if (r1 == 0) goto L_0x00ca
            r0.a()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00ca:
            int r11 = r11 + 1
            goto L_0x00b9
        L_0x00cd:
            r9.l()     // Catch:{ CancellationException -> 0x0035 }
            goto L_0x00d4
        L_0x00d1:
            r9.onCancel()     // Catch:{ CancellationException -> 0x0035 }
        L_0x00d4:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        L_0x00d7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.p(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: androidx.compose.foundation.text.TextDragObserver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6 A[Catch:{ CancellationException -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac A[Catch:{ CancellationException -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ CancellationException -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7 A[Catch:{ CancellationException -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f A[Catch:{ CancellationException -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, androidx.compose.foundation.text.TextDragObserver r13, androidx.compose.ui.input.pointer.PointerEvent r14, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1
            r0.<init>(r15)
        L_0x0018:
            java.lang.Object r15 = r0.H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0063
            if (r2 == r5) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r12 = r0.D
            r13 = r12
            androidx.compose.foundation.text.TextDragObserver r13 = (androidx.compose.foundation.text.TextDragObserver) r13
            java.lang.Object r12 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
            kotlin.ResultKt.b(r15)     // Catch:{ CancellationException -> 0x0037 }
            goto L_0x00df
        L_0x0037:
            r12 = move-exception
            goto L_0x0115
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0042:
            long r12 = r0.G
            java.lang.Object r14 = r0.F
            kotlin.jvm.internal.Ref$LongRef r14 = (kotlin.jvm.internal.Ref.LongRef) r14
            java.lang.Object r2 = r0.E
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            java.lang.Object r5 = r0.D
            androidx.compose.foundation.text.TextDragObserver r5 = (androidx.compose.foundation.text.TextDragObserver) r5
            java.lang.Object r6 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.ResultKt.b(r15)     // Catch:{ CancellationException -> 0x005f }
            r10 = r6
            r6 = r14
            r11 = r5
            r5 = r15
            r14 = r12
            r13 = r11
            r12 = r10
            goto L_0x00a2
        L_0x005f:
            r12 = move-exception
            r13 = r5
            goto L_0x0115
        L_0x0063:
            kotlin.ResultKt.b(r15)
            java.util.List r14 = r14.c()     // Catch:{ CancellationException -> 0x0037 }
            java.lang.Object r14 = kotlin.collections.CollectionsKt.e0(r14)     // Catch:{ CancellationException -> 0x0037 }
            r2 = r14
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2     // Catch:{ CancellationException -> 0x0037 }
            long r14 = r2.f()     // Catch:{ CancellationException -> 0x0037 }
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef     // Catch:{ CancellationException -> 0x0037 }
            r6.<init>()     // Catch:{ CancellationException -> 0x0037 }
            androidx.compose.ui.geometry.Offset$Companion r7 = androidx.compose.ui.geometry.Offset.f15855b     // Catch:{ CancellationException -> 0x0037 }
            long r7 = r7.b()     // Catch:{ CancellationException -> 0x0037 }
            r6.f40907z = r7     // Catch:{ CancellationException -> 0x0037 }
            androidx.compose.ui.platform.ViewConfiguration r7 = r12.getViewConfiguration()     // Catch:{ CancellationException -> 0x0037 }
            long r7 = r7.c()     // Catch:{ CancellationException -> 0x0037 }
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 r9 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1     // Catch:{ CancellationException -> 0x0037 }
            r9.<init>(r14, r6, r4)     // Catch:{ CancellationException -> 0x0037 }
            r0.C = r12     // Catch:{ CancellationException -> 0x0037 }
            r0.D = r13     // Catch:{ CancellationException -> 0x0037 }
            r0.E = r2     // Catch:{ CancellationException -> 0x0037 }
            r0.F = r6     // Catch:{ CancellationException -> 0x0037 }
            r0.G = r14     // Catch:{ CancellationException -> 0x0037 }
            r0.I = r5     // Catch:{ CancellationException -> 0x0037 }
            java.lang.Object r5 = r12.V0(r7, r9, r0)     // Catch:{ CancellationException -> 0x0037 }
            if (r5 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            androidx.compose.foundation.text.selection.DownResolution r5 = (androidx.compose.foundation.text.selection.DownResolution) r5     // Catch:{ CancellationException -> 0x0037 }
            if (r5 != 0) goto L_0x00a8
            androidx.compose.foundation.text.selection.DownResolution r5 = androidx.compose.foundation.text.selection.DownResolution.Timeout     // Catch:{ CancellationException -> 0x0037 }
        L_0x00a8:
            androidx.compose.foundation.text.selection.DownResolution r7 = androidx.compose.foundation.text.selection.DownResolution.Cancel     // Catch:{ CancellationException -> 0x0037 }
            if (r5 != r7) goto L_0x00af
            kotlin.Unit r12 = kotlin.Unit.f40552a     // Catch:{ CancellationException -> 0x0037 }
            return r12
        L_0x00af:
            long r7 = r2.h()     // Catch:{ CancellationException -> 0x0037 }
            r13.n(r7)     // Catch:{ CancellationException -> 0x0037 }
            androidx.compose.foundation.text.selection.DownResolution r2 = androidx.compose.foundation.text.selection.DownResolution.Up     // Catch:{ CancellationException -> 0x0037 }
            if (r5 != r2) goto L_0x00c0
            r13.l()     // Catch:{ CancellationException -> 0x0037 }
            kotlin.Unit r12 = kotlin.Unit.f40552a     // Catch:{ CancellationException -> 0x0037 }
            return r12
        L_0x00c0:
            androidx.compose.foundation.text.selection.DownResolution r2 = androidx.compose.foundation.text.selection.DownResolution.Drag     // Catch:{ CancellationException -> 0x0037 }
            if (r5 != r2) goto L_0x00c9
            long r5 = r6.f40907z     // Catch:{ CancellationException -> 0x0037 }
            r13.p(r5)     // Catch:{ CancellationException -> 0x0037 }
        L_0x00c9:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1     // Catch:{ CancellationException -> 0x0037 }
            r2.<init>(r13)     // Catch:{ CancellationException -> 0x0037 }
            r0.C = r12     // Catch:{ CancellationException -> 0x0037 }
            r0.D = r13     // Catch:{ CancellationException -> 0x0037 }
            r0.E = r4     // Catch:{ CancellationException -> 0x0037 }
            r0.F = r4     // Catch:{ CancellationException -> 0x0037 }
            r0.I = r3     // Catch:{ CancellationException -> 0x0037 }
            java.lang.Object r15 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r12, r14, r2, r0)     // Catch:{ CancellationException -> 0x0037 }
            if (r15 != r1) goto L_0x00df
            return r1
        L_0x00df:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ CancellationException -> 0x0037 }
            boolean r14 = r15.booleanValue()     // Catch:{ CancellationException -> 0x0037 }
            if (r14 == 0) goto L_0x010f
            androidx.compose.ui.input.pointer.PointerEvent r12 = r12.l0()     // Catch:{ CancellationException -> 0x0037 }
            java.util.List r12 = r12.c()     // Catch:{ CancellationException -> 0x0037 }
            r14 = r12
            java.util.Collection r14 = (java.util.Collection) r14     // Catch:{ CancellationException -> 0x0037 }
            int r14 = r14.size()     // Catch:{ CancellationException -> 0x0037 }
            r15 = 0
        L_0x00f7:
            if (r15 >= r14) goto L_0x010b
            java.lang.Object r0 = r12.get(r15)     // Catch:{ CancellationException -> 0x0037 }
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch:{ CancellationException -> 0x0037 }
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.c(r0)     // Catch:{ CancellationException -> 0x0037 }
            if (r1 == 0) goto L_0x0108
            r0.a()     // Catch:{ CancellationException -> 0x0037 }
        L_0x0108:
            int r15 = r15 + 1
            goto L_0x00f7
        L_0x010b:
            r13.l()     // Catch:{ CancellationException -> 0x0037 }
            goto L_0x0112
        L_0x010f:
            r13.onCancel()     // Catch:{ CancellationException -> 0x0037 }
        L_0x0112:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x0115:
            r13.onCancel()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.q(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier r(Modifier modifier, Function1 function1) {
        return SuspendingPointerInputFilterKt.c(modifier, 8675309, new SelectionGesturesKt$updateSelectionTouchMode$1(function1));
    }
}
