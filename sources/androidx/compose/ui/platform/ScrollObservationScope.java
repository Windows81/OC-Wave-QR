package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class ScrollObservationScope implements OwnerScope {

    /* renamed from: A  reason: collision with root package name */
    public final List f17872A;

    /* renamed from: B  reason: collision with root package name */
    public Float f17873B;
    public Float C;
    public ScrollAxisRange D;
    public ScrollAxisRange E;

    /* renamed from: z  reason: collision with root package name */
    public final int f17874z;

    public ScrollObservationScope(int i2, List list, Float f2, Float f3, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.f17874z = i2;
        this.f17872A = list;
        this.f17873B = f2;
        this.C = f3;
        this.D = scrollAxisRange;
        this.E = scrollAxisRange2;
    }

    public final ScrollAxisRange a() {
        return this.D;
    }

    public final Float b() {
        return this.f17873B;
    }

    public final Float c() {
        return this.C;
    }

    public final int d() {
        return this.f17874z;
    }

    public final ScrollAxisRange e() {
        return this.E;
    }

    public final void f(ScrollAxisRange scrollAxisRange) {
        this.D = scrollAxisRange;
    }

    public final void g(Float f2) {
        this.f17873B = f2;
    }

    public final void h(Float f2) {
        this.C = f2;
    }

    public final void i(ScrollAxisRange scrollAxisRange) {
        this.E = scrollAxisRange;
    }

    public boolean v0() {
        return this.f17872A.contains(this);
    }
}
