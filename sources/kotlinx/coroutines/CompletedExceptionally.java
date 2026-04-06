package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public class CompletedExceptionally {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41375b = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f41376a;

    public CompletedExceptionally(Throwable th, boolean z2) {
        this.f41376a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final boolean a() {
        return f41375b.get(this) == 1;
    }

    public final boolean c() {
        return f41375b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return DebugStringsKt.a(this) + '[' + this.f41376a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompletedExceptionally(Throwable th, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? false : z2);
    }
}
