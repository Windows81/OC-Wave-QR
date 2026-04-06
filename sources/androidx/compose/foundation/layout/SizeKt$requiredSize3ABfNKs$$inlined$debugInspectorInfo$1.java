package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4175z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(float f2) {
        super(1);
        this.f4175z = f2;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("requiredSize");
        inspectorInfo.c(Dp.j(this.f4175z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
