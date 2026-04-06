package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata
public final class MutableEntries$iterator$1 implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f1870A = -1;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableEntries f1871B;

    /* renamed from: z  reason: collision with root package name */
    public Iterator f1872z;

    @Metadata
    @DebugMetadata(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", l = {1538}, m = "invokeSuspend")
    /* renamed from: androidx.collection.MutableEntries$iterator$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public Object f1873B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public int G;
        public int H;
        public long I;
        public int J;
        public /* synthetic */ Object K;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(mutableEntries, this, continuation);
            r0.K = obj;
            return r0;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00b7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00c0  */
        public final java.lang.Object x(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.J
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r5) goto L_0x002f
                int r2 = r0.H
                int r6 = r0.G
                long r7 = r0.I
                int r9 = r0.F
                int r10 = r0.E
                java.lang.Object r11 = r0.D
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.C
                androidx.collection.MutableEntries r12 = (androidx.collection.MutableEntries) r12
                java.lang.Object r13 = r0.f1873B
                androidx.collection.MutableEntries$iterator$1 r13 = (androidx.collection.MutableEntries$iterator$1) r13
                java.lang.Object r14 = r0.K
                kotlin.sequences.SequenceScope r14 = (kotlin.sequences.SequenceScope) r14
                kotlin.ResultKt.b(r23)
                r3 = r5
                goto L_0x00b8
            L_0x002f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0037:
                kotlin.ResultKt.b(r23)
                java.lang.Object r2 = r0.K
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                androidx.collection.MutableEntries r6 = r3
                androidx.collection.MutableScatterMap r6 = r6.f1869z
                androidx.collection.MutableEntries$iterator$1 r7 = r2
                androidx.collection.MutableEntries r8 = r3
                long[] r6 = r6.f1959a
                int r9 = r6.length
                int r9 = r9 + -2
                if (r9 < 0) goto L_0x00d5
                r10 = 0
            L_0x0050:
                r11 = r6[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L_0x00cd
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
            L_0x0076:
                if (r2 >= r6) goto L_0x00c0
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r7
                r17 = 128(0x80, double:6.32E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto L_0x00bb
                int r15 = r9 << 3
                int r15 = r15 + r2
                r13.e(r15)
                androidx.collection.MutableMapEntry r15 = new androidx.collection.MutableMapEntry
                androidx.collection.MutableScatterMap r3 = r12.f1869z
                java.lang.Object[] r3 = r3.f1960b
                androidx.collection.MutableScatterMap r4 = r12.f1869z
                java.lang.Object[] r4 = r4.f1961c
                int r5 = r13.b()
                r15.<init>(r3, r4, r5)
                r0.K = r14
                r0.f1873B = r13
                r0.C = r12
                r0.D = r11
                r0.E = r10
                r0.F = r9
                r0.I = r7
                r0.G = r6
                r0.H = r2
                r3 = 1
                r0.J = r3
                java.lang.Object r4 = r14.c(r15, r0)
                if (r4 != r1) goto L_0x00b8
                return r1
            L_0x00b8:
                r4 = 8
                goto L_0x00bc
            L_0x00bb:
                r3 = r5
            L_0x00bc:
                long r7 = r7 >> r4
                int r2 = r2 + r3
                r5 = r3
                goto L_0x0076
            L_0x00c0:
                r3 = r5
                if (r6 != r4) goto L_0x00d5
                r6 = r11
                r8 = r12
                r7 = r13
                r2 = r14
                r19 = r10
                r10 = r9
                r9 = r19
                goto L_0x00ce
            L_0x00cd:
                r3 = r5
            L_0x00ce:
                if (r10 == r9) goto L_0x00d5
                int r10 = r10 + 1
                r5 = r3
                goto L_0x0050
            L_0x00d5:
                kotlin.Unit r1 = kotlin.Unit.f40552a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries$iterator$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(SequenceScope sequenceScope, Continuation continuation) {
            return ((AnonymousClass1) s(sequenceScope, continuation)).x(Unit.f40552a);
        }
    }

    public MutableEntries$iterator$1(final MutableEntries mutableEntries) {
        this.f1871B = mutableEntries;
        this.f1872z = SequencesKt.a(new AnonymousClass1((Continuation) null));
    }

    public final int b() {
        return this.f1870A;
    }

    /* renamed from: c */
    public Map.Entry next() {
        return (Map.Entry) this.f1872z.next();
    }

    public final void e(int i2) {
        this.f1870A = i2;
    }

    public boolean hasNext() {
        return this.f1872z.hasNext();
    }

    public void remove() {
        if (this.f1870A != -1) {
            this.f1871B.f1869z.v(this.f1870A);
            this.f1870A = -1;
        }
    }
}
