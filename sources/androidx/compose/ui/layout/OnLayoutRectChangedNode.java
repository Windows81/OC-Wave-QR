package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OnLayoutRectChangedNode extends Modifier.Node {
    public long N;
    public long O;
    public Function1 P;
    public DelegatableNode.RegistrationHandle Q;

    public OnLayoutRectChangedNode(long j2, long j3, Function1 function1) {
        this.N = j2;
        this.O = j3;
        this.P = function1;
    }

    public void I2() {
        Z2();
    }

    public void J2() {
        DelegatableNode.RegistrationHandle registrationHandle = this.Q;
        if (registrationHandle != null) {
            registrationHandle.a();
        }
    }

    public final void Z2() {
        DelegatableNode.RegistrationHandle registrationHandle = this.Q;
        if (registrationHandle != null) {
            registrationHandle.a();
        }
        this.Q = OnLayoutRectChangedModifierKt.a(this, this.N, this.O, this.P);
    }

    public final void a3(Function1 function1) {
        this.P = function1;
    }

    public final void b3(long j2) {
        this.O = j2;
    }

    public final void c3(long j2) {
        this.N = j2;
    }
}
