package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1 extends Lambda implements Function3<Float, Float, Float, Float> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f5266A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f5267B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5268z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1(PagerState pagerState, LayoutDirection layoutDirection, float f2) {
        super(3);
        this.f5268z = pagerState;
        this.f5266A = layoutDirection;
        this.f5267B = f2;
    }

    public final Float b(float f2, float f3, float f4) {
        return Float.valueOf(PagerSnapLayoutInfoProviderKt.c(this.f5268z, this.f5266A, this.f5267B, f2, f3, f4));
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
    }
}
