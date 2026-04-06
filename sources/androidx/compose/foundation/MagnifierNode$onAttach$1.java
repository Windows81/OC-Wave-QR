package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
public final class MagnifierNode$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ MagnifierNode E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(MagnifierNode magnifierNode, Continuation continuation) {
        super(2, continuation);
        this.E = magnifierNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MagnifierNode$onAttach$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MagnifierNode$onAttach$1(this.E, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.D
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.b(r5)
            goto L_0x0045
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            kotlin.ResultKt.b(r5)
            goto L_0x0032
        L_0x001e:
            kotlin.ResultKt.b(r5)
        L_0x0021:
            androidx.compose.foundation.MagnifierNode r5 = r4.E
            kotlinx.coroutines.channels.Channel r5 = r5.e0
            if (r5 == 0) goto L_0x0032
            r4.D = r3
            java.lang.Object r5 = r5.v(r4)
            if (r5 != r0) goto L_0x0032
            return r0
        L_0x0032:
            androidx.compose.foundation.MagnifierNode r5 = r4.E
            androidx.compose.foundation.PlatformMagnifier r5 = r5.Z
            if (r5 == 0) goto L_0x0021
            androidx.compose.foundation.MagnifierNode$onAttach$1$1 r5 = androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.f3101z
            r4.D = r2
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.b(r5, r4)
            if (r5 != r0) goto L_0x0045
            return r0
        L_0x0045:
            androidx.compose.foundation.MagnifierNode r5 = r4.E
            androidx.compose.foundation.PlatformMagnifier r5 = r5.Z
            if (r5 == 0) goto L_0x0021
            r5.c()
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.x(java.lang.Object):java.lang.Object");
    }
}
