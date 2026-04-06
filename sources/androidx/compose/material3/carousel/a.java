package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class a implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CarouselState f11966A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11967B;
    public final /* synthetic */ CarouselItemDrawInfoImpl C;
    public final /* synthetic */ Shape D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11968z;

    public /* synthetic */ a(Function0 function0, CarouselState carouselState, int i2, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape) {
        this.f11968z = function0;
        this.f11966A = carouselState;
        this.f11967B = i2;
        this.C = carouselItemDrawInfoImpl;
        this.D = shape;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return CarouselKt.h(this.f11968z, this.f11966A, this.f11967B, this.C, this.D, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
    }
}
