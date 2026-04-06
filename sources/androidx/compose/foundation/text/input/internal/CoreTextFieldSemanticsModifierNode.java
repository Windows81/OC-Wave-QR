package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public TransformedText P;
    public TextFieldValue Q;
    public LegacyTextFieldState R;
    public boolean S;
    public boolean T;
    public boolean U;
    public OffsetMapping V;
    public TextFieldSelectionManager W;
    public ImeOptions X;
    public FocusRequester Y;

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, boolean z4, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.P = transformedText;
        this.Q = textFieldValue;
        this.R = legacyTextFieldState;
        this.S = z2;
        this.T = z3;
        this.U = z4;
        this.V = offsetMapping;
        this.W = textFieldSelectionManager;
        this.X = imeOptions;
        this.Y = focusRequester;
        textFieldSelectionManager.n0(new Function0<Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6144z;

            {
                this.f6144z = r1;
            }

            public final void invoke() {
                DelegatableNodeKt.i(this.f6144z);
            }
        });
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.l0(semanticsPropertyReceiver, this.Q.f());
        SemanticsPropertiesKt.i0(semanticsPropertyReceiver, this.P.b());
        SemanticsPropertiesKt.C0(semanticsPropertyReceiver, this.Q.h());
        SemanticsPropertiesKt.d0(semanticsPropertyReceiver, ContentDataType.f15591a.a());
        SemanticsPropertiesKt.A(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$1(this), 1, (Object) null);
        if (!this.T) {
            SemanticsPropertiesKt.l(semanticsPropertyReceiver);
        }
        if (this.U) {
            SemanticsPropertiesKt.P(semanticsPropertyReceiver);
        }
        boolean z2 = this.T && !this.S;
        SemanticsPropertiesKt.h0(semanticsPropertyReceiver, z2);
        SemanticsPropertiesKt.u(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$2(this), 1, (Object) null);
        if (z2) {
            SemanticsPropertiesKt.B0(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$3(this), 1, (Object) null);
            SemanticsPropertiesKt.x(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$4(this, semanticsPropertyReceiver), 1, (Object) null);
        }
        SemanticsPropertiesKt.v0(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$5(this), 1, (Object) null);
        SemanticsPropertiesKt.E(semanticsPropertyReceiver, this.X.e(), (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$6(this), 2, (Object) null);
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$7(this), 1, (Object) null);
        SemanticsPropertiesKt.G(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$8(this), 1, (Object) null);
        if (!TextRange.h(this.Q.h()) && !this.U) {
            SemanticsPropertiesKt.h(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$9(this), 1, (Object) null);
            if (this.T && !this.S) {
                SemanticsPropertiesKt.j(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$10(this), 1, (Object) null);
            }
        }
        if (this.T && !this.S) {
            SemanticsPropertiesKt.R(semanticsPropertyReceiver, (String) null, new CoreTextFieldSemanticsModifierNode$applySemantics$11(this), 1, (Object) null);
        }
    }

    public final FocusRequester d1() {
        return this.Y;
    }

    public final boolean g3() {
        return this.T;
    }

    public final ImeOptions h3() {
        return this.X;
    }

    public boolean i2() {
        return true;
    }

    public final TextFieldSelectionManager i3() {
        return this.W;
    }

    public final OffsetMapping j3() {
        return this.V;
    }

    public final boolean k3() {
        return this.S;
    }

    public final LegacyTextFieldState l3() {
        return this.R;
    }

    public final TextFieldValue m3() {
        return this.Q;
    }

    public final void n3(LegacyTextFieldState legacyTextFieldState, String str, boolean z2, boolean z3) {
        Unit unit;
        if (!z2 && z3) {
            TextInputSession h2 = legacyTextFieldState.h();
            if (h2 != null) {
                TextFieldDelegate.f5899a.g(CollectionsKt.p(new DeleteAllCommand(), new CommitTextCommand(str, 1)), legacyTextFieldState.p(), legacyTextFieldState.o(), h2);
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            if (unit == null) {
                legacyTextFieldState.o().invoke(new TextFieldValue(str, TextRangeKt.a(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
        }
    }

    public final void o3(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, boolean z4, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z5 = z2;
        boolean z6 = z3;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        ImeOptions imeOptions2 = imeOptions;
        boolean z7 = this.T;
        boolean z8 = false;
        boolean z9 = z7 && !this.S;
        boolean z10 = this.U;
        ImeOptions imeOptions3 = this.X;
        TextFieldSelectionManager textFieldSelectionManager3 = this.W;
        if (z6 && !z5) {
            z8 = true;
        }
        this.P = transformedText;
        this.Q = textFieldValue;
        this.R = legacyTextFieldState;
        this.S = z5;
        this.T = z6;
        this.V = offsetMapping;
        this.W = textFieldSelectionManager2;
        this.X = imeOptions2;
        this.Y = focusRequester;
        if (!(z6 == z7 && z8 == z9 && Intrinsics.d(imeOptions2, imeOptions3) && z4 == z10 && TextRange.h(textFieldValue.h()))) {
            SemanticsModifierNodeKt.b(this);
        }
        if (!Intrinsics.d(textFieldSelectionManager2, textFieldSelectionManager3)) {
            textFieldSelectionManager2.n0(new CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1(this));
        }
    }
}
