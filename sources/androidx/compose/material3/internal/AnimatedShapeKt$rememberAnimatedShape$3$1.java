package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1", f = "AnimatedShape.kt", l = {140}, m = "invokeSuspend")
final class AnimatedShapeKt$rememberAnimatedShape$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Channel G;
    public final /* synthetic */ AnimatedShapeState H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedShapeKt$rememberAnimatedShape$3$1(Channel channel, AnimatedShapeState animatedShapeState, Continuation continuation) {
        super(2, continuation);
        this.G = channel;
        this.H = animatedShapeState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnimatedShapeKt$rememberAnimatedShape$3$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AnimatedShapeKt$rememberAnimatedShape$3$1 animatedShapeKt$rememberAnimatedShape$3$1 = new AnimatedShapeKt$rememberAnimatedShape$3$1(this.G, this.H, continuation);
        animatedShapeKt$rememberAnimatedShape$3$1.F = obj;
        return animatedShapeKt$rememberAnimatedShape$3$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.E
            r2 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.lang.Object r1 = r10.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r10.F
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r11)
        L_0x0016:
            r9 = r3
            goto L_0x003b
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0020:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.F
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            kotlinx.coroutines.channels.Channel r1 = r10.G
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r3 = r11
        L_0x002e:
            r10.F = r3
            r10.D = r1
            r10.E = r2
            java.lang.Object r11 = r1.a(r10)
            if (r11 != r0) goto L_0x0016
            return r0
        L_0x003b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0069
            java.lang.Object r11 = r1.next()
            androidx.compose.foundation.shape.RoundedCornerShape r11 = (androidx.compose.foundation.shape.RoundedCornerShape) r11
            kotlinx.coroutines.channels.Channel r3 = r10.G
            java.lang.Object r3 = r3.n()
            java.lang.Object r3 = kotlinx.coroutines.channels.ChannelResult.f(r3)
            androidx.compose.foundation.shape.RoundedCornerShape r3 = (androidx.compose.foundation.shape.RoundedCornerShape) r3
            if (r3 != 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r11 = r3
        L_0x0059:
            androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1 r6 = new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1
            androidx.compose.material3.internal.AnimatedShapeState r3 = r10.H
            r4 = 0
            r6.<init>(r3, r11, r4)
            r7 = 3
            r8 = 0
            r5 = 0
            r3 = r9
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r3, r4, r5, r6, r7, r8)
            goto L_0x002e
        L_0x0069:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.x(java.lang.Object):java.lang.Object");
    }
}
