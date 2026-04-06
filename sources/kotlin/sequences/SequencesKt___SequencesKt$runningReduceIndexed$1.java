package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", l = {2397, 2401}, m = "invokeSuspend")
final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41071B;
    public Object C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Sequence G;
    public final /* synthetic */ Function3 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(Sequence sequence, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.G = sequence;
        this.H = function3;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.G, this.H, continuation);
        sequencesKt___SequencesKt$runningReduceIndexed$1.F = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.sequences.SequenceScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            int r1 = r9.D
            java.lang.Object r3 = r9.C
            java.lang.Object r4 = r9.f41071B
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r9.F
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.b(r10)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x005e
        L_0x0021:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0029:
            java.lang.Object r1 = r9.C
            java.lang.Object r4 = r9.f41071B
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r9.F
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.b(r10)
            goto L_0x005e
        L_0x0037:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.F
            r5 = r10
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.sequences.Sequence r10 = r9.G
            java.util.Iterator r4 = r10.iterator()
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x008d
            java.lang.Object r1 = r4.next()
            r9.F = r5
            r9.f41071B = r4
            r9.C = r1
            r9.E = r3
            java.lang.Object r10 = r5.c(r1, r9)
            if (r10 != r0) goto L_0x005e
            return r0
        L_0x005e:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x008d
            kotlin.jvm.functions.Function3 r10 = r9.H
            int r6 = r3 + 1
            if (r3 >= 0) goto L_0x006d
            kotlin.collections.CollectionsKt.w()
        L_0x006d:
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.c(r3)
            java.lang.Object r7 = r4.next()
            java.lang.Object r3 = r10.d(r3, r1, r7)
            r9.F = r5
            r9.f41071B = r4
            r9.C = r3
            r9.D = r6
            r9.E = r2
            java.lang.Object r10 = r5.c(r3, r9)
            if (r10 != r0) goto L_0x008a
            return r0
        L_0x008a:
            r1 = r3
            r3 = r6
            goto L_0x005e
        L_0x008d:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
