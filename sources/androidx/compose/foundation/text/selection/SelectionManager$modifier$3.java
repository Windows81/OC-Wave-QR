package androidx.compose.foundation.text.selection;

import androidx.compose.ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager$modifier$3 extends Lambda implements Function1<FocusState, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6908z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$3(SelectionManager selectionManager) {
        super(1);
        this.f6908z = selectionManager;
    }

    public final void b(FocusState focusState) {
        if (!focusState.d() && this.f6908z.z()) {
            this.f6908z.P();
        }
        this.f6908z.b0(focusState.d());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusState) obj);
        return Unit.f40552a;
    }
}
