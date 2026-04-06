package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PaddingKt$padding$3 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4115z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$3(float f2) {
        super(1);
        this.f4115z = f2;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("padding");
        inspectorInfo.c(Dp.j(this.f4115z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
