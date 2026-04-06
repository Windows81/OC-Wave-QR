package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", l = {2873}, m = "invokeSuspend")
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41075B;
    public Object C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Sequence F;
    public final /* synthetic */ Function2 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(Sequence sequence, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = sequence;
        this.G = function2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.F, this.G, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.E = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.D
            r2 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r1 = r6.C
            java.lang.Object r3 = r6.f41075B
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r6.E
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.b(r7)
        L_0x0018:
            r7 = r1
            goto L_0x003f
        L_0x001a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0022:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.E
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.sequences.Sequence r1 = r6.F
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x0038
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0038:
            java.lang.Object r3 = r1.next()
            r4 = r7
            r7 = r3
            r3 = r1
        L_0x003f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r3.next()
            kotlin.jvm.functions.Function2 r5 = r6.G
            java.lang.Object r7 = r5.m(r7, r1)
            r6.E = r4
            r6.f41075B = r3
            r6.C = r1
            r6.D = r2
            java.lang.Object r7 = r4.c(r7, r6)
            if (r7 != r0) goto L_0x0018
            return r0
        L_0x005e:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
