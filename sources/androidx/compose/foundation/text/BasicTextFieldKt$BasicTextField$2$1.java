package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InputTransformation f5539A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5540B;
    public final /* synthetic */ HapticFeedback C;
    public final /* synthetic */ Clipboard D;
    public final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 E;
    public final /* synthetic */ Density F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f5541z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$2$1(TransformedTextFieldState transformedTextFieldState, InputTransformation inputTransformation, TextFieldSelectionState textFieldSelectionState, HapticFeedback hapticFeedback, Clipboard clipboard, BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, Density density, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.f5541z = transformedTextFieldState;
        this.f5539A = inputTransformation;
        this.f5540B = textFieldSelectionState;
        this.C = hapticFeedback;
        this.D = clipboard;
        this.E = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
        this.F = density;
        this.G = z2;
        this.H = z3;
        this.I = z4;
    }

    public final void invoke() {
        this.f5541z.F(this.f5539A);
        this.f5540B.H0(this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }
}
