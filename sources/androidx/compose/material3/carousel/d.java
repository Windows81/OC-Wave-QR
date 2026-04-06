package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Strategy f11972A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11973B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ CarouselItemDrawInfoImpl D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ boolean F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CarouselState f11974z;

    public /* synthetic */ d(CarouselState carouselState, Strategy strategy, int i2, boolean z2, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z3) {
        this.f11974z = carouselState;
        this.f11972A = strategy;
        this.f11973B = i2;
        this.C = z2;
        this.D = carouselItemDrawInfoImpl;
        this.E = shape;
        this.F = z3;
    }

    public final Object invoke(Object obj) {
        return CarouselKt.k(this.f11974z, this.f11972A, this.f11973B, this.C, this.D, this.E, this.F, (GraphicsLayerScope) obj);
    }
}
