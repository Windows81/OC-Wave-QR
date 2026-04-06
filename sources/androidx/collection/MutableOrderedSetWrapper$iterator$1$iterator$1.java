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
@DebugMetadata(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
public final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f1912B;
    public Object C;
    public Object D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ MutableOrderedSetWrapper H;
    public final /* synthetic */ MutableOrderedSetWrapper$iterator$1 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper mutableOrderedSetWrapper, MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$1, Continuation continuation) {
        super(2, continuation);
        this.H = mutableOrderedSetWrapper;
        this.I = mutableOrderedSetWrapper$iterator$1;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.H, this.I, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.G = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    public final Object x(Object obj) {
        SequenceScope sequenceScope;
        MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$1;
        MutableOrderedSetWrapper mutableOrderedSetWrapper;
        long[] jArr;
        int i2;
        Object f2 = IntrinsicsKt.f();
        int i3 = this.F;
        if (i3 == 0) {
            ResultKt.b(obj);
            MutableOrderedScatterSet h2 = this.H.f1908A;
            MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$12 = this.I;
            mutableOrderedSetWrapper = this.H;
            long[] jArr2 = h2.f1950c;
            i2 = h2.f1952e;
            sequenceScope = (SequenceScope) this.G;
            long[] jArr3 = jArr2;
            mutableOrderedSetWrapper$iterator$1 = mutableOrderedSetWrapper$iterator$12;
            jArr = jArr3;
        } else if (i3 == 1) {
            i2 = this.E;
            jArr = (long[]) this.D;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.C;
            mutableOrderedSetWrapper$iterator$1 = (MutableOrderedSetWrapper$iterator$1) this.f1912B;
            sequenceScope = (SequenceScope) this.G;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (i2 != Integer.MAX_VALUE) {
            int i4 = (int) ((jArr[i2] >> 31) & 2147483647L);
            mutableOrderedSetWrapper$iterator$1.b(i2);
            Object obj2 = mutableOrderedSetWrapper.f1908A.f1949b[i2];
            this.G = sequenceScope;
            this.f1912B = mutableOrderedSetWrapper$iterator$1;
            this.C = mutableOrderedSetWrapper;
            this.D = jArr;
            this.E = i4;
            this.F = 1;
            if (sequenceScope.c(obj2, this) == f2) {
                return f2;
            }
            i2 = i4;
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
