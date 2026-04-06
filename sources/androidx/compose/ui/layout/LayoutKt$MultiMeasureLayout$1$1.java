package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LayoutKt$MultiMeasureLayout$1$1 extends Lambda implements Function1<LayoutNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final LayoutKt$MultiMeasureLayout$1$1 f17054z = new LayoutKt$MultiMeasureLayout$1$1();

    public LayoutKt$MultiMeasureLayout$1$1() {
        super(1);
    }

    public final void b(LayoutNode layoutNode) {
        layoutNode.L1(true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutNode) obj);
        return Unit.f40552a;
    }
}
