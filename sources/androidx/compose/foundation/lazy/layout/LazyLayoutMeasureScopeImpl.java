package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {

    /* renamed from: A  reason: collision with root package name */
    public final SubcomposeMeasureScope f4888A;

    /* renamed from: B  reason: collision with root package name */
    public final LazyLayoutItemProvider f4889B;
    public final MutableIntObjectMap C = IntObjectMapKt.c();

    /* renamed from: z  reason: collision with root package name */
    public final LazyLayoutItemContentFactory f4890z;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.f4890z = lazyLayoutItemContentFactory;
        this.f4888A = subcomposeMeasureScope;
        this.f4889B = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.d().invoke();
    }

    public long A(float f2) {
        return this.f4888A.A(f2);
    }

    public float B1(float f2) {
        return this.f4888A.B1(f2);
    }

    public float D(int i2) {
        return this.f4888A.D(i2);
    }

    public float E(float f2) {
        return this.f4888A.E(f2);
    }

    public int K1(long j2) {
        return this.f4888A.K1(j2);
    }

    public MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
        return this.f4888A.O1(i2, i3, map, function1, function12);
    }

    public int P1(float f2) {
        return this.f4888A.P1(f2);
    }

    public long V(long j2) {
        return this.f4888A.V(j2);
    }

    public float f2(long j2) {
        return this.f4888A.f2(j2);
    }

    public float getDensity() {
        return this.f4888A.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f4888A.getLayoutDirection();
    }

    public List k1(int i2, long j2) {
        List list = (List) this.C.b(i2);
        if (list != null) {
            return list;
        }
        Object c2 = this.f4889B.c(i2);
        List j0 = this.f4888A.j0(c2, this.f4890z.b(i2, c2, this.f4889B.f(i2)));
        int size = j0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Measurable) j0.get(i3)).c0(j2));
        }
        this.C.r(i2, arrayList);
        return arrayList;
    }

    public long r(float f2) {
        return this.f4888A.r(f2);
    }

    public long s(long j2) {
        return this.f4888A.s(j2);
    }

    public float u1() {
        return this.f4888A.u1();
    }

    public float v(long j2) {
        return this.f4888A.v(j2);
    }

    public boolean w1() {
        return this.f4888A.w1();
    }

    public MeasureResult y0(int i2, int i3, Map map, Function1 function1) {
        return this.f4888A.y0(i2, i3, map, function1);
    }
}
