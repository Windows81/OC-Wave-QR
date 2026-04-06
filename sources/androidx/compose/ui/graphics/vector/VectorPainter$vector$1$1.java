package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorPainter$vector$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ VectorPainter f16665z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainter$vector$1$1(VectorPainter vectorPainter) {
        super(0);
        this.f16665z = vectorPainter;
    }

    public final void invoke() {
        if (this.f16665z.L == this.f16665z.r()) {
            VectorPainter vectorPainter = this.f16665z;
            vectorPainter.v(vectorPainter.r() + 1);
        }
    }
}
