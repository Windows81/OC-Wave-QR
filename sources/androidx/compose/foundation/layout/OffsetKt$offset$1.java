package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OffsetKt$offset$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4091A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4092z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetKt$offset$1(float f2, float f3) {
        super(1);
        this.f4092z = f2;
        this.f4091A = f3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("offset");
        inspectorInfo.a().b("x", Dp.j(this.f4092z));
        inspectorInfo.a().b("y", Dp.j(this.f4091A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
