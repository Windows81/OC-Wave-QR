package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DragAndDropSourceNode$onAttach$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragAndDropSourceNode f3301z;

    public DragAndDropSourceNode$onAttach$1(DragAndDropSourceNode dragAndDropSourceNode) {
        this.f3301z = dragAndDropSourceNode;
    }

    public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
        Function2 h3 = this.f3301z.h3();
        final DragAndDropSourceNode dragAndDropSourceNode = this.f3301z;
        Object m2 = h3.m(new Object() {
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

            public void x(long j2) {
                dragAndDropSourceNode.T.x(j2);
            }
        }, continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
