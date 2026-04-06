package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {
    public final int L;
    public final ReentrantLock M;
    public List N;
    public Object O;
    public final HashMap P;

    @Metadata
    public final class SubscriberBuffered extends BufferedChannel<E> {
        public SubscriberBuffered() {
            super(BroadcastChannelImpl.this.L1(), (Function1) null, 2, (DefaultConstructorMarker) null);
        }

        /* renamed from: I1 */
        public boolean W(Throwable th) {
            ReentrantLock I1 = BroadcastChannelImpl.this.M;
            BroadcastChannelImpl broadcastChannelImpl = BroadcastChannelImpl.this;
            I1.lock();
            try {
                broadcastChannelImpl.N1(this);
                return super.W(th);
            } finally {
                I1.unlock();
            }
        }
    }

    @Metadata
    public final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, BufferOverflow.DROP_OLDEST, (Function1) null, 4, (DefaultConstructorMarker) null);
        }

        /* renamed from: M1 */
        public boolean W(Throwable th) {
            BroadcastChannelImpl.this.N1(this);
            return super.W(th);
        }
    }

    public ReceiveChannel B() {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            BufferedChannel subscriberConflated = this.L == -1 ? new SubscriberConflated() : new SubscriberBuffered();
            if (!R() || this.O != BroadcastChannelKt.f41457a) {
                if (this.O != BroadcastChannelKt.f41457a) {
                    subscriberConflated.L(M1());
                }
                this.N = CollectionsKt.y0(this.N, subscriberConflated);
                reentrantLock.unlock();
                return subscriberConflated;
            }
            subscriberConflated.z(l0());
            reentrantLock.unlock();
            return subscriberConflated;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Object L(Object obj) {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            if (R()) {
                return super.L(obj);
            }
            Iterable<BufferedChannel> iterable = this.N;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (BufferedChannel v1 : iterable) {
                    if (v1.v1()) {
                        Object b2 = ChannelResult.f41493b.b();
                        reentrantLock.unlock();
                        return b2;
                    }
                }
            }
            if (this.L == -1) {
                this.O = obj;
            }
            for (BufferedChannel L2 : this.N) {
                L2.L(obj);
            }
            Object c2 = ChannelResult.f41493b.c(Unit.f40552a);
            reentrantLock.unlock();
            return c2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int L1() {
        return this.L;
    }

    public final Object M1() {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            if (R()) {
                Throwable l0 = l0();
                if (l0 == null) {
                    l0 = new IllegalStateException("This broadcast channel is closed");
                }
                throw l0;
            } else if (this.O != BroadcastChannelKt.f41457a) {
                Object obj = this.O;
                reentrantLock.unlock();
                return obj;
            } else {
                throw new IllegalStateException("No value");
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlinx.coroutines.channels.BufferedChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N1(kotlinx.coroutines.channels.ReceiveChannel r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.M
            r0.lock()
            java.util.List r1 = r5.N     // Catch:{ all -> 0x0025 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0025 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0025 }
            r2.<init>()     // Catch:{ all -> 0x0025 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0025 }
        L_0x0012:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0025 }
            r4 = r3
            kotlinx.coroutines.channels.BufferedChannel r4 = (kotlinx.coroutines.channels.BufferedChannel) r4     // Catch:{ all -> 0x0025 }
            if (r4 == r6) goto L_0x0012
            r2.add(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0012
        L_0x0025:
            r6 = move-exception
            goto L_0x002f
        L_0x0027:
            r5.N = r2     // Catch:{ all -> 0x0025 }
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0025 }
            r0.unlock()
            return
        L_0x002f:
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.N1(kotlinx.coroutines.channels.ReceiveChannel):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object O(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.E
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.D
            java.lang.Object r4 = r0.C
            kotlinx.coroutines.channels.BroadcastChannelImpl r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r4
            kotlin.ResultKt.b(r8)
            goto L_0x0080
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.ResultKt.b(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.M
            r8.lock()
            boolean r2 = r6.R()     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0099
            int r2 = r6.L     // Catch:{ all -> 0x0051 }
            r4 = -1
            if (r2 != r4) goto L_0x0053
            r6.O = r7     // Catch:{ all -> 0x0051 }
            goto L_0x0053
        L_0x0051:
            r7 = move-exception
            goto L_0x009e
        L_0x0053:
            java.util.List r2 = r6.N     // Catch:{ all -> 0x0051 }
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0062:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.C = r4
            r0.D = r8
            r0.E = r7
            r0.H = r3
            java.lang.Object r2 = r2.r1(r8, r0)
            if (r2 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x0080:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0094
            boolean r8 = r4.R()
            if (r8 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            java.lang.Throwable r7 = r4.s0()
            throw r7
        L_0x0094:
            r8 = r2
            goto L_0x0062
        L_0x0096:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0099:
            java.lang.Throwable r7 = r6.s0()     // Catch:{ all -> 0x0051 }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x009e:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.O(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean R() {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            return super.R();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean W(Throwable th) {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            for (BufferedChannel W : this.N) {
                W.W(th);
            }
            this.O = BroadcastChannelKt.f41457a;
            boolean W2 = super.W(th);
            reentrantLock.unlock();
            return W2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void l1(SelectInstance selectInstance, Object obj) {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            Object remove = this.P.remove(selectInstance);
            if (remove != null) {
                selectInstance.h(remove);
                return;
            }
            Unit unit = Unit.f40552a;
            reentrantLock.unlock();
            Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(selectInstance.f()), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new BroadcastChannelImpl$registerSelectForSend$2(this, obj, selectInstance, (Continuation) null), 1, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.O != BroadcastChannelKt.f41457a) {
            str = "CONFLATED_ELEMENT=" + this.O + "; ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(CollectionsKt.n0(this.N, ";", "<", ">", 0, (CharSequence) null, (Function1) null, 56, (Object) null));
        return sb.toString();
    }

    public boolean z(Throwable th) {
        ReentrantLock reentrantLock = this.M;
        reentrantLock.lock();
        try {
            for (BufferedChannel z2 : this.N) {
                z2.z(th);
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : this.N) {
                if (((BufferedChannel) next).x0()) {
                    arrayList.add(next);
                }
            }
            this.N = arrayList;
            boolean z3 = super.z(th);
            reentrantLock.unlock();
            return z3;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
