package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$1 extends Lambda implements Function0<Offset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6814z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$4$1$1$1$1$positionProvider$1$1(SelectionManager selectionManager) {
        super(0);
        this.f6814z = selectionManager;
    }

    public final long b() {
        Offset H = this.f6814z.H();
        return H != null ? H.t() : Offset.f15855b.b();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.d(b());
    }
}
