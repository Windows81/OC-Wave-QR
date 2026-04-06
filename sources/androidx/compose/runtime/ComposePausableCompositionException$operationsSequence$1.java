package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {554}, m = "invokeSuspend")
public final class ComposePausableCompositionException$operationsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f14561B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ComposePausableCompositionException G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, Continuation continuation) {
        super(2, continuation);
        this.G = composePausableCompositionException;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.G, continuation);
        composePausableCompositionException$operationsSequence$1.F = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    public final Object x(Object obj) {
        int i2;
        SequenceScope sequenceScope;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        Object f2 = IntrinsicsKt.f();
        int i7 = this.E;
        if (i7 == 0) {
            ResultKt.b(obj);
            i4 = 0;
            sequenceScope = (SequenceScope) this.F;
            i2 = 0;
            i3 = 0;
        } else if (i7 == 1) {
            int i8 = this.D;
            int i9 = this.C;
            int i10 = this.f14561B;
            sequenceScope = (SequenceScope) this.F;
            ResultKt.b(obj);
            i2 = i9;
            i3 = i8;
            i4 = i10;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (i4 < Math.min(this.G.C, this.G.f14559B.f1784b)) {
            int i11 = i4 + 1;
            int e2 = this.G.f14559B.e(i4);
            switch (e2) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    int i12 = i2 + 1;
                    str = "down " + this.G.f14560z.d(i2);
                    i2 = i12;
                    break;
                case 2:
                    str = "remove " + this.G.f14559B.e(i11) + ' ' + this.G.f14559B.e(i4 + 2);
                    i11 = i4 + 3;
                    break;
                case 3:
                    str = "move " + this.G.f14559B.e(i11) + ' ' + this.G.f14559B.e(i4 + 2) + ' ' + this.G.f14559B.e(i4 + 3);
                    i11 = i4 + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    i5 = i4 + 2;
                    i6 = i2 + 1;
                    str = "insertBottomUp " + this.G.f14559B.e(i11) + ' ' + this.G.f14560z.d(i2);
                    break;
                case 6:
                    i5 = i4 + 2;
                    i6 = i2 + 1;
                    str = "insertTopDown " + this.G.f14559B.e(i11) + ' ' + this.G.f14560z.d(i2);
                    break;
                case 7:
                    int i13 = i2 + 1;
                    Object d2 = this.G.f14560z.d(i2);
                    Intrinsics.g(d2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                    i2 += 2;
                    str = "apply " + ((Function2) TypeIntrinsics.e(d2, 2)) + ' ' + this.G.f14560z.d(i13);
                    break;
                case 8:
                    str = "reuse " + this.G.f14558A.d(i3);
                    i3++;
                    break;
                default:
                    str = "unknown op: " + e2;
                    break;
            }
            i11 = i5;
            i2 = i6;
            String str2 = i4 + ": " + str;
            this.F = sequenceScope;
            this.f14561B = i11;
            this.C = i2;
            this.D = i3;
            this.E = 1;
            if (sequenceScope.c(str2, this) == f2) {
                return f2;
            }
            i4 = i11;
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((ComposePausableCompositionException$operationsSequence$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
