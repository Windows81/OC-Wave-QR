package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PaddingKt$padding$2 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4113A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4114z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$2(float f2, float f3) {
        super(1);
        this.f4114z = f2;
        this.f4113A = f3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("padding");
        inspectorInfo.a().b("horizontal", Dp.j(this.f4114z));
        inspectorInfo.a().b("vertical", Dp.j(this.f4113A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
