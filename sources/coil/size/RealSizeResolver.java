package coil.size;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RealSizeResolver implements SizeResolver {

    /* renamed from: z  reason: collision with root package name */
    public final Size f23697z;

    public RealSizeResolver(Size size) {
        this.f23697z = size;
    }

    public Object c(Continuation continuation) {
        return this.f23697z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealSizeResolver) && Intrinsics.d(this.f23697z, ((RealSizeResolver) obj).f23697z);
    }

    public int hashCode() {
        return this.f23697z.hashCode();
    }
}
