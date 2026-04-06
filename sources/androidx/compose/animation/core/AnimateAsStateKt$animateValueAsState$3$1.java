package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
public final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Channel G;
    public final /* synthetic */ Animatable H;
    public final /* synthetic */ State I;
    public final /* synthetic */ State J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(Channel channel, Animatable animatable, State state, State state2, Continuation continuation) {
        super(2, continuation);
        this.G = channel;
        this.H = animatable;
        this.I = state;
        this.J = state2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.G, this.H, this.I, this.J, continuation);
        animateAsStateKt$animateValueAsState$3$1.F = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.E
            r2 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.lang.Object r1 = r13.D
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r13.F
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r14)
            r4 = r14
            goto L_0x003d
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            kotlin.ResultKt.b(r14)
            java.lang.Object r1 = r13.F
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlinx.coroutines.channels.Channel r3 = r13.G
            kotlinx.coroutines.channels.ChannelIterator r3 = r3.iterator()
            r12 = r3
            r3 = r1
            r1 = r12
        L_0x0030:
            r13.F = r3
            r13.D = r1
            r13.E = r2
            java.lang.Object r4 = r1.a(r13)
            if (r4 != r0) goto L_0x003d
            return r0
        L_0x003d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r1.next()
            kotlinx.coroutines.channels.Channel r5 = r13.G
            java.lang.Object r5 = r5.n()
            java.lang.Object r5 = kotlinx.coroutines.channels.ChannelResult.f(r5)
            if (r5 != 0) goto L_0x0057
            r7 = r4
            goto L_0x0058
        L_0x0057:
            r7 = r5
        L_0x0058:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r4 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            androidx.compose.animation.core.Animatable r8 = r13.H
            androidx.compose.runtime.State r9 = r13.I
            androidx.compose.runtime.State r10 = r13.J
            r11 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r5 = r3
            r8 = r4
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r5, r6, r7, r8, r9, r10)
            goto L_0x0030
        L_0x006f:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.x(java.lang.Object):java.lang.Object");
    }
}
