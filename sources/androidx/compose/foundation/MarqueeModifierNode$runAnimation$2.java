package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {402}, m = "invokeSuspend")
public final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ MarqueeModifierNode E;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {416, 418, 422, 422}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        public Object D;
        public int E;
        public /* synthetic */ Object F;

        /* renamed from: A */
        public final Object m(Float f2, Continuation continuation) {
            return ((AnonymousClass2) s(f2, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(marqueeModifierNode2, continuation);
            r0.F = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r22) {
            /*
                r21 = this;
                r9 = r21
                java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r9.E
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L_0x0043
                if (r0 == r2) goto L_0x0036
                if (r0 == r1) goto L_0x002e
                if (r0 == r12) goto L_0x0029
                if (r0 == r11) goto L_0x0020
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0020:
                java.lang.Object r0 = r9.F
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.b(r22)
                goto L_0x00d5
            L_0x0029:
                kotlin.ResultKt.b(r22)
                goto L_0x00bb
            L_0x002e:
                kotlin.ResultKt.b(r22)     // Catch:{ all -> 0x0033 }
                goto L_0x00a8
            L_0x0033:
                r0 = move-exception
                goto L_0x00be
            L_0x0036:
                java.lang.Object r0 = r9.D
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r2 = r9.F
                java.lang.Float r2 = (java.lang.Float) r2
                kotlin.ResultKt.b(r22)
                r3 = r0
                goto L_0x008d
            L_0x0043:
                kotlin.ResultKt.b(r22)
                java.lang.Object r0 = r9.F
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L_0x004f
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x004f:
                androidx.compose.foundation.MarqueeModifierNode r3 = r3
                int r15 = r3.N
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifierNode r3 = r3
                int r17 = r3.P
                androidx.compose.foundation.MarqueeModifierNode r3 = r3
                int r18 = r3.O
                androidx.compose.foundation.MarqueeModifierNode r3 = r3
                float r19 = r3.Q
                androidx.compose.foundation.MarqueeModifierNode r3 = r3
                androidx.compose.ui.unit.Density r20 = androidx.compose.ui.node.DelegatableNodeKt.k(r3)
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.b(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifierNode r4 = r3
                androidx.compose.animation.core.Animatable r4 = r4.Y
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.b(r14)
                r9.F = r0
                r9.D = r3
                r9.E = r2
                java.lang.Object r2 = r4.t(r5, r9)
                if (r2 != r10) goto L_0x008c
                return r10
            L_0x008c:
                r2 = r0
            L_0x008d:
                androidx.compose.foundation.MarqueeModifierNode r0 = r3     // Catch:{ all -> 0x0033 }
                androidx.compose.animation.core.Animatable r0 = r0.Y     // Catch:{ all -> 0x0033 }
                r9.F = r13     // Catch:{ all -> 0x0033 }
                r9.D = r13     // Catch:{ all -> 0x0033 }
                r9.E = r1     // Catch:{ all -> 0x0033 }
                r4 = 0
                r5 = 0
                r7 = 12
                r8 = 0
                r1 = r0
                r6 = r21
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.f(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0033 }
                if (r0 != r10) goto L_0x00a8
                return r10
            L_0x00a8:
                androidx.compose.foundation.MarqueeModifierNode r0 = r3
                androidx.compose.animation.core.Animatable r0 = r0.Y
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.b(r14)
                r9.E = r12
                java.lang.Object r0 = r0.t(r1, r9)
                if (r0 != r10) goto L_0x00bb
                return r10
            L_0x00bb:
                kotlin.Unit r0 = kotlin.Unit.f40552a
                return r0
            L_0x00be:
                androidx.compose.foundation.MarqueeModifierNode r1 = r3
                androidx.compose.animation.core.Animatable r1 = r1.Y
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.b(r14)
                r9.F = r0
                r9.D = r13
                r9.E = r11
                java.lang.Object r1 = r1.t(r2, r9)
                if (r1 != r10) goto L_0x00d5
                return r10
            L_0x00d5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2.x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, Continuation continuation) {
        super(2, continuation);
        this.E = marqueeModifierNode;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MarqueeModifierNode$runAnimation$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new MarqueeModifierNode$runAnimation$2(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final MarqueeModifierNode marqueeModifierNode = this.E;
            Flow q2 = SnapshotStateKt.q(new Function0<Float>() {
                /* renamed from: b */
                public final Float invoke() {
                    if (marqueeModifierNode.m3() <= marqueeModifierNode.l3()) {
                        return null;
                    }
                    if (!MarqueeAnimationMode.e(marqueeModifierNode.k3(), MarqueeAnimationMode.f3104b.a()) || marqueeModifierNode.o3()) {
                        return Float.valueOf((float) (marqueeModifierNode.m3() + marqueeModifierNode.p3()));
                    }
                    return null;
                }
            });
            final MarqueeModifierNode marqueeModifierNode2 = this.E;
            AnonymousClass2 r1 = new AnonymousClass2((Continuation) null);
            this.D = 1;
            if (FlowKt.l(q2, r1, this) == f2) {
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
