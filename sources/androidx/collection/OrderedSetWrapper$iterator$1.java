package androidx.collection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
public final class OrderedSetWrapper$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f1958B;
    public Object C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ OrderedSetWrapper G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderedSetWrapper$iterator$1(OrderedSetWrapper orderedSetWrapper, Continuation continuation) {
        super(2, continuation);
        this.G = orderedSetWrapper;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new OrderedSetWrapper$iterator$1(this.G, continuation);
        orderedSetWrapper$iterator$1.F = obj;
        return orderedSetWrapper$iterator$1;
    }

    public final Object x(Object obj) {
        SequenceScope sequenceScope;
        Object[] objArr;
        long[] jArr;
        int i2;
        Object f2 = IntrinsicsKt.f();
        int i3 = this.E;
        if (i3 == 0) {
            ResultKt.b(obj);
            OrderedScatterSet e2 = this.G.f1957z;
            Object[] objArr2 = e2.f1949b;
            long[] jArr2 = e2.f1950c;
            i2 = e2.f1952e;
            sequenceScope = (SequenceScope) this.F;
            long[] jArr3 = jArr2;
            objArr = objArr2;
            jArr = jArr3;
        } else if (i3 == 1) {
            i2 = this.D;
            jArr = (long[]) this.C;
            objArr = (Object[]) this.f1958B;
            sequenceScope = (SequenceScope) this.F;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (i2 != Integer.MAX_VALUE) {
            int i4 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj2 = objArr[i2];
            this.F = sequenceScope;
            this.f1958B = objArr;
            this.C = jArr;
            this.D = i4;
            this.E = 1;
            if (sequenceScope.c(obj2, this) == f2) {
                return f2;
            }
            i2 = i4;
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((OrderedSetWrapper$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
