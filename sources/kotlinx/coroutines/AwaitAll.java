package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AwaitAll<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41362b = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final Deferred[] f41363a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata
    public final class AwaitAllNode extends JobNode {
        public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        public final CancellableContinuation D;
        public DisposableHandle E;
        private volatile /* synthetic */ Object _disposer$volatile;

        public AwaitAllNode(CancellableContinuation cancellableContinuation) {
            this.D = cancellableContinuation;
        }

        public final DisposableHandle A() {
            DisposableHandle disposableHandle = this.E;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            Intrinsics.y("handle");
            return null;
        }

        public final void C(DisposeHandlersOnCancel disposeHandlersOnCancel) {
            G.set(this, disposeHandlersOnCancel);
        }

        public final void D(DisposableHandle disposableHandle) {
            this.E = disposableHandle;
        }

        public boolean w() {
            return false;
        }

        public void x(Throwable th) {
            if (th != null) {
                Object J = this.D.J(th);
                if (J != null) {
                    this.D.a0(J);
                    DisposeHandlersOnCancel z2 = z();
                    if (z2 != null) {
                        z2.a();
                    }
                }
            } else if (AwaitAll.f41362b.decrementAndGet(AwaitAll.this) == 0) {
                CancellableContinuation cancellableContinuation = this.D;
                Deferred[] a2 = AwaitAll.this.f41363a;
                ArrayList arrayList = new ArrayList(a2.length);
                for (Deferred m2 : a2) {
                    arrayList.add(m2.m());
                }
                cancellableContinuation.q(Result.b(arrayList));
            }
        }

        public final DisposeHandlersOnCancel z() {
            return (DisposeHandlersOnCancel) G.get(this);
        }
    }

    @Metadata
    public final class DisposeHandlersOnCancel implements CancelHandler {

        /* renamed from: z  reason: collision with root package name */
        public final AwaitAllNode[] f41365z;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.f41365z = awaitAllNodeArr;
        }

        public final void a() {
            for (AwaitAllNode A2 : this.f41365z) {
                A2.A().d();
            }
        }

        public void e(Throwable th) {
            a();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f41365z + ']';
        }
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.f41363a = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    public final Object c(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        int length = this.f41363a.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i2 = 0; i2 < length; i2++) {
            Deferred deferred = this.f41363a[i2];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.D(JobKt__JobKt.m(deferred, false, awaitAllNode, 1, (Object) null));
            Unit unit = Unit.f40552a;
            awaitAllNodeArr[i2] = awaitAllNode;
        }
        DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i3 = 0; i3 < length; i3++) {
            awaitAllNodeArr[i3].C(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl.t()) {
            disposeHandlersOnCancel.a();
        } else {
            CancellableContinuationKt.c(cancellableContinuationImpl, disposeHandlersOnCancel);
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }
}
