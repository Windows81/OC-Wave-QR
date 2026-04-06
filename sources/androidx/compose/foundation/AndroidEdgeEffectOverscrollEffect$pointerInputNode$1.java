package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f2886z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public int f2887B;
        public /* synthetic */ Object C;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(androidEdgeEffectOverscrollEffect, continuation);
            r0.C = obj;
            return r0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad A[SYNTHETIC] */
        public final java.lang.Object x(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f2887B
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r1 = r13.C
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.b(r14)
                goto L_0x005f
            L_0x0017:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001f:
                java.lang.Object r1 = r13.C
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.b(r14)
                goto L_0x0040
            L_0x0027:
                kotlin.ResultKt.b(r14)
                java.lang.Object r14 = r13.C
                r1 = r14
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r13.C = r1
                r13.f2887B = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r5 = r1
                r8 = r13
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r5, r6, r7, r8, r9, r10)
                if (r14 != r0) goto L_0x0040
                return r0
            L_0x0040:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r1
                long r6 = r14.f()
                r5.f2883h = r6
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r1
                long r6 = r14.h()
                r5.f2877b = r6
            L_0x0054:
                r13.C = r1
                r13.f2887B = r2
                java.lang.Object r14 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r1, r3, r13, r4, r3)
                if (r14 != r0) goto L_0x005f
                return r0
            L_0x005f:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.c()
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r14.size()
                r5.<init>(r6)
                r6 = r14
                java.util.Collection r6 = (java.util.Collection) r6
                int r6 = r6.size()
                r7 = 0
                r8 = r7
            L_0x0077:
                if (r8 >= r6) goto L_0x008c
                java.lang.Object r9 = r14.get(r8)
                r10 = r9
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x0089
                r5.add(r9)
            L_0x0089:
                int r8 = r8 + 1
                goto L_0x0077
            L_0x008c:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = r1
                int r6 = r5.size()
            L_0x0092:
                if (r7 >= r6) goto L_0x00ad
                java.lang.Object r8 = r5.get(r7)
                r9 = r8
                androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                long r9 = r9.f()
                long r11 = r14.f2883h
                boolean r9 = androidx.compose.ui.input.pointer.PointerId.c(r9, r11)
                if (r9 == 0) goto L_0x00aa
                goto L_0x00ae
            L_0x00aa:
                int r7 = r7 + 1
                goto L_0x0092
            L_0x00ad:
                r8 = r3
            L_0x00ae:
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                if (r8 != 0) goto L_0x00b9
                java.lang.Object r14 = kotlin.collections.CollectionsKt.g0(r5)
                r8 = r14
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            L_0x00b9:
                if (r8 == 0) goto L_0x00cd
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = r1
                long r6 = r8.f()
                r14.f2883h = r6
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = r1
                long r6 = r8.h()
                r14.f2877b = r6
            L_0x00cd:
                boolean r14 = r5.isEmpty()
                if (r14 == 0) goto L_0x0054
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = r1
                r0 = -1
                long r0 = androidx.compose.ui.input.pointer.PointerId.a(r0)
                r14.f2883h = r0
                kotlin.Unit r14 = kotlin.Unit.f40552a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    public AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        this.f2886z = androidEdgeEffectOverscrollEffect;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f2886z;
        Object e2 = ForEachGestureKt.e(pointerInputScope, new AnonymousClass1((Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
