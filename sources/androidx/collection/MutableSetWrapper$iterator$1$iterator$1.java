package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
public final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f1919B;
    public Object C;
    public Object D;
    public int E;
    public int F;
    public int G;
    public int H;
    public long I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ MutableSetWrapper L;
    public final /* synthetic */ MutableSetWrapper$iterator$1 M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper mutableSetWrapper, MutableSetWrapper$iterator$1 mutableSetWrapper$iterator$1, Continuation continuation) {
        super(2, continuation);
        this.L = mutableSetWrapper;
        this.M = mutableSetWrapper$iterator$1;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.L, this.M, continuation);
        mutableSetWrapper$iterator$1$iterator$1.K = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    public final java.lang.Object x(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.J
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            int r2 = r0.H
            int r6 = r0.G
            long r7 = r0.I
            int r9 = r0.F
            int r10 = r0.E
            java.lang.Object r11 = r0.D
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.C
            androidx.collection.MutableSetWrapper r12 = (androidx.collection.MutableSetWrapper) r12
            java.lang.Object r13 = r0.f1919B
            androidx.collection.MutableSetWrapper$iterator$1 r13 = (androidx.collection.MutableSetWrapper$iterator$1) r13
            java.lang.Object r14 = r0.K
            kotlin.sequences.SequenceScope r14 = (kotlin.sequences.SequenceScope) r14
            kotlin.ResultKt.b(r23)
            goto L_0x00a9
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            kotlin.ResultKt.b(r23)
            java.lang.Object r2 = r0.K
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.collection.MutableSetWrapper r6 = r0.L
            androidx.collection.MutableScatterSet r6 = r6.f1915A
            androidx.collection.MutableSetWrapper$iterator$1 r7 = r0.M
            androidx.collection.MutableSetWrapper r8 = r0.L
            long[] r6 = r6.f1966a
            int r9 = r6.length
            int r9 = r9 + -2
            if (r9 < 0) goto L_0x00bc
            r10 = 0
        L_0x004f:
            r11 = r6[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00b7
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r11 = r6
            r12 = r8
            r6 = r13
            r13 = r7
            r7 = r19
            r21 = r10
            r10 = r9
            r9 = r21
        L_0x0075:
            if (r2 >= r6) goto L_0x00ac
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x00a9
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.b(r15)
            androidx.collection.MutableScatterSet r3 = r12.f1915A
            java.lang.Object[] r3 = r3.f1967b
            r3 = r3[r15]
            r0.K = r14
            r0.f1919B = r13
            r0.C = r12
            r0.D = r11
            r0.E = r10
            r0.F = r9
            r0.I = r7
            r0.G = r6
            r0.H = r2
            r0.J = r5
            java.lang.Object r3 = r14.c(r3, r0)
            if (r3 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L_0x0075
        L_0x00ac:
            if (r6 != r4) goto L_0x00bc
            r6 = r11
            r8 = r12
            r7 = r13
            r2 = r14
            r19 = r10
            r10 = r9
            r9 = r19
        L_0x00b7:
            if (r10 == r9) goto L_0x00bc
            int r10 = r10 + 1
            goto L_0x004f
        L_0x00bc:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((MutableSetWrapper$iterator$1$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
