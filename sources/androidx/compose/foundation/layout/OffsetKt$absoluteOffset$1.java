package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class OffsetKt$absoluteOffset$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4088A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4089z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("absoluteOffset");
        inspectorInfo.a().b("x", Dp.j(this.f4089z));
        inspectorInfo.a().b("y", Dp.j(this.f4088A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
