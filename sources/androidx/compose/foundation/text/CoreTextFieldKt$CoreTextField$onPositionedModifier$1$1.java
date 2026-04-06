package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5704A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ WindowInfo f5705B;
    public final /* synthetic */ TextFieldSelectionManager C;
    public final /* synthetic */ TextFieldValue D;
    public final /* synthetic */ OffsetMapping E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5706z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1(LegacyTextFieldState legacyTextFieldState, boolean z2, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.f5706z = legacyTextFieldState;
        this.f5704A = z2;
        this.f5705B = windowInfo;
        this.C = textFieldSelectionManager;
        this.D = textFieldValue;
        this.E = offsetMapping;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        this.f5706z.J(layoutCoordinates);
        TextLayoutResultProxy l2 = this.f5706z.l();
        if (l2 != null) {
            l2.i(layoutCoordinates);
        }
        if (this.f5704A) {
            if (this.f5706z.e() == HandleState.Selection) {
                if (!this.f5706z.u() || !this.f5705B.b()) {
                    this.C.X();
                } else {
                    this.C.t0();
                }
                this.f5706z.Q(TextFieldSelectionManagerKt.c(this.C, true));
                this.f5706z.P(TextFieldSelectionManagerKt.c(this.C, false));
                this.f5706z.N(TextRange.h(this.D.h()));
            } else if (this.f5706z.e() == HandleState.Cursor) {
                this.f5706z.N(TextFieldSelectionManagerKt.c(this.C, true));
            }
            CoreTextFieldKt.n(this.f5706z, this.D, this.E);
            TextLayoutResultProxy l3 = this.f5706z.l();
            if (l3 != null) {
                LegacyTextFieldState legacyTextFieldState = this.f5706z;
                TextFieldValue textFieldValue = this.D;
                OffsetMapping offsetMapping = this.E;
                TextInputSession h2 = legacyTextFieldState.h();
                if (h2 != null && legacyTextFieldState.f()) {
                    TextFieldDelegate.f5899a.k(h2, textFieldValue, offsetMapping, l3);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}
