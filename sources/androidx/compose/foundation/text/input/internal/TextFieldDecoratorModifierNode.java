package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public TransformedTextFieldState P;
    public TextLayoutState Q;
    public TextFieldSelectionState R;
    public InputTransformation S;
    public boolean T;
    public boolean U;
    public KeyboardOptions V;
    public KeyboardActionHandler W;
    public boolean X;
    public MutableInteractionSource Y;
    public boolean Z;
    public MutableSharedFlow a0;
    public final SuspendingPointerInputModifierNode b0 = ((SuspendingPointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new TextFieldDecoratorModifierNode$pointerInputNode$1(this))));
    public HoverInteraction.Enter c0;
    public final DragAndDropTargetModifierNode d0 = ((DragAndDropTargetModifierNode) Z2(TextFieldDragAndDropNode_androidKt.b(new TextFieldDecoratorModifierNode$dragAndDropNode$1(this), new TextFieldDecoratorModifierNode$dragAndDropNode$2(this), new TextFieldDecoratorModifierNode$dragAndDropNode$3(this), (Function1) null, new TextFieldDecoratorModifierNode$dragAndDropNode$4(this), new TextFieldDecoratorModifierNode$dragAndDropNode$5(this), (Function1) null, new TextFieldDecoratorModifierNode$dragAndDropNode$6(this), new TextFieldDecoratorModifierNode$dragAndDropNode$7(this), 72, (Object) null)));
    public boolean e0;
    public WindowInfo f0;
    public Job g0;
    public final TextFieldKeyEventHandler h0 = TextFieldKeyEventHandler_androidKt.b();
    public final TextFieldDecoratorModifierNode$keyboardActionScope$1 i0 = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
    public final Function1 j0 = ClipboardKeyCommandsHandler.a(new TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1(this));
    public Job k0;
    public final Function0 l0 = new TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1(this);
    public final MutableState m0 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, MutableSharedFlow mutableSharedFlow) {
        this.P = transformedTextFieldState;
        this.Q = textLayoutState;
        this.R = textFieldSelectionState;
        this.S = inputTransformation;
        this.T = z2;
        this.U = z3;
        this.V = keyboardOptions;
        this.W = keyboardActionHandler;
        this.X = z4;
        this.Y = mutableInteractionSource;
        this.Z = z5;
        this.a0 = mutableSharedFlow;
        textFieldSelectionState.B0(new Function0<Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ TextFieldDecoratorModifierNode f6303z;

            {
                this.f6303z = r1;
            }

            public final void invoke() {
                DelegatableNodeKt.i(this.f6303z);
            }
        });
    }

    /* access modifiers changed from: private */
    public final boolean D3() {
        WindowInfo windowInfo = this.f0;
        return this.e0 && (windowInfo != null && windowInfo.b());
    }

    public final TextFieldSelectionState A3() {
        return this.R;
    }

    public final TransformedTextFieldState B3() {
        return this.P;
    }

    public final TextLayoutState C3() {
        return this.Q;
    }

    public final Object E3(Continuation continuation) {
        Object a2 = FlowKt.e0(FlowKt.w(SnapshotStateKt.q(new TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2(this)), 1), 1).a(new TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3(this), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final void F3() {
        this.R.x0(D3());
        if (D3() && this.g0 == null) {
            this.g0 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TextFieldDecoratorModifierNode$onFocusChange$1(this, (Continuation) null), 3, (Object) null);
        } else if (!D3()) {
            Job job = this.g0;
            if (job != null) {
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            }
            this.g0 = null;
        }
    }

    public final void G3(int i2) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.f18821b;
        if (ImeAction.m(i2, companion.e()) || ImeAction.m(i2, companion.a()) || (keyboardActionHandler = this.W) == null) {
            this.i0.a(i2);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.a(new TextFieldDecoratorModifierNode$onImeActionPerformed$1(this, i2));
        }
    }

    public final SoftwareKeyboardController H3() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.q());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    public void I2() {
        L1();
        this.R.A0(this.l0);
    }

    public final void I3(boolean z2) {
        this.m0.setValue(Boolean.valueOf(z2));
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        this.Q.n(layoutCoordinates);
    }

    public void J2() {
        r3();
        this.R.A0((Function0) null);
    }

    public final void J3(boolean z2) {
        if (z2 || this.V.m()) {
            this.k0 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.b(this), (Continuation) null), 3, (Object) null);
        }
    }

    public final void K3(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, MutableSharedFlow mutableSharedFlow) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z6;
        Job job;
        TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
        TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
        boolean z7 = z2;
        boolean z8 = z3;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z9 = z5;
        MutableSharedFlow mutableSharedFlow2 = mutableSharedFlow;
        boolean z10 = this.T;
        boolean z11 = z10 && !this.U;
        TransformedTextFieldState transformedTextFieldState3 = this.P;
        KeyboardOptions keyboardOptions3 = this.V;
        TextFieldSelectionState textFieldSelectionState4 = this.R;
        MutableInteractionSource mutableInteractionSource3 = this.Y;
        boolean z12 = this.Z;
        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
        MutableSharedFlow mutableSharedFlow3 = this.a0;
        if (!z7 || z8) {
            textFieldSelectionState2 = textFieldSelectionState4;
            z6 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState4;
            z6 = true;
        }
        this.P = transformedTextFieldState2;
        boolean z13 = z12;
        this.Q = textLayoutState;
        this.R = textFieldSelectionState3;
        this.S = inputTransformation;
        this.T = z7;
        this.U = z8;
        this.V = keyboardOptions2;
        this.W = keyboardActionHandler;
        this.X = z4;
        this.Y = mutableInteractionSource2;
        this.Z = z9;
        this.a0 = mutableSharedFlow2;
        if (z6 != z11 || !Intrinsics.d(transformedTextFieldState2, transformedTextFieldState3) || !Intrinsics.d(keyboardOptions2, keyboardOptions3) || !Intrinsics.d(mutableSharedFlow2, mutableSharedFlow3)) {
            if (z6 && D3()) {
                J3(false);
            } else if (!z6) {
                r3();
            }
        }
        if (!(z7 == z10 && z6 == z11 && ImeAction.m(keyboardOptions.j(), keyboardOptions3.j()) && z9 == z13)) {
            SemanticsModifierNodeKt.b(this);
        }
        if (!Intrinsics.d(textFieldSelectionState3, textFieldSelectionState2)) {
            this.b0.u2();
            if (F2()) {
                textFieldSelectionState3.A0(this.l0);
                if (D3() && (job = this.g0) != null) {
                    if (job != null) {
                        Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.g0 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TextFieldDecoratorModifierNode$updateNode$1(textFieldSelectionState3, (Continuation) null), 3, (Object) null);
                }
            }
            textFieldSelectionState3.B0(new TextFieldDecoratorModifierNode$updateNode$2(this));
        }
        if (!Intrinsics.d(mutableInteractionSource2, mutableInteractionSource4)) {
            this.b0.u2();
        }
    }

    public boolean L0(KeyEvent keyEvent) {
        return this.h0.b(keyEvent, this.P, this.Q, this.R, this.j0, this.T && !this.U, this.X, new TextFieldDecoratorModifierNode$onKeyEvent$1(this));
    }

    public void L1() {
        ObserverModifierNodeKt.a(this, new TextFieldDecoratorModifierNode$onObservedReadsChanged$1(this));
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.b0.S0(pointerEvent, pointerEventPass, j2);
    }

    public void U(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        if (t3()) {
            DrawScope.A1(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.a(this, AutofillHighlightKt.a())).v(), 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence l2 = this.P.l();
        long g2 = l2.g();
        SemanticsPropertiesKt.l0(semanticsPropertyReceiver, new AnnotatedString(this.P.n().toString(), (List) null, 2, (DefaultConstructorMarker) null));
        SemanticsPropertiesKt.i0(semanticsPropertyReceiver, new AnnotatedString(l2.toString(), (List) null, 2, (DefaultConstructorMarker) null));
        SemanticsPropertiesKt.C0(semanticsPropertyReceiver, g2);
        if (!this.T) {
            SemanticsPropertiesKt.l(semanticsPropertyReceiver);
        }
        if (this.Z) {
            SemanticsPropertiesKt.P(semanticsPropertyReceiver);
        }
        boolean z2 = this.T && !this.U;
        SemanticsPropertiesKt.h0(semanticsPropertyReceiver, z2);
        SemanticsPropertiesKt.d0(semanticsPropertyReceiver, ContentDataType.f15591a.a());
        SemanticsPropertiesKt.A(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$1(z2, this), 1, (Object) null);
        SemanticsPropertiesKt.u(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$2(this), 1, (Object) null);
        if (z2) {
            SemanticsPropertiesKt.B0(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$3(z2, this), 1, (Object) null);
            SemanticsPropertiesKt.x(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$4(z2, this), 1, (Object) null);
        }
        SemanticsPropertiesKt.v0(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$5(this), 1, (Object) null);
        int j2 = this.V.j();
        SemanticsPropertiesKt.E(semanticsPropertyReceiver, j2, (String) null, new TextFieldDecoratorModifierNode$applySemantics$6(this, j2), 2, (Object) null);
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$7(this), 1, (Object) null);
        SemanticsPropertiesKt.G(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$8(this), 1, (Object) null);
        if (!TextRange.h(g2) && !this.Z) {
            SemanticsPropertiesKt.h(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$9(this), 1, (Object) null);
            if (this.T && !this.U) {
                SemanticsPropertiesKt.j(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$10(this), 1, (Object) null);
            }
        }
        if (z2) {
            SemanticsPropertiesKt.R(semanticsPropertyReceiver, (String) null, new TextFieldDecoratorModifierNode$applySemantics$11(this), 1, (Object) null);
        }
        InputTransformation inputTransformation = this.S;
        if (inputTransformation != null) {
            inputTransformation.W(semanticsPropertyReceiver);
        }
    }

    public void X(FocusState focusState) {
        if (this.e0 != focusState.f()) {
            this.e0 = focusState.f();
            F3();
            boolean z2 = this.T && !this.U;
            if (!focusState.f()) {
                r3();
                TransformedTextFieldState transformedTextFieldState = this.P;
                TextFieldState e2 = transformedTextFieldState.f6397a;
                InputTransformation c2 = transformedTextFieldState.f6398b;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                e2.g().e().e();
                TextFieldBuffer g2 = e2.g();
                g2.d();
                transformedTextFieldState.G(g2);
                e2.e(c2, true, textFieldEditUndoBehavior);
                this.P.h();
            } else if (z2) {
                J3(false);
            }
        }
    }

    public void X0() {
        this.b0.X0();
    }

    public boolean e0(KeyEvent keyEvent) {
        return this.h0.c(keyEvent, this.P, this.R, (FocusManager) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.h()), H3());
    }

    public boolean i2() {
        return true;
    }

    public void q(long j2) {
        this.d0.q(j2);
    }

    public final void r3() {
        Job job = this.k0;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        this.k0 = null;
        MutableSharedFlow mutableSharedFlow = this.a0;
        if (mutableSharedFlow != null) {
            mutableSharedFlow.h();
        }
    }

    public final void s3() {
        HoverInteraction.Enter enter = this.c0;
        if (enter != null) {
            this.Y.b(new HoverInteraction.Exit(enter));
            this.c0 = null;
        }
    }

    public final boolean t3() {
        return ((Boolean) this.m0.getValue()).booleanValue();
    }

    public void u(LayoutCoordinates layoutCoordinates) {
        this.d0.u(layoutCoordinates);
    }

    public final boolean u3() {
        return this.T;
    }

    public final MutableInteractionSource v3() {
        return this.Y;
    }

    public final KeyboardOptions w3() {
        return this.V;
    }

    public final boolean x3() {
        return this.U;
    }

    public final boolean y3() {
        return this.X;
    }

    public final MutableSharedFlow z3() {
        return this.a0;
    }
}
