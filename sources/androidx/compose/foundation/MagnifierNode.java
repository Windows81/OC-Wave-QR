package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public Function1 N;
    public Function1 O;
    public Function1 P;
    public float Q;
    public boolean R;
    public long S;
    public float T;
    public float U;
    public boolean V;
    public PlatformMagnifierFactory W;
    public View X;
    public Density Y;
    public PlatformMagnifier Z;
    public final MutableState a0;
    public State b0;
    public long c0;
    public IntSize d0;
    public Channel e0;

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f2, z2, j2, f3, f4, z3, platformMagnifierFactory);
    }

    /* access modifiers changed from: private */
    public final LayoutCoordinates N() {
        return (LayoutCoordinates) this.a0.getValue();
    }

    public void I2() {
        L1();
        this.e0 = ChannelKt.b(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, (Continuation) null), 1, (Object) null);
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        g3(layoutCoordinates);
    }

    public void J2() {
        PlatformMagnifier platformMagnifier = this.Z;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.Z = null;
    }

    public void L1() {
        ObserverModifierNodeKt.a(this, new MagnifierNode$onObservedReadsChanged$1(this));
    }

    public void U(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        Channel channel = this.e0;
        if (channel != null) {
            ChannelResult.b(channel.L(Unit.f40552a));
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.e(Magnifier_androidKt.b(), new MagnifierNode$applySemantics$1(this));
    }

    public final long e3() {
        if (this.b0 == null) {
            this.b0 = SnapshotStateKt.e(new MagnifierNode$anchorPositionInRoot$1(this));
        }
        State state = this.b0;
        return state != null ? ((Offset) state.getValue()).t() : Offset.f15855b.b();
    }

    public final void f3() {
        PlatformMagnifier platformMagnifier = this.Z;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.X;
        if (view == null) {
            view = DelegatableNode_androidKt.a(this);
        }
        View view2 = view;
        this.X = view2;
        Density density = this.Y;
        if (density == null) {
            density = DelegatableNodeKt.k(this);
        }
        Density density2 = density;
        this.Y = density2;
        this.Z = this.W.a(view2, this.R, this.S, this.T, this.U, this.V, density2, this.Q);
        j3();
    }

    public final void g3(LayoutCoordinates layoutCoordinates) {
        this.a0.setValue(layoutCoordinates);
    }

    public final void h3(Function1 function1, Function1 function12, float f2, boolean z2, long j2, float f3, float f4, boolean z3, Function1 function13, PlatformMagnifierFactory platformMagnifierFactory) {
        float f5 = f2;
        boolean z4 = z2;
        long j3 = j2;
        float f6 = f3;
        float f7 = f4;
        boolean z5 = z3;
        PlatformMagnifierFactory platformMagnifierFactory2 = platformMagnifierFactory;
        float f8 = this.Q;
        long j4 = this.S;
        float f9 = this.T;
        boolean z6 = this.R;
        float f10 = this.U;
        boolean z7 = this.V;
        PlatformMagnifierFactory platformMagnifierFactory3 = this.W;
        View view = this.X;
        Density density = this.Y;
        this.N = function1;
        this.O = function12;
        this.Q = f5;
        this.R = z4;
        this.S = j3;
        this.T = f6;
        this.U = f7;
        this.V = z5;
        this.P = function13;
        this.W = platformMagnifierFactory2;
        View a2 = DelegatableNode_androidKt.a(this);
        Density k2 = DelegatableNodeKt.k(this);
        if (this.Z != null && ((!Magnifier_androidKt.a(f5, f8) && !platformMagnifierFactory.b()) || !DpSize.h(j3, j4) || !Dp.o(f6, f9) || !Dp.o(f7, f10) || z4 != z6 || z5 != z7 || !Intrinsics.d(platformMagnifierFactory2, platformMagnifierFactory3) || !Intrinsics.d(a2, view) || !Intrinsics.d(k2, density))) {
            f3();
        }
        i3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i3() {
        /*
            r9 = this;
            androidx.compose.ui.unit.Density r0 = r9.Y
            if (r0 != 0) goto L_0x000a
            androidx.compose.ui.unit.Density r0 = androidx.compose.ui.node.DelegatableNodeKt.k(r9)
            r9.Y = r0
        L_0x000a:
            kotlin.jvm.functions.Function1 r1 = r9.N
            java.lang.Object r1 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r1 = (androidx.compose.ui.geometry.Offset) r1
            long r1 = r1.t()
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0083
            long r5 = r9.e3()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0083
            long r5 = r9.e3()
            long r1 = androidx.compose.ui.geometry.Offset.q(r5, r1)
            r9.c0 = r1
            kotlin.jvm.functions.Function1 r1 = r9.O
            if (r1 == 0) goto L_0x0066
            java.lang.Object r0 = r1.invoke(r0)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.t()
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r0)
            long r1 = r0.t()
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0066
            long r0 = r0.t()
            long r2 = r9.e3()
            long r0 = androidx.compose.ui.geometry.Offset.q(r2, r0)
        L_0x0064:
            r5 = r0
            goto L_0x006d
        L_0x0066:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r0 = r0.b()
            goto L_0x0064
        L_0x006d:
            androidx.compose.foundation.PlatformMagnifier r0 = r9.Z
            if (r0 != 0) goto L_0x0074
            r9.f3()
        L_0x0074:
            androidx.compose.foundation.PlatformMagnifier r2 = r9.Z
            if (r2 == 0) goto L_0x007f
            long r3 = r9.c0
            float r7 = r9.Q
            r2.b(r3, r5, r7)
        L_0x007f:
            r9.j3()
            return
        L_0x0083:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r0 = r0.b()
            r9.c0 = r0
            androidx.compose.foundation.PlatformMagnifier r0 = r9.Z
            if (r0 == 0) goto L_0x0092
            r0.dismiss()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.i3():void");
    }

    public final void j3() {
        Density density;
        PlatformMagnifier platformMagnifier = this.Z;
        if (platformMagnifier != null && (density = this.Y) != null && !IntSize.d(platformMagnifier.a(), this.d0)) {
            Function1 function1 = this.P;
            if (function1 != null) {
                function1.invoke(DpSize.c(density.s(IntSizeKt.e(platformMagnifier.a()))));
            }
            this.d0 = IntSize.b(platformMagnifier.a());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MagnifierNode(kotlin.jvm.functions.Function1 r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function1 r19, float r20, boolean r21, long r22, float r24, float r25, boolean r26, androidx.compose.foundation.PlatformMagnifierFactory r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r16 = this;
            r0 = r28
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r18
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r19
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001b
            r1 = 2143289344(0x7fc00000, float:NaN)
            r7 = r1
            goto L_0x001d
        L_0x001b:
            r7 = r20
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0024
            r1 = 0
            r8 = r1
            goto L_0x0026
        L_0x0024:
            r8 = r21
        L_0x0026:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0032
            androidx.compose.ui.unit.DpSize$Companion r1 = androidx.compose.ui.unit.DpSize.f19156b
            long r1 = r1.a()
            r9 = r1
            goto L_0x0034
        L_0x0032:
            r9 = r22
        L_0x0034:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0040
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.f19144A
            float r1 = r1.c()
            r11 = r1
            goto L_0x0042
        L_0x0040:
            r11 = r24
        L_0x0042:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004e
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.f19144A
            float r1 = r1.c()
            r12 = r1
            goto L_0x0050
        L_0x004e:
            r12 = r25
        L_0x0050:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0057
            r1 = 1
            r13 = r1
            goto L_0x0059
        L_0x0057:
            r13 = r26
        L_0x0059:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0065
            androidx.compose.foundation.PlatformMagnifierFactory$Companion r0 = androidx.compose.foundation.PlatformMagnifierFactory.f3140a
            androidx.compose.foundation.PlatformMagnifierFactory r0 = r0.a()
            r14 = r0
            goto L_0x0067
        L_0x0065:
            r14 = r27
        L_0x0067:
            r15 = 0
            r3 = r16
            r4 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, float, boolean, long, float, float, boolean, androidx.compose.foundation.PlatformMagnifierFactory, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.N = function1;
        this.O = function12;
        this.P = function13;
        this.Q = f2;
        this.R = z2;
        this.S = j2;
        this.T = f3;
        this.U = f4;
        this.V = z3;
        this.W = platformMagnifierFactory;
        this.a0 = SnapshotStateKt.i((Object) null, SnapshotStateKt.k());
        this.c0 = Offset.f15855b.b();
    }
}
