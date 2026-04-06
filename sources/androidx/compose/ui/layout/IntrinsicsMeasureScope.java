package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IntrinsicMeasureScope f17046A;

    /* renamed from: z  reason: collision with root package name */
    public final LayoutDirection f17047z;

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.f17047z = layoutDirection;
        this.f17046A = intrinsicMeasureScope;
    }

    public long A(float f2) {
        return this.f17046A.A(f2);
    }

    public float B1(float f2) {
        return this.f17046A.B1(f2);
    }

    public float D(int i2) {
        return this.f17046A.D(i2);
    }

    public float E(float f2) {
        return this.f17046A.E(f2);
    }

    public int K1(long j2) {
        return this.f17046A.K1(j2);
    }

    public MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
        boolean z2 = false;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if ((i2 & -16777216) == 0 && (-16777216 & i3) == 0) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.c("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new IntrinsicsMeasureScope$layout$1(i2, i3, map, function1);
    }

    public int P1(float f2) {
        return this.f17046A.P1(f2);
    }

    public long V(long j2) {
        return this.f17046A.V(j2);
    }

    public float f2(long j2) {
        return this.f17046A.f2(j2);
    }

    public float getDensity() {
        return this.f17046A.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f17047z;
    }

    public long r(float f2) {
        return this.f17046A.r(f2);
    }

    public long s(long j2) {
        return this.f17046A.s(j2);
    }

    public float u1() {
        return this.f17046A.u1();
    }

    public float v(long j2) {
        return this.f17046A.v(j2);
    }

    public boolean w1() {
        return this.f17046A.w1();
    }
}
