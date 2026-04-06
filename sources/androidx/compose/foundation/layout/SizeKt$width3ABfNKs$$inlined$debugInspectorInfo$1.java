package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4190z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(float f2) {
        super(1);
        this.f4190z = f2;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("width");
        inspectorInfo.c(Dp.j(this.f4190z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
