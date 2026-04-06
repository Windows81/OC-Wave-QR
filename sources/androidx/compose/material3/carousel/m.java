package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class m implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CarouselPagerState f11979z;

    public /* synthetic */ m(CarouselPagerState carouselPagerState) {
        this.f11979z = carouselPagerState;
    }

    public final Object m(Object obj, Object obj2) {
        return CarouselState$animateScrollToItem$2$1.C(this.f11979z, (ScrollScope) obj, ((Integer) obj2).intValue());
    }
}
