package androidx.compose.ui.contentcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidContentCaptureManager$updateBuffersOnAppeared$1 extends Lambda implements Function2<Integer, SemanticsNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidContentCaptureManager f15640z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$updateBuffersOnAppeared$1(AndroidContentCaptureManager androidContentCaptureManager) {
        super(2);
        this.f15640z = androidContentCaptureManager;
    }

    public final void b(int i2, SemanticsNode semanticsNode) {
        this.f15640z.K(i2, semanticsNode);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Number) obj).intValue(), (SemanticsNode) obj2);
        return Unit.f40552a;
    }
}
