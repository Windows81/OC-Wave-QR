package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeChainKt$fillVector$1 extends Lambda implements Function1<Modifier.Element, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableVector f17391z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeChainKt$fillVector$1(MutableVector mutableVector) {
        super(1);
        this.f17391z = mutableVector;
    }

    /* renamed from: b */
    public final Boolean invoke(Modifier.Element element) {
        this.f17391z.d(element);
        return Boolean.TRUE;
    }
}
