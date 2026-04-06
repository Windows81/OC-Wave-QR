package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f3158A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f3159B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollNode f3160z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollNode$measure$1(ScrollNode scrollNode, int i2, Placeable placeable) {
        super(1);
        this.f3160z = scrollNode;
        this.f3158A = i2;
        this.f3159B = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        int n2 = this.f3160z.a3().n();
        int i2 = this.f3158A;
        final int i3 = 0;
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 <= i2) {
            i2 = n2;
        }
        int i4 = this.f3160z.Z2() ? i2 - this.f3158A : -i2;
        final int i5 = this.f3160z.b3() ? 0 : i4;
        if (this.f3160z.b3()) {
            i3 = i4;
        }
        final Placeable placeable = this.f3159B;
        placementScope.C(new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.r(placementScope, placeable, i5, i3, 0.0f, (Function1) null, 12, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
