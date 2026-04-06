package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements Function2<DeviceRenderNode, Matrix, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final RenderNodeLayer$Companion$getMatrix$1 f17865z = new RenderNodeLayer$Companion$getMatrix$1();

    public RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    public final void b(DeviceRenderNode deviceRenderNode, Matrix matrix) {
        deviceRenderNode.L(matrix);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((DeviceRenderNode) obj, (Matrix) obj2);
        return Unit.f40552a;
    }
}
