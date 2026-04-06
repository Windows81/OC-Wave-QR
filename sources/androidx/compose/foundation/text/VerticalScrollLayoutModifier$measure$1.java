package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VerticalScrollLayoutModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ VerticalScrollLayoutModifier f6035A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f6036B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f6037z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalScrollLayoutModifier$measure$1(MeasureScope measureScope, VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i2) {
        super(1);
        this.f6037z = measureScope;
        this.f6035A = verticalScrollLayoutModifier;
        this.f6036B = placeable;
        this.C = i2;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        MeasureScope measureScope = this.f6037z;
        int a2 = this.f6035A.a();
        TransformedText d2 = this.f6035A.d();
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) this.f6035A.c().invoke();
        this.f6035A.b().k(Orientation.Vertical, TextFieldScrollKt.c(measureScope, a2, d2, textLayoutResultProxy != null ? textLayoutResultProxy.f() : null, false, this.f6036B.L0()), this.C, this.f6036B.C0());
        Placeable.PlacementScope.n(placementScope, this.f6036B, 0, Math.round(-this.f6035A.b().d()), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
