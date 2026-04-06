package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend")
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PointerInputScope F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Function1 J;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public Object f3599B;
        public Object C;
        public Object D;
        public int E;
        public /* synthetic */ Object F;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(coroutineScope, function3, function1, function12, function13, pressGestureScopeImpl, continuation);
            r0.F = obj;
            return r0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ab, code lost:
            r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r0;
            r1.a();
            r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r4, (kotlin.coroutines.CoroutineContext) null, androidx.compose.foundation.gestures.TapGestureDetectorKt.n(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(r9, (kotlin.coroutines.Continuation) null), 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cb, code lost:
            if (r5 == androidx.compose.foundation.gestures.TapGestureDetectorKt.f3596a) goto L_0x00e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cd, code lost:
            r3 = r4;
            r5 = r5;
            r10 = r9;
            androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r3, r0, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass1((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e9, code lost:
            if (r6 != null) goto L_0x00fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00eb, code lost:
            r6.F = r2;
            r6.f3599B = r0;
            r6.E = 2;
            r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.v(r2, (androidx.compose.ui.input.pointer.PointerEventPass) null, r6, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f6, code lost:
            if (r1 != r7) goto L_0x00f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f8, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f9, code lost:
            r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fb, code lost:
            r11 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fd, code lost:
            r6.F = r2;
            r6.f3599B = r1;
            r6.C = r0;
            r6.E = 3;
            r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.t(r2, (androidx.compose.ui.input.pointer.PointerEventPass) null, r6, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x010a, code lost:
            if (r3 != r7) goto L_0x010d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x010c, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x010d, code lost:
            r3 = (androidx.compose.foundation.gestures.LongPressResult) r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0115, code lost:
            if (kotlin.jvm.internal.Intrinsics.d(r3, androidx.compose.foundation.gestures.LongPressResult.Success.f3525a) == false) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0117, code lost:
            r6.invoke(androidx.compose.ui.geometry.Offset.d(r1.h()));
            r6.F = r0;
            r6.f3599B = null;
            r6.C = null;
            r6.E = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0131, code lost:
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.j(r2, r6) != r7) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0133, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0134, code lost:
            r10 = r4;
            r0 = r9;
            androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass2((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0145, code lost:
            return kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0148, code lost:
            if ((r3 instanceof androidx.compose.foundation.gestures.LongPressResult.Released) == false) goto L_0x0151;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x014a, code lost:
            r1 = ((androidx.compose.foundation.gestures.LongPressResult.Released) r3).a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0153, code lost:
            if ((r3 instanceof androidx.compose.foundation.gestures.LongPressResult.Canceled) == false) goto L_0x02c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0155, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0157, code lost:
            if (r1 != null) goto L_0x016a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0159, code lost:
            r10 = r4;
            r0 = r9;
            r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass3((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x016a, code lost:
            r1.a();
            r10 = r4;
            r0 = r9;
            r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass4((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x017d, code lost:
            if (r1 == null) goto L_0x02be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0181, code lost:
            if (r7 != null) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0183, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0185, code lost:
            if (r0 == null) goto L_0x02be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0187, code lost:
            r0.invoke(androidx.compose.ui.geometry.Offset.d(r1.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0194, code lost:
            r6.F = r2;
            r6.f3599B = r1;
            r6.C = r0;
            r6.E = 5;
            r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.i(r2, r1, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a1, code lost:
            if (r3 != r7) goto L_0x01a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a3, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a4, code lost:
            r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a6, code lost:
            if (r3 != null) goto L_0x01b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a8, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01aa, code lost:
            if (r0 == null) goto L_0x02be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ac, code lost:
            r0.invoke(androidx.compose.ui.geometry.Offset.d(r1.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b9, code lost:
            r10 = r4;
            r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.n();
            r4 = r9;
            r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r10, (kotlin.coroutines.CoroutineContext) null, r12, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass5((kotlin.coroutines.Continuation) null), 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d3, code lost:
            if (r5 == androidx.compose.foundation.gestures.TapGestureDetectorKt.f3596a) goto L_0x01ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d5, code lost:
            r4 = r4;
            r10 = r5;
            r11 = r9;
            androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r4, r0, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass6((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f1, code lost:
            if (r6 != null) goto L_0x020d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f3, code lost:
            r6.F = r0;
            r6.f3599B = r1;
            r6.C = null;
            r6.E = 6;
            r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.v(r2, (androidx.compose.ui.input.pointer.PointerEventPass) null, r6, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0200, code lost:
            if (r2 != r7) goto L_0x0203;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0202, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0203, code lost:
            r22 = r1;
            r1 = r0;
            r0 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0208, code lost:
            r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2;
            r11 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x020d, code lost:
            r6.F = r2;
            r6.f3599B = r0;
            r6.C = r1;
            r6.D = r3;
            r6.E = 7;
            r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.t(r2, (androidx.compose.ui.input.pointer.PointerEventPass) null, r6, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x021c, code lost:
            if (r4 != r7) goto L_0x021f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x021e, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x021f, code lost:
            r22 = r2;
            r2 = r0;
            r0 = r3;
            r3 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0225, code lost:
            r4 = (androidx.compose.foundation.gestures.LongPressResult) r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x022d, code lost:
            if (kotlin.jvm.internal.Intrinsics.d(r4, androidx.compose.foundation.gestures.LongPressResult.Success.f3525a) == false) goto L_0x0262;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x022f, code lost:
            r6.invoke(androidx.compose.ui.geometry.Offset.d(r0.h()));
            r6.F = r2;
            r6.f3599B = null;
            r6.C = null;
            r6.D = null;
            r6.E = 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x024c, code lost:
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.j(r3, r6) != r7) goto L_0x024f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x024e, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x024f, code lost:
            r11 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0250, code lost:
            androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r4, r11, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(r9, (kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0261, code lost:
            return kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0264, code lost:
            if ((r4 instanceof androidx.compose.foundation.gestures.LongPressResult.Released) == false) goto L_0x0270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0266, code lost:
            r11 = r2;
            r2 = ((androidx.compose.foundation.gestures.LongPressResult.Released) r4).a();
            r0 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0272, code lost:
            if ((r4 instanceof androidx.compose.foundation.gestures.LongPressResult.Canceled) == false) goto L_0x02b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0274, code lost:
            r0 = r1;
            r11 = r2;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0277, code lost:
            if (r2 == null) goto L_0x0299;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0279, code lost:
            r2.a();
            r10 = r4;
            r0 = r9;
            androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass7((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
            r7.invoke(androidx.compose.ui.geometry.Offset.d(r2.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0299, code lost:
            r10 = r4;
            r1 = r9;
            androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.AnonymousClass8((kotlin.coroutines.Continuation) null), 2, (java.lang.Object) null);
            r1 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x02aa, code lost:
            if (r1 == null) goto L_0x02be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ac, code lost:
            r1.invoke(androidx.compose.ui.geometry.Offset.d(r0.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x02bd, code lost:
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c0, code lost:
            return kotlin.Unit.f40552a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c6, code lost:
            throw new kotlin.NoWhenBranchMatchedException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
            r11 = r0;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r24) {
            /*
                r23 = this;
                r6 = r23
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r6.E
                r8 = 1
                r9 = 0
                switch(r0) {
                    case 0: goto L_0x0090;
                    case 1: goto L_0x0085;
                    case 2: goto L_0x0075;
                    case 3: goto L_0x0062;
                    case 4: goto L_0x0058;
                    case 5: goto L_0x0045;
                    case 6: goto L_0x0036;
                    case 7: goto L_0x001f;
                    case 8: goto L_0x0015;
                    default: goto L_0x000d;
                }
            L_0x000d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0015:
                java.lang.Object r0 = r6.F
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.ResultKt.b(r24)
                r11 = r0
                goto L_0x0250
            L_0x001f:
                java.lang.Object r0 = r6.D
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                java.lang.Object r1 = r6.C
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                java.lang.Object r2 = r6.f3599B
                kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
                java.lang.Object r3 = r6.F
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.ResultKt.b(r24)
                r4 = r24
                goto L_0x0225
            L_0x0036:
                java.lang.Object r0 = r6.f3599B
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                java.lang.Object r1 = r6.F
                kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
                kotlin.ResultKt.b(r24)
                r2 = r24
                goto L_0x0208
            L_0x0045:
                java.lang.Object r0 = r6.C
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                java.lang.Object r1 = r6.f3599B
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                java.lang.Object r2 = r6.F
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.b(r24)
                r3 = r24
                goto L_0x01a4
            L_0x0058:
                java.lang.Object r0 = r6.F
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.ResultKt.b(r24)
            L_0x005f:
                r11 = r0
                goto L_0x0134
            L_0x0062:
                java.lang.Object r0 = r6.C
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                java.lang.Object r1 = r6.f3599B
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                java.lang.Object r2 = r6.F
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.b(r24)
                r3 = r24
                goto L_0x010d
            L_0x0075:
                java.lang.Object r0 = r6.f3599B
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                java.lang.Object r1 = r6.F
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.b(r24)
                r2 = r1
                r1 = r24
                goto L_0x00f9
            L_0x0085:
                java.lang.Object r0 = r6.F
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                kotlin.ResultKt.b(r24)
                r2 = r0
                r0 = r24
                goto L_0x00ab
            L_0x0090:
                kotlin.ResultKt.b(r24)
                java.lang.Object r0 = r6.F
                r10 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                r6.F = r10
                r6.E = r8
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r0 = r10
                r3 = r23
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x00aa
                return r7
            L_0x00aa:
                r2 = r10
            L_0x00ab:
                r1 = r0
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                r1.a()
                kotlinx.coroutines.CoroutineScope r10 = r4
                kotlinx.coroutines.CoroutineStart r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.n()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r13.<init>(r0, r9)
                r14 = 1
                r15 = 0
                r11 = 0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r10, r11, r12, r13, r14, r15)
                kotlin.jvm.functions.Function3 r3 = r5
                kotlin.jvm.functions.Function3 r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f3596a
                if (r3 == r4) goto L_0x00e7
                kotlinx.coroutines.CoroutineScope r3 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1 r4 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1
                kotlin.jvm.functions.Function3 r5 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r10 = r9
                r4.<init>(r5, r10, r1, r9)
                r20 = 2
                r21 = 0
                r18 = 0
                r16 = r3
                r17 = r0
                r19 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r16, r17, r18, r19, r20, r21)
            L_0x00e7:
                kotlin.jvm.functions.Function1 r3 = r6
                if (r3 != 0) goto L_0x00fd
                r6.F = r2
                r6.f3599B = r0
                r1 = 2
                r6.E = r1
                java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.v(r2, r9, r6, r8, r9)
                if (r1 != r7) goto L_0x00f9
                return r7
            L_0x00f9:
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            L_0x00fb:
                r11 = r0
                goto L_0x0157
            L_0x00fd:
                r6.F = r2
                r6.f3599B = r1
                r6.C = r0
                r3 = 3
                r6.E = r3
                java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.t(r2, r9, r6, r8, r9)
                if (r3 != r7) goto L_0x010d
                return r7
            L_0x010d:
                androidx.compose.foundation.gestures.LongPressResult r3 = (androidx.compose.foundation.gestures.LongPressResult) r3
                androidx.compose.foundation.gestures.LongPressResult$Success r4 = androidx.compose.foundation.gestures.LongPressResult.Success.f3525a
                boolean r4 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
                if (r4 == 0) goto L_0x0146
                kotlin.jvm.functions.Function1 r3 = r6
                long r4 = r1.h()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r4)
                r3.invoke(r1)
                r6.F = r0
                r6.f3599B = r9
                r6.C = r9
                r1 = 4
                r6.E = r1
                java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.j(r2, r6)
                if (r1 != r7) goto L_0x005f
                return r7
            L_0x0134:
                kotlinx.coroutines.CoroutineScope r10 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, r12, r13, r14, r15)
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x0146:
                boolean r1 = r3 instanceof androidx.compose.foundation.gestures.LongPressResult.Released
                if (r1 == 0) goto L_0x0151
                androidx.compose.foundation.gestures.LongPressResult$Released r3 = (androidx.compose.foundation.gestures.LongPressResult.Released) r3
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r3.a()
                goto L_0x00fb
            L_0x0151:
                boolean r1 = r3 instanceof androidx.compose.foundation.gestures.LongPressResult.Canceled
                if (r1 == 0) goto L_0x02c1
                r1 = r9
                goto L_0x00fb
            L_0x0157:
                if (r1 != 0) goto L_0x016a
                kotlinx.coroutines.CoroutineScope r10 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                kotlinx.coroutines.Job r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, r12, r13, r14, r15)
                goto L_0x017d
            L_0x016a:
                r1.a()
                kotlinx.coroutines.CoroutineScope r10 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                kotlinx.coroutines.Job r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, r12, r13, r14, r15)
            L_0x017d:
                if (r1 == 0) goto L_0x02be
                kotlin.jvm.functions.Function1 r3 = r7
                if (r3 != 0) goto L_0x0194
                kotlin.jvm.functions.Function1 r0 = r8
                if (r0 == 0) goto L_0x02be
                long r1 = r1.h()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r1)
                r0.invoke(r1)
                goto L_0x02be
            L_0x0194:
                r6.F = r2
                r6.f3599B = r1
                r6.C = r0
                r3 = 5
                r6.E = r3
                java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.i(r2, r1, r6)
                if (r3 != r7) goto L_0x01a4
                return r7
            L_0x01a4:
                androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
                if (r3 != 0) goto L_0x01b9
                kotlin.jvm.functions.Function1 r0 = r8
                if (r0 == 0) goto L_0x02be
                long r1 = r1.h()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r1)
                r0.invoke(r1)
                goto L_0x02be
            L_0x01b9:
                kotlinx.coroutines.CoroutineScope r10 = r4
                kotlinx.coroutines.CoroutineStart r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.n()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r9
                r13.<init>(r0, r4, r9)
                r14 = 1
                r15 = 0
                r11 = 0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r10, r11, r12, r13, r14, r15)
                kotlin.jvm.functions.Function3 r4 = r5
                kotlin.jvm.functions.Function3 r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f3596a
                if (r4 == r5) goto L_0x01ef
                kotlinx.coroutines.CoroutineScope r4 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6
                kotlin.jvm.functions.Function3 r10 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r11 = r9
                r5.<init>(r10, r11, r3, r9)
                r20 = 2
                r21 = 0
                r18 = 0
                r16 = r4
                r17 = r0
                r19 = r5
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r16, r17, r18, r19, r20, r21)
            L_0x01ef:
                kotlin.jvm.functions.Function1 r4 = r6
                if (r4 != 0) goto L_0x020d
                r6.F = r0
                r6.f3599B = r1
                r6.C = r9
                r3 = 6
                r6.E = r3
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.v(r2, r9, r6, r8, r9)
                if (r2 != r7) goto L_0x0203
                return r7
            L_0x0203:
                r22 = r1
                r1 = r0
                r0 = r22
            L_0x0208:
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
                r11 = r1
                goto L_0x0277
            L_0x020d:
                r6.F = r2
                r6.f3599B = r0
                r6.C = r1
                r6.D = r3
                r4 = 7
                r6.E = r4
                java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.t(r2, r9, r6, r8, r9)
                if (r4 != r7) goto L_0x021f
                return r7
            L_0x021f:
                r22 = r2
                r2 = r0
                r0 = r3
                r3 = r22
            L_0x0225:
                androidx.compose.foundation.gestures.LongPressResult r4 = (androidx.compose.foundation.gestures.LongPressResult) r4
                androidx.compose.foundation.gestures.LongPressResult$Success r5 = androidx.compose.foundation.gestures.LongPressResult.Success.f3525a
                boolean r5 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
                if (r5 == 0) goto L_0x0262
                kotlin.jvm.functions.Function1 r1 = r6
                long r4 = r0.h()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r4)
                r1.invoke(r0)
                r6.F = r2
                r6.f3599B = r9
                r6.C = r9
                r6.D = r9
                r0 = 8
                r6.E = r0
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.j(r3, r6)
                if (r0 != r7) goto L_0x024f
                return r7
            L_0x024f:
                r11 = r2
            L_0x0250:
                kotlinx.coroutines.CoroutineScope r10 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, r12, r13, r14, r15)
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x0262:
                boolean r0 = r4 instanceof androidx.compose.foundation.gestures.LongPressResult.Released
                if (r0 == 0) goto L_0x0270
                androidx.compose.foundation.gestures.LongPressResult$Released r4 = (androidx.compose.foundation.gestures.LongPressResult.Released) r4
                androidx.compose.ui.input.pointer.PointerInputChange r0 = r4.a()
                r11 = r2
                r2 = r0
                r0 = r1
                goto L_0x0277
            L_0x0270:
                boolean r0 = r4 instanceof androidx.compose.foundation.gestures.LongPressResult.Canceled
                if (r0 == 0) goto L_0x02b8
                r0 = r1
                r11 = r2
                r2 = r9
            L_0x0277:
                if (r2 == 0) goto L_0x0299
                r2.a()
                kotlinx.coroutines.CoroutineScope r10 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r13.<init>(r0, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, r12, r13, r14, r15)
                kotlin.jvm.functions.Function1 r0 = r7
                long r1 = r2.h()
                androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r1)
                r0.invoke(r1)
                goto L_0x02be
            L_0x0299:
                kotlinx.coroutines.CoroutineScope r10 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r9
                r13.<init>(r1, r9)
                r14 = 2
                r15 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r10, r11, r12, r13, r14, r15)
                kotlin.jvm.functions.Function1 r1 = r8
                if (r1 == 0) goto L_0x02be
                long r2 = r0.h()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r2)
                r1.invoke(r0)
                goto L_0x02be
            L_0x02b8:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L_0x02be:
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x02c1:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.F = pointerInputScope;
        this.G = function3;
        this.H = function1;
        this.I = function12;
        this.J = function13;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TapGestureDetectorKt$detectTapGestures$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.F, this.G, this.H, this.I, this.J, continuation);
        tapGestureDetectorKt$detectTapGestures$2.E = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            final PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.F);
            PointerInputScope pointerInputScope = this.F;
            final Function3 function3 = this.G;
            final Function1 function1 = this.H;
            final Function1 function12 = this.I;
            final Function1 function13 = this.J;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (ForEachGestureKt.e(pointerInputScope, r3, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
