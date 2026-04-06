package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f11969A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CarouselState f11970B;
    public final /* synthetic */ Strategy C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ CarouselItemDrawInfoImpl F;
    public final /* synthetic */ Shape G;
    public final /* synthetic */ boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f11971z;

    public /* synthetic */ c(Placeable placeable, float f2, CarouselState carouselState, Strategy strategy, int i2, boolean z2, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z3) {
        this.f11971z = placeable;
        this.f11969A = f2;
        this.f11970B = carouselState;
        this.C = strategy;
        this.D = i2;
        this.E = z2;
        this.F = carouselItemDrawInfoImpl;
        this.G = shape;
        this.H = z3;
    }

    public final Object invoke(Object obj) {
        return CarouselKt.j(this.f11971z, this.f11969A, this.f11970B, this.C, this.D, this.E, this.F, this.G, this.H, (Placeable.PlacementScope) obj);
    }
}
