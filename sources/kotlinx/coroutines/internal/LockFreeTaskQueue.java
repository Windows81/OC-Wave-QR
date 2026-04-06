package kotlinx.coroutines.internal;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata
public class LockFreeTaskQueue<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41846a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public LockFreeTaskQueue(boolean z2) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, z2);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater d2 = f41846a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) d2.get(this);
            int a2 = lockFreeTaskQueueCore.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.a(f41846a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.l());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater d2 = f41846a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) d2.get(this);
            if (!lockFreeTaskQueueCore.d()) {
                a.a(f41846a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.l());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((LockFreeTaskQueueCore) f41846a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater d2 = f41846a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) d2.get(this);
            Object m2 = lockFreeTaskQueueCore.m();
            if (m2 != LockFreeTaskQueueCore.f41850h) {
                return m2;
            }
            a.a(f41846a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.l());
        }
    }
}
