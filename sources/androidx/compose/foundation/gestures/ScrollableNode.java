package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {
    public OverscrollEffect Y;
    public FlingBehavior Z;
    public final boolean a0;
    public final NestedScrollDispatcher b0;
    public final ScrollableContainerNode c0;
    public final DefaultFlingBehavior d0;
    public final ScrollingLogic e0;
    public final ScrollableNestedScrollConnection f0;
    public final ContentInViewNode g0;
    public Function2 h0;
    public Function2 i0;
    public MouseWheelScrollingLogic j0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ScrollableNode(androidx.compose.foundation.gestures.ScrollableState r16, androidx.compose.foundation.OverscrollEffect r17, androidx.compose.foundation.gestures.FlingBehavior r18, androidx.compose.foundation.gestures.Orientation r19, boolean r20, boolean r21, androidx.compose.foundation.interaction.MutableInteractionSource r22, androidx.compose.foundation.gestures.BringIntoViewSpec r23) {
        /*
            r15 = this;
            r0 = r15
            r9 = r19
            r10 = r20
            kotlin.jvm.functions.Function1 r1 = androidx.compose.foundation.gestures.ScrollableKt.f3563a
            r2 = r22
            r15.<init>(r1, r10, r2, r9)
            r1 = r17
            r0.Y = r1
            r1 = r18
            r0.Z = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r11 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r11.<init>()
            r0.b0 = r11
            androidx.compose.foundation.gestures.ScrollableContainerNode r1 = new androidx.compose.foundation.gestures.ScrollableContainerNode
            r1.<init>(r10)
            androidx.compose.ui.node.DelegatableNode r1 = r15.Z2(r1)
            androidx.compose.foundation.gestures.ScrollableContainerNode r1 = (androidx.compose.foundation.gestures.ScrollableContainerNode) r1
            r0.c0 = r1
            androidx.compose.foundation.gestures.DefaultFlingBehavior r1 = new androidx.compose.foundation.gestures.DefaultFlingBehavior
            androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1 r2 = androidx.compose.foundation.gestures.ScrollableKt.f3566d
            androidx.compose.animation.core.DecayAnimationSpec r2 = androidx.compose.animation.SplineBasedDecayKt.c(r2)
            r12 = 0
            r13 = 2
            r1.<init>(r2, r12, r13, r12)
            r0.d0 = r1
            androidx.compose.foundation.OverscrollEffect r3 = r0.Y
            androidx.compose.foundation.gestures.FlingBehavior r2 = r0.Z
            if (r2 != 0) goto L_0x0043
            r4 = r1
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            androidx.compose.foundation.gestures.ScrollingLogic r14 = new androidx.compose.foundation.gestures.ScrollingLogic
            androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1 r8 = new androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            r8.<init>(r15)
            r1 = r14
            r2 = r16
            r5 = r19
            r6 = r21
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.e0 = r14
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r1 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection
            r1.<init>(r14, r10)
            r0.f0 = r1
            androidx.compose.foundation.gestures.ContentInViewNode r2 = new androidx.compose.foundation.gestures.ContentInViewNode
            r3 = r21
            r4 = r23
            r2.<init>(r9, r14, r3, r4)
            androidx.compose.ui.node.DelegatableNode r2 = r15.Z2(r2)
            androidx.compose.foundation.gestures.ContentInViewNode r2 = (androidx.compose.foundation.gestures.ContentInViewNode) r2
            r0.g0 = r2
            androidx.compose.ui.node.DelegatableNode r1 = androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.c(r1, r11)
            r15.Z2(r1)
            androidx.compose.ui.focus.Focusability$Companion r1 = androidx.compose.ui.focus.Focusability.f15833b
            int r1 = r1.b()
            androidx.compose.ui.focus.FocusTargetModifierNode r1 = androidx.compose.ui.focus.FocusTargetModifierNodeKt.b(r1, r12, r13, r12)
            r15.Z2(r1)
            androidx.compose.foundation.relocation.BringIntoViewResponderNode r1 = new androidx.compose.foundation.relocation.BringIntoViewResponderNode
            r1.<init>(r2)
            r15.Z2(r1)
            androidx.compose.foundation.FocusedBoundsObserverNode r1 = new androidx.compose.foundation.FocusedBoundsObserverNode
            androidx.compose.foundation.gestures.ScrollableNode$1 r2 = new androidx.compose.foundation.gestures.ScrollableNode$1
            r2.<init>(r15)
            r1.<init>(r2)
            r15.Z2(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNode.<init>(androidx.compose.foundation.gestures.ScrollableState, androidx.compose.foundation.OverscrollEffect, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec):void");
    }

    public boolean D2() {
        return this.a0;
    }

    public final void E3() {
        this.h0 = null;
        this.i0 = null;
    }

    public final void F3() {
        if (this.j0 == null) {
            this.j0 = new MouseWheelScrollingLogic(this.e0, AndroidScrollable_androidKt.a(this), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(this), DelegatableNodeKt.k(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.j0;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.v(y2());
        }
    }

    public void G() {
        X0();
        K3();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.j0;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.z(DelegatableNodeKt.k(this));
        }
    }

    public final void H3(long j2) {
        Job unused = BuildersKt__Builders_commonKt.d(this.b0.e(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onWheelScrollStopped$1(this, j2, (Continuation) null), 3, (Object) null);
    }

    public void I2() {
        K3();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.j0;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.z(DelegatableNodeKt.k(this));
        }
    }

    public final void I3() {
        this.h0 = new ScrollableNode$setScrollSemanticsActions$1(this);
        this.i0 = new ScrollableNode$setScrollSemanticsActions$2(this, (Continuation) null);
    }

    public final void J3(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z4;
        boolean z5 = z2;
        FlingBehavior flingBehavior2 = flingBehavior;
        if (q3() != z5) {
            this.f0.a(z5);
            this.c0.a3(z5);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = z4;
        boolean I = this.e0.I(scrollableState, orientation, overscrollEffect, z3, flingBehavior2 == null ? this.d0 : flingBehavior2, this.b0);
        this.g0.w3(orientation, z3, bringIntoViewSpec);
        this.Y = overscrollEffect;
        this.Z = flingBehavior2;
        z3(ScrollableKt.f3563a, z2, mutableInteractionSource, this.e0.t() ? Orientation.Vertical : Orientation.Horizontal, I);
        if (z6) {
            E3();
            SemanticsModifierNodeKt.b(this);
        }
    }

    public final void K3() {
        if (F2()) {
            this.d0.g(DelegatableNodeKt.k(this));
        }
    }

    public boolean L0(KeyEvent keyEvent) {
        long j2;
        if (q3()) {
            long a2 = KeyEvent_androidKt.a(keyEvent);
            Key.Companion companion = Key.f16750b;
            if ((Key.r(a2, companion.l()) || Key.r(KeyEvent_androidKt.a(keyEvent), companion.m())) && KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) && !KeyEvent_androidKt.e(keyEvent)) {
                if (this.e0.t()) {
                    int p3 = (int) (this.g0.p3() & 4294967295L);
                    j2 = Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Key.r(KeyEvent_androidKt.a(keyEvent), companion.m()) ? (float) p3 : -((float) p3))) & 4294967295L));
                } else {
                    int p32 = (int) (this.g0.p3() >> 32);
                    j2 = Offset.e((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Key.r(KeyEvent_androidKt.a(keyEvent), companion.m()) ? (float) p32 : -((float) p32))) << 32));
                }
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onKeyEvent$1(this, j2, (Continuation) null), 3, (Object) null);
                return true;
            }
        }
        return false;
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        List c2 = pointerEvent.c();
        int size = c2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) p3().invoke((PointerInputChange) c2.get(i2))).booleanValue()) {
                super.S0(pointerEvent, pointerEventPass, j2);
                break;
            }
            i2++;
        }
        if (q3()) {
            if (pointerEventPass == PointerEventPass.Initial && PointerEventType.j(pointerEvent.h(), PointerEventType.f16852b.f())) {
                F3();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.j0;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.u(pointerEvent, pointerEventPass, j2);
            }
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (q3() && (this.h0 == null || this.i0 == null)) {
            I3();
        }
        Function2 function2 = this.h0;
        if (function2 != null) {
            SemanticsPropertiesKt.W(semanticsPropertyReceiver, (String) null, function2, 1, (Object) null);
        }
        Function2 function22 = this.i0;
        if (function22 != null) {
            SemanticsPropertiesKt.X(semanticsPropertyReceiver, function22);
        }
    }

    public boolean e0(KeyEvent keyEvent) {
        return false;
    }

    public Object o3(Function2 function2, Continuation continuation) {
        ScrollingLogic scrollingLogic = this.e0;
        Object z2 = scrollingLogic.z(MutatePriority.UserInput, new ScrollableNode$drag$2$1(function2, scrollingLogic, (Continuation) null), continuation);
        return z2 == IntrinsicsKt.f() ? z2 : Unit.f40552a;
    }

    public void s3(long j2) {
    }

    public void t3(long j2) {
        Job unused = BuildersKt__Builders_commonKt.d(this.b0.e(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onDragStopped$1(this, j2, (Continuation) null), 3, (Object) null);
    }

    public boolean x3() {
        return this.e0.B();
    }
}
