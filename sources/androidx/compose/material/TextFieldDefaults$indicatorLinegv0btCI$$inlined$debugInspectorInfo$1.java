package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8735A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f8736B;
    public final /* synthetic */ TextFieldColors C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8737z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3) {
        super(1);
        this.f8737z = z2;
        this.f8735A = z3;
        this.f8736B = interactionSource;
        this.C = textFieldColors;
        this.D = f2;
        this.E = f3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("indicatorLine");
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f8737z));
        inspectorInfo.a().b("isError", Boolean.valueOf(this.f8735A));
        inspectorInfo.a().b("interactionSource", this.f8736B);
        inspectorInfo.a().b("colors", this.C);
        inspectorInfo.a().b("focusedIndicatorLineThickness", Dp.j(this.D));
        inspectorInfo.a().b("unfocusedIndicatorLineThickness", Dp.j(this.E));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
