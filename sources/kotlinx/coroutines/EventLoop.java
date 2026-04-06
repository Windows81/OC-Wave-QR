package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata
public abstract class EventLoop extends CoroutineDispatcher {

    /* renamed from: B  reason: collision with root package name */
    public long f41403B;
    public boolean C;
    public ArrayDeque D;

    public static /* synthetic */ void J0(EventLoop eventLoop, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            eventLoop.H0(z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void b1(EventLoop eventLoop, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            eventLoop.W0(z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final CoroutineDispatcher E0(int i2, String str) {
        LimitedDispatcherKt.a(i2);
        return LimitedDispatcherKt.b(this, str);
    }

    public final boolean E1() {
        DispatchedTask dispatchedTask;
        ArrayDeque arrayDeque = this.D;
        if (arrayDeque == null || (dispatchedTask = (DispatchedTask) arrayDeque.z()) == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public boolean F1() {
        return false;
    }

    public final void H0(boolean z2) {
        long L0 = this.f41403B - L0(z2);
        this.f41403B = L0;
        if (L0 <= 0 && this.C) {
            shutdown();
        }
    }

    public final long L0(boolean z2) {
        return z2 ? 4294967296L : 1;
    }

    public final void S0(DispatchedTask dispatchedTask) {
        ArrayDeque arrayDeque = this.D;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.D = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    public long U0() {
        ArrayDeque arrayDeque = this.D;
        return (arrayDeque != null && !arrayDeque.isEmpty()) ? 0 : Long.MAX_VALUE;
    }

    public final void W0(boolean z2) {
        this.f41403B += L0(z2);
        if (!z2) {
            this.C = true;
        }
    }

    public final boolean j1() {
        return this.f41403B >= L0(true);
    }

    public final boolean q1() {
        ArrayDeque arrayDeque = this.D;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public void shutdown() {
    }

    public long w1() {
        return !E1() ? Long.MAX_VALUE : 0;
    }
}
