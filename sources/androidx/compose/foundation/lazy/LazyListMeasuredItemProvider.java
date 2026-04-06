package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {

    /* renamed from: a  reason: collision with root package name */
    public final LazyListItemProvider f4449a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyLayoutMeasureScope f4450b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4451c;

    public /* synthetic */ LazyListMeasuredItemProvider(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, z2, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    public static /* synthetic */ LazyListMeasuredItem e(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, long j2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                j2 = lazyListMeasuredItemProvider.f4451c;
            }
            return lazyListMeasuredItemProvider.d(i2, j2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
    }

    public abstract LazyListMeasuredItem b(int i2, Object obj, Object obj2, List list, long j2);

    /* renamed from: c */
    public LazyListMeasuredItem a(int i2, int i3, int i4, long j2) {
        return d(i2, j2);
    }

    public final LazyListMeasuredItem d(int i2, long j2) {
        return b(i2, this.f4449a.c(i2), this.f4449a.f(i2), this.f4450b.k1(i2, j2), j2);
    }

    public final long f() {
        return this.f4451c;
    }

    public final IntList g() {
        return this.f4449a.d();
    }

    public final LazyLayoutKeyIndexMap h() {
        return this.f4449a.a();
    }

    public LazyListMeasuredItemProvider(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.f4449a = lazyListItemProvider;
        this.f4450b = lazyLayoutMeasureScope;
        this.f4451c = ConstraintsKt.b(0, z2 ? Constraints.l(j2) : Integer.MAX_VALUE, 0, !z2 ? Constraints.k(j2) : Integer.MAX_VALUE, 5, (Object) null);
    }
}
