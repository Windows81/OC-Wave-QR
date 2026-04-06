package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 extends LazyListMeasuredItemProvider {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f4386d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f4387e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4388f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f4389g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f4390h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f4391i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f4392j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f4393k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4394l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f4395m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4396n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, int i3, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z3, int i4, int i5, long j3, LazyListState lazyListState) {
        super(j2, z2, lazyListItemProvider, lazyLayoutMeasureScope, (DefaultConstructorMarker) null);
        this.f4386d = z2;
        this.f4387e = lazyLayoutMeasureScope;
        this.f4388f = i2;
        this.f4389g = i3;
        this.f4390h = horizontal;
        this.f4391i = vertical;
        this.f4392j = z3;
        this.f4393k = i4;
        this.f4394l = i5;
        this.f4395m = j3;
        this.f4396n = lazyListState;
    }

    public LazyListMeasuredItem b(int i2, Object obj, Object obj2, List list, long j2) {
        return new LazyListMeasuredItem(i2, list, this.f4386d, this.f4390h, this.f4391i, this.f4387e.getLayoutDirection(), this.f4392j, this.f4393k, this.f4394l, i2 == this.f4388f + -1 ? 0 : this.f4389g, this.f4395m, obj, obj2, this.f4396n.w(), j2, (DefaultConstructorMarker) null);
    }
}
