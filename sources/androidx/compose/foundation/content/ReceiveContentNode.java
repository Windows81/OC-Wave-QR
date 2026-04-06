package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {
    public ReceiveContentListener P;
    public final ReceiveContentConfiguration Q;
    public final ModifierLocalMap R;

    public ReceiveContentNode(ReceiveContentListener receiveContentListener) {
        this.P = receiveContentListener;
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new DynamicReceiveContentConfiguration(this);
        this.Q = dynamicReceiveContentConfiguration;
        this.R = ModifierLocalModifierNodeKt.b(TuplesKt.a(ReceiveContentConfigurationKt.a(), dynamicReceiveContentConfiguration));
        Z2(ReceiveContentDragAndDropNode_androidKt.a(dynamicReceiveContentConfiguration, new Function1<DragAndDropEvent, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ ReceiveContentNode f3202z;

            {
                this.f3202z = r1;
            }

            public final void b(DragAndDropEvent dragAndDropEvent) {
                DragAndDropRequestPermission_androidKt.b(this.f3202z, dragAndDropEvent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((DragAndDropEvent) obj);
                return Unit.f40552a;
            }
        }));
    }

    public final ReceiveContentListener f3() {
        return this.P;
    }

    public final void g3(ReceiveContentListener receiveContentListener) {
        this.P = receiveContentListener;
    }

    public ModifierLocalMap q1() {
        return this.R;
    }
}
