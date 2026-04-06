package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class CarouselKt$Carousel$2$clipShape$1$1 implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselItemDrawInfoImpl f11917a;

    public CarouselKt$Carousel$2$clipShape$1$1(CarouselItemDrawInfoImpl carouselItemDrawInfoImpl) {
        this.f11917a = carouselItemDrawInfoImpl;
    }

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        return new Outline.Rectangle(this.f11917a.a());
    }
}
