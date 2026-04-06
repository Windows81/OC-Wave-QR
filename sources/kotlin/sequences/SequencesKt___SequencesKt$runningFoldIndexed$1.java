package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", l = {2339, 2344}, m = "invokeSuspend")
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41069B;
    public Object C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Sequence H;
    public final /* synthetic */ Function3 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, Sequence sequence, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.G = obj;
        this.H = sequence;
        this.I = function3;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.G, this.H, this.I, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.F = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.sequences.SequenceScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r8.D
            java.lang.Object r3 = r8.C
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.f41069B
            java.lang.Object r5 = r8.F
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.b(r9)
            r9 = r4
            r4 = r1
            goto L_0x004f
        L_0x0020:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0028:
            java.lang.Object r1 = r8.F
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.b(r9)
            goto L_0x0045
        L_0x0030:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.F
            r1 = r9
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            java.lang.Object r9 = r8.G
            r8.F = r1
            r8.E = r3
            java.lang.Object r9 = r1.c(r9, r8)
            if (r9 != r0) goto L_0x0045
            return r0
        L_0x0045:
            java.lang.Object r9 = r8.G
            kotlin.sequences.Sequence r3 = r8.H
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = r1
        L_0x004f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r3.next()
            kotlin.jvm.functions.Function3 r6 = r8.I
            int r7 = r4 + 1
            if (r4 >= 0) goto L_0x0062
            kotlin.collections.CollectionsKt.w()
        L_0x0062:
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.c(r4)
            java.lang.Object r4 = r6.d(r4, r9, r1)
            r8.F = r5
            r8.f41069B = r4
            r8.C = r3
            r8.D = r7
            r8.E = r2
            java.lang.Object r9 = r5.c(r4, r8)
            if (r9 != r0) goto L_0x007b
            return r0
        L_0x007b:
            r9 = r4
            r4 = r7
            goto L_0x004f
        L_0x007e:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
