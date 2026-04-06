package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MagnifierNode$anchorPositionInRoot$1 extends Lambda implements Function0<Offset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MagnifierNode f3099z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierNode$anchorPositionInRoot$1(MagnifierNode magnifierNode) {
        super(0);
        this.f3099z = magnifierNode;
    }

    public final long b() {
        LayoutCoordinates a3 = this.f3099z.N();
        return a3 != null ? LayoutCoordinatesKt.f(a3) : Offset.f15855b.b();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.d(b());
    }
}
