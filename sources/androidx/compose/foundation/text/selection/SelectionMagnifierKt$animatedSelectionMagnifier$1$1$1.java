package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends Lambda implements Function0<Offset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f6873z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(State state) {
        super(0);
        this.f6873z = state;
    }

    public final long b() {
        return SelectionMagnifierKt$animatedSelectionMagnifier$1.e(this.f6873z);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.d(b());
    }
}
