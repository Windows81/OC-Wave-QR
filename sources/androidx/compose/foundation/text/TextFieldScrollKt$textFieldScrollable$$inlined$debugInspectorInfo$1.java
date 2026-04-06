package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5946A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5947B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f5948z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z2) {
        super(1);
        this.f5948z = textFieldScrollerPosition;
        this.f5946A = mutableInteractionSource;
        this.f5947B = z2;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("textFieldScrollable");
        inspectorInfo.a().b("scrollerPosition", this.f5948z);
        inspectorInfo.a().b("interactionSource", this.f5946A);
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.f5947B));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
