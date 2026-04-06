package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class PaddingKt$absolutePadding$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4107A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f4108B;
    public final /* synthetic */ float C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4109z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("absolutePadding");
        inspectorInfo.a().b("left", Dp.j(this.f4109z));
        inspectorInfo.a().b("top", Dp.j(this.f4107A));
        inspectorInfo.a().b("right", Dp.j(this.f4108B));
        inspectorInfo.a().b("bottom", Dp.j(this.C));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
