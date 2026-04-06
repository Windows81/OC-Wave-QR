package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class LegacyDragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public Function1 P;
    public Function2 Q;
    public long R = IntSize.f19170b.a();

    public LegacyDragAndDropSourceNode(Function1 function1, Function2 function2) {
        this.P = function1;
        this.Q = function2;
        final DragAndDropModifierNode dragAndDropModifierNode = (DragAndDropModifierNode) Z2(DragAndDropNodeKt.a());
        Z2(SuspendingPointerInputFilterKt.a(new PointerInputEventHandler(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ LegacyDragAndDropSourceNode f3313z;

            {
                this.f3313z = r1;
            }

            public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                Function2 f3 = this.f3313z.f3();
                final DragAndDropModifierNode dragAndDropModifierNode = dragAndDropModifierNode;
                final LegacyDragAndDropSourceNode legacyDragAndDropSourceNode = this.f3313z;
                Object m2 = f3.m(new Object() {
                    public long A(float f2) {
                        return pointerInputScope.A(f2);
                    }

                    public float B1(float f2) {
                        return pointerInputScope.B1(f2);
                    }

                    public float D(int i2) {
                        return pointerInputScope.D(i2);
                    }

                    public float E(float f2) {
                        return pointerInputScope.E(f2);
                    }

                    public int K1(long j2) {
                        return pointerInputScope.K1(j2);
                    }

                    public Object M0(Function2 function2, Continuation continuation) {
                        return pointerInputScope.M0(function2, continuation);
                    }

                    public int P1(float f2) {
                        return pointerInputScope.P1(f2);
                    }

                    public long V(long j2) {
                        return pointerInputScope.V(j2);
                    }

                    public float f2(long j2) {
                        return pointerInputScope.f2(j2);
                    }

                    public float getDensity() {
                        return pointerInputScope.getDensity();
                    }

                    public ViewConfiguration getViewConfiguration() {
                        return pointerInputScope.getViewConfiguration();
                    }

                    public void l2(boolean z2) {
                        pointerInputScope.l2(z2);
                    }

                    public long r(float f2) {
                        return pointerInputScope.r(f2);
                    }

                    public long s(long j2) {
                        return pointerInputScope.s(j2);
                    }

                    public float u1() {
                        return pointerInputScope.u1();
                    }

                    public float v(long j2) {
                        return pointerInputScope.v(j2);
                    }
                }, continuation);
                return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
            }
        }));
    }

    public final Function2 f3() {
        return this.Q;
    }

    public final void g3(Function2 function2) {
        this.Q = function2;
    }

    public final void h3(Function1 function1) {
        this.P = function1;
    }

    public void q(long j2) {
        this.R = j2;
    }
}
