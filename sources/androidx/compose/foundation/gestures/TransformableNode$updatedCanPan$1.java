package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransformableNode$updatedCanPan$1 extends Lambda implements Function1<Offset, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformableNode f3620z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableNode$updatedCanPan$1(TransformableNode transformableNode) {
        super(1);
        this.f3620z = transformableNode;
    }

    public final Boolean b(long j2) {
        return (Boolean) this.f3620z.Q.invoke(Offset.d(j2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Offset) obj).t());
    }
}
