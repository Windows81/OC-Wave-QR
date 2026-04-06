package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.collection.Values$iterator$1", f = "ScatterMap.kt", l = {1446}, m = "invokeSuspend")
public final class Values$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super V>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f2005B;
    public Object C;
    public int D;
    public int E;
    public int F;
    public int G;
    public long H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Values K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Values$iterator$1(Values values, Continuation continuation) {
        super(2, continuation);
        this.K = values;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Values$iterator$1 values$iterator$1 = new Values$iterator$1(this.K, continuation);
        values$iterator$1.J = obj;
        return values$iterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    public final java.lang.Object x(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r5) goto L_0x002b
            int r2 = r0.G
            int r6 = r0.F
            long r7 = r0.H
            int r9 = r0.E
            int r10 = r0.D
            java.lang.Object r11 = r0.C
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f2005B
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.J
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.b(r21)
            goto L_0x0094
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            kotlin.ResultKt.b(r21)
            java.lang.Object r2 = r0.J
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.collection.Values r6 = r0.K
            androidx.collection.ScatterMap r6 = r6.f2004z
            java.lang.Object[] r7 = r6.f1961c
            long[] r6 = r6.f1959a
            int r8 = r6.length
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x00a2
            r9 = r3
        L_0x004a:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x009d
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L_0x006b:
            if (r2 >= r6) goto L_0x0097
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0094
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.J = r13
            r0.f2005B = r12
            r0.C = r11
            r0.D = r10
            r0.E = r9
            r0.H = r7
            r0.F = r6
            r0.G = r2
            r0.I = r5
            java.lang.Object r14 = r13.c(r14, r0)
            if (r14 != r1) goto L_0x0094
            return r1
        L_0x0094:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L_0x006b
        L_0x0097:
            if (r6 != r4) goto L_0x00a2
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L_0x009d:
            if (r9 == r8) goto L_0x00a2
            int r9 = r9 + 1
            goto L_0x004a
        L_0x00a2:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Values$iterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((Values$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
