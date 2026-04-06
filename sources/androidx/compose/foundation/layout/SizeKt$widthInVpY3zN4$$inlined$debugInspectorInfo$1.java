package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4191A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4192z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(float f2, float f3) {
        super(1);
        this.f4192z = f2;
        this.f4191A = f3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("widthIn");
        inspectorInfo.a().b("min", Dp.j(this.f4192z));
        inspectorInfo.a().b("max", Dp.j(this.f4191A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
