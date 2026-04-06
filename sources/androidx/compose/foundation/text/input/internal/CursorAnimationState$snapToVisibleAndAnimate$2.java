package androidx.compose.foundation.text.input.internal;

import androidx.compose.animation.core.h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
public final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ CursorAnimationState F;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(job, cursorAnimationState, continuation);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[Catch:{ all -> 0x001d }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[Catch:{ all -> 0x001d }, RETURN] */
        public final java.lang.Object x(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.D
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L_0x0033
                if (r1 == r9) goto L_0x002f
                if (r1 == r8) goto L_0x002b
                if (r1 == r7) goto L_0x0027
                if (r1 != r6) goto L_0x001f
                kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x001d }
                goto L_0x0076
            L_0x001d:
                r11 = move-exception
                goto L_0x007c
            L_0x001f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0027:
                kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x001d }
                goto L_0x0068
            L_0x002b:
                kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x001d }
                goto L_0x0059
            L_0x002f:
                kotlin.ResultKt.b(r11)
                goto L_0x0043
            L_0x0033:
                kotlin.ResultKt.b(r11)
                kotlinx.coroutines.Job r11 = r9
                if (r11 == 0) goto L_0x0043
                r10.D = r9
                java.lang.Object r11 = kotlinx.coroutines.JobKt.g(r11, r10)
                if (r11 != r0) goto L_0x0043
                return r0
            L_0x0043:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r1     // Catch:{ all -> 0x001d }
                r11.f(r5)     // Catch:{ all -> 0x001d }
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r1     // Catch:{ all -> 0x001d }
                boolean r11 = r11.d()     // Catch:{ all -> 0x001d }
                if (r11 != 0) goto L_0x005f
                r10.D = r8     // Catch:{ all -> 0x001d }
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.a(r10)     // Catch:{ all -> 0x001d }
                if (r11 != r0) goto L_0x0059
                return r0
            L_0x0059:
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x001d }
                r11.<init>()     // Catch:{ all -> 0x001d }
                throw r11     // Catch:{ all -> 0x001d }
            L_0x005f:
                r10.D = r7     // Catch:{ all -> 0x001d }
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r10)     // Catch:{ all -> 0x001d }
                if (r11 != r0) goto L_0x0068
                return r0
            L_0x0068:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r1     // Catch:{ all -> 0x001d }
                r11.f(r2)     // Catch:{ all -> 0x001d }
                r10.D = r6     // Catch:{ all -> 0x001d }
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r10)     // Catch:{ all -> 0x001d }
                if (r11 != r0) goto L_0x0076
                return r0
            L_0x0076:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r1     // Catch:{ all -> 0x001d }
                r11.f(r5)     // Catch:{ all -> 0x001d }
                goto L_0x005f
            L_0x007c:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r1
                r0.f(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, Continuation continuation) {
        super(2, continuation);
        this.F = cursorAnimationState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.F, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.E = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            final Job job = (Job) this.F.f6177b.getAndSet((Object) null);
            AtomicReference a2 = this.F.f6177b;
            final CursorAnimationState cursorAnimationState = this.F;
            return Boxing.a(h.a(a2, (Object) null, BuildersKt__Builders_commonKt.d((CoroutineScope) this.E, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
