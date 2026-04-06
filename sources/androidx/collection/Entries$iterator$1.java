package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
public final class Entries$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<? extends K, ? extends V>>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f1732B;
    public Object C;
    public int D;
    public int E;
    public int F;
    public int G;
    public long H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Entries K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Entries$iterator$1(Entries entries, Continuation continuation) {
        super(2, continuation);
        this.K = entries;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Entries$iterator$1 entries$iterator$1 = new Entries$iterator$1(this.K, continuation);
        entries$iterator$1.J = obj;
        return entries$iterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    public final java.lang.Object x(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r5) goto L_0x002a
            int r2 = r0.G
            int r6 = r0.F
            long r7 = r0.H
            int r9 = r0.E
            int r10 = r0.D
            java.lang.Object r11 = r0.C
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f1732B
            androidx.collection.Entries r12 = (androidx.collection.Entries) r12
            java.lang.Object r13 = r0.J
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.b(r21)
            goto L_0x00a6
        L_0x002a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0032:
            kotlin.ResultKt.b(r21)
            java.lang.Object r2 = r0.J
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            androidx.collection.Entries r6 = r0.K
            androidx.collection.ScatterMap r6 = r6.f1731z
            androidx.collection.Entries r7 = r0.K
            long[] r6 = r6.f1959a
            int r8 = r6.length
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x00bd
            r9 = 0
        L_0x0049:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x00b6
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = 0
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L_0x006a:
            if (r2 >= r6) goto L_0x00ae
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a9
            int r14 = r9 << 3
            int r14 = r14 + r2
            androidx.collection.MapEntry r15 = new androidx.collection.MapEntry
            androidx.collection.ScatterMap r3 = r12.f1731z
            java.lang.Object[] r3 = r3.f1960b
            r3 = r3[r14]
            androidx.collection.ScatterMap r4 = r12.f1731z
            java.lang.Object[] r4 = r4.f1961c
            r4 = r4[r14]
            r15.<init>(r3, r4)
            r0.J = r13
            r0.f1732B = r12
            r0.C = r11
            r0.D = r10
            r0.E = r9
            r0.H = r7
            r0.F = r6
            r0.G = r2
            r0.I = r5
            java.lang.Object r3 = r13.c(r15, r0)
            if (r3 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r3 = 8
            goto L_0x00aa
        L_0x00a9:
            r3 = r4
        L_0x00aa:
            long r7 = r7 >> r3
            int r2 = r2 + r5
            r4 = r3
            goto L_0x006a
        L_0x00ae:
            r3 = r4
            if (r6 != r3) goto L_0x00bd
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
            goto L_0x00b7
        L_0x00b6:
            r3 = r4
        L_0x00b7:
            if (r9 == r8) goto L_0x00bd
            int r9 = r9 + 1
            r4 = r3
            goto L_0x0049
        L_0x00bd:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Entries$iterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((Entries$iterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
