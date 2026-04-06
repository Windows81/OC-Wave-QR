package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState$observeTextToolbarVisibility$2 extends Lambda implements Function0<Rect> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6541z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$observeTextToolbarVisibility$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6541z = textFieldSelectionState;
    }

    /* renamed from: b */
    public final Rect invoke() {
        Rect x2;
        boolean h2 = TextRange.h(this.f6541z.f6463a.o().g());
        if (((!h2 || this.f6541z.i0() != TextToolbarState.Cursor) && (h2 || this.f6541z.i0() != TextToolbarState.Selection)) || this.f6541z.Y() != null || !this.f6541z.m0()) {
            return Rect.f15860e.a();
        }
        LayoutCoordinates l2 = this.f6541z.h0();
        Rect rect = null;
        Rect i2 = l2 != null ? SelectionManagerKt.i(l2) : null;
        if (i2 == null) {
            return Rect.f15860e.a();
        }
        LayoutCoordinates l3 = this.f6541z.h0();
        Offset d2 = l3 != null ? Offset.d(l3.o0(i2.t())) : null;
        Intrinsics.f(d2);
        Rect c2 = RectKt.c(d2.t(), i2.q());
        Rect e2 = this.f6541z.T();
        if (c2.z(e2)) {
            rect = e2;
        }
        return (rect == null || (x2 = rect.x(c2)) == null) ? Rect.f15860e.a() : x2;
    }
}
