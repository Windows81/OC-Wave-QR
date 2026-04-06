package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager$modifier$2 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6907z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$2(SelectionManager selectionManager) {
        super(1);
        this.f6907z = selectionManager;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        this.f6907z.U(layoutCoordinates);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}
