package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f4187A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f4188B;
    public final /* synthetic */ float C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4189z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f2, float f3, float f4, float f5) {
        super(1);
        this.f4189z = f2;
        this.f4187A = f3;
        this.f4188B = f4;
        this.C = f5;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("sizeIn");
        inspectorInfo.a().b("minWidth", Dp.j(this.f4189z));
        inspectorInfo.a().b("minHeight", Dp.j(this.f4187A));
        inspectorInfo.a().b("maxWidth", Dp.j(this.f4188B));
        inspectorInfo.a().b("maxHeight", Dp.j(this.C));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
