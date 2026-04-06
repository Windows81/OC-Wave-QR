package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PaddingKt$padding$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4110A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f4111B;
    public final /* synthetic */ float C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4112z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$1(float f2, float f3, float f4, float f5) {
        super(1);
        this.f4112z = f2;
        this.f4110A = f3;
        this.f4111B = f4;
        this.C = f5;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("padding");
        inspectorInfo.a().b("start", Dp.j(this.f4112z));
        inspectorInfo.a().b("top", Dp.j(this.f4110A));
        inspectorInfo.a().b("end", Dp.j(this.f4111B));
        inspectorInfo.a().b("bottom", Dp.j(this.C));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
