package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;

@Metadata
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridItemProvider f4677a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyLayoutMeasureScope f4678b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4679c;

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2) {
        this.f4677a = lazyGridItemProvider;
        this.f4678b = lazyLayoutMeasureScope;
        this.f4679c = i2;
    }

    public abstract LazyGridMeasuredItem b(int i2, Object obj, Object obj2, int i3, int i4, List list, long j2, int i5, int i6);

    /* renamed from: c */
    public LazyGridMeasuredItem a(int i2, int i3, int i4, long j2) {
        return d(i2, j2, i3, i4, this.f4679c);
    }

    public final LazyGridMeasuredItem d(int i2, long j2, int i3, int i4, int i5) {
        int m2;
        int i6 = i2;
        Object c2 = this.f4677a.c(i2);
        Object f2 = this.f4677a.f(i2);
        long j3 = j2;
        List k1 = this.f4678b.k1(i2, j2);
        if (Constraints.j(j2)) {
            m2 = Constraints.n(j2);
        } else {
            if (!Constraints.i(j2)) {
                InlineClassHelperKt.a("does not have fixed height");
            }
            m2 = Constraints.m(j2);
        }
        return b(i2, c2, f2, m2, i5, k1, j2, i3, i4);
    }

    public final IntList e() {
        return this.f4677a.d();
    }

    public final LazyLayoutKeyIndexMap f() {
        return this.f4677a.a();
    }
}
