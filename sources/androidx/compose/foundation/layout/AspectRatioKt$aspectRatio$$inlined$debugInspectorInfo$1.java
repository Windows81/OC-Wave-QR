package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f3774A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f3775z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(float f2, boolean z2) {
        super(1);
        this.f3775z = f2;
        this.f3774A = z2;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("aspectRatio");
        inspectorInfo.a().b("ratio", Float.valueOf(this.f3775z));
        inspectorInfo.a().b("matchHeightConstraintsFirst", Boolean.valueOf(this.f3774A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
