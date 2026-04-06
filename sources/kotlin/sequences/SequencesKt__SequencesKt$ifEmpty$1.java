package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", l = {69, 71}, m = "invokeSuspend")
final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f41056B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Sequence D;
    public final /* synthetic */ Function0 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$ifEmpty$1(Sequence sequence, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.D = sequence;
        this.E = function0;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.D, this.E, continuation);
        sequencesKt__SequencesKt$ifEmpty$1.C = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.f41056B;
        if (i2 == 0) {
            ResultKt.b(obj);
            SequenceScope sequenceScope = (SequenceScope) this.C;
            Iterator it = this.D.iterator();
            if (it.hasNext()) {
                this.f41056B = 1;
                if (sequenceScope.e(it, this) == f2) {
                    return f2;
                }
            } else {
                this.f41056B = 2;
                if (sequenceScope.g((Sequence) this.E.invoke(), this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
