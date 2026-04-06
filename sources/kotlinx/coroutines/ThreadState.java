package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata
final class ThreadState extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state$volatile");
    public final Thread D = Thread.currentThread();
    public DisposableHandle E;
    private volatile /* synthetic */ int _state$volatile;

    public final Void B(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    public final void C(Job job) {
        int i2;
        this.E = JobKt__JobKt.m(job, false, this, 1, (Object) null);
        AtomicIntegerFieldUpdater A2 = F;
        do {
            i2 = A2.get(this);
            if (i2 != 0) {
                if (i2 != 2 && i2 != 3) {
                    B(i2);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!F.compareAndSet(this, i2, 0));
    }

    public boolean w() {
        return true;
    }

    public void x(Throwable th) {
        int i2;
        AtomicIntegerFieldUpdater A2 = F;
        do {
            i2 = A2.get(this);
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    B(i2);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!F.compareAndSet(this, i2, 2));
        this.D.interrupt();
        F.set(this, 3);
    }

    public final void z() {
        AtomicIntegerFieldUpdater A2 = F;
        while (true) {
            int i2 = A2.get(this);
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        B(i2);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (F.compareAndSet(this, i2, 1)) {
                DisposableHandle disposableHandle = this.E;
                if (disposableHandle != null) {
                    disposableHandle.d();
                    return;
                }
                return;
            }
        }
    }
}
