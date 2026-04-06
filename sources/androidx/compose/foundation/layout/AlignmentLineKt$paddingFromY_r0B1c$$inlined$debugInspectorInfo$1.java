package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f3717A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f3718B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AlignmentLine f3719z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("paddingFrom");
        inspectorInfo.a().b("alignmentLine", this.f3719z);
        inspectorInfo.a().b("before", TextUnit.b(this.f3717A));
        inspectorInfo.a().b("after", TextUnit.b(this.f3718B));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
