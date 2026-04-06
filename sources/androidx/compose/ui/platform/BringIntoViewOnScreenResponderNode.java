package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

@Metadata
final class BringIntoViewOnScreenResponderNode extends Modifier.Node implements BringIntoViewModifierNode {
    public ViewGroup N;

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.N = viewGroup;
    }

    public Object W1(LayoutCoordinates layoutCoordinates, Function0 function0, Continuation continuation) {
        long f2 = LayoutCoordinatesKt.f(layoutCoordinates);
        Rect rect = (Rect) function0.invoke();
        Rect B2 = rect != null ? rect.B(f2) : null;
        if (B2 != null) {
            this.N.requestRectangleOnScreen(RectHelper_androidKt.a(B2), false);
        }
        return Unit.f40552a;
    }

    public final void Z2(ViewGroup viewGroup) {
        this.N = viewGroup;
    }
}
