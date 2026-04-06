package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode {
    public static final TraverseKey g0 = new TraverseKey((DefaultConstructorMarker) null);
    public static final int h0 = 8;
    public MutableInteractionSource P;
    public IndicationNodeFactory Q;
    public String R;
    public Role S;
    public boolean T;
    public Function0 U;
    public final boolean V;
    public final FocusableNode W;
    public SuspendingPointerInputModifierNode X;
    public DelegatableNode Y;
    public PressInteraction.Press Z;
    public HoverInteraction.Enter a0;
    public final MutableLongObjectMap b0;
    public long c0;
    public MutableInteractionSource d0;
    public boolean e0;
    public final Object f0;

    @Metadata
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public TraverseKey() {
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    public final Unit A3() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.X;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.u2();
        return Unit.f40552a;
    }

    public final boolean B3() {
        return this.d0 == null && this.Q != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r2.Y == null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C3(androidx.compose.foundation.interaction.MutableInteractionSource r3, androidx.compose.foundation.IndicationNodeFactory r4, boolean r5, java.lang.String r6, androidx.compose.ui.semantics.Role r7, kotlin.jvm.functions.Function0 r8) {
        /*
            r2 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r2.d0
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            r1 = 1
            if (r0 != 0) goto L_0x0012
            r2.p3()
            r2.d0 = r3
            r2.P = r3
            r3 = r1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            androidx.compose.foundation.IndicationNodeFactory r0 = r2.Q
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r4)
            if (r0 != 0) goto L_0x001e
            r2.Q = r4
            r3 = r1
        L_0x001e:
            boolean r4 = r2.T
            if (r4 == r5) goto L_0x0037
            if (r5 == 0) goto L_0x002a
            androidx.compose.foundation.FocusableNode r4 = r2.W
            r2.Z2(r4)
            goto L_0x0032
        L_0x002a:
            androidx.compose.foundation.FocusableNode r4 = r2.W
            r2.c3(r4)
            r2.p3()
        L_0x0032:
            androidx.compose.ui.node.SemanticsModifierNodeKt.b(r2)
            r2.T = r5
        L_0x0037:
            java.lang.String r4 = r2.R
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x0044
            r2.R = r6
            androidx.compose.ui.node.SemanticsModifierNodeKt.b(r2)
        L_0x0044:
            androidx.compose.ui.semantics.Role r4 = r2.S
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x0051
            r2.S = r7
            androidx.compose.ui.node.SemanticsModifierNodeKt.b(r2)
        L_0x0051:
            r2.U = r8
            boolean r4 = r2.e0
            boolean r5 = r2.B3()
            if (r4 == r5) goto L_0x0068
            boolean r4 = r2.B3()
            r2.e0 = r4
            if (r4 != 0) goto L_0x0068
            androidx.compose.ui.node.DelegatableNode r4 = r2.Y
            if (r4 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            if (r1 == 0) goto L_0x007e
            androidx.compose.ui.node.DelegatableNode r3 = r2.Y
            if (r3 != 0) goto L_0x0073
            boolean r4 = r2.e0
            if (r4 != 0) goto L_0x007e
        L_0x0073:
            if (r3 == 0) goto L_0x0078
            r2.c3(r3)
        L_0x0078:
            r3 = 0
            r2.Y = r3
            r2.v3()
        L_0x007e:
            androidx.compose.foundation.FocusableNode r3 = r2.W
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.P
            r3.o3(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.C3(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):void");
    }

    public final boolean D2() {
        return this.V;
    }

    public final void I2() {
        if (!this.e0) {
            v3();
        }
        if (this.T) {
            Z2(this.W);
        }
    }

    public final void J2() {
        p3();
        if (this.d0 == null) {
            this.P = null;
        }
        DelegatableNode delegatableNode = this.Y;
        if (delegatableNode != null) {
            c3(delegatableNode);
        }
        this.Y = null;
    }

    public final boolean L0(KeyEvent keyEvent) {
        boolean z2;
        v3();
        long a2 = KeyEvent_androidKt.a(keyEvent);
        if (this.T && ClickableKt.l(keyEvent)) {
            if (!this.b0.a(a2)) {
                PressInteraction.Press press = new PressInteraction.Press(this.c0, (DefaultConstructorMarker) null);
                this.b0.r(a2, press);
                if (this.P != null) {
                    Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$onKeyEvent$1(this, press, (Continuation) null), 3, (Object) null);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (x3(keyEvent) || z2) {
                return true;
            }
        } else if (this.T && ClickableKt.j(keyEvent)) {
            PressInteraction.Press press2 = (PressInteraction.Press) this.b0.o(a2);
            if (press2 != null) {
                if (this.P != null) {
                    Job unused2 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$onKeyEvent$2(this, press2, (Continuation) null), 3, (Object) null);
                }
                y3(keyEvent);
            }
            if (press2 != null) {
                return true;
            }
        }
        return false;
    }

    public final void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        long b2 = IntSizeKt.b(j2);
        this.c0 = Offset.e((((long) Float.floatToRawIntBits((float) IntOffset.k(b2))) << 32) | (((long) Float.floatToRawIntBits((float) IntOffset.l(b2))) & 4294967295L));
        v3();
        if (this.T && pointerEventPass == PointerEventPass.Main) {
            int h2 = pointerEvent.h();
            PointerEventType.Companion companion = PointerEventType.f16852b;
            if (PointerEventType.j(h2, companion.a())) {
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$onPointerEvent$1(this, (Continuation) null), 3, (Object) null);
            } else if (PointerEventType.j(h2, companion.b())) {
                Job unused2 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$onPointerEvent$2(this, (Continuation) null), 3, (Object) null);
            }
        }
        if (this.X == null) {
            this.X = (SuspendingPointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new AbstractClickableNode$onPointerEvent$3(this)));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.X;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.S0(pointerEvent, pointerEventPass, j2);
        }
    }

    public final void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.S;
        if (role != null) {
            Intrinsics.f(role);
            SemanticsPropertiesKt.s0(semanticsPropertyReceiver, role.p());
        }
        SemanticsPropertiesKt.B(semanticsPropertyReceiver, this.R, new AbstractClickableNode$applySemantics$1(this));
        if (this.T) {
            this.W.W(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.l(semanticsPropertyReceiver);
        }
        m3(semanticsPropertyReceiver);
    }

    public final void X0() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.P;
        if (!(mutableInteractionSource == null || (enter = this.a0) == null)) {
            mutableInteractionSource.b(new HoverInteraction.Exit(enter));
        }
        this.a0 = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.X;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.X0();
        }
    }

    public final boolean e0(KeyEvent keyEvent) {
        return false;
    }

    public Object i0() {
        return this.f0;
    }

    public final boolean i2() {
        return true;
    }

    public void m3(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract Object n3(PointerInputScope pointerInputScope, Continuation continuation);

    public final boolean o3() {
        return ClickableKt.i(this) || Clickable_androidKt.b(this);
    }

    public final void p3() {
        MutableInteractionSource mutableInteractionSource = this.P;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.Z;
            if (press != null) {
                mutableInteractionSource.b(new PressInteraction.Cancel(press));
            }
            HoverInteraction.Enter enter = this.a0;
            if (enter != null) {
                mutableInteractionSource.b(new HoverInteraction.Exit(enter));
            }
            MutableLongObjectMap mutableLongObjectMap = this.b0;
            Object[] objArr = mutableLongObjectMap.f1831c;
            long[] jArr = mutableLongObjectMap.f1829a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                mutableInteractionSource.b(new PressInteraction.Cancel((PressInteraction.Press) objArr[(i2 << 3) + i4]));
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        this.Z = null;
        this.a0 = null;
        this.b0.g();
    }

    public final void q3() {
        if (this.a0 == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.P;
            if (mutableInteractionSource != null) {
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, (Continuation) null), 3, (Object) null);
            }
            this.a0 = enter;
        }
    }

    public final void r3() {
        HoverInteraction.Enter enter = this.a0;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.P;
            if (mutableInteractionSource != null) {
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, (Continuation) null), 3, (Object) null);
            }
            this.a0 = null;
        }
    }

    public final boolean s3() {
        return this.T;
    }

    public final Function0 t3() {
        return this.U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r9 = kotlinx.coroutines.CoroutineScopeKt.f(new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1(r9, r10, r4, r8, (kotlin.coroutines.Continuation) null), r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u3(androidx.compose.foundation.gestures.PressGestureScope r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r8.P
            if (r4 == 0) goto L_0x0019
            androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1 r7 = new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r10
            r5 = r8
            r0.<init>(r1, r2, r4, r5, r6)
            java.lang.Object r9 = kotlinx.coroutines.CoroutineScopeKt.f(r7, r12)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r9 != r10) goto L_0x0019
            return r9
        L_0x0019:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.u3(androidx.compose.foundation.gestures.PressGestureScope, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void v3() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.Y == null && (indicationNodeFactory = this.Q) != null) {
            if (this.P == null) {
                this.P = InteractionSourceKt.a();
            }
            this.W.o3(this.P);
            MutableInteractionSource mutableInteractionSource = this.P;
            Intrinsics.f(mutableInteractionSource);
            DelegatableNode b2 = indicationNodeFactory.b(mutableInteractionSource);
            Z2(b2);
            this.Y = b2;
        }
    }

    public void w3() {
    }

    public abstract boolean x3(KeyEvent keyEvent);

    public abstract boolean y3(KeyEvent keyEvent);

    public final void z3(boolean z2) {
        if (z2) {
            v3();
            return;
        }
        if (this.P != null) {
            MutableLongObjectMap mutableLongObjectMap = this.b0;
            Object[] objArr = mutableLongObjectMap.f1831c;
            long[] jArr = mutableLongObjectMap.f1829a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AbstractClickableNode$onFocusChange$1$1(this, (PressInteraction.Press) objArr[(i2 << 3) + i4], (Continuation) null), 3, (Object) null);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        this.b0.g();
        w3();
    }

    public AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0) {
        this.P = mutableInteractionSource;
        this.Q = indicationNodeFactory;
        this.R = str;
        this.S = role;
        this.T = z2;
        this.U = function0;
        this.W = new FocusableNode(this.P, Focusability.f15833b.c(), new AbstractClickableNode$focusableNode$1(this), (DefaultConstructorMarker) null);
        this.b0 = LongObjectMapKt.c();
        this.c0 = Offset.f15855b.c();
        this.d0 = this.P;
        this.e0 = B3();
        this.f0 = g0;
    }
}
