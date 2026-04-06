package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public TransformedTextFieldState P;
    public TextFieldSelectionState Q;
    public TextLayoutState R;
    public boolean S;
    public final MutableState T = SnapshotStateKt__SnapshotStateKt.e(IntSize.b(IntSize.f19170b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);
    public final Animatable U = new Animatable(Offset.d(TextFieldMagnifierKt.a(this.P, this.Q, this.R, n3())), SelectionMagnifierKt.g(), Offset.d(SelectionMagnifierKt.f()), (String) null, 8, (DefaultConstructorMarker) null);
    public final MagnifierNode V = ((MagnifierNode) Z2(new MagnifierNode(new TextFieldMagnifierNodeImpl28$magnifierNode$1(this), (Function1) null, new TextFieldMagnifierNodeImpl28$magnifierNode$2(this), 0.0f, true, 0, 0.0f, 0.0f, false, (PlatformMagnifierFactory) null, 1002, (DefaultConstructorMarker) null)));
    public Job W;

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z2) {
        this.P = transformedTextFieldState;
        this.Q = textFieldSelectionState;
        this.R = textLayoutState;
        this.S = z2;
    }

    public void I2() {
        o3();
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        this.V.J(layoutCoordinates);
    }

    public void U(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        this.V.U(contentDrawScope);
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.V.W(semanticsPropertyReceiver);
    }

    public void f3(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z2) {
        TransformedTextFieldState transformedTextFieldState2 = this.P;
        TextFieldSelectionState textFieldSelectionState2 = this.Q;
        TextLayoutState textLayoutState2 = this.R;
        boolean z3 = this.S;
        this.P = transformedTextFieldState;
        this.Q = textFieldSelectionState;
        this.R = textLayoutState;
        this.S = z2;
        if (!Intrinsics.d(transformedTextFieldState, transformedTextFieldState2) || !Intrinsics.d(textFieldSelectionState, textFieldSelectionState2) || !Intrinsics.d(textLayoutState, textLayoutState2) || z2 != z3) {
            o3();
        }
    }

    public final long n3() {
        return ((IntSize) this.T.getValue()).j();
    }

    public final void o3() {
        Job job = this.W;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        this.W = null;
        if (Magnifier_androidKt.d(0, 1, (Object) null)) {
            this.W = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, (Continuation) null), 3, (Object) null);
        }
    }

    public final void p3(long j2) {
        this.T.setValue(IntSize.b(j2));
    }
}
