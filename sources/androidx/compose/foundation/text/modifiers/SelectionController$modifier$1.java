package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionController$modifier$1 extends Lambda implements Function0<LayoutCoordinates> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionController f6656z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionController$modifier$1(SelectionController selectionController) {
        super(0);
        this.f6656z = selectionController;
    }

    /* renamed from: b */
    public final LayoutCoordinates invoke() {
        return this.f6656z.C.d();
    }
}
