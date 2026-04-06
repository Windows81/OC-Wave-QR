package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final Companion J = new Companion((DefaultConstructorMarker) null);
    public static final Lazy K = LazyKt.a(LazyThreadSafetyMode.NONE, SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.f2345z);

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LookaheadScope f2342A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f2343B;
    public final MutableState C = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    public final Function0 D = new SharedTransitionScopeImpl$observeAnimatingBlock$1(this);
    public final Function1 E = new SharedTransitionScopeImpl$updateTransitionActiveness$1(this);
    public LayoutCoordinates F;
    public LayoutCoordinates G;
    public final SnapshotStateList H = SnapshotStateKt.f();
    public final MutableScatterMap I = new MutableScatterMap(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineScope f2344z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotStateObserver b() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.K.getValue();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {

        /* renamed from: a  reason: collision with root package name */
        public final Shape f2347a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f2348b;

        public Path a(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            this.f2348b.b();
            OutlineKt.a(this.f2348b, this.f2347a.a(rect.q(), layoutDirection, density));
            this.f2348b.v(rect.t());
            return this.f2348b;
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, CoroutineScope coroutineScope) {
        this.f2344z = coroutineScope;
        this.f2342A = lookaheadScope;
    }

    public final void A() {
        boolean z2;
        MutableScatterMap mutableScatterMap = this.I;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0:
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j2 & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (((SharedElement) objArr2[i5]).l()) {
                                z2 = true;
                                break loop0;
                            }
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
        z2 = false;
        if (z2 != q()) {
            y(z2);
            if (!z2) {
                MutableScatterMap mutableScatterMap2 = this.I;
                Object[] objArr3 = mutableScatterMap2.f1960b;
                Object[] objArr4 = mutableScatterMap2.f1961c;
                long[] jArr2 = mutableScatterMap2.f1959a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr2[i6];
                        if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j3 & 255) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj2 = objArr3[i9];
                                    ((SharedElement) objArr4[i9]).n();
                                }
                                j3 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length2) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        MutableScatterMap mutableScatterMap3 = this.I;
        Object[] objArr5 = mutableScatterMap3.f1960b;
        Object[] objArr6 = mutableScatterMap3.f1961c;
        long[] jArr3 = mutableScatterMap3.f1959a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i10 = 0;
            while (true) {
                long j4 = jArr3[i10];
                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length3)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j4 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj3 = objArr5[i13];
                            ((SharedElement) objArr6[i13]).s();
                        }
                        j4 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length3) {
                    break;
                }
                i10++;
            }
        }
        l();
    }

    public LayoutCoordinates f(LayoutCoordinates layoutCoordinates) {
        return this.f2342A.f(layoutCoordinates);
    }

    public final void h(Object obj) {
        J.b().g(obj);
    }

    public final void i(ContentDrawScope contentDrawScope) {
        SnapshotStateList snapshotStateList = this.H;
        if (snapshotStateList.size() > 1) {
            CollectionsKt.A(snapshotStateList, new SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1());
        }
        SnapshotStateList snapshotStateList2 = this.H;
        int size = snapshotStateList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LayerRenderer) snapshotStateList2.get(i2)).b(contentDrawScope);
        }
    }

    public final LayoutCoordinates j() {
        LayoutCoordinates layoutCoordinates = this.G;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final LayoutCoordinates k() {
        LayoutCoordinates layoutCoordinates = this.F;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        Intrinsics.y("root");
        return null;
    }

    public final void l() {
        if (!this.f2343B) {
            J.b().k(this, this.E, this.D);
        }
    }

    public final void m(SharedElement sharedElement, Function1 function1, Function0 function0) {
        if (!this.f2343B) {
            J.b().k(sharedElement, function1, function0);
        }
    }

    public final void n() {
        J.b().g(this);
        this.f2343B = true;
    }

    public final void o(LayerRenderer layerRenderer) {
        this.H.add(layerRenderer);
    }

    public final void p(LayerRenderer layerRenderer) {
        this.H.remove((Object) layerRenderer);
    }

    public boolean q() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    public final void r(SharedElementInternalState sharedElementInternalState) {
        SharedElement p2 = sharedElementInternalState.p();
        p2.b(sharedElementInternalState);
        this.E.invoke(this);
        p2.f().l();
        Iterator it = this.H.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            LayerRenderer layerRenderer = (LayerRenderer) it.next();
            SharedElement sharedElement = null;
            SharedElementInternalState sharedElementInternalState2 = layerRenderer instanceof SharedElementInternalState ? (SharedElementInternalState) layerRenderer : null;
            if (sharedElementInternalState2 != null) {
                sharedElement = sharedElementInternalState2.p();
            }
            if (Intrinsics.d(sharedElement, sharedElementInternalState.p())) {
                break;
            }
            i2++;
        }
        if (i2 == this.H.size() - 1 || i2 == -1) {
            this.H.add(sharedElementInternalState);
        } else {
            this.H.add(i2 + 1, sharedElementInternalState);
        }
    }

    public final void s(SharedElementInternalState sharedElementInternalState) {
        SharedElement p2 = sharedElementInternalState.p();
        p2.o(sharedElementInternalState);
        this.E.invoke(this);
        p2.f().l();
        this.H.remove((Object) sharedElementInternalState);
        if (p2.g().isEmpty()) {
            Job unused = BuildersKt__Builders_commonKt.d(p2.f().f2344z, (CoroutineContext) null, (CoroutineStart) null, new SharedTransitionScopeImpl$onStateRemoved$1$1(p2, (Continuation) null), 3, (Object) null);
        }
    }

    public long t(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
        return this.f2342A.t(layoutCoordinates, layoutCoordinates2, j2, z2);
    }

    public LayoutCoordinates u(Placeable.PlacementScope placementScope) {
        return this.f2342A.u(placementScope);
    }

    public final SharedElementInternalState v(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f2, boolean z3, Composer composer, int i2) {
        SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
        if (ComposerKt.P()) {
            ComposerKt.Y(2066772852, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            SharedElementInternalState sharedElementInternalState = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z2, overlayClip, z3, sharedContentState, f2);
            composer.N(sharedElementInternalState);
            g2 = sharedElementInternalState;
        }
        SharedElementInternalState sharedElementInternalState2 = (SharedElementInternalState) g2;
        sharedContentState2.g(sharedElementInternalState2);
        SharedElement sharedElement2 = sharedElement;
        sharedElementInternalState2.E(sharedElement);
        boolean z4 = z2;
        sharedElementInternalState2.D(z2);
        BoundsAnimation boundsAnimation2 = boundsAnimation;
        sharedElementInternalState2.u(boundsAnimation);
        SharedTransitionScope.PlaceHolderSize placeHolderSize2 = placeHolderSize;
        sharedElementInternalState2.B(placeHolderSize);
        sharedElementInternalState2.z(overlayClip);
        sharedElementInternalState2.G(f2);
        sharedElementInternalState2.C(z3);
        sharedElementInternalState2.F(sharedContentState2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return sharedElementInternalState2;
    }

    public final void w(LayoutCoordinates layoutCoordinates) {
        this.G = layoutCoordinates;
    }

    public final void x(LayoutCoordinates layoutCoordinates) {
        this.F = layoutCoordinates;
    }

    public final void y(boolean z2) {
        this.C.setValue(Boolean.valueOf(z2));
    }

    public final SharedElement z(Object obj) {
        SharedElement sharedElement = (SharedElement) this.I.e(obj);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(obj, this);
        this.I.x(obj, sharedElement2);
        return sharedElement2;
    }
}
