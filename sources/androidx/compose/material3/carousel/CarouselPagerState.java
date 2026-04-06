package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class CarouselPagerState extends PagerState {
    public static final Companion M = new Companion((DefaultConstructorMarker) null);
    public static final Saver N = ListSaverKt.b(new g(), new h());
    public MutableState L;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CarouselPagerState(int i2, float f2, Function0 function0) {
        super(i2, f2);
        this.L = SnapshotStateKt__SnapshotStateKt.e(function0, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final List s0(SaverScope saverScope, CarouselPagerState carouselPagerState) {
        return CollectionsKt.p(Integer.valueOf(carouselPagerState.v()), Float.valueOf(RangesKt.n(carouselPagerState.w(), -0.5f, 0.5f)), carouselPagerState.L.getValue());
    }

    public static final CarouselPagerState t0(List list) {
        Object obj = list.get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new CarouselPagerState(intValue, ((Float) obj2).floatValue(), new i(list));
    }

    public static final int u0(List list) {
        Object obj = list.get(2);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    public int H() {
        return ((Number) ((Function0) this.L.getValue()).invoke()).intValue();
    }
}
