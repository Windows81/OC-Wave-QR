package kotlin.sequences;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", l = {145}, m = "invokeSuspend")
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41057B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Sequence E;
    public final /* synthetic */ Random F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(Sequence sequence, Random random, Continuation continuation) {
        super(2, continuation);
        this.E = sequence;
        this.F = random;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.E, this.F, continuation);
        sequencesKt__SequencesKt$shuffled$1.D = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    public final Object x(Object obj) {
        SequenceScope sequenceScope;
        List list;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.C;
        if (i2 == 0) {
            ResultKt.b(obj);
            list = SequencesKt___SequencesKt.E(this.E);
            sequenceScope = (SequenceScope) this.D;
        } else if (i2 == 1) {
            list = (List) this.f41057B;
            sequenceScope = (SequenceScope) this.D;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (!list.isEmpty()) {
            int i3 = this.F.i(list.size());
            Object K = CollectionsKt.K(list);
            if (i3 < list.size()) {
                K = list.set(i3, K);
            }
            this.D = sequenceScope;
            this.f41057B = list;
            this.C = 1;
            if (sequenceScope.c(K, this) == f2) {
                return f2;
            }
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt__SequencesKt$shuffled$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
