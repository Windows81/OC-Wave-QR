package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$drawModifier$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5698A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5699B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5700z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$drawModifier$1$1(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.f5700z = legacyTextFieldState;
        this.f5698A = textFieldValue;
        this.f5699B = offsetMapping;
    }

    public final void b(DrawScope drawScope) {
        TextLayoutResultProxy l2 = this.f5700z.l();
        if (l2 != null) {
            TextFieldValue textFieldValue = this.f5698A;
            LegacyTextFieldState legacyTextFieldState = this.f5700z;
            OffsetMapping offsetMapping = this.f5699B;
            Canvas j2 = drawScope.G1().j();
            TextFieldDelegate.f5899a.b(j2, textFieldValue, legacyTextFieldState.s(), legacyTextFieldState.d(), offsetMapping, l2.f(), legacyTextFieldState.g(), legacyTextFieldState.r());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
