package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.collection.MutableKeys$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1622}, m = "invokeSuspend")
public final class MutableKeys$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f1888B;
    public int C;
    public int D;
    public int E;
    public int F;
    public long G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ MutableKeys J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableKeys$iterator$1$iterator$1(MutableKeys mutableKeys, Continuation continuation) {
        super(2, continuation);
        this.J = mutableKeys;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MutableKeys$iterator$1$iterator$1 mutableKeys$iterator$1$iterator$1 = new MutableKeys$iterator$1$iterator$1(this.J, continuation);
        mutableKeys$iterator$1$iterator$1.I = obj;
        return mutableKeys$iterator$1$iterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
    public final java.lang.Object x(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r5) goto L_0x0027
            int r2 = r0.F
            int r6 = r0.E
            long r7 = r0.G
            int r9 = r0.D
            int r10 = r0.C
            java.lang.Object r11 = r0.f1888B
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.I
            kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
            kotlin.ResultKt.b(r21)
            goto L_0x0091
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            kotlin.ResultKt.b(r21)
            java.lang.Object r2 = r0.I
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.collection.MutableKeys r6 = r0.J
            androidx.collection.MutableScatterMap r6 = r6.f1884z
            long[] r6 = r6.f1959a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x009f
            r8 = r3
        L_0x0044:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x009a
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r2
            r2 = r3
            r17 = r11
            r11 = r6
            r6 = r17
            r18 = r9
            r10 = r7
            r9 = r8
            r7 = r18
        L_0x0068:
            if (r2 >= r6) goto L_0x0094
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0091
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.Boxing.c(r13)
            r0.I = r12
            r0.f1888B = r11
            r0.C = r10
            r0.D = r9
            r0.G = r7
            r0.E = r6
            r0.F = r2
            r0.H = r5
            java.lang.Object r13 = r12.c(r13, r0)
            if (r13 != r1) goto L_0x0091
            return r1
        L_0x0091:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L_0x0068
        L_0x0094:
            if (r6 != r4) goto L_0x009f
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L_0x009a:
            if (r8 == r7) goto L_0x009f
            int r8 = r8 + 1
            goto L_0x0044
        L_0x009f:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys$iterator$1$iterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableKeys$iterator$1$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
