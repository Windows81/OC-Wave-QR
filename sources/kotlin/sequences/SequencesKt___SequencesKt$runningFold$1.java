package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2311, 2315}, m = "invokeSuspend")
final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41068B;
    public Object C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Sequence G;
    public final /* synthetic */ Function2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(Object obj, Sequence sequence, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.F = obj;
        this.G = sequence;
        this.H = function2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.F, this.G, this.H, continuation);
        sequencesKt___SequencesKt$runningFold$1.E = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.sequences.SequenceScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.D
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r6.C
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r6.f41068B
            java.lang.Object r4 = r6.E
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.b(r7)
        L_0x001b:
            r7 = r3
            goto L_0x004c
        L_0x001d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0025:
            java.lang.Object r1 = r6.E
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.b(r7)
            goto L_0x0042
        L_0x002d:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.E
            r1 = r7
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            java.lang.Object r7 = r6.F
            r6.E = r1
            r6.D = r3
            java.lang.Object r7 = r1.c(r7, r6)
            if (r7 != r0) goto L_0x0042
            return r0
        L_0x0042:
            java.lang.Object r7 = r6.F
            kotlin.sequences.Sequence r3 = r6.G
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r3
        L_0x004c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r1.next()
            kotlin.jvm.functions.Function2 r5 = r6.H
            java.lang.Object r3 = r5.m(r7, r3)
            r6.E = r4
            r6.f41068B = r3
            r6.C = r1
            r6.D = r2
            java.lang.Object r7 = r4.c(r3, r6)
            if (r7 != r0) goto L_0x001b
            return r0
        L_0x006b:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt___SequencesKt$runningFold$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
