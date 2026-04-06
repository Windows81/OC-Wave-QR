package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class LegacyAdaptingPlatformTextInputModifierNode extends Modifier.Node implements PlatformTextInputModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode {
    public LegacyPlatformTextInputServiceAdapter N;
    public LegacyTextFieldState O;
    public TextFieldSelectionManager P;
    public final MutableState Q = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public LegacyAdaptingPlatformTextInputModifierNode(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.N = legacyPlatformTextInputServiceAdapter;
        this.O = legacyTextFieldState;
        this.P = textFieldSelectionManager;
    }

    private void Z2(LayoutCoordinates layoutCoordinates) {
        this.Q.setValue(layoutCoordinates);
    }

    public Job C0(Function2 function2) {
        if (!F2()) {
            return null;
        }
        return BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this, function2, (Continuation) null), 1, (Object) null);
    }

    public void I2() {
        this.N.j(this);
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        Z2(layoutCoordinates);
    }

    public void J2() {
        this.N.l(this);
    }

    public LayoutCoordinates N() {
        return (LayoutCoordinates) this.Q.getValue();
    }

    public TextFieldSelectionManager W0() {
        return this.P;
    }

    public void a3(LegacyTextFieldState legacyTextFieldState) {
        this.O = legacyTextFieldState;
    }

    public final void b3(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        if (F2()) {
            this.N.c();
            this.N.l(this);
        }
        this.N = legacyPlatformTextInputServiceAdapter;
        if (F2()) {
            this.N.j(this);
        }
    }

    public void c3(TextFieldSelectionManager textFieldSelectionManager) {
        this.P = textFieldSelectionManager;
    }

    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.q());
    }

    public ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.t());
    }

    public LegacyTextFieldState h2() {
        return this.O;
    }
}
