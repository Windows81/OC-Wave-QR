package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public final InteractionSource N;
    public final boolean O;
    public final float P;
    public final ColorProducer Q;
    public final Function0 R;
    public final boolean S;
    public StateLayer T;
    public float U;
    public long V;
    public boolean W;
    public final MutableObjectList X;

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z2, f2, colorProducer, function0);
    }

    public final boolean D2() {
        return this.S;
    }

    public void I2() {
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new RippleNode$onAttach$1(this, (Continuation) null), 3, (Object) null);
    }

    public void U(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        StateLayer stateLayer = this.T;
        if (stateLayer != null) {
            stateLayer.b(contentDrawScope, this.U, i3());
        }
        f3(contentDrawScope);
    }

    public abstract void e3(PressInteraction.Press press, long j2, float f2);

    public abstract void f3(DrawScope drawScope);

    public final boolean g3() {
        return this.O;
    }

    public final Function0 h3() {
        return this.R;
    }

    public final long i3() {
        return this.Q.a();
    }

    public final long j3() {
        return this.V;
    }

    public final float k3() {
        return this.U;
    }

    public final void l3(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            e3((PressInteraction.Press) pressInteraction, this.V, this.U);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            m3(((PressInteraction.Release) pressInteraction).a());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            m3(((PressInteraction.Cancel) pressInteraction).a());
        }
    }

    public abstract void m3(PressInteraction.Press press);

    public final void n3(Interaction interaction, CoroutineScope coroutineScope) {
        StateLayer stateLayer = this.T;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.O, this.R);
            DrawModifierNodeKt.a(this);
            this.T = stateLayer;
        }
        stateLayer.c(interaction, coroutineScope);
    }

    public void q(long j2) {
        this.W = true;
        Density k2 = DelegatableNodeKt.k(this);
        this.V = IntSizeKt.e(j2);
        this.U = Float.isNaN(this.P) ? RippleAnimationKt.a(k2, this.O, this.V) : k2.B1(this.P);
        MutableObjectList mutableObjectList = this.X;
        Object[] objArr = mutableObjectList.f1937a;
        int i2 = mutableObjectList.f1938b;
        for (int i3 = 0; i3 < i2; i3++) {
            l3((PressInteraction) objArr[i3]);
        }
        this.X.t();
    }

    public RippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0) {
        this.N = interactionSource;
        this.O = z2;
        this.P = f2;
        this.Q = colorProducer;
        this.R = function0;
        this.V = Size.f15876b.b();
        this.X = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);
    }
}
