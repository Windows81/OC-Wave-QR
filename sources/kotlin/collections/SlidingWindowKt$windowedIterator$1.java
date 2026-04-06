package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<Object>>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f40643B;
    public Object C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Iterator I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i2, int i3, Iterator it, boolean z2, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.G = i2;
        this.H = i3;
        this.I = it;
        this.J = z2;
        this.K = z3;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.G, this.H, this.I, this.J, this.K, continuation);
        slidingWindowKt$windowedIterator$1.F = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0120 A[SYNTHETIC] */
    public final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r10.E
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0057
            if (r1 == r6) goto L_0x0044
            if (r1 == r5) goto L_0x003f
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0021:
            java.lang.Object r1 = r10.f40643B
            kotlin.collections.RingBuffer r1 = (kotlin.collections.RingBuffer) r1
            java.lang.Object r4 = r10.F
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.b(r11)
            goto L_0x0148
        L_0x002e:
            java.lang.Object r1 = r10.C
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r10.f40643B
            kotlin.collections.RingBuffer r5 = (kotlin.collections.RingBuffer) r5
            java.lang.Object r6 = r10.F
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.b(r11)
            goto L_0x011a
        L_0x003f:
            kotlin.ResultKt.b(r11)
            goto L_0x0163
        L_0x0044:
            int r1 = r10.D
            java.lang.Object r2 = r10.C
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r10.f40643B
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r10.F
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.b(r11)
        L_0x0055:
            r11 = r1
            goto L_0x00a5
        L_0x0057:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.F
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            int r1 = r10.G
            r8 = 1024(0x400, float:1.435E-42)
            int r1 = kotlin.ranges.RangesKt.j(r1, r8)
            int r8 = r10.H
            int r9 = r10.G
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x00d8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r1 = r10.I
            r3 = 0
            r4 = r11
            r11 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        L_0x007a:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = r2.next()
            if (r11 <= 0) goto L_0x0089
            int r11 = r11 + -1
            goto L_0x007a
        L_0x0089:
            r3.add(r8)
            int r8 = r3.size()
            int r9 = r10.G
            if (r8 != r9) goto L_0x007a
            r10.F = r4
            r10.f40643B = r3
            r10.C = r2
            r10.D = r1
            r10.E = r6
            java.lang.Object r11 = r4.c(r3, r10)
            if (r11 != r0) goto L_0x0055
            return r0
        L_0x00a5:
            boolean r1 = r10.J
            if (r1 == 0) goto L_0x00ad
            r3.clear()
            goto L_0x00b5
        L_0x00ad:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.G
            r1.<init>(r3)
            r3 = r1
        L_0x00b5:
            r1 = r11
            goto L_0x007a
        L_0x00b7:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x0163
            boolean r11 = r10.K
            if (r11 != 0) goto L_0x00c9
            int r11 = r3.size()
            int r1 = r10.G
            if (r11 != r1) goto L_0x0163
        L_0x00c9:
            r10.F = r7
            r10.f40643B = r7
            r10.C = r7
            r10.E = r5
            java.lang.Object r11 = r4.c(r3, r10)
            if (r11 != r0) goto L_0x0163
            return r0
        L_0x00d8:
            kotlin.collections.RingBuffer r5 = new kotlin.collections.RingBuffer
            r5.<init>(r1)
            java.util.Iterator r1 = r10.I
            r6 = r11
        L_0x00e0:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0120
            java.lang.Object r11 = r1.next()
            r5.o(r11)
            boolean r11 = r5.q()
            if (r11 == 0) goto L_0x00e0
            int r11 = r5.size()
            int r8 = r10.G
            if (r11 >= r8) goto L_0x0100
            kotlin.collections.RingBuffer r5 = r5.p(r8)
            goto L_0x00e0
        L_0x0100:
            boolean r11 = r10.J
            if (r11 == 0) goto L_0x0106
            r11 = r5
            goto L_0x010b
        L_0x0106:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
        L_0x010b:
            r10.F = r6
            r10.f40643B = r5
            r10.C = r1
            r10.E = r4
            java.lang.Object r11 = r6.c(r11, r10)
            if (r11 != r0) goto L_0x011a
            return r0
        L_0x011a:
            int r11 = r10.H
            r5.s(r11)
            goto L_0x00e0
        L_0x0120:
            boolean r11 = r10.K
            if (r11 == 0) goto L_0x0163
            r1 = r5
            r4 = r6
        L_0x0126:
            int r11 = r1.size()
            int r5 = r10.H
            if (r11 <= r5) goto L_0x014e
            boolean r11 = r10.J
            if (r11 == 0) goto L_0x0134
            r11 = r1
            goto L_0x0139
        L_0x0134:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r1)
        L_0x0139:
            r10.F = r4
            r10.f40643B = r1
            r10.C = r7
            r10.E = r3
            java.lang.Object r11 = r4.c(r11, r10)
            if (r11 != r0) goto L_0x0148
            return r0
        L_0x0148:
            int r11 = r10.H
            r1.s(r11)
            goto L_0x0126
        L_0x014e:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x0163
            r10.F = r7
            r10.f40643B = r7
            r10.C = r7
            r10.E = r2
            java.lang.Object r11 = r4.c(r1, r10)
            if (r11 != r0) goto L_0x0163
            return r0
        L_0x0163:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((SlidingWindowKt$windowedIterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
