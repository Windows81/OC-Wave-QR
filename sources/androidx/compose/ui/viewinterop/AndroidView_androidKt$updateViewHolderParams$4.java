package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$updateViewHolderParams$4 extends Lambda implements Function2<LayoutNode, SavedStateRegistryOwner, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidView_androidKt$updateViewHolderParams$4 f19246z = new AndroidView_androidKt$updateViewHolderParams$4();

    public AndroidView_androidKt$updateViewHolderParams$4() {
        super(2);
    }

    public final void b(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner) {
        AndroidView_androidKt.f(layoutNode).setSavedStateRegistryOwner(savedStateRegistryOwner);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
        return Unit.f40552a;
    }
}
