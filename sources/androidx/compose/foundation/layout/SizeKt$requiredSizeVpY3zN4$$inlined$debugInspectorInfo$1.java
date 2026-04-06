package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4176A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(float f2, float f3) {
        super(1);
        this.f4177z = f2;
        this.f4176A = f3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("requiredSize");
        inspectorInfo.a().b("width", Dp.j(this.f4177z));
        inspectorInfo.a().b("height", Dp.j(this.f4176A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
