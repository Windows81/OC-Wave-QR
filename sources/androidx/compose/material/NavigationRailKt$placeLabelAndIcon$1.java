package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$placeLabelAndIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f8079A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8080B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Placeable E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8081z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeLabelAndIcon$1(float f2, Placeable placeable, int i2, int i3, int i4, Placeable placeable2, int i5, int i6) {
        super(1);
        this.f8081z = f2;
        this.f8079A = placeable;
        this.f8080B = i2;
        this.C = i3;
        this.D = i4;
        this.E = placeable2;
        this.F = i5;
        this.G = i6;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        if (this.f8081z != 0.0f) {
            Placeable.PlacementScope.n(placementScope, this.f8079A, this.f8080B, this.C + this.D, 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, this.E, this.F, this.G + this.D, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
