package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", l = {350}, m = "invokeSuspend")
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41055B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Sequence F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function1 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$flatMapIndexed$1(Sequence sequence, Function2 function2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.F = sequence;
        this.G = function2;
        this.H = function1;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.F, this.G, this.H, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.E = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    public final Object x(Object obj) {
        int i2;
        SequenceScope sequenceScope;
        Iterator it;
        Object f2 = IntrinsicsKt.f();
        int i3 = this.D;
        if (i3 == 0) {
            ResultKt.b(obj);
            sequenceScope = (SequenceScope) this.E;
            i2 = 0;
            it = this.F.iterator();
        } else if (i3 == 1) {
            int i4 = this.C;
            it = (Iterator) this.f41055B;
            sequenceScope = (SequenceScope) this.E;
            ResultKt.b(obj);
            i2 = i4;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object next = it.next();
            Function2 function2 = this.G;
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            Object m2 = function2.m(Boxing.c(i2), next);
            this.E = sequenceScope;
            this.f41055B = it;
            this.C = i5;
            this.D = 1;
            if (sequenceScope.e((Iterator) this.H.invoke(m2), this) == f2) {
                return f2;
            }
            i2 = i5;
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
