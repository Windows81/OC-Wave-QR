package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {748, 751, 754}, m = "invokeSuspend")
public final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    public long D;
    public int E;
    public /* synthetic */ long F;
    public final /* synthetic */ ScrollingLogic G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation continuation) {
        super(2, continuation);
        this.G = scrollingLogic;
    }

    public final Object A(long j2, Continuation continuation) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) s(Velocity.b(j2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((Velocity) obj).o(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.G, continuation);
        scrollingLogic$onScrollStopped$performFling$1.F = ((Velocity) obj).o();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r13.E
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r3) goto L_0x002e
            if (r0 == r2) goto L_0x0024
            if (r0 != r1) goto L_0x001c
            long r0 = r13.D
            long r2 = r13.F
            kotlin.ResultKt.b(r14)
            r9 = r0
            r0 = r14
            goto L_0x0089
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            long r2 = r13.D
            long r4 = r13.F
            kotlin.ResultKt.b(r14)
            r0 = r14
            r7 = r4
            goto L_0x0068
        L_0x002e:
            long r3 = r13.F
            kotlin.ResultKt.b(r14)
            r0 = r14
            goto L_0x004c
        L_0x0035:
            kotlin.ResultKt.b(r14)
            long r4 = r13.F
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.G
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = r0.f3585f
            r13.F = r4
            r13.E = r3
            java.lang.Object r0 = r0.c(r4, r13)
            if (r0 != r6) goto L_0x004b
            return r6
        L_0x004b:
            r3 = r4
        L_0x004c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.o()
            long r7 = androidx.compose.ui.unit.Velocity.k(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.G
            r13.F = r3
            r13.D = r7
            r13.E = r2
            java.lang.Object r0 = r0.p(r7, r13)
            if (r0 != r6) goto L_0x0065
            return r6
        L_0x0065:
            r11 = r3
            r2 = r7
            r7 = r11
        L_0x0068:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.o()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.G
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = r0.f3585f
            long r2 = androidx.compose.ui.unit.Velocity.k(r2, r9)
            r13.F = r7
            r13.D = r9
            r13.E = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L_0x0088
            return r6
        L_0x0088:
            r2 = r7
        L_0x0089:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.o()
            long r0 = androidx.compose.ui.unit.Velocity.k(r9, r0)
            long r0 = androidx.compose.ui.unit.Velocity.k(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.x(java.lang.Object):java.lang.Object");
    }
}
