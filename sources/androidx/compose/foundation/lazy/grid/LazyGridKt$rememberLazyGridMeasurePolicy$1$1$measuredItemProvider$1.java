package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 extends LazyGridMeasuredItemProvider {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f4613d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4614e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f4615f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f4616g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f4617h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4618i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f4619j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, LazyGridState lazyGridState, boolean z2, boolean z3, int i3, int i4, long j2) {
        super(lazyGridItemProvider, lazyLayoutMeasureScope, i2);
        this.f4613d = lazyLayoutMeasureScope;
        this.f4614e = lazyGridState;
        this.f4615f = z2;
        this.f4616g = z3;
        this.f4617h = i3;
        this.f4618i = i4;
        this.f4619j = j2;
    }

    public LazyGridMeasuredItem b(int i2, Object obj, Object obj2, int i3, int i4, List list, long j2, int i5, int i6) {
        int i7 = i3;
        int i8 = i4;
        List list2 = list;
        LayoutDirection layoutDirection = this.f4613d.getLayoutDirection();
        LazyLayoutItemAnimator v2 = this.f4614e.v();
        return new LazyGridMeasuredItem(i2, obj, this.f4615f, i7, i8, this.f4616g, layoutDirection, this.f4617h, this.f4618i, list2, this.f4619j, obj2, v2, j2, i5, i6, (DefaultConstructorMarker) null);
    }
}
