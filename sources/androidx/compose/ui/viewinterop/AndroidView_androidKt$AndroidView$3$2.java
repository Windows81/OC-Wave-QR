package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidView_androidKt$AndroidView$3$2 extends Lambda implements Function2<LayoutNode, Function1<View, ? extends Unit>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidView_androidKt$AndroidView$3$2 f19235z = new AndroidView_androidKt$AndroidView$3$2();

    public AndroidView_androidKt$AndroidView$3$2() {
        super(2);
    }

    public final void b(LayoutNode layoutNode, Function1 function1) {
        AndroidView_androidKt.f(layoutNode).setReleaseBlock(function1);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (Function1) obj2);
        return Unit.f40552a;
    }
}
