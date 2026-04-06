package kotlinx.coroutines.channels;

import androidx.concurrent.futures.a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

@Metadata
public class BufferedChannel<E> implements Channel<E> {
    public static final /* synthetic */ AtomicLongFieldUpdater C;
    public static final /* synthetic */ AtomicLongFieldUpdater D;
    public static final /* synthetic */ AtomicLongFieldUpdater E;
    public static final /* synthetic */ AtomicLongFieldUpdater F;
    public static final /* synthetic */ AtomicReferenceFieldUpdater G;
    public static final /* synthetic */ AtomicReferenceFieldUpdater H;
    public static final /* synthetic */ AtomicReferenceFieldUpdater I;
    public static final /* synthetic */ AtomicReferenceFieldUpdater J;
    public static final /* synthetic */ AtomicReferenceFieldUpdater K;

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f41461A;

    /* renamed from: B  reason: collision with root package name */
    public final Function3 f41462B;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: z  reason: collision with root package name */
    public final int f41463z;

    @Metadata
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {

        /* renamed from: A  reason: collision with root package name */
        public CancellableContinuationImpl f41464A;

        /* renamed from: z  reason: collision with root package name */
        public Object f41466z = BufferedChannelKt.f41486p;

        public BufferedChannelIterator() {
        }

        public Object a(Continuation continuation) {
            boolean z2 = true;
            if (this.f41466z == BufferedChannelKt.f41486p || this.f41466z == BufferedChannelKt.z()) {
                BufferedChannel bufferedChannel = BufferedChannel.this;
                ChannelSegment channelSegment = (ChannelSegment) BufferedChannel.H.get(bufferedChannel);
                while (true) {
                    if (bufferedChannel.D0()) {
                        z2 = g();
                        break;
                    }
                    long andIncrement = BufferedChannel.D.getAndIncrement(bufferedChannel);
                    int i2 = BufferedChannelKt.f41472b;
                    long j2 = andIncrement / ((long) i2);
                    int i3 = (int) (andIncrement % ((long) i2));
                    if (channelSegment.f41864B != j2) {
                        ChannelSegment j3 = bufferedChannel.g0(j2, channelSegment);
                        if (j3 == null) {
                            continue;
                        } else {
                            channelSegment = j3;
                        }
                    }
                    Object N = bufferedChannel.B1(channelSegment, i3, andIncrement, (Object) null);
                    if (N == BufferedChannelKt.f41483m) {
                        throw new IllegalStateException("unreachable");
                    } else if (N == BufferedChannelKt.f41485o) {
                        if (andIncrement < bufferedChannel.v0()) {
                            channelSegment.b();
                        }
                    } else if (N == BufferedChannelKt.f41484n) {
                        return f(channelSegment, i3, andIncrement, continuation);
                    } else {
                        channelSegment.b();
                        this.f41466z = N;
                    }
                }
            }
            return Boxing.a(z2);
        }

        public void c(Segment segment, int i2) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f41464A;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.c(segment, i2);
            }
        }

        public final Object f(ChannelSegment channelSegment, int i2, long j2, Continuation continuation) {
            Boolean a2;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl b2 = CancellableContinuationKt.b(IntrinsicsKt.c(continuation));
            try {
                this.f41464A = b2;
                Object N = bufferedChannel.B1(channelSegment, i2, j2, this);
                if (N == BufferedChannelKt.f41483m) {
                    bufferedChannel.a1(this, channelSegment, i2);
                } else {
                    Function3 function3 = null;
                    if (N == BufferedChannelKt.f41485o) {
                        if (j2 < bufferedChannel.v0()) {
                            channelSegment.b();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.H.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.D0()) {
                                h();
                                break;
                            }
                            long andIncrement = BufferedChannel.D.getAndIncrement(bufferedChannel);
                            int i3 = BufferedChannelKt.f41472b;
                            long j3 = andIncrement / ((long) i3);
                            int i4 = (int) (andIncrement % ((long) i3));
                            if (channelSegment2.f41864B != j3) {
                                ChannelSegment j4 = bufferedChannel.g0(j3, channelSegment2);
                                if (j4 != null) {
                                    channelSegment2 = j4;
                                }
                            }
                            Object N2 = bufferedChannel.B1(channelSegment2, i4, andIncrement, this);
                            if (N2 == BufferedChannelKt.f41483m) {
                                bufferedChannel.a1(this, channelSegment2, i4);
                                break;
                            } else if (N2 == BufferedChannelKt.f41485o) {
                                if (andIncrement < bufferedChannel.v0()) {
                                    channelSegment2.b();
                                }
                            } else if (N2 != BufferedChannelKt.f41484n) {
                                channelSegment2.b();
                                this.f41466z = N2;
                                this.f41464A = null;
                                a2 = Boxing.a(true);
                                Function1 function1 = bufferedChannel.f41461A;
                                if (function1 != null) {
                                    function3 = bufferedChannel.Q(function1, N2);
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        }
                    } else {
                        channelSegment.b();
                        this.f41466z = N;
                        this.f41464A = null;
                        a2 = Boxing.a(true);
                        Function1 function12 = bufferedChannel.f41461A;
                        if (function12 != null) {
                            function3 = bufferedChannel.Q(function12, N);
                        }
                    }
                    b2.w(a2, function3);
                }
                Object A2 = b2.A();
                if (A2 == IntrinsicsKt.f()) {
                    DebugProbesKt.c(continuation);
                }
                return A2;
            } catch (Throwable th) {
                b2.R();
                throw th;
            }
        }

        public final boolean g() {
            this.f41466z = BufferedChannelKt.z();
            Throwable l0 = BufferedChannel.this.l0();
            if (l0 == null) {
                return false;
            }
            throw StackTraceRecoveryKt.a(l0);
        }

        public final void h() {
            CancellableContinuationImpl cancellableContinuationImpl = this.f41464A;
            Intrinsics.f(cancellableContinuationImpl);
            this.f41464A = null;
            this.f41466z = BufferedChannelKt.z();
            Throwable l0 = BufferedChannel.this.l0();
            if (l0 == null) {
                Result.Companion companion = Result.f40519A;
                cancellableContinuationImpl.q(Result.b(Boolean.FALSE));
                return;
            }
            Result.Companion companion2 = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(ResultKt.a(l0)));
        }

        public final boolean i(Object obj) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f41464A;
            Intrinsics.f(cancellableContinuationImpl);
            Function3 function3 = null;
            this.f41464A = null;
            this.f41466z = obj;
            Boolean bool = Boolean.TRUE;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            Function1 function1 = bufferedChannel.f41461A;
            if (function1 != null) {
                function3 = bufferedChannel.Q(function1, obj);
            }
            return BufferedChannelKt.B(cancellableContinuationImpl, bool, function3);
        }

        public final void j() {
            CancellableContinuationImpl cancellableContinuationImpl = this.f41464A;
            Intrinsics.f(cancellableContinuationImpl);
            this.f41464A = null;
            this.f41466z = BufferedChannelKt.z();
            Throwable l0 = BufferedChannel.this.l0();
            if (l0 == null) {
                Result.Companion companion = Result.f40519A;
                cancellableContinuationImpl.q(Result.b(Boolean.FALSE));
                return;
            }
            Result.Companion companion2 = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(ResultKt.a(l0)));
        }

        public Object next() {
            Object obj = this.f41466z;
            if (obj != BufferedChannelKt.f41486p) {
                this.f41466z = BufferedChannelKt.f41486p;
                if (obj != BufferedChannelKt.z()) {
                    return obj;
                }
                throw StackTraceRecoveryKt.a(BufferedChannel.this.o0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
    }

    @Metadata
    public static final class SendBroadcast implements Waiter {

        /* renamed from: A  reason: collision with root package name */
        public final CancellableContinuation f41467A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ CancellableContinuationImpl f41468z;

        public SendBroadcast(CancellableContinuation cancellableContinuation) {
            Intrinsics.g(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f41468z = (CancellableContinuationImpl) cancellableContinuation;
            this.f41467A = cancellableContinuation;
        }

        public final CancellableContinuation a() {
            return this.f41467A;
        }

        public void c(Segment segment, int i2) {
            this.f41468z.c(segment, i2);
        }
    }

    static {
        Class<BufferedChannel> cls = BufferedChannel.class;
        C = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        D = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        E = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        F = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        G = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        H = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        I = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        J = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        K = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
    }

    public BufferedChannel(int i2, Function1 function1) {
        this.f41463z = i2;
        this.f41461A = function1;
        if (i2 >= 0) {
            this.bufferEnd$volatile = BufferedChannelKt.A(i2);
            this.completedExpandBuffersAndPauseFlag$volatile = j0();
            ChannelSegment channelSegment = new ChannelSegment(0, (ChannelSegment) null, this, 3);
            this.sendSegment$volatile = channelSegment;
            this.receiveSegment$volatile = channelSegment;
            if (H0()) {
                channelSegment = BufferedChannelKt.f41471a;
                Intrinsics.g(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = channelSegment;
            this.f41462B = function1 != null ? new a(this) : null;
            this._closeCause$volatile = BufferedChannelKt.f41489s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
    }

    public static final Unit T(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        OnUndeliveredElementKt.a(function1, obj, coroutineContext);
        return Unit.f40552a;
    }

    public static final Function3 Y0(BufferedChannel bufferedChannel, SelectInstance selectInstance, Object obj, Object obj2) {
        return new c(obj2, bufferedChannel, selectInstance);
    }

    public static final Unit Z0(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        if (obj != BufferedChannelKt.z()) {
            OnUndeliveredElementKt.a(bufferedChannel.f41461A, obj, selectInstance.f());
        }
        return Unit.f40552a;
    }

    public static /* synthetic */ Object g1(BufferedChannel bufferedChannel, Continuation continuation) {
        ChannelSegment channelSegment = (ChannelSegment) H.get(bufferedChannel);
        while (!bufferedChannel.D0()) {
            long andIncrement = D.getAndIncrement(bufferedChannel);
            int i2 = BufferedChannelKt.f41472b;
            long j2 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (channelSegment.f41864B != j2) {
                ChannelSegment j3 = bufferedChannel.g0(j2, channelSegment);
                if (j3 == null) {
                    continue;
                } else {
                    channelSegment = j3;
                }
            }
            Object N = bufferedChannel.B1(channelSegment, i3, andIncrement, (Object) null);
            if (N == BufferedChannelKt.f41483m) {
                throw new IllegalStateException("unexpected");
            } else if (N == BufferedChannelKt.f41485o) {
                if (andIncrement < bufferedChannel.v0()) {
                    channelSegment.b();
                }
            } else if (N == BufferedChannelKt.f41484n) {
                return bufferedChannel.j1(channelSegment, i3, andIncrement, continuation);
            } else {
                channelSegment.b();
                return N;
            }
        }
        throw StackTraceRecoveryKt.a(bufferedChannel.o0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object h1(kotlinx.coroutines.channels.BufferedChannel r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.E = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.C
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.E
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            kotlin.ResultKt.b(r14)
            kotlinx.coroutines.channels.ChannelResult r14 = (kotlinx.coroutines.channels.ChannelResult) r14
            java.lang.Object r13 = r14.l()
            goto L_0x00b2
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            kotlin.ResultKt.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = H
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
        L_0x0047:
            boolean r1 = r13.D0()
            if (r1 == 0) goto L_0x0058
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.f41493b
            java.lang.Throwable r13 = r13.l0()
            java.lang.Object r13 = r14.a(r13)
            goto L_0x00b2
        L_0x0058:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = D
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f41864B
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0077
            kotlinx.coroutines.channels.ChannelSegment r1 = r13.g0(r7, r14)
            if (r1 != 0) goto L_0x0076
            goto L_0x0047
        L_0x0076:
            r14 = r1
        L_0x0077:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.B1(r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41483m
            if (r1 == r7) goto L_0x00b3
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41485o
            if (r1 != r7) goto L_0x0098
            long r7 = r13.v0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0047
            r14.b()
            goto L_0x0047
        L_0x0098:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41484n
            if (r1 != r7) goto L_0x00a9
            r6.E = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.i1(r2, r3, r4, r6)
            if (r13 != r0) goto L_0x00b2
            return r0
        L_0x00a9:
            r14.b()
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.f41493b
            java.lang.Object r13 = r13.c(r1)
        L_0x00b2:
            return r13
        L_0x00b3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.h1(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object q1(BufferedChannel bufferedChannel, Object obj, Continuation continuation) {
        ChannelSegment channelSegment = (ChannelSegment) G.get(bufferedChannel);
        while (true) {
            long andIncrement = C.getAndIncrement(bufferedChannel);
            long j2 = 1152921504606846975L & andIncrement;
            boolean t2 = bufferedChannel.F0(andIncrement);
            int i2 = BufferedChannelKt.f41472b;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            if (channelSegment.f41864B != j3) {
                ChannelSegment k2 = bufferedChannel.h0(j3, channelSegment);
                if (k2 != null) {
                    channelSegment = k2;
                } else if (t2) {
                    Object U0 = bufferedChannel.U0(obj, continuation);
                    if (U0 == IntrinsicsKt.f()) {
                        return U0;
                    }
                }
            }
            int P = bufferedChannel.D1(channelSegment, i3, obj, j2, (Object) null, t2);
            if (P == 0) {
                channelSegment.b();
                break;
            } else if (P == 1) {
                break;
            } else if (P != 2) {
                if (P == 3) {
                    Object t1 = bufferedChannel.t1(channelSegment, i3, obj, j2, continuation);
                    if (t1 == IntrinsicsKt.f()) {
                        return t1;
                    }
                } else if (P == 4) {
                    if (j2 < bufferedChannel.r0()) {
                        channelSegment.b();
                    }
                    Object U02 = bufferedChannel.U0(obj, continuation);
                    if (U02 == IntrinsicsKt.f()) {
                        return U02;
                    }
                } else if (P == 5) {
                    channelSegment.b();
                }
            } else if (t2) {
                channelSegment.t();
                Object U03 = bufferedChannel.U0(obj, continuation);
                if (U03 == IntrinsicsKt.f()) {
                    return U03;
                }
            }
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r0 = kotlin.Result.f40519A;
        r9.q(kotlin.Result.b(kotlin.coroutines.jvm.internal.Boxing.a(true)));
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object s1(kotlinx.coroutines.channels.BufferedChannel r18, java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r8 = r18
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.G()
            kotlin.jvm.functions.Function1 r0 = r8.f41461A
            if (r0 != 0) goto L_0x00c8
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r11 = new kotlinx.coroutines.channels.BufferedChannel$SendBroadcast
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = G
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L_0x0022:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = C
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            boolean r14 = r8.F0(r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            long r2 = (long) r1
            long r2 = r12 / r2
            long r4 = (long) r1
            long r4 = r12 % r4
            int r15 = (int) r4
            long r4 = r0.f41864B
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r16 = 0
            if (r1 == 0) goto L_0x005f
            kotlinx.coroutines.channels.ChannelSegment r1 = r8.h0(r2, r0)
            if (r1 != 0) goto L_0x005d
            if (r14 == 0) goto L_0x0022
        L_0x004e:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r16)
            java.lang.Object r0 = kotlin.Result.b(r0)
            r9.q(r0)
            goto L_0x00ba
        L_0x005d:
            r7 = r1
            goto L_0x0060
        L_0x005f:
            r7 = r0
        L_0x0060:
            r0 = r18
            r1 = r7
            r2 = r15
            r3 = r19
            r4 = r12
            r6 = r11
            r17 = r7
            r7 = r14
            int r0 = r0.D1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b4
            if (r0 == r10) goto L_0x00a6
            r1 = 2
            if (r0 == r1) goto L_0x009a
            r1 = 3
            if (r0 == r1) goto L_0x0092
            r1 = 4
            if (r0 == r1) goto L_0x0086
            r1 = 5
            if (r0 == r1) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            r17.b()
        L_0x0083:
            r0 = r17
            goto L_0x0022
        L_0x0086:
            long r0 = r18.r0()
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r17.b()
            goto L_0x004e
        L_0x0092:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r14 == 0) goto L_0x00a0
            r17.t()
            goto L_0x004e
        L_0x00a0:
            r0 = r17
            r8.b1(r11, r0, r15)
            goto L_0x00ba
        L_0x00a6:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r10)
            java.lang.Object r0 = kotlin.Result.b(r0)
            r9.q(r0)
            goto L_0x00ba
        L_0x00b4:
            r0 = r17
            r0.b()
            goto L_0x00a6
        L_0x00ba:
            java.lang.Object r0 = r9.A()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r0 != r1) goto L_0x00c7
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r20)
        L_0x00c7:
            return r0
        L_0x00c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.s1(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void z0(BufferedChannel bufferedChannel, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                j2 = 1;
            }
            bufferedChannel.y0(j2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    public final void A0() {
        Object obj;
        AtomicReferenceFieldUpdater m0 = K;
        do {
            obj = m0.get(this);
        } while (!a.a(m0, this, obj, obj == null ? BufferedChannelKt.f41487q : BufferedChannelKt.f41488r));
        if (obj != null) {
            Function1 function1 = (Function1) TypeIntrinsics.e(obj, 1);
            ((Function1) obj).invoke(l0());
        }
    }

    public final boolean A1(ChannelSegment channelSegment, int i2, long j2) {
        while (true) {
            Object B2 = channelSegment.B(i2);
            if (B2 instanceof Waiter) {
                if (j2 < D.get(this)) {
                    if (channelSegment.v(i2, B2, new WaiterEB((Waiter) B2))) {
                        return true;
                    }
                } else if (channelSegment.v(i2, B2, BufferedChannelKt.f41477g)) {
                    if (x1(B2, channelSegment, i2)) {
                        channelSegment.F(i2, BufferedChannelKt.f41474d);
                        return true;
                    }
                    channelSegment.F(i2, BufferedChannelKt.f41480j);
                    channelSegment.C(i2, false);
                    return false;
                }
            } else if (B2 == BufferedChannelKt.f41480j) {
                return false;
            } else {
                if (B2 == null) {
                    if (channelSegment.v(i2, B2, BufferedChannelKt.f41475e)) {
                        return true;
                    }
                } else if (B2 == BufferedChannelKt.f41474d || B2 == BufferedChannelKt.f41478h || B2 == BufferedChannelKt.f41479i || B2 == BufferedChannelKt.f41481k || B2 == BufferedChannelKt.z()) {
                    return true;
                } else {
                    if (B2 != BufferedChannelKt.f41476f) {
                        throw new IllegalStateException(("Unexpected cell state: " + B2).toString());
                    }
                }
            }
        }
        return true;
    }

    public final boolean B0(ChannelSegment channelSegment, int i2, long j2) {
        Object B2;
        do {
            B2 = channelSegment.B(i2);
            if (B2 != null && B2 != BufferedChannelKt.f41475e) {
                if (B2 == BufferedChannelKt.f41474d) {
                    return true;
                }
                if (B2 == BufferedChannelKt.f41480j || B2 == BufferedChannelKt.z() || B2 == BufferedChannelKt.f41479i || B2 == BufferedChannelKt.f41478h) {
                    return false;
                }
                if (B2 == BufferedChannelKt.f41477g) {
                    return true;
                }
                return B2 != BufferedChannelKt.f41476f && j2 == r0();
            }
        } while (!channelSegment.v(i2, B2, BufferedChannelKt.f41478h));
        e0();
        return false;
    }

    public final Object B1(ChannelSegment channelSegment, int i2, long j2, Object obj) {
        Object B2 = channelSegment.B(i2);
        if (B2 == null) {
            if (j2 >= (C.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f41484n;
                }
                if (channelSegment.v(i2, B2, obj)) {
                    e0();
                    return BufferedChannelKt.f41483m;
                }
            }
        } else if (B2 == BufferedChannelKt.f41474d && channelSegment.v(i2, B2, BufferedChannelKt.f41479i)) {
            e0();
            return channelSegment.D(i2);
        }
        return C1(channelSegment, i2, j2, obj);
    }

    public final boolean C0(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            b0(j2 & 1152921504606846975L);
            if (z2 && x0()) {
                return false;
            }
        } else if (i2 == 3) {
            a0(j2 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i2).toString());
        }
        return true;
    }

    public final Object C1(ChannelSegment channelSegment, int i2, long j2, Object obj) {
        while (true) {
            Object B2 = channelSegment.B(i2);
            if (B2 == null || B2 == BufferedChannelKt.f41475e) {
                if (j2 < (C.get(this) & 1152921504606846975L)) {
                    if (channelSegment.v(i2, B2, BufferedChannelKt.f41478h)) {
                        e0();
                        return BufferedChannelKt.f41485o;
                    }
                } else if (obj == null) {
                    return BufferedChannelKt.f41484n;
                } else {
                    if (channelSegment.v(i2, B2, obj)) {
                        e0();
                        return BufferedChannelKt.f41483m;
                    }
                }
            } else if (B2 == BufferedChannelKt.f41474d) {
                if (channelSegment.v(i2, B2, BufferedChannelKt.f41479i)) {
                    e0();
                    return channelSegment.D(i2);
                }
            } else if (B2 == BufferedChannelKt.f41480j) {
                return BufferedChannelKt.f41485o;
            } else {
                if (B2 == BufferedChannelKt.f41478h) {
                    return BufferedChannelKt.f41485o;
                }
                if (B2 == BufferedChannelKt.z()) {
                    e0();
                    return BufferedChannelKt.f41485o;
                } else if (B2 != BufferedChannelKt.f41477g && channelSegment.v(i2, B2, BufferedChannelKt.f41476f)) {
                    boolean z2 = B2 instanceof WaiterEB;
                    if (z2) {
                        B2 = ((WaiterEB) B2).f41504a;
                    }
                    if (x1(B2, channelSegment, i2)) {
                        channelSegment.F(i2, BufferedChannelKt.f41479i);
                        e0();
                        return channelSegment.D(i2);
                    }
                    channelSegment.F(i2, BufferedChannelKt.f41480j);
                    channelSegment.C(i2, false);
                    if (z2) {
                        e0();
                    }
                    return BufferedChannelKt.f41485o;
                }
            }
        }
    }

    public boolean D0() {
        return E0(C.get(this));
    }

    public final int D1(ChannelSegment channelSegment, int i2, Object obj, long j2, Object obj2, boolean z2) {
        channelSegment.G(i2, obj);
        if (z2) {
            return E1(channelSegment, i2, obj, j2, obj2, z2);
        }
        Object B2 = channelSegment.B(i2);
        if (B2 == null) {
            if (V(j2)) {
                if (channelSegment.v(i2, (Object) null, BufferedChannelKt.f41474d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (channelSegment.v(i2, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (B2 instanceof Waiter) {
            channelSegment.w(i2);
            if (w1(B2, obj)) {
                channelSegment.F(i2, BufferedChannelKt.f41479i);
                W0();
                return 0;
            }
            if (channelSegment.x(i2, BufferedChannelKt.f41481k) != BufferedChannelKt.f41481k) {
                channelSegment.C(i2, true);
            }
            return 5;
        }
        return E1(channelSegment, i2, obj, j2, obj2, z2);
    }

    public final boolean E0(long j2) {
        return C0(j2, true);
    }

    public final int E1(ChannelSegment channelSegment, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object B2 = channelSegment.B(i2);
            if (B2 == null) {
                if (!V(j2) || z2) {
                    if (z2) {
                        if (channelSegment.v(i2, (Object) null, BufferedChannelKt.f41480j)) {
                            channelSegment.C(i2, false);
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (channelSegment.v(i2, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.v(i2, (Object) null, BufferedChannelKt.f41474d)) {
                    return 1;
                }
            } else if (B2 == BufferedChannelKt.f41475e) {
                if (channelSegment.v(i2, B2, BufferedChannelKt.f41474d)) {
                    return 1;
                }
            } else if (B2 == BufferedChannelKt.f41481k) {
                channelSegment.w(i2);
                return 5;
            } else if (B2 == BufferedChannelKt.f41478h) {
                channelSegment.w(i2);
                return 5;
            } else if (B2 == BufferedChannelKt.z()) {
                channelSegment.w(i2);
                c0();
                return 4;
            } else {
                channelSegment.w(i2);
                if (B2 instanceof WaiterEB) {
                    B2 = ((WaiterEB) B2).f41504a;
                }
                if (w1(B2, obj)) {
                    channelSegment.F(i2, BufferedChannelKt.f41479i);
                    W0();
                    return 0;
                }
                if (channelSegment.x(i2, BufferedChannelKt.f41481k) != BufferedChannelKt.f41481k) {
                    channelSegment.C(i2, true);
                }
                return 5;
            }
        }
    }

    public final boolean F0(long j2) {
        return C0(j2, false);
    }

    public final void F1(long j2) {
        long j3;
        AtomicLongFieldUpdater q0 = D;
        do {
            j3 = q0.get(this);
            if (j3 >= j2 || D.compareAndSet(this, j3, j2)) {
            }
            j3 = q0.get(this);
            return;
        } while (D.compareAndSet(this, j3, j2));
    }

    public boolean G0() {
        return false;
    }

    public final void G1(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater u0 = C;
        do {
            j3 = u0.get(this);
            j4 = 1152921504606846975L & j3;
            if (j4 < j2) {
            } else {
                return;
            }
        } while (!C.compareAndSet(this, j3, BufferedChannelKt.w(j4, (int) (j3 >> 60))));
    }

    public final boolean H0() {
        long j0 = j0();
        return j0 == 0 || j0 == Long.MAX_VALUE;
    }

    public final void H1(long j2) {
        long j3;
        long j4;
        if (!H0()) {
            do {
            } while (j0() <= j2);
            int g2 = BufferedChannelKt.f41473c;
            int i2 = 0;
            while (i2 < g2) {
                long j0 = j0();
                if (j0 != (F.get(this) & 4611686018427387903L) || j0 != j0()) {
                    i2++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater n0 = F;
            do {
                j3 = n0.get(this);
            } while (!n0.compareAndSet(this, j3, BufferedChannelKt.v(j3 & 4611686018427387903L, true)));
            while (true) {
                long j02 = j0();
                long j5 = F.get(this);
                long j6 = j5 & 4611686018427387903L;
                boolean z2 = (4611686018427387904L & j5) != 0;
                if (j02 == j6 && j02 == j0()) {
                    break;
                } else if (!z2) {
                    F.compareAndSet(this, j5, BufferedChannelKt.v(j6, true));
                }
            }
            AtomicLongFieldUpdater n02 = F;
            do {
                j4 = n02.get(this);
            } while (!n02.compareAndSet(this, j4, BufferedChannelKt.v(j4 & 4611686018427387903L, false)));
        }
    }

    public final long I0(ChannelSegment channelSegment) {
        do {
            int i2 = BufferedChannelKt.f41472b;
            while (true) {
                i2--;
                if (-1 < i2) {
                    long j2 = (channelSegment.f41864B * ((long) BufferedChannelKt.f41472b)) + ((long) i2);
                    if (j2 < r0()) {
                        return -1;
                    }
                    while (true) {
                        Object B2 = channelSegment.B(i2);
                        if (B2 == null || B2 == BufferedChannelKt.f41475e) {
                            if (channelSegment.v(i2, B2, BufferedChannelKt.z())) {
                                channelSegment.t();
                                break;
                            }
                        } else if (B2 == BufferedChannelKt.f41474d) {
                            return j2;
                        }
                    }
                } else {
                    channelSegment = (ChannelSegment) channelSegment.h();
                }
            }
        } while (channelSegment != null);
        return -1;
    }

    public final void J0() {
        long j2;
        AtomicLongFieldUpdater u0 = C;
        do {
            j2 = u0.get(this);
            if (((int) (j2 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!u0.compareAndSet(this, j2, BufferedChannelKt.w(1152921504606846975L & j2, 1)));
    }

    public void K(Function1 function1) {
        if (!a.a(K, this, (Object) null, function1)) {
            AtomicReferenceFieldUpdater m0 = K;
            do {
                Object obj = m0.get(this);
                if (obj != BufferedChannelKt.f41487q) {
                    if (obj == BufferedChannelKt.f41488r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!a.a(K, this, BufferedChannelKt.f41487q, BufferedChannelKt.f41488r));
            function1.invoke(l0());
        }
    }

    public final void K0() {
        long j2;
        AtomicLongFieldUpdater u0 = C;
        do {
            j2 = u0.get(this);
        } while (!u0.compareAndSet(this, j2, BufferedChannelKt.w(1152921504606846975L & j2, 3)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return kotlinx.coroutines.channels.ChannelResult.f41493b.c(kotlin.Unit.f40552a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object L(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = C
            long r0 = r0.get(r14)
            boolean r0 = r14.u1(r0)
            if (r0 == 0) goto L_0x0015
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.f41493b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0015:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.f41480j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = G
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L_0x0023:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = C
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.F0(r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f41864B
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005b
            kotlinx.coroutines.channels.ChannelSegment r1 = r14.h0(r2, r0)
            if (r1 != 0) goto L_0x0059
            if (r11 == 0) goto L_0x0023
        L_0x004d:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.f41493b
            java.lang.Throwable r0 = r14.s0()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00bc
        L_0x0059:
            r13 = r1
            goto L_0x005c
        L_0x005b:
            r13 = r0
        L_0x005c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.D1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b8
            r1 = 1
            if (r0 == r1) goto L_0x00af
            r1 = 2
            if (r0 == r1) goto L_0x0092
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r1 = 4
            if (r0 == r1) goto L_0x007e
            r1 = 5
            if (r0 == r1) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r13.b()
        L_0x007c:
            r0 = r13
            goto L_0x0023
        L_0x007e:
            long r0 = r14.r0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x004d
            r13.b()
            goto L_0x004d
        L_0x008a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L_0x0092:
            if (r11 == 0) goto L_0x0098
            r13.t()
            goto L_0x004d
        L_0x0098:
            boolean r15 = r8 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto L_0x009f
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r8 == 0) goto L_0x00a5
            r14.b1(r8, r13, r12)
        L_0x00a5:
            r13.t()
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.f41493b
            java.lang.Object r15 = r15.b()
            goto L_0x00bc
        L_0x00af:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.f41493b
            kotlin.Unit r0 = kotlin.Unit.f40552a
            java.lang.Object r15 = r15.c(r0)
            goto L_0x00bc
        L_0x00b8:
            r13.b()
            goto L_0x00af
        L_0x00bc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.L(java.lang.Object):java.lang.Object");
    }

    public final void L0() {
        long j2;
        long b2;
        AtomicLongFieldUpdater u0 = C;
        do {
            j2 = u0.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                b2 = BufferedChannelKt.w(j2 & 1152921504606846975L, 2);
            } else if (i2 == 1) {
                b2 = BufferedChannelKt.w(j2 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!u0.compareAndSet(this, j2, b2));
    }

    public final void M0(long j2, ChannelSegment channelSegment) {
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        while (channelSegment.f41864B < j2 && (channelSegment3 = (ChannelSegment) channelSegment.f()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.k() || (channelSegment2 = (ChannelSegment) channelSegment.f()) == null) {
                AtomicReferenceFieldUpdater k0 = I;
                while (true) {
                    Segment segment = (Segment) k0.get(this);
                    if (segment.f41864B < channelSegment.f41864B) {
                        if (!channelSegment.u()) {
                            continue;
                            break;
                        } else if (a.a(k0, this, segment, channelSegment)) {
                            if (segment.p()) {
                                segment.n();
                                return;
                            }
                            return;
                        } else if (channelSegment.p()) {
                            channelSegment.n();
                        }
                    } else {
                        return;
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    public final void N0(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f41461A;
        Intrinsics.f(function1);
        Object f2 = ChannelResult.f(obj);
        Intrinsics.f(f2);
        OnUndeliveredElementKt.a(function1, f2, coroutineContext);
    }

    public Object O(Object obj, Continuation continuation) {
        return q1(this, obj, continuation);
    }

    public final void O0(Throwable th, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f41461A;
        Intrinsics.f(function1);
        OnUndeliveredElementKt.a(function1, obj, coroutineContext);
    }

    public void P0() {
    }

    public final Function3 Q(Function1 function1, Object obj) {
        return new b(function1, obj);
    }

    public final void Q0(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ChannelResult.b(ChannelResult.f41493b.a(l0()))));
    }

    public boolean R() {
        return F0(C.get(this));
    }

    public final void R0(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(o0())));
    }

    public final KFunction S(Function1 function1) {
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    public final void S0(SelectInstance selectInstance) {
        selectInstance.h(BufferedChannelKt.z());
    }

    public final void T0(Object obj, SelectInstance selectInstance) {
        Function1 function1 = this.f41461A;
        if (function1 != null) {
            OnUndeliveredElementKt.a(function1, obj, selectInstance.f());
        }
        selectInstance.h(BufferedChannelKt.z());
    }

    public final KFunction U(Function1 function1) {
        return new BufferedChannel$bindCancellationFunResult$1(this);
    }

    public final Object U0(Object obj, Continuation continuation) {
        UndeliveredElementException c2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        Function1 function1 = this.f41461A;
        if (function1 == null || (c2 = OnUndeliveredElementKt.c(function1, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            Throwable s0 = s0();
            Result.Companion companion = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(ResultKt.a(s0)));
        } else {
            ExceptionsKt.a(c2, s0());
            Result.Companion companion2 = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(ResultKt.a(c2)));
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public final boolean V(long j2) {
        return j2 < j0() || j2 < r0() + ((long) this.f41463z);
    }

    public final void V0(Object obj, CancellableContinuation cancellableContinuation) {
        Function1 function1 = this.f41461A;
        if (function1 != null) {
            OnUndeliveredElementKt.a(function1, obj, cancellableContinuation.f());
        }
        Throwable s0 = s0();
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(s0)));
    }

    public boolean W(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return Z(th, true);
    }

    public void W0() {
    }

    public final void X(ChannelSegment channelSegment, long j2) {
        Object b2 = InlineList.b((Object) null, 1, (DefaultConstructorMarker) null);
        loop0:
        while (channelSegment != null) {
            for (int i2 = BufferedChannelKt.f41472b - 1; -1 < i2; i2--) {
                if ((channelSegment.f41864B * ((long) BufferedChannelKt.f41472b)) + ((long) i2) < j2) {
                    break loop0;
                }
                while (true) {
                    Object B2 = channelSegment.B(i2);
                    if (B2 == null || B2 == BufferedChannelKt.f41475e) {
                        if (channelSegment.v(i2, B2, BufferedChannelKt.z())) {
                            channelSegment.t();
                            break;
                        }
                    } else if (B2 instanceof WaiterEB) {
                        if (channelSegment.v(i2, B2, BufferedChannelKt.z())) {
                            b2 = InlineList.e(b2, ((WaiterEB) B2).f41504a);
                            channelSegment.C(i2, true);
                            break;
                        }
                    } else if (!(B2 instanceof Waiter)) {
                        break;
                    } else if (channelSegment.v(i2, B2, BufferedChannelKt.z())) {
                        b2 = InlineList.e(b2, B2);
                        channelSegment.C(i2, true);
                        break;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.h();
        }
        if (b2 == null) {
            return;
        }
        if (!(b2 instanceof ArrayList)) {
            n1((Waiter) b2);
            return;
        }
        Intrinsics.g(b2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList arrayList = (ArrayList) b2;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            n1((Waiter) arrayList.get(size));
        }
    }

    public void X0() {
    }

    public final ChannelSegment Y() {
        ChannelSegment channelSegment = I.get(this);
        ChannelSegment channelSegment2 = (ChannelSegment) G.get(this);
        if (channelSegment2.f41864B > ((ChannelSegment) channelSegment).f41864B) {
            channelSegment = channelSegment2;
        }
        ChannelSegment channelSegment3 = (ChannelSegment) H.get(this);
        if (channelSegment3.f41864B > ((ChannelSegment) channelSegment).f41864B) {
            channelSegment = channelSegment3;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.b((ConcurrentLinkedListNode) channelSegment);
    }

    public boolean Z(Throwable th, boolean z2) {
        if (z2) {
            J0();
        }
        boolean a2 = a.a(J, this, BufferedChannelKt.f41489s, th);
        if (z2) {
            K0();
        } else {
            L0();
        }
        c0();
        P0();
        if (a2) {
            A0();
        }
        return a2;
    }

    public final void a0(long j2) {
        m1(b0(j2));
    }

    public final void a1(Waiter waiter, ChannelSegment channelSegment, int i2) {
        X0();
        waiter.c(channelSegment, i2);
    }

    public final ChannelSegment b0(long j2) {
        ChannelSegment Y = Y();
        if (G0()) {
            long I0 = I0(Y);
            if (I0 != -1) {
                d0(I0);
            }
        }
        X(Y, j2);
        return Y;
    }

    public final void b1(Waiter waiter, ChannelSegment channelSegment, int i2) {
        waiter.c(channelSegment, i2 + BufferedChannelKt.f41472b);
    }

    public final void c(CancellationException cancellationException) {
        W(cancellationException);
    }

    public final void c0() {
        R();
    }

    public final Object c1(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.z()) {
            return obj2;
        }
        throw o0();
    }

    public final void d0(long j2) {
        UndeliveredElementException c2;
        ChannelSegment channelSegment = (ChannelSegment) H.get(this);
        while (true) {
            long j3 = D.get(this);
            if (j2 >= Math.max(((long) this.f41463z) + j3, j0())) {
                if (D.compareAndSet(this, j3, j3 + 1)) {
                    int i2 = BufferedChannelKt.f41472b;
                    long j4 = j3 / ((long) i2);
                    int i3 = (int) (j3 % ((long) i2));
                    if (channelSegment.f41864B != j4) {
                        ChannelSegment g0 = g0(j4, channelSegment);
                        if (g0 == null) {
                            continue;
                        } else {
                            channelSegment = g0;
                        }
                    }
                    Object B1 = B1(channelSegment, i3, j3, (Object) null);
                    if (B1 != BufferedChannelKt.f41485o) {
                        channelSegment.b();
                        Function1 function1 = this.f41461A;
                        if (!(function1 == null || (c2 = OnUndeliveredElementKt.c(function1, B1, (UndeliveredElementException) null, 2, (Object) null)) == null)) {
                            throw c2;
                        }
                    } else if (j3 < v0()) {
                        channelSegment.b();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object d1(Object obj, Object obj2) {
        return ChannelResult.b(obj2 == BufferedChannelKt.z() ? ChannelResult.f41493b.a(l0()) : ChannelResult.f41493b.c(obj2));
    }

    public final void e0() {
        if (!H0()) {
            ChannelSegment channelSegment = (ChannelSegment) I.get(this);
            while (true) {
                long andIncrement = E.getAndIncrement(this);
                int i2 = BufferedChannelKt.f41472b;
                long j2 = andIncrement / ((long) i2);
                if (v0() <= andIncrement) {
                    if (channelSegment.f41864B < j2 && channelSegment.f() != null) {
                        M0(j2, channelSegment);
                    }
                    z0(this, 0, 1, (Object) null);
                    return;
                }
                if (channelSegment.f41864B != j2) {
                    ChannelSegment f0 = f0(j2, channelSegment, andIncrement);
                    if (f0 == null) {
                        continue;
                    } else {
                        channelSegment = f0;
                    }
                }
                if (z1(channelSegment, (int) (andIncrement % ((long) i2)), andIncrement)) {
                    z0(this, 0, 1, (Object) null);
                    return;
                }
                z0(this, 0, 1, (Object) null);
            }
        }
    }

    public final Object e1(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.z()) {
            return obj2;
        }
        if (l0() == null) {
            return null;
        }
        throw o0();
    }

    public final ChannelSegment f0(long j2, ChannelSegment channelSegment, long j3) {
        Object c2;
        long j4 = j2;
        AtomicReferenceFieldUpdater k0 = I;
        Function2 function2 = (Function2) BufferedChannelKt.y();
        ChannelSegment channelSegment2 = channelSegment;
        loop0:
        while (true) {
            c2 = ConcurrentLinkedListKt.c(channelSegment2, j4, function2);
            if (SegmentOrClosed.e(c2)) {
                break;
            }
            Segment c3 = SegmentOrClosed.c(c2);
            while (true) {
                Segment segment = (Segment) k0.get(this);
                if (segment.f41864B >= c3.f41864B) {
                    break loop0;
                } else if (c3.u()) {
                    if (a.a(k0, this, segment, c3)) {
                        if (segment.p()) {
                            segment.n();
                        }
                    } else if (c3.p()) {
                        c3.n();
                    }
                }
            }
        }
        if (SegmentOrClosed.e(c2)) {
            c0();
            M0(j2, channelSegment);
            z0(this, 0, 1, (Object) null);
            return null;
        }
        ChannelSegment channelSegment3 = (ChannelSegment) SegmentOrClosed.c(c2);
        if (channelSegment3.f41864B <= j4) {
            return channelSegment3;
        }
        long j5 = channelSegment3.f41864B;
        int i2 = BufferedChannelKt.f41472b;
        if (E.compareAndSet(this, j3 + 1, j5 * ((long) i2))) {
            y0((channelSegment3.f41864B * ((long) i2)) - j3);
            return null;
        }
        z0(this, 0, 1, (Object) null);
        return null;
    }

    public final Object f1(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.z()) {
            return this;
        }
        throw s0();
    }

    public final ChannelSegment g0(long j2, ChannelSegment channelSegment) {
        Object c2;
        AtomicReferenceFieldUpdater p0 = H;
        Function2 function2 = (Function2) BufferedChannelKt.y();
        loop0:
        while (true) {
            c2 = ConcurrentLinkedListKt.c(channelSegment, j2, function2);
            if (SegmentOrClosed.e(c2)) {
                break;
            }
            Segment c3 = SegmentOrClosed.c(c2);
            while (true) {
                Segment segment = (Segment) p0.get(this);
                if (segment.f41864B >= c3.f41864B) {
                    break loop0;
                } else if (c3.u()) {
                    if (a.a(p0, this, segment, c3)) {
                        if (segment.p()) {
                            segment.n();
                        }
                    } else if (c3.p()) {
                        c3.n();
                    }
                }
            }
        }
        if (SegmentOrClosed.e(c2)) {
            c0();
            if (channelSegment.f41864B * ((long) BufferedChannelKt.f41472b) >= v0()) {
                return null;
            }
            channelSegment.b();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.c(c2);
        if (!H0() && j2 <= j0() / ((long) BufferedChannelKt.f41472b)) {
            AtomicReferenceFieldUpdater k0 = I;
            while (true) {
                Segment segment2 = (Segment) k0.get(this);
                if (segment2.f41864B >= channelSegment2.f41864B || !channelSegment2.u()) {
                    break;
                } else if (a.a(k0, this, segment2, channelSegment2)) {
                    if (segment2.p()) {
                        segment2.n();
                    }
                } else if (channelSegment2.p()) {
                    channelSegment2.n();
                }
            }
        }
        long j3 = channelSegment2.f41864B;
        if (j3 <= j2) {
            return channelSegment2;
        }
        int i2 = BufferedChannelKt.f41472b;
        F1(j3 * ((long) i2));
        if (channelSegment2.f41864B * ((long) i2) >= v0()) {
            return null;
        }
        channelSegment2.b();
        return null;
    }

    public SelectClause1 h() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.I;
        Intrinsics.g(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.I;
        Intrinsics.g(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.e(bufferedChannel$onReceive$1, 3), (Function3) TypeIntrinsics.e(bufferedChannel$onReceive$2, 3), this.f41462B);
    }

    public final ChannelSegment h0(long j2, ChannelSegment channelSegment) {
        Object c2;
        AtomicReferenceFieldUpdater t0 = G;
        Function2 function2 = (Function2) BufferedChannelKt.y();
        loop0:
        while (true) {
            c2 = ConcurrentLinkedListKt.c(channelSegment, j2, function2);
            if (SegmentOrClosed.e(c2)) {
                break;
            }
            Segment c3 = SegmentOrClosed.c(c2);
            while (true) {
                Segment segment = (Segment) t0.get(this);
                if (segment.f41864B >= c3.f41864B) {
                    break loop0;
                } else if (c3.u()) {
                    if (a.a(t0, this, segment, c3)) {
                        if (segment.p()) {
                            segment.n();
                        }
                    } else if (c3.p()) {
                        c3.n();
                    }
                }
            }
        }
        if (SegmentOrClosed.e(c2)) {
            c0();
            if (channelSegment.f41864B * ((long) BufferedChannelKt.f41472b) >= r0()) {
                return null;
            }
            channelSegment.b();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.c(c2);
        long j3 = channelSegment2.f41864B;
        if (j3 <= j2) {
            return channelSegment2;
        }
        int i2 = BufferedChannelKt.f41472b;
        G1(j3 * ((long) i2));
        if (channelSegment2.f41864B * ((long) i2) >= r0()) {
            return null;
        }
        channelSegment2.b();
        return null;
    }

    public SelectClause1 i() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.I;
        Intrinsics.g(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.I;
        Intrinsics.g(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.e(bufferedChannel$onReceiveCatching$1, 3), (Function3) TypeIntrinsics.e(bufferedChannel$onReceiveCatching$2, 3), this.f41462B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i1(kotlinx.coroutines.channels.ChannelSegment r11, int r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.D
            kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11
            java.lang.Object r11 = r0.C
            kotlinx.coroutines.channels.BufferedChannel r11 = (kotlinx.coroutines.channels.BufferedChannel) r11
            kotlin.ResultKt.b(r15)
            goto L_0x012c
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            kotlin.ResultKt.b(r15)
            r0.C = r10
            r0.D = r11
            r0.E = r12
            r0.F = r13
            r0.I = r3
            kotlin.coroutines.Continuation r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            kotlinx.coroutines.CancellableContinuationImpl r15 = kotlinx.coroutines.CancellableContinuationKt.b(r15)
            kotlinx.coroutines.channels.ReceiveCatching r8 = new kotlinx.coroutines.channels.ReceiveCatching     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>"
            kotlin.jvm.internal.Intrinsics.g(r15, r2)     // Catch:{ all -> 0x006d }
            r8.<init>(r15)     // Catch:{ all -> 0x006d }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r8
            java.lang.Object r2 = r2.B1(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.f41483m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x0070
            r10.a1(r8, r11, r12)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x006d:
            r11 = move-exception
            goto L_0x0133
        L_0x0070:
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.channels.BufferedChannelKt.f41485o     // Catch:{ all -> 0x006d }
            r9 = 0
            if (r2 != r12) goto L_0x0104
            long r2 = r10.v0()     // Catch:{ all -> 0x006d }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            r11.b()     // Catch:{ all -> 0x006d }
        L_0x0082:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = H     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11     // Catch:{ all -> 0x006d }
        L_0x008c:
            boolean r12 = r10.D0()     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0097
            r10.Q0(r15)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x0097:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = D     // Catch:{ all -> 0x006d }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x006d }
            int r14 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b     // Catch:{ all -> 0x006d }
            long r2 = (long) r14     // Catch:{ all -> 0x006d }
            long r2 = r12 / r2
            long r4 = (long) r14     // Catch:{ all -> 0x006d }
            long r4 = r12 % r4
            int r14 = (int) r4     // Catch:{ all -> 0x006d }
            long r4 = r11.f41864B     // Catch:{ all -> 0x006d }
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
            kotlinx.coroutines.channels.ChannelSegment r2 = r10.g0(r2, r11)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x00b5
            goto L_0x008c
        L_0x00b5:
            r11 = r2
        L_0x00b6:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r8
            java.lang.Object r2 = r2.B1(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.f41483m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x00c9
            r10.a1(r8, r11, r14)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x00c9:
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.f41485o     // Catch:{ all -> 0x006d }
            if (r2 != r14) goto L_0x00db
            long r2 = r10.v0()     // Catch:{ all -> 0x006d }
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x008c
            r11.b()     // Catch:{ all -> 0x006d }
            goto L_0x008c
        L_0x00db:
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.channels.BufferedChannelKt.f41484n     // Catch:{ all -> 0x006d }
            if (r2 == r12) goto L_0x00fc
            r11.b()     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.channels.ChannelResult$Companion r11 = kotlinx.coroutines.channels.ChannelResult.f41493b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.channels.ChannelResult r11 = kotlinx.coroutines.channels.ChannelResult.b(r11)     // Catch:{ all -> 0x006d }
            kotlin.jvm.functions.Function1 r12 = r10.f41461A     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x00f6
            kotlin.reflect.KFunction r9 = r10.U(r12)     // Catch:{ all -> 0x006d }
        L_0x00f6:
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9     // Catch:{ all -> 0x006d }
        L_0x00f8:
            r15.w(r11, r9)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x00fc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r12 = "unexpected"
            r11.<init>(r12)     // Catch:{ all -> 0x006d }
            throw r11     // Catch:{ all -> 0x006d }
        L_0x0104:
            r11.b()     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.channels.ChannelResult$Companion r11 = kotlinx.coroutines.channels.ChannelResult.f41493b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.channels.ChannelResult r11 = kotlinx.coroutines.channels.ChannelResult.b(r11)     // Catch:{ all -> 0x006d }
            kotlin.jvm.functions.Function1 r12 = r10.f41461A     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0119
            kotlin.reflect.KFunction r9 = r10.U(r12)     // Catch:{ all -> 0x006d }
        L_0x0119:
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9     // Catch:{ all -> 0x006d }
            goto L_0x00f8
        L_0x011c:
            java.lang.Object r15 = r15.A()
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r15 != r11) goto L_0x0129
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x0129:
            if (r15 != r1) goto L_0x012c
            return r1
        L_0x012c:
            kotlinx.coroutines.channels.ChannelResult r15 = (kotlinx.coroutines.channels.ChannelResult) r15
            java.lang.Object r11 = r15.l()
            return r11
        L_0x0133:
            r15.R()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.i1(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ChannelIterator iterator() {
        return new BufferedChannelIterator();
    }

    public final long j0() {
        return E.get(this);
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [kotlin.reflect.KFunction] */
    /* JADX WARNING: type inference failed for: r7v9, types: [kotlin.reflect.KFunction] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j1(kotlinx.coroutines.channels.ChannelSegment r9, int r10, long r11, kotlin.coroutines.Continuation r13) {
        /*
            r8 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r13)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.B1(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.f41483m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x001f
            r8.a1(r0, r9, r10)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x001c:
            r9 = move-exception
            goto L_0x00ca
        L_0x001f:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.f41485o     // Catch:{ all -> 0x001c }
            r7 = 0
            if (r1 != r10) goto L_0x00ae
            long r1 = r8.v0()     // Catch:{ all -> 0x001c }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0031
            r9.b()     // Catch:{ all -> 0x001c }
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = H     // Catch:{ all -> 0x001c }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x001c }
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9     // Catch:{ all -> 0x001c }
        L_0x003b:
            boolean r10 = r8.D0()     // Catch:{ all -> 0x001c }
            if (r10 == 0) goto L_0x0046
            r8.R0(r0)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x0046:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = D     // Catch:{ all -> 0x001c }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x001c }
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b     // Catch:{ all -> 0x001c }
            long r1 = (long) r12     // Catch:{ all -> 0x001c }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x001c }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x001c }
            long r3 = r9.f41864B     // Catch:{ all -> 0x001c }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            kotlinx.coroutines.channels.ChannelSegment r1 = r8.g0(r1, r9)     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0064
            goto L_0x003b
        L_0x0064:
            r9 = r1
        L_0x0065:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.B1(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.f41483m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x007d
            if (r0 == 0) goto L_0x0077
            r7 = r0
        L_0x0077:
            if (r7 == 0) goto L_0x00bc
            r8.a1(r7, r9, r12)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x007d:
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.channels.BufferedChannelKt.f41485o     // Catch:{ all -> 0x001c }
            if (r1 != r12) goto L_0x008f
            long r1 = r8.v0()     // Catch:{ all -> 0x001c }
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x003b
            r9.b()     // Catch:{ all -> 0x001c }
            goto L_0x003b
        L_0x008f:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.f41484n     // Catch:{ all -> 0x001c }
            if (r1 == r10) goto L_0x00a6
            r9.b()     // Catch:{ all -> 0x001c }
            kotlin.jvm.functions.Function1 r9 = r8.f41461A     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00a0
            kotlin.reflect.KFunction r7 = r8.S(r9)     // Catch:{ all -> 0x001c }
        L_0x00a0:
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7     // Catch:{ all -> 0x001c }
        L_0x00a2:
            r0.w(r1, r7)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x00a6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001c }
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)     // Catch:{ all -> 0x001c }
            throw r9     // Catch:{ all -> 0x001c }
        L_0x00ae:
            r9.b()     // Catch:{ all -> 0x001c }
            kotlin.jvm.functions.Function1 r9 = r8.f41461A     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00b9
            kotlin.reflect.KFunction r7 = r8.S(r9)     // Catch:{ all -> 0x001c }
        L_0x00b9:
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7     // Catch:{ all -> 0x001c }
            goto L_0x00a2
        L_0x00bc:
            java.lang.Object r9 = r0.A()
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r9 != r10) goto L_0x00c9
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r13)
        L_0x00c9:
            return r9
        L_0x00ca:
            r0.R()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.j1(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k1(SelectInstance selectInstance, Object obj) {
        ChannelSegment channelSegment = (ChannelSegment) H.get(this);
        while (!D0()) {
            long andIncrement = D.getAndIncrement(this);
            int i2 = BufferedChannelKt.f41472b;
            long j2 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (channelSegment.f41864B != j2) {
                ChannelSegment j3 = g0(j2, channelSegment);
                if (j3 == null) {
                    continue;
                } else {
                    channelSegment = j3;
                }
            }
            Object N = B1(channelSegment, i3, andIncrement, selectInstance);
            if (N == BufferedChannelKt.f41483m) {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    a1(waiter, channelSegment, i3);
                    return;
                }
                return;
            } else if (N == BufferedChannelKt.f41485o) {
                if (andIncrement < v0()) {
                    channelSegment.b();
                }
            } else if (N != BufferedChannelKt.f41484n) {
                channelSegment.b();
                selectInstance.h(N);
                return;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        S0(selectInstance);
    }

    public final Throwable l0() {
        return (Throwable) J.get(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r14.h(kotlin.Unit.f40552a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l1(kotlinx.coroutines.selects.SelectInstance r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = G
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L_0x000a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = C
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = r13.F0(r1)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.f41864B
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            kotlinx.coroutines.channels.ChannelSegment r5 = r13.h0(r5, r0)
            if (r5 != 0) goto L_0x0038
            if (r1 == 0) goto L_0x000a
        L_0x0033:
            r13.T0(r15, r14)
            goto L_0x008c
        L_0x0038:
            r0 = r5
        L_0x0039:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = r5.D1(r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L_0x0088
            r6 = 1
            if (r5 == r6) goto L_0x0082
            r6 = 2
            if (r5 == r6) goto L_0x006e
            r1 = 3
            if (r5 == r1) goto L_0x0066
            r1 = 4
            if (r5 == r1) goto L_0x005a
            r1 = 5
            if (r5 == r1) goto L_0x0056
            goto L_0x000a
        L_0x0056:
            r0.b()
            goto L_0x000a
        L_0x005a:
            long r1 = r13.r0()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0033
            r0.b()
            goto L_0x0033
        L_0x0066:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            r14.<init>(r15)
            throw r14
        L_0x006e:
            if (r1 == 0) goto L_0x0074
            r0.t()
            goto L_0x0033
        L_0x0074:
            boolean r15 = r14 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto L_0x007b
            kotlinx.coroutines.Waiter r14 = (kotlinx.coroutines.Waiter) r14
            goto L_0x007c
        L_0x007b:
            r14 = 0
        L_0x007c:
            if (r14 == 0) goto L_0x008c
            r13.b1(r14, r0, r2)
            goto L_0x008c
        L_0x0082:
            kotlin.Unit r15 = kotlin.Unit.f40552a
            r14.h(r15)
            goto L_0x008c
        L_0x0088:
            r0.b()
            goto L_0x0082
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.l1(kotlinx.coroutines.selects.SelectInstance, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1(kotlinx.coroutines.channels.ChannelSegment r12) {
        /*
            r11 = this;
            kotlin.jvm.functions.Function1 r0 = r11.f41461A
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.b(r1, r2, r1)
        L_0x0008:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b3
            long r6 = r12.f41864B
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.B(r4)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41479i
            if (r8 == r9) goto L_0x00bb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41474d
            if (r8 != r9) goto L_0x0048
            long r9 = r11.r0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r0, r5, r1)
        L_0x0040:
            r12.w(r4)
            r12.t()
            goto L_0x00af
        L_0x0048:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41475e
            if (r8 == r9) goto L_0x00a2
            if (r8 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            boolean r9 = r8 instanceof kotlinx.coroutines.Waiter
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41477g
            if (r8 == r9) goto L_0x00bb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41476f
            if (r8 != r9) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41477g
            if (r8 == r9) goto L_0x0016
            goto L_0x00af
        L_0x006e:
            long r9 = r11.r0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L_0x0080
            r9 = r8
            kotlinx.coroutines.channels.WaiterEB r9 = (kotlinx.coroutines.channels.WaiterEB) r9
            kotlinx.coroutines.Waiter r9 = r9.f41504a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
        L_0x0083:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.b(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.e(r3, r9)
            r12.w(r4)
            r12.t()
            goto L_0x00af
        L_0x00a2:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            r12.t()
        L_0x00af:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b3:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r12 = r12.h()
            kotlinx.coroutines.channels.ChannelSegment r12 = (kotlinx.coroutines.channels.ChannelSegment) r12
            if (r12 != 0) goto L_0x0008
        L_0x00bb:
            if (r3 == 0) goto L_0x00e1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c7
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r11.o1(r3)
            goto L_0x00e1
        L_0x00c7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.Intrinsics.g(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00d3:
            if (r5 >= r12) goto L_0x00e1
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r11.o1(r0)
            int r12 = r12 + -1
            goto L_0x00d3
        L_0x00e1:
            if (r1 != 0) goto L_0x00e4
            return
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m1(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    public Object n() {
        ChannelSegment channelSegment;
        long j2 = D.get(this);
        long j3 = C.get(this);
        if (E0(j3)) {
            return ChannelResult.f41493b.a(l0());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return ChannelResult.f41493b.b();
        }
        Symbol i2 = BufferedChannelKt.f41481k;
        ChannelSegment channelSegment2 = (ChannelSegment) H.get(this);
        while (!D0()) {
            long andIncrement = D.getAndIncrement(this);
            int i3 = BufferedChannelKt.f41472b;
            long j4 = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (channelSegment2.f41864B != j4) {
                ChannelSegment j5 = g0(j4, channelSegment2);
                if (j5 == null) {
                    continue;
                } else {
                    channelSegment = j5;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object N = B1(channelSegment, i4, andIncrement, i2);
            if (N == BufferedChannelKt.f41483m) {
                Waiter waiter = i2 instanceof Waiter ? (Waiter) i2 : null;
                if (waiter != null) {
                    a1(waiter, channelSegment, i4);
                }
                H1(andIncrement);
                channelSegment.t();
                return ChannelResult.f41493b.b();
            } else if (N == BufferedChannelKt.f41485o) {
                if (andIncrement < v0()) {
                    channelSegment.b();
                }
                channelSegment2 = channelSegment;
            } else if (N != BufferedChannelKt.f41484n) {
                channelSegment.b();
                return ChannelResult.f41493b.c(N);
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        return ChannelResult.f41493b.a(l0());
    }

    public final void n1(Waiter waiter) {
        p1(waiter, true);
    }

    public Object o(Continuation continuation) {
        return h1(this, continuation);
    }

    public final Throwable o0() {
        Throwable l0 = l0();
        return l0 == null ? new ClosedReceiveChannelException("Channel was closed") : l0;
    }

    public final void o1(Waiter waiter) {
        p1(waiter, false);
    }

    public final void p1(Waiter waiter, boolean z2) {
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation a2 = ((SendBroadcast) waiter).a();
            Result.Companion companion = Result.f40519A;
            a2.q(Result.b(Boolean.FALSE));
        } else if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion2 = Result.f40519A;
            continuation.q(Result.b(ResultKt.a(z2 ? o0() : s0())));
        } else if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl cancellableContinuationImpl = ((ReceiveCatching) waiter).f41499z;
            Result.Companion companion3 = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(ChannelResult.b(ChannelResult.f41493b.a(l0()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).j();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).d(this, BufferedChannelKt.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    public final long r0() {
        return D.get(this);
    }

    public Object r1(Object obj, Continuation continuation) {
        return s1(this, obj, continuation);
    }

    public SelectClause2 s() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.I;
        Intrinsics.g(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.I;
        Intrinsics.g(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, (Function3) TypeIntrinsics.e(bufferedChannel$onSend$1, 3), (Function3) TypeIntrinsics.e(bufferedChannel$onSend$2, 3), (Function3) null, 8, (DefaultConstructorMarker) null);
    }

    public final Throwable s0() {
        Throwable l0 = l0();
        return l0 == null ? new ClosedSendChannelException("Channel was closed") : l0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t1(kotlinx.coroutines.channels.ChannelSegment r21, int r22, java.lang.Object r23, long r24, kotlin.coroutines.Continuation r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r26)
            kotlinx.coroutines.CancellableContinuationImpl r10 = kotlinx.coroutines.CancellableContinuationKt.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.D1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00fa
            r11 = 1
            if (r1 == r11) goto L_0x00f1
            r12 = 2
            if (r1 == r12) goto L_0x00e9
            r13 = 4
            if (r1 == r13) goto L_0x00dc
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d6
            r21.b()     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = G     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0068 }
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1     // Catch:{ all -> 0x0068 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = C     // Catch:{ all -> 0x0068 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0068 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.F0(r2)     // Catch:{ all -> 0x0068 }
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b     // Catch:{ all -> 0x0068 }
            long r3 = (long) r2     // Catch:{ all -> 0x0068 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0068 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0068 }
            long r5 = r1.f41864B     // Catch:{ all -> 0x0068 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            kotlinx.coroutines.channels.ChannelSegment r2 = r9.h0(r3, r1)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x006b
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.V0(r0, r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x0068:
            r0 = move-exception
            goto L_0x011f
        L_0x006b:
            r7 = r2
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.D1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00c8
            if (r1 == r11) goto L_0x00bc
            if (r1 == r12) goto L_0x00a7
            r2 = 3
            if (r1 == r2) goto L_0x00a1
            if (r1 == r13) goto L_0x0095
            if (r1 == r15) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r21.b()     // Catch:{ all -> 0x0068 }
        L_0x0092:
            r1 = r21
            goto L_0x0039
        L_0x0095:
            long r1 = r20.r0()     // Catch:{ all -> 0x0068 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00a7:
            if (r18 == 0) goto L_0x00ad
            r21.t()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00ad:
            if (r10 == 0) goto L_0x00b1
            r0 = r10
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x0108
            r2 = r21
            r1 = r19
            r9.b1(r0, r2, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00bc:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A     // Catch:{ all -> 0x0068 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x0068 }
        L_0x00c4:
            r10.q(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00c8:
            r2 = r21
            r2.b()     // Catch:{ all -> 0x0068 }
            kotlin.Result$Companion r0 = kotlin.Result.f40519A     // Catch:{ all -> 0x0068 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00dc:
            long r1 = r20.r0()     // Catch:{ all -> 0x0068 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00e9:
            r0 = r21
            r1 = r22
            r9.b1(r10, r0, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00f1:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A     // Catch:{ all -> 0x0068 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00fa:
            r0 = r21
            r21.b()     // Catch:{ all -> 0x0068 }
            kotlin.Result$Companion r0 = kotlin.Result.f40519A     // Catch:{ all -> 0x0068 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x0108:
            java.lang.Object r0 = r10.A()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r0 != r1) goto L_0x0115
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r26)
        L_0x0115:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r0 != r1) goto L_0x011c
            return r0
        L_0x011c:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x011f:
            r10.R()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.t1(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d7, code lost:
        r3 = r3.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01de, code lost:
        if (r3 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = C
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x0020
            if (r2 == r3) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0025
        L_0x0020:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f41463z
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            kotlinx.coroutines.channels.ChannelSegment[] r2 = new kotlinx.coroutines.channels.ChannelSegment[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = H
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = G
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = I
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = kotlin.collections.CollectionsKt.p(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0076:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r2.next()
            r8 = r4
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
            kotlinx.coroutines.channels.ChannelSegment r9 = kotlinx.coroutines.channels.BufferedChannelKt.f41471a
            if (r8 == r9) goto L_0x0076
            r3.add(r4)
            goto L_0x0076
        L_0x008d:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0203
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a2
            goto L_0x00bc
        L_0x00a2:
            r4 = r3
            kotlinx.coroutines.channels.ChannelSegment r4 = (kotlinx.coroutines.channels.ChannelSegment) r4
            long r8 = r4.f41864B
        L_0x00a7:
            java.lang.Object r4 = r2.next()
            r10 = r4
            kotlinx.coroutines.channels.ChannelSegment r10 = (kotlinx.coroutines.channels.ChannelSegment) r10
            long r10 = r10.f41864B
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b6
            r3 = r4
            r8 = r10
        L_0x00b6:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a7
        L_0x00bc:
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            long r10 = r16.r0()
            long r12 = r16.v0()
        L_0x00c6:
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            r4 = r6
        L_0x00c9:
            if (r4 >= r2) goto L_0x01d7
            long r8 = r3.f41864B
            int r14 = kotlinx.coroutines.channels.BufferedChannelKt.f41472b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00db
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e0
        L_0x00db:
            java.lang.Object r15 = r3.B(r4)
            java.lang.Object r6 = r3.A(r4)
            boolean r7 = r15 instanceof kotlinx.coroutines.CancellableContinuation
            if (r7 == 0) goto L_0x00fd
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f1
            if (r14 < 0) goto L_0x00f1
            java.lang.String r7 = "receive"
            goto L_0x019d
        L_0x00f1:
            if (r14 >= 0) goto L_0x00f9
            if (r7 < 0) goto L_0x00f9
            java.lang.String r7 = "send"
            goto L_0x019d
        L_0x00f9:
            java.lang.String r7 = "cont"
            goto L_0x019d
        L_0x00fd:
            boolean r7 = r15 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r7 == 0) goto L_0x0117
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            if (r14 < 0) goto L_0x010b
            java.lang.String r7 = "onReceive"
            goto L_0x019d
        L_0x010b:
            if (r14 >= 0) goto L_0x0113
            if (r7 < 0) goto L_0x0113
            java.lang.String r7 = "onSend"
            goto L_0x019d
        L_0x0113:
            java.lang.String r7 = "select"
            goto L_0x019d
        L_0x0117:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.ReceiveCatching
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = "receiveCatching"
            goto L_0x019d
        L_0x011f:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r7 == 0) goto L_0x0127
            java.lang.String r7 = "sendBroadcast"
            goto L_0x019d
        L_0x0127:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r7 == 0) goto L_0x0142
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x019d
        L_0x0142:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41476f
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 != 0) goto L_0x019b
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41477g
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 == 0) goto L_0x0157
            goto L_0x019b
        L_0x0157:
            if (r15 == 0) goto L_0x01d1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41475e
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 != 0) goto L_0x01d1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41479i
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 != 0) goto L_0x01d1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41478h
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 != 0) goto L_0x01d1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41481k
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 != 0) goto L_0x01d1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.f41480j
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 != 0) goto L_0x01d1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r15, r7)
            if (r7 == 0) goto L_0x0196
            goto L_0x01d1
        L_0x0196:
            java.lang.String r7 = r15.toString()
            goto L_0x019d
        L_0x019b:
            java.lang.String r7 = "resuming_sender"
        L_0x019d:
            if (r6 == 0) goto L_0x01bf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01d1
        L_0x01bf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01d1:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c9
        L_0x01d7:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r2 = r3.f()
            r3 = r2
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            if (r3 != 0) goto L_0x01ff
        L_0x01e0:
            char r2 = kotlin.text.StringsKt.l1(r1)
            if (r2 != r5) goto L_0x01f5
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "deleteCharAt(...)"
            kotlin.jvm.internal.Intrinsics.h(r2, r3)
        L_0x01f5:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x01ff:
            r6 = 0
            r7 = 1
            goto L_0x00c6
        L_0x0203:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    public final boolean u1(long j2) {
        if (F0(j2)) {
            return false;
        }
        return !V(j2 & 1152921504606846975L);
    }

    public Object v(Continuation continuation) {
        return g1(this, continuation);
    }

    public final long v0() {
        return C.get(this) & 1152921504606846975L;
    }

    public boolean v1() {
        return u1(C.get(this));
    }

    public final boolean w1(Object obj, Object obj2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).d(this, obj2);
        }
        KFunction kFunction = null;
        if (obj instanceof ReceiveCatching) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl cancellableContinuationImpl = ((ReceiveCatching) obj).f41499z;
            ChannelResult b2 = ChannelResult.b(ChannelResult.f41493b.c(obj2));
            Function1 function1 = this.f41461A;
            if (function1 != null) {
                kFunction = U(function1);
            }
            return BufferedChannelKt.B(cancellableContinuationImpl, b2, (Function3) kFunction);
        } else if (obj instanceof BufferedChannelIterator) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).i(obj2);
        } else if (obj instanceof CancellableContinuation) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1 function12 = this.f41461A;
            if (function12 != null) {
                kFunction = S(function12);
            }
            return BufferedChannelKt.B(cancellableContinuation, obj2, (Function3) kFunction);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final boolean x0() {
        while (true) {
            ChannelSegment channelSegment = (ChannelSegment) H.get(this);
            long r0 = r0();
            if (v0() <= r0) {
                return false;
            }
            int i2 = BufferedChannelKt.f41472b;
            long j2 = r0 / ((long) i2);
            if (channelSegment.f41864B == j2 || (channelSegment = g0(j2, channelSegment)) != null) {
                channelSegment.b();
                if (B0(channelSegment, (int) (r0 % ((long) i2)), r0)) {
                    return true;
                }
                D.compareAndSet(this, r0, 1 + r0);
            } else if (((ChannelSegment) H.get(this)).f41864B < j2) {
                return false;
            }
        }
    }

    public final boolean x1(Object obj, ChannelSegment channelSegment, int i2) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.C((CancellableContinuation) obj, Unit.f40552a, (Function3) null, 2, (Object) null);
        } else if (obj instanceof SelectInstance) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult A2 = ((SelectImplementation) obj).A(this, Unit.f40552a);
            if (A2 == TrySelectDetailedResult.REREGISTER) {
                channelSegment.w(i2);
            }
            return A2 == TrySelectDetailedResult.SUCCESSFUL;
        } else if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.C(((SendBroadcast) obj).a(), Boolean.TRUE, (Function3) null, 2, (Object) null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    public final void y0(long j2) {
        if ((F.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            do {
            } while ((F.get(this) & 4611686018427387904L) != 0);
        }
    }

    public final Object y1(Object obj) {
        ChannelSegment channelSegment;
        Symbol symbol = BufferedChannelKt.f41474d;
        ChannelSegment channelSegment2 = (ChannelSegment) G.get(this);
        while (true) {
            long andIncrement = C.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean t2 = F0(andIncrement);
            int i2 = BufferedChannelKt.f41472b;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            if (channelSegment2.f41864B != j3) {
                ChannelSegment k2 = h0(j3, channelSegment2);
                if (k2 != null) {
                    channelSegment = k2;
                } else if (t2) {
                    return ChannelResult.f41493b.a(s0());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int P = D1(channelSegment, i3, obj, j2, symbol, t2);
            if (P == 0) {
                channelSegment.b();
                return ChannelResult.f41493b.c(Unit.f40552a);
            } else if (P == 1) {
                return ChannelResult.f41493b.c(Unit.f40552a);
            } else {
                if (P != 2) {
                    if (P == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (P != 4) {
                        if (P == 5) {
                            channelSegment.b();
                        }
                        channelSegment2 = channelSegment;
                    } else {
                        if (j2 < r0()) {
                            channelSegment.b();
                        }
                        return ChannelResult.f41493b.a(s0());
                    }
                } else if (t2) {
                    channelSegment.t();
                    return ChannelResult.f41493b.a(s0());
                } else {
                    Waiter waiter = symbol instanceof Waiter ? (Waiter) symbol : null;
                    if (waiter != null) {
                        b1(waiter, channelSegment, i3);
                    }
                    d0((channelSegment.f41864B * ((long) i2)) + ((long) i3));
                    return ChannelResult.f41493b.c(Unit.f40552a);
                }
            }
        }
    }

    public boolean z(Throwable th) {
        return Z(th, false);
    }

    public final boolean z1(ChannelSegment channelSegment, int i2, long j2) {
        Object B2 = channelSegment.B(i2);
        if (!(B2 instanceof Waiter) || j2 < D.get(this) || !channelSegment.v(i2, B2, BufferedChannelKt.f41477g)) {
            return A1(channelSegment, i2, j2);
        }
        if (x1(B2, channelSegment, i2)) {
            channelSegment.F(i2, BufferedChannelKt.f41474d);
            return true;
        }
        channelSegment.F(i2, BufferedChannelKt.f41480j);
        channelSegment.C(i2, false);
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BufferedChannel(int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? null : function1);
    }
}
