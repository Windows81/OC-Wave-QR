package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5435A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Role f5436B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f5437z;

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("triStateToggleable");
        inspectorInfo.a().b("state", this.f5437z);
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f5435A));
        inspectorInfo.a().b("role", this.f5436B);
        inspectorInfo.a().b("onClick", this.C);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
