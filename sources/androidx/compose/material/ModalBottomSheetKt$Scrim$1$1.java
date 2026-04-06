package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class ModalBottomSheetKt$Scrim$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f8005A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8006z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$1$1(long j2, State state) {
        super(1);
        this.f8006z = j2;
        this.f8005A = state;
    }

    public final void b(DrawScope drawScope) {
        DrawScope.A1(drawScope, this.f8006z, 0, 0, RangesKt.n(ModalBottomSheetKt.d(this.f8005A), 0.0f, 1.0f), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
