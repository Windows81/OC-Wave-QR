package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$updateViewHolderParams$1 extends Lambda implements Function2<LayoutNode, Modifier, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$1 f19243z = new AndroidView_androidKt$updateViewHolderParams$1();

    public AndroidView_androidKt$updateViewHolderParams$1() {
        super(2);
    }

    public final void b(LayoutNode layoutNode, Modifier modifier) {
        AndroidView_androidKt.f(layoutNode).setModifier(modifier);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (Modifier) obj2);
        return Unit.f40552a;
    }
}
