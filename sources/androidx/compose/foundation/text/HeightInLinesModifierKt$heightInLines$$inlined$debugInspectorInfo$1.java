package androidx.compose.foundation.text;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5739A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5740B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f5741z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(int i2, int i3, TextStyle textStyle) {
        super(1);
        this.f5741z = i2;
        this.f5739A = i3;
        this.f5740B = textStyle;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("heightInLines");
        inspectorInfo.a().b("minLines", Integer.valueOf(this.f5741z));
        inspectorInfo.a().b("maxLines", Integer.valueOf(this.f5739A));
        inspectorInfo.a().b("textStyle", this.f5740B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
