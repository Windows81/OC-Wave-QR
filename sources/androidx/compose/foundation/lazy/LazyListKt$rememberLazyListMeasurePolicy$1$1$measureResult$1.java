package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f4383A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f4384B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f4385z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, int i2, int i3) {
        super(3);
        this.f4385z = lazyLayoutMeasureScope;
        this.f4383A = j2;
        this.f4384B = i2;
        this.C = i3;
    }

    public final MeasureResult b(int i2, int i3, Function1 function1) {
        return this.f4385z.y0(ConstraintsKt.g(this.f4383A, i2 + this.f4384B), ConstraintsKt.f(this.f4383A, i3 + this.C), MapsKt.h(), function1);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj).intValue(), ((Number) obj2).intValue(), (Function1) obj3);
    }
}
