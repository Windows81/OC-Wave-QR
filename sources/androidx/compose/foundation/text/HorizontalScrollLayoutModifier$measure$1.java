package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class HorizontalScrollLayoutModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HorizontalScrollLayoutModifier f5748A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f5749B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f5750z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalScrollLayoutModifier$measure$1(MeasureScope measureScope, HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, Placeable placeable, int i2) {
        super(1);
        this.f5750z = measureScope;
        this.f5748A = horizontalScrollLayoutModifier;
        this.f5749B = placeable;
        this.C = i2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        MeasureScope measureScope = this.f5750z;
        int a2 = this.f5748A.a();
        TransformedText d2 = this.f5748A.d();
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) this.f5748A.c().invoke();
        this.f5748A.b().k(Orientation.Horizontal, TextFieldScrollKt.c(measureScope, a2, d2, textLayoutResultProxy != null ? textLayoutResultProxy.f() : null, this.f5750z.getLayoutDirection() == LayoutDirection.Rtl, this.f5749B.L0()), this.C, this.f5749B.L0());
        Placeable.PlacementScope.n(placementScope, this.f5749B, Math.round(-this.f5748A.b().d()), 0, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
