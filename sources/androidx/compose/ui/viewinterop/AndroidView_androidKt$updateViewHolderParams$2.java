package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$updateViewHolderParams$2 extends Lambda implements Function2<LayoutNode, Density, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$2 f19244z = new AndroidView_androidKt$updateViewHolderParams$2();

    public AndroidView_androidKt$updateViewHolderParams$2() {
        super(2);
    }

    public final void b(LayoutNode layoutNode, Density density) {
        AndroidView_androidKt.f(layoutNode).setDensity(density);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (Density) obj2);
        return Unit.f40552a;
    }
}
