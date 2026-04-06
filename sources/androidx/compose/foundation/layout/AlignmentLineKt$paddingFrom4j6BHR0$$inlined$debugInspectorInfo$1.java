package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f3714A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f3715B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AlignmentLine f3716z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(AlignmentLine alignmentLine, float f2, float f3) {
        super(1);
        this.f3716z = alignmentLine;
        this.f3714A = f2;
        this.f3715B = f3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("paddingFrom");
        inspectorInfo.a().b("alignmentLine", this.f3716z);
        inspectorInfo.a().b("before", Dp.j(this.f3714A));
        inspectorInfo.a().b("after", Dp.j(this.f3715B));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
