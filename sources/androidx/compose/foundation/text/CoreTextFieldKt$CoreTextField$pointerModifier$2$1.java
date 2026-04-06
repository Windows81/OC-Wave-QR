package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$pointerModifier$2$1 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusRequester f5708A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5709B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ TextFieldSelectionManager D;
    public final /* synthetic */ OffsetMapping E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5710z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$2$1(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z2, boolean z3, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        super(1);
        this.f5710z = legacyTextFieldState;
        this.f5708A = focusRequester;
        this.f5709B = z2;
        this.C = z3;
        this.D = textFieldSelectionManager;
        this.E = offsetMapping;
    }

    public final void b(long j2) {
        CoreTextFieldKt.q(this.f5710z, this.f5708A, !this.f5709B);
        if (this.f5710z.f() && this.C) {
            if (this.f5710z.e() != HandleState.Selection) {
                TextLayoutResultProxy l2 = this.f5710z.l();
                if (l2 != null) {
                    LegacyTextFieldState legacyTextFieldState = this.f5710z;
                    long j3 = j2;
                    TextFieldDelegate.f5899a.j(j3, l2, legacyTextFieldState.p(), this.E, legacyTextFieldState.o());
                    if (legacyTextFieldState.x().k().length() > 0) {
                        legacyTextFieldState.E(HandleState.Cursor);
                        return;
                    }
                    return;
                }
                return;
            }
            this.D.v(Offset.d(j2));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
