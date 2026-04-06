package coil.size;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f23698A;

    /* renamed from: z  reason: collision with root package name */
    public final View f23699z;

    public RealViewSizeResolver(View view, boolean z2) {
        this.f23699z = view;
        this.f23698A = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealViewSizeResolver) {
            RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj;
            return Intrinsics.d(r(), realViewSizeResolver.r()) && h() == realViewSizeResolver.h();
        }
    }

    public boolean h() {
        return this.f23698A;
    }

    public int hashCode() {
        return (r().hashCode() * 31) + Boolean.hashCode(h());
    }

    public View r() {
        return this.f23699z;
    }
}
