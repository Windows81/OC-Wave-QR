package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* renamed from: a  reason: collision with root package name */
    public final Transition f2063a;

    /* renamed from: b  reason: collision with root package name */
    public Alignment f2064b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutDirection f2065c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f2066d = SnapshotStateKt__SnapshotStateKt.e(IntSize.b(IntSize.f19170b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final MutableScatterMap f2067e = ScatterMapKt.c();

    /* renamed from: f  reason: collision with root package name */
    public State f2068f;

    @Metadata
    public static final class ChildData implements ParentDataModifier {

        /* renamed from: z  reason: collision with root package name */
        public final MutableState f2069z;

        public ChildData(boolean z2) {
            this.f2069z = SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z2), (SnapshotMutationPolicy) null, 2, (Object) null);
        }

        public Object F(Density density, Object obj) {
            return this;
        }

        public final boolean a() {
            return ((Boolean) this.f2069z.getValue()).booleanValue();
        }

        public final void b(boolean z2) {
            this.f2069z.setValue(Boolean.valueOf(z2));
        }
    }

    @Metadata
    public static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {

        /* renamed from: A  reason: collision with root package name */
        public final State f2070A;

        /* renamed from: B  reason: collision with root package name */
        public final AnimatedContentTransitionScopeImpl f2071B;

        /* renamed from: z  reason: collision with root package name */
        public final Transition.DeferredAnimation f2072z;

        public SizeModifierElement(Transition.DeferredAnimation deferredAnimation, State state, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.f2072z = deferredAnimation;
            this.f2070A = state;
            this.f2071B = animatedContentTransitionScopeImpl;
        }

        /* renamed from: c */
        public SizeModifierNode a() {
            return new SizeModifierNode(this.f2072z, this.f2070A, this.f2071B);
        }

        /* renamed from: d */
        public void b(SizeModifierNode sizeModifierNode) {
            sizeModifierNode.e3(this.f2072z);
            sizeModifierNode.f3(this.f2070A);
            sizeModifierNode.d3(this.f2071B);
        }

        public boolean equals(Object obj) {
            if (obj instanceof SizeModifierElement) {
                SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
                return Intrinsics.d(sizeModifierElement.f2072z, this.f2072z) && Intrinsics.d(sizeModifierElement.f2070A, this.f2070A);
            }
        }

        public int hashCode() {
            int hashCode = this.f2071B.hashCode() * 31;
            Transition.DeferredAnimation deferredAnimation = this.f2072z;
            return ((hashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31) + this.f2070A.hashCode();
        }
    }

    @Metadata
    public static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        public Transition.DeferredAnimation N;
        public State O;
        public AnimatedContentTransitionScopeImpl P;
        public long Q = AnimatedContentKt.f2019a;

        public SizeModifierNode(Transition.DeferredAnimation deferredAnimation, State state, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.N = deferredAnimation;
            this.O = state;
            this.P = animatedContentTransitionScopeImpl;
        }

        public void K2() {
            super.K2();
            this.Q = AnimatedContentKt.f2019a;
        }

        public final AnimatedContentTransitionScopeImpl a3() {
            return this.P;
        }

        public final State b3() {
            return this.O;
        }

        public final long c3(long j2) {
            return IntSize.e(this.Q, AnimatedContentKt.f2019a) ? j2 : this.Q;
        }

        public final void d3(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.P = animatedContentTransitionScopeImpl;
        }

        public final void e3(Transition.DeferredAnimation deferredAnimation) {
            this.N = deferredAnimation;
        }

        public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
            long j3;
            Placeable c0 = measurable.c0(j2);
            if (measureScope.w1()) {
                j3 = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
            } else if (this.N == null) {
                j3 = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
                this.Q = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
            } else {
                long c2 = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
                Transition.DeferredAnimation deferredAnimation = this.N;
                Intrinsics.f(deferredAnimation);
                State a2 = deferredAnimation.a(new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(this, c2), new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(this, c2));
                this.P.p(a2);
                j3 = ((IntSize) a2.getValue()).j();
                this.Q = ((IntSize) a2.getValue()).j();
            }
            return MeasureScope.R1(measureScope, (int) (j3 >> 32), (int) (j3 & 4294967295L), (Map) null, new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(this, c0, j3), 4, (Object) null);
        }

        public final void f3(State state) {
            this.O = state;
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.f2063a = transition;
        this.f2064b = alignment;
        this.f2065c = layoutDirection;
    }

    public static final boolean i(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void j(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public ContentTransform a(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.e(sizeTransform);
        return contentTransform;
    }

    public Object b() {
        return this.f2063a.o().b();
    }

    public Object d() {
        return this.f2063a.o().d();
    }

    public final long g(long j2, long j3) {
        return k().a(j2, j3, LayoutDirection.Ltr);
    }

    public final Modifier h(ContentTransform contentTransform, Composer composer, int i2) {
        Modifier modifier;
        if (ComposerKt.P()) {
            ComposerKt.Y(93755870, i2, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean W = composer.W(this);
        Object g2 = composer.g();
        Transition.DeferredAnimation deferredAnimation = null;
        if (W || g2 == Composer.f14567a.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        State p2 = SnapshotStateKt.p(contentTransform.b(), composer, 0);
        if (Intrinsics.d(this.f2063a.i(), this.f2063a.q())) {
            j(mutableState, false);
        } else if (p2.getValue() != null) {
            j(mutableState, true);
        }
        if (i(mutableState)) {
            composer.X(249676467);
            deferredAnimation = TransitionKt.e(this.f2063a, VectorConvertersKt.h(IntSize.f19170b), (String) null, composer, 0, 2);
            boolean W2 = composer.W(deferredAnimation);
            Object g3 = composer.g();
            if (W2 || g3 == Composer.f14567a.a()) {
                SizeTransform sizeTransform = (SizeTransform) p2.getValue();
                g3 = (sizeTransform == null || sizeTransform.a()) ? ClipKt.b(Modifier.f15489d) : Modifier.f15489d;
                composer.N(g3);
            }
            modifier = (Modifier) g3;
            composer.M();
        } else {
            composer.X(249942509);
            composer.M();
            this.f2068f = null;
            modifier = Modifier.f15489d;
        }
        Modifier o0 = modifier.o0(new SizeModifierElement(deferredAnimation, p2, this));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return o0;
    }

    public Alignment k() {
        return this.f2064b;
    }

    public final long l() {
        State state = this.f2068f;
        return state != null ? ((IntSize) state.getValue()).j() : m();
    }

    public final long m() {
        return ((IntSize) this.f2066d.getValue()).j();
    }

    public final MutableScatterMap n() {
        return this.f2067e;
    }

    public final Transition o() {
        return this.f2063a;
    }

    public final void p(State state) {
        this.f2068f = state;
    }

    public void q(Alignment alignment) {
        this.f2064b = alignment;
    }

    public final void r(LayoutDirection layoutDirection) {
        this.f2065c = layoutDirection;
    }

    public final void s(long j2) {
        this.f2066d.setValue(IntSize.b(j2));
    }
}
