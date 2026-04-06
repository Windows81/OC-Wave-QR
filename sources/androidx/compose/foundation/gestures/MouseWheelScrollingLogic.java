package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class MouseWheelScrollingLogic {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollingLogic f3528a;

    /* renamed from: b  reason: collision with root package name */
    public final ScrollConfig f3529b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f3530c;

    /* renamed from: d  reason: collision with root package name */
    public Density f3531d;

    /* renamed from: e  reason: collision with root package name */
    public final Channel f3532e = ChannelKt.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public boolean f3533f;

    /* renamed from: g  reason: collision with root package name */
    public Job f3534g;

    /* renamed from: h  reason: collision with root package name */
    public final MouseWheelVelocityTracker f3535h = new MouseWheelVelocityTracker();

    @Metadata
    public static final class MouseWheelScrollDelta {

        /* renamed from: a  reason: collision with root package name */
        public final long f3536a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3537b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3538c;

        public /* synthetic */ MouseWheelScrollDelta(long j2, long j3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, z2);
        }

        public static /* synthetic */ MouseWheelScrollDelta b(MouseWheelScrollDelta mouseWheelScrollDelta, long j2, long j3, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = mouseWheelScrollDelta.f3536a;
            }
            long j4 = j2;
            if ((i2 & 2) != 0) {
                j3 = mouseWheelScrollDelta.f3537b;
            }
            long j5 = j3;
            if ((i2 & 4) != 0) {
                z2 = mouseWheelScrollDelta.f3538c;
            }
            return mouseWheelScrollDelta.a(j4, j5, z2);
        }

        public final MouseWheelScrollDelta a(long j2, long j3, boolean z2) {
            return new MouseWheelScrollDelta(j2, j3, z2, (DefaultConstructorMarker) null);
        }

        public final boolean c() {
            return this.f3538c;
        }

        public final long d() {
            return this.f3537b;
        }

        public final long e() {
            return this.f3536a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.j(this.f3536a, mouseWheelScrollDelta.f3536a) && this.f3537b == mouseWheelScrollDelta.f3537b && this.f3538c == mouseWheelScrollDelta.f3538c;
        }

        public final MouseWheelScrollDelta f(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.q(this.f3536a, mouseWheelScrollDelta.f3536a), Math.max(this.f3537b, mouseWheelScrollDelta.f3537b), this.f3538c, (DefaultConstructorMarker) null);
        }

        public int hashCode() {
            return (((Offset.o(this.f3536a) * 31) + Long.hashCode(this.f3537b)) * 31) + Boolean.hashCode(this.f3538c);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + Offset.s(this.f3536a) + ", timeMillis=" + this.f3537b + ", shouldApplyImmediately=" + this.f3538c + ')';
        }

        public MouseWheelScrollDelta(long j2, long j3, boolean z2) {
            this.f3536a = j2;
            this.f3537b = j3;
            this.f3538c = z2;
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, Function2 function2, Density density) {
        this.f3528a = scrollingLogic;
        this.f3529b = scrollConfig;
        this.f3530c = function2;
        this.f3531d = density;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r21, kotlin.jvm.internal.Ref.ObjectRef r22, kotlin.jvm.internal.Ref.FloatRef r23, androidx.compose.foundation.gestures.ScrollingLogic r24, kotlin.jvm.internal.Ref.ObjectRef r25, long r26, kotlin.coroutines.Continuation r28) {
        /*
            r0 = r21
            r1 = r26
            r3 = r28
            boolean r4 = r3 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1
            if (r4 == 0) goto L_0x0019
            r4 = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r4 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) r4
            int r5 = r4.I
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.I = r5
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r4 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1
            r4.<init>(r3)
        L_0x001e:
            java.lang.Object r3 = r4.H
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r6 = r4.I
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0050
            if (r6 != r8) goto L_0x0048
            java.lang.Object r0 = r4.G
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            java.lang.Object r1 = r4.F
            androidx.compose.foundation.gestures.ScrollingLogic r1 = (androidx.compose.foundation.gestures.ScrollingLogic) r1
            java.lang.Object r2 = r4.E
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            java.lang.Object r5 = r4.D
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            java.lang.Object r4 = r4.C
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r4 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r4
            kotlin.ResultKt.b(r3)
            r11 = r0
            r10 = r1
            r9 = r2
            r0 = r4
            goto L_0x0080
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            kotlin.ResultKt.b(r3)
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r7)
            return r0
        L_0x005e:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 r3 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2
            r6 = 0
            r3.<init>(r0, r6)
            r4.C = r0
            r6 = r22
            r4.D = r6
            r9 = r23
            r4.E = r9
            r10 = r24
            r4.F = r10
            r11 = r25
            r4.G = r11
            r4.I = r8
            java.lang.Object r3 = kotlinx.coroutines.TimeoutKt.d(r1, r3, r4)
            if (r3 != r5) goto L_0x007f
            return r5
        L_0x007f:
            r5 = r6
        L_0x0080:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r3 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r3
            if (r3 == 0) goto L_0x00cf
            java.lang.Object r1 = r5.f40908z
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r1 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r1
            boolean r1 = r1.c()
            r2 = 3
            r4 = 0
            r6 = 0
            r12 = 0
            r21 = r3
            r22 = r6
            r24 = r12
            r26 = r1
            r27 = r2
            r28 = r4
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta.b(r21, r22, r24, r26, r27, r28)
            r5.f40908z = r1
            long r1 = r1.e()
            long r1 = r10.y(r1)
            float r1 = r10.F(r1)
            r9.f40905z = r1
            r19 = 30
            r20 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            androidx.compose.animation.core.AnimationState r1 = androidx.compose.animation.core.AnimationStateKt.c(r12, r13, r14, r16, r18, r19, r20)
            r11.f40908z = r1
            r0.x(r3)
            float r0 = r9.f40905z
            boolean r0 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.d(r0)
            r7 = r0 ^ 1
        L_0x00cf:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.s(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(androidx.compose.foundation.gestures.ScrollingLogic r5, kotlin.jvm.functions.Function2 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r5
            kotlin.ResultKt.b(r7)
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r7)
            r4.f3533f = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = kotlinx.coroutines.SupervisorKt.c(r7, r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r5 = r4
        L_0x004c:
            r6 = 0
            r5.f3533f = r6
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.A(androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object m(NestedScrollScope nestedScrollScope, AnimationState animationState, float f2, int i2, Function1 function1, Continuation continuation) {
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.f40905z = ((Number) animationState.getValue()).floatValue();
        Object j2 = SuspendAnimationKt.j(animationState, Boxing.b(f2), AnimationSpecKt.n(i2, 0, EasingKt.e(), 2, (Object) null), true, new MouseWheelScrollingLogic$animateMouseWheelScroll$2(floatRef, this, nestedScrollScope, function1), continuation);
        return j2 == IntrinsicsKt.f() ? j2 : Unit.f40552a;
    }

    public final Object n(Channel channel, Continuation continuation) {
        return CoroutineScopeKt.f(new MouseWheelScrollingLogic$busyReceive$2(channel, (Continuation) null), continuation);
    }

    public final boolean o(ScrollingLogic scrollingLogic, long j2) {
        float F = scrollingLogic.F(scrollingLogic.y(j2));
        if (F == 0.0f) {
            return false;
        }
        return F > 0.0f ? scrollingLogic.q().f() : scrollingLogic.q().d();
    }

    public final void p(PointerEvent pointerEvent) {
        List c2 = pointerEvent.c();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((PointerInputChange) c2.get(i2)).a();
        }
    }

    public final float q(NestedScrollScope nestedScrollScope, float f2) {
        ScrollingLogic scrollingLogic = this.f3528a;
        return scrollingLogic.F(scrollingLogic.y(nestedScrollScope.b(scrollingLogic.G(scrollingLogic.x(f2)), NestedScrollSource.f16795b.b())));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(androidx.compose.foundation.gestures.ScrollingLogic r26, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r27, float r28, float r29, kotlin.coroutines.Continuation r30) {
        /*
            r25 = this;
            r9 = r25
            r10 = r26
            r0 = r27
            r1 = r30
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1
            if (r2 == 0) goto L_0x001c
            r2 = r1
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 r2 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001c
            int r3 = r3 - r4
            r2.I = r3
        L_0x001a:
            r11 = r2
            goto L_0x0022
        L_0x001c:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 r2 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1
            r2.<init>(r9, r1)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r1 = r11.G
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r11.I
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r14) goto L_0x003f
            if (r2 != r13) goto L_0x0037
            kotlin.ResultKt.b(r1)
            goto L_0x0121
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            float r0 = r11.F
            java.lang.Object r2 = r11.E
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            java.lang.Object r3 = r11.D
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            java.lang.Object r4 = r11.C
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r4 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r4
            kotlin.ResultKt.b(r1)
            r10 = r3
            goto L_0x00d7
        L_0x0053:
            kotlin.ResultKt.b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r3.f40908z = r0
            r9.x(r0)
            kotlinx.coroutines.channels.Channel r0 = r9.f3532e
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r0 = r9.w(r0)
            if (r0 == 0) goto L_0x0075
            r9.x(r0)
            java.lang.Object r1 = r3.f40908z
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r1 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r1
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r0 = r1.f(r0)
            r3.f40908z = r0
        L_0x0075:
            kotlin.jvm.internal.Ref$FloatRef r15 = new kotlin.jvm.internal.Ref$FloatRef
            r15.<init>()
            java.lang.Object r0 = r3.f40908z
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r0
            long r0 = r0.e()
            long r0 = r10.y(r0)
            float r0 = r10.F(r0)
            r15.f40905z = r0
            boolean r0 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.d(r0)
            if (r0 == 0) goto L_0x0095
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x0095:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r23 = 30
            r24 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.c(r16, r17, r18, r20, r22, r23, r24)
            r2.f40908z = r0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 r8 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3
            r16 = 0
            r0 = r8
            r1 = r15
            r4 = r28
            r5 = r25
            r6 = r29
            r7 = r26
            r13 = r8
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.C = r9
            r11.D = r10
            r11.E = r15
            r0 = r29
            r11.F = r0
            r11.I = r14
            java.lang.Object r1 = r9.A(r10, r13, r11)
            if (r1 != r12) goto L_0x00d5
            return r12
        L_0x00d5:
            r4 = r9
            r2 = r15
        L_0x00d7:
            androidx.compose.foundation.gestures.MouseWheelVelocityTracker r1 = r4.f3535h
            long r5 = r1.b()
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.f19186b
            long r7 = r1.a()
            boolean r1 = androidx.compose.ui.unit.Velocity.g(r5, r7)
            if (r1 == 0) goto L_0x010a
            float r1 = r2.f40905z
            float r1 = java.lang.Math.abs(r1)
            r3 = 100
            float r3 = (float) r3
            float r1 = r1 / r3
            float r0 = java.lang.Math.min(r1, r0)
            float r1 = r2.f40905z
            float r1 = java.lang.Math.signum(r1)
            float r1 = r10.x(r1)
            float r1 = r1 * r0
            r0 = 1000(0x3e8, float:1.401E-42)
            float r0 = (float) r0
            float r1 = r1 * r0
            long r5 = r10.H(r1)
        L_0x010a:
            kotlin.jvm.functions.Function2 r0 = r4.f3530c
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r5)
            r2 = 0
            r11.C = r2
            r11.D = r2
            r11.E = r2
            r2 = 2
            r11.I = r2
            java.lang.Object r0 = r0.m(r1, r11)
            if (r0 != r12) goto L_0x0121
            return r12
        L_0x0121:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.r(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean t(PointerEvent pointerEvent, long j2) {
        long c2 = this.f3529b.c(this.f3531d, pointerEvent, j2);
        if (!o(this.f3528a, c2)) {
            return this.f3533f;
        }
        return ChannelResult.j(this.f3532e.L(new MouseWheelScrollDelta(c2, ((PointerInputChange) CollectionsKt.e0(pointerEvent.c())).o(), !this.f3529b.b() || this.f3529b.a(pointerEvent), (DefaultConstructorMarker) null)));
    }

    public final void u(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.Main && PointerEventType.j(pointerEvent.h(), PointerEventType.f16852b.f())) {
            List c2 = pointerEvent.c();
            int size = c2.size();
            int i2 = 0;
            while (i2 < size) {
                if (!((PointerInputChange) c2.get(i2)).p()) {
                    i2++;
                } else {
                    return;
                }
            }
            if (t(pointerEvent, j2)) {
                p(pointerEvent);
            }
        }
    }

    public final void v(CoroutineScope coroutineScope) {
        if (this.f3534g == null) {
            this.f3534g = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this, (Continuation) null), 3, (Object) null);
        }
    }

    public final MouseWheelScrollDelta w(Channel channel) {
        MouseWheelScrollDelta mouseWheelScrollDelta = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta2 : y(new MouseWheelScrollingLogic$sumOrNull$1(channel))) {
            mouseWheelScrollDelta = mouseWheelScrollDelta == null ? mouseWheelScrollDelta2 : mouseWheelScrollDelta.f(mouseWheelScrollDelta2);
        }
        return mouseWheelScrollDelta;
    }

    public final void x(MouseWheelScrollDelta mouseWheelScrollDelta) {
        this.f3535h.a(mouseWheelScrollDelta.d(), mouseWheelScrollDelta.e());
    }

    public final Sequence y(Function0 function0) {
        return SequencesKt.b(new MouseWheelScrollingLogic$untilNull$1(function0, (Continuation) null));
    }

    public final void z(Density density) {
        this.f3531d = density;
    }
}
