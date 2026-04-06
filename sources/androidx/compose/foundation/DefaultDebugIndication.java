package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class DefaultDebugIndication implements IndicationNodeFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultDebugIndication f3048a = new DefaultDebugIndication();

    @Metadata
    public static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {
        public final InteractionSource N;
        public boolean O;
        public boolean P;
        public boolean Q;

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.N = interactionSource;
        }

        public void I2() {
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, (Continuation) null), 3, (Object) null);
        }

        public void U(ContentDrawScope contentDrawScope) {
            contentDrawScope.q2();
            if (this.O) {
                DrawScope.A1(contentDrawScope, Color.l(Color.f15975b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, contentDrawScope.c(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, ModuleDescriptor.MODULE_VERSION, (Object) null);
            } else if (this.P || this.Q) {
                DrawScope.A1(contentDrawScope, Color.l(Color.f15975b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, contentDrawScope.c(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, ModuleDescriptor.MODULE_VERSION, (Object) null);
            }
        }
    }

    public DelegatableNode b(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
