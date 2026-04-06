package androidx.compose.material3.internal;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class I implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SemanticsPropertyReceiver f12250z;

    public /* synthetic */ I(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.f12250z = semanticsPropertyReceiver;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(ChildSemanticsNode.b3(this.f12250z, (TraversableNode) obj));
    }
}
