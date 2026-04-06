package kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DeltaCounter {

    /* renamed from: a  reason: collision with root package name */
    public int f41355a;

    public DeltaCounter(int i2) {
        this.f41355a = i2;
    }

    public final int a() {
        return this.f41355a;
    }

    public final void b(int i2) {
        this.f41355a += i2;
    }

    public final void c(int i2) {
        this.f41355a = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.f41355a == ((DeltaCounter) obj).f41355a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f41355a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f41355a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeltaCounter(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
