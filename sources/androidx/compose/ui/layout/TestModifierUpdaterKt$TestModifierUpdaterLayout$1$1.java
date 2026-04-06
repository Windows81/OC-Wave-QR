package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends Lambda implements Function1<LayoutNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f17175z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(Function1 function1) {
        super(1);
        this.f17175z = function1;
    }

    public final void b(LayoutNode layoutNode) {
        this.f17175z.invoke(new TestModifierUpdater(layoutNode));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutNode) obj);
        return Unit.f40552a;
    }
}
