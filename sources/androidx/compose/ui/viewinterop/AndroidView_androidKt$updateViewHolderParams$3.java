package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$updateViewHolderParams$3 extends Lambda implements Function2<LayoutNode, LifecycleOwner, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$3 f19245z = new AndroidView_androidKt$updateViewHolderParams$3();

    public AndroidView_androidKt$updateViewHolderParams$3() {
        super(2);
    }

    public final void b(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
        AndroidView_androidKt.f(layoutNode).setLifecycleOwner(lifecycleOwner);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (LifecycleOwner) obj2);
        return Unit.f40552a;
    }
}
