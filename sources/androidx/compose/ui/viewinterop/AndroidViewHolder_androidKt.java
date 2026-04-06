package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata
public final class AndroidViewHolder_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 f19226a = new AndroidViewHolder_androidKt$NoOpScrollConnection$1();

    public static final void f(View view, LayoutNode layoutNode) {
        long f2 = LayoutCoordinatesKt.f(layoutNode.w());
        int round = Math.round(Float.intBitsToFloat((int) (f2 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (f2 & 4294967295L)));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }

    public static final float g(int i2) {
        return ((float) i2) * ((float) -1);
    }

    public static final float h(float f2) {
        return f2 * -1.0f;
    }

    public static final int i(int i2) {
        return i2 == 0 ? NestedScrollSource.f16795b.b() : NestedScrollSource.f16795b.a();
    }
}
