package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackgroundKt$background$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Brush f2920A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shape f2921B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f2922z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("background");
        inspectorInfo.a().b("alpha", Float.valueOf(this.f2922z));
        inspectorInfo.a().b("brush", this.f2920A);
        inspectorInfo.a().b("shape", this.f2921B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
