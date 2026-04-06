package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidContentCaptureManager$sendContentCaptureAppearEvents$1 extends Lambda implements Function2<Integer, SemanticsNode, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidContentCaptureManager f15638A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SemanticsNodeCopy f15639z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$sendContentCaptureAppearEvents$1(SemanticsNodeCopy semanticsNodeCopy, AndroidContentCaptureManager androidContentCaptureManager) {
        super(2);
        this.f15639z = semanticsNodeCopy;
        this.f15638A = androidContentCaptureManager;
    }

    public final void b(int i2, SemanticsNode semanticsNode) {
        if (!this.f15639z.a().a(semanticsNode.o())) {
            this.f15638A.K(i2, semanticsNode);
            this.f15638A.v();
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Number) obj).intValue(), (SemanticsNode) obj2);
        return Unit.f40552a;
    }
}
