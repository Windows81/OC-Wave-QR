package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata
public final class DefaultIntrinsicMeasurable implements Measurable {

    /* renamed from: A  reason: collision with root package name */
    public final IntrinsicMinMax f17035A;

    /* renamed from: B  reason: collision with root package name */
    public final IntrinsicWidthHeight f17036B;

    /* renamed from: z  reason: collision with root package name */
    public final IntrinsicMeasurable f17037z;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.f17037z = intrinsicMeasurable;
        this.f17035A = intrinsicMinMax;
        this.f17036B = intrinsicWidthHeight;
    }

    public int C(int i2) {
        return this.f17037z.C(i2);
    }

    public int Z(int i2) {
        return this.f17037z.Z(i2);
    }

    public int a0(int i2) {
        return this.f17037z.a0(i2);
    }

    public Placeable c0(long j2) {
        int i2 = 32767;
        if (this.f17036B == IntrinsicWidthHeight.Width) {
            int a0 = this.f17035A == IntrinsicMinMax.Max ? this.f17037z.a0(Constraints.k(j2)) : this.f17037z.Z(Constraints.k(j2));
            if (Constraints.g(j2)) {
                i2 = Constraints.k(j2);
            }
            return new FixedSizeIntrinsicsPlaceable(a0, i2);
        }
        int C = this.f17035A == IntrinsicMinMax.Max ? this.f17037z.C(Constraints.l(j2)) : this.f17037z.q0(Constraints.l(j2));
        if (Constraints.h(j2)) {
            i2 = Constraints.l(j2);
        }
        return new FixedSizeIntrinsicsPlaceable(i2, C);
    }

    public int q0(int i2) {
        return this.f17037z.q0(i2);
    }

    public Object t() {
        return this.f17037z.t();
    }
}
