package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldCoreModifierNode$measureVerticalScroll$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f6293A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f6294B;
    public final /* synthetic */ Placeable C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldCoreModifierNode f6295z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$measureVerticalScroll$1(TextFieldCoreModifierNode textFieldCoreModifierNode, MeasureScope measureScope, int i2, Placeable placeable) {
        super(1);
        this.f6295z = textFieldCoreModifierNode;
        this.f6293A = measureScope;
        this.f6294B = i2;
        this.C = placeable;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        this.f6295z.u3(this.f6293A, this.f6294B, this.C.C0(), this.f6295z.S.o().g(), this.f6293A.getLayoutDirection());
        Placeable.PlacementScope.n(placementScope, this.C, 0, -this.f6295z.W.n(), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
