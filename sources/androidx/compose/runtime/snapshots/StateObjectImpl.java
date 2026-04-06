package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import kotlin.Metadata;

@Metadata
public abstract class StateObjectImpl implements StateObject {

    /* renamed from: z  reason: collision with root package name */
    public final AtomicInt f15342z = new AtomicInt(0);

    public final boolean t(int i2) {
        return (i2 & ReaderKind.a(this.f15342z.get())) != 0;
    }

    public final void u(int i2) {
        int a2;
        do {
            a2 = ReaderKind.a(this.f15342z.get());
            if ((a2 & i2) == 0) {
            } else {
                return;
            }
        } while (!this.f15342z.compareAndSet(a2, ReaderKind.a(a2 | i2)));
    }
}
