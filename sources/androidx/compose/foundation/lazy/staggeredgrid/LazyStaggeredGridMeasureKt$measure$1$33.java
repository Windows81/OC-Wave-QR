package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridMeasureKt$measure$1$33 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f5104A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f5105B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridMeasureContext f5106z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureKt$measure$1$33(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, List list, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        super(1);
        this.f5106z = lazyStaggeredGridMeasureContext;
        this.f5104A = list;
        this.f5105B = lazyLayoutMeasureScope;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        final List list = this.f5104A;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.f5106z;
        final LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f5105B;
        placementScope.C(new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                List list = list;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = lazyStaggeredGridMeasureContext;
                LazyLayoutMeasureScope lazyLayoutMeasureScope = lazyLayoutMeasureScope;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((LazyStaggeredGridMeasuredItem) list.get(i2)).s(placementScope, lazyStaggeredGridMeasureContext, lazyLayoutMeasureScope.w1());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        });
        ObservableScopeInvalidator.a(this.f5106z.s().D());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
