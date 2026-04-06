package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1 extends Lambda implements Function1<FocusState, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f5701A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5702B;
    public final /* synthetic */ TextInputService C;
    public final /* synthetic */ TextFieldValue D;
    public final /* synthetic */ ImeOptions E;
    public final /* synthetic */ OffsetMapping F;
    public final /* synthetic */ TextFieldSelectionManager G;
    public final /* synthetic */ CoroutineScope H;
    public final /* synthetic */ BringIntoViewRequester I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5703z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1(LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.f5703z = legacyTextFieldState;
        this.f5701A = z2;
        this.f5702B = z3;
        this.C = textInputService;
        this.D = textFieldValue;
        this.E = imeOptions;
        this.F = offsetMapping;
        this.G = textFieldSelectionManager;
        this.H = coroutineScope;
        this.I = bringIntoViewRequester;
    }

    public final void b(FocusState focusState) {
        TextLayoutResultProxy l2;
        if (this.f5703z.f() != focusState.f()) {
            this.f5703z.F(focusState.f());
            if (!this.f5703z.f() || !this.f5701A || this.f5702B) {
                CoreTextFieldKt.m(this.f5703z);
            } else {
                CoreTextFieldKt.p(this.C, this.f5703z, this.D, this.E, this.F);
            }
            if (focusState.f() && (l2 = this.f5703z.l()) != null) {
                Job unused = BuildersKt__Builders_commonKt.d(this.H, (CoroutineContext) null, (CoroutineStart) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.I, this.D, this.f5703z, l2, this.F, (Continuation) null), 3, (Object) null);
            }
            if (!focusState.f()) {
                TextFieldSelectionManager.w(this.G, (Offset) null, 1, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusState) obj);
        return Unit.f40552a;
    }
}
