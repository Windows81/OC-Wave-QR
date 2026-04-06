package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend")
public final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public boolean D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ PressGestureScope G;
    public final /* synthetic */ long H;
    public final /* synthetic */ MutableInteractionSource I;
    public final /* synthetic */ AbstractClickableNode J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j2, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, Continuation continuation) {
        super(2, continuation);
        this.G = pressGestureScope;
        this.H = j2;
        this.I = mutableInteractionSource;
        this.J = abstractClickableNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.G, this.H, this.I, this.J, continuation);
        abstractClickableNode$handlePressInteraction$2$1.F = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r7) goto L_0x0037
            if (r2 == r6) goto L_0x0031
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            kotlin.ResultKt.b(r17)
            goto L_0x00d1
        L_0x0028:
            java.lang.Object r2 = r0.F
            androidx.compose.foundation.interaction.PressInteraction$Release r2 = (androidx.compose.foundation.interaction.PressInteraction.Release) r2
            kotlin.ResultKt.b(r17)
            goto L_0x00a2
        L_0x0031:
            boolean r2 = r0.D
            kotlin.ResultKt.b(r17)
            goto L_0x0086
        L_0x0037:
            java.lang.Object r2 = r0.F
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlin.ResultKt.b(r17)
            r7 = r17
            goto L_0x006c
        L_0x0041:
            kotlin.ResultKt.b(r17)
            java.lang.Object r2 = r0.F
            r9 = r2
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 r2 = new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1
            androidx.compose.foundation.AbstractClickableNode r11 = r0.J
            long r12 = r0.H
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r0.I
            r15 = 0
            r10 = r2
            r10.<init>(r11, r12, r14, r15)
            r13 = 3
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = r2
            kotlinx.coroutines.Job r2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r9, r10, r11, r12, r13, r14)
            androidx.compose.foundation.gestures.PressGestureScope r9 = r0.G
            r0.F = r2
            r0.E = r7
            java.lang.Object r7 = r9.U1(r0)
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            boolean r9 = r2.b()
            if (r9 == 0) goto L_0x00af
            r0.F = r8
            r0.D = r7
            r0.E = r6
            java.lang.Object r2 = kotlinx.coroutines.JobKt.g(r2, r0)
            if (r2 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r2 = r7
        L_0x0086:
            if (r2 == 0) goto L_0x00d1
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r6 = r0.H
            r2.<init>(r6, r8)
            androidx.compose.foundation.interaction.PressInteraction$Release r3 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r3.<init>(r2)
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r0.I
            r0.F = r3
            r0.E = r5
            java.lang.Object r2 = r6.a(r2, r0)
            if (r2 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r2 = r3
        L_0x00a2:
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.I
            r0.F = r8
            r0.E = r4
            java.lang.Object r2 = r3.a(r2, r0)
            if (r2 != r1) goto L_0x00d1
            return r1
        L_0x00af:
            androidx.compose.foundation.AbstractClickableNode r2 = r0.J
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = r2.Z
            if (r2 == 0) goto L_0x00d1
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r0.I
            if (r7 == 0) goto L_0x00c1
            androidx.compose.foundation.interaction.PressInteraction$Release r5 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r5.<init>(r2)
            goto L_0x00c6
        L_0x00c1:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r5 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r5.<init>(r2)
        L_0x00c6:
            r0.F = r8
            r0.E = r3
            java.lang.Object r2 = r4.a(r5, r0)
            if (r2 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            androidx.compose.foundation.AbstractClickableNode r1 = r0.J
            r1.Z = r8
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.x(java.lang.Object):java.lang.Object");
    }
}
