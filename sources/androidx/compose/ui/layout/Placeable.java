package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

@Metadata
public abstract class Placeable implements Measured {

    /* renamed from: A  reason: collision with root package name */
    public int f17140A;

    /* renamed from: B  reason: collision with root package name */
    public long f17141B;
    public long C = PlaceableKt.f17145b;
    public long D = IntOffset.f19160b.b();

    /* renamed from: z  reason: collision with root package name */
    public int f17142z;

    @PlacementScopeMarker
    @Metadata
    public static abstract class PlacementScope {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17143a;

        public static /* synthetic */ void A(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    f2 = 0.0f;
                }
                float f3 = f2;
                if ((i2 & 4) != 0) {
                    function1 = PlaceableKt.f17144a;
                }
                placementScope.y(placeable, j2, f3, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void B(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    f2 = 0.0f;
                }
                placementScope.z(placeable, j2, graphicsLayer, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void j(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 4) != 0) {
                    f2 = 0.0f;
                }
                placementScope.i(placeable, i2, i3, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public static /* synthetic */ void l(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    f2 = 0.0f;
                }
                placementScope.k(placeable, j2, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void n(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 4) != 0) {
                    f2 = 0.0f;
                }
                placementScope.m(placeable, i2, i3, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public static /* synthetic */ void p(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    f2 = 0.0f;
                }
                placementScope.o(placeable, j2, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void r(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 4) != 0) {
                    f2 = 0.0f;
                }
                float f3 = f2;
                if ((i4 & 8) != 0) {
                    function1 = PlaceableKt.f17144a;
                }
                placementScope.q(placeable, i2, i3, f3, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public static /* synthetic */ void u(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    f2 = 0.0f;
                }
                float f3 = f2;
                if ((i2 & 4) != 0) {
                    function1 = PlaceableKt.f17144a;
                }
                placementScope.s(placeable, j2, f3, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void v(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    f2 = 0.0f;
                }
                placementScope.t(placeable, j2, graphicsLayer, f2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void x(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 4) != 0) {
                    f2 = 0.0f;
                }
                float f3 = f2;
                if ((i4 & 8) != 0) {
                    function1 = PlaceableKt.f17144a;
                }
                placementScope.w(placeable, i2, i3, f3, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public final void C(Function1 function1) {
            this.f17143a = true;
            function1.invoke(this);
            this.f17143a = false;
        }

        public float d(Ruler ruler, float f2) {
            return f2;
        }

        public LayoutCoordinates e() {
            return null;
        }

        public abstract LayoutDirection f();

        public abstract int g();

        public final void h(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).h0(this.f17143a);
            }
        }

        public final void i(Placeable placeable, int i2, int i3, float f2) {
            long f3 = IntOffset.f((((long) i3) & 4294967295L) | (((long) i2) << 32));
            h(placeable);
            placeable.R0(IntOffset.o(f3, placeable.D), f2, (Function1) null);
        }

        public final void k(Placeable placeable, long j2, float f2) {
            h(placeable);
            placeable.R0(IntOffset.o(j2, placeable.D), f2, (Function1) null);
        }

        public final void m(Placeable placeable, int i2, int i3, float f2) {
            long f3 = IntOffset.f((((long) i2) << 32) | (((long) i3) & 4294967295L));
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(placeable);
                placeable.R0(IntOffset.o(f3, placeable.D), f2, (Function1) null);
                return;
            }
            long f4 = IntOffset.f((((long) ((g() - placeable.L0()) - IntOffset.k(f3))) << 32) | (((long) IntOffset.l(f3)) & 4294967295L));
            h(placeable);
            placeable.R0(IntOffset.o(f4, placeable.D), f2, (Function1) null);
        }

        public final void o(Placeable placeable, long j2, float f2) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(placeable);
                placeable.R0(IntOffset.o(j2, placeable.D), f2, (Function1) null);
                return;
            }
            long f3 = IntOffset.f((((long) IntOffset.l(j2)) & 4294967295L) | (((long) ((g() - placeable.L0()) - IntOffset.k(j2))) << 32));
            h(placeable);
            placeable.R0(IntOffset.o(f3, placeable.D), f2, (Function1) null);
        }

        public final void q(Placeable placeable, int i2, int i3, float f2, Function1 function1) {
            long f3 = IntOffset.f((((long) i2) << 32) | (((long) i3) & 4294967295L));
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(placeable);
                placeable.R0(IntOffset.o(f3, placeable.D), f2, function1);
                return;
            }
            long f4 = IntOffset.f((((long) ((g() - placeable.L0()) - IntOffset.k(f3))) << 32) | (((long) IntOffset.l(f3)) & 4294967295L));
            h(placeable);
            placeable.R0(IntOffset.o(f4, placeable.D), f2, function1);
        }

        public final void s(Placeable placeable, long j2, float f2, Function1 function1) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(placeable);
                placeable.R0(IntOffset.o(j2, placeable.D), f2, function1);
                return;
            }
            long f3 = IntOffset.f((((long) IntOffset.l(j2)) & 4294967295L) | (((long) ((g() - placeable.L0()) - IntOffset.k(j2))) << 32));
            h(placeable);
            placeable.R0(IntOffset.o(f3, placeable.D), f2, function1);
        }

        public final void t(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            if (f() == LayoutDirection.Ltr || g() == 0) {
                h(placeable);
                placeable.Q0(IntOffset.o(j2, placeable.D), f2, graphicsLayer);
                return;
            }
            long f3 = IntOffset.f((((long) IntOffset.l(j2)) & 4294967295L) | (((long) ((g() - placeable.L0()) - IntOffset.k(j2))) << 32));
            h(placeable);
            placeable.Q0(IntOffset.o(f3, placeable.D), f2, graphicsLayer);
        }

        public final void w(Placeable placeable, int i2, int i3, float f2, Function1 function1) {
            long f3 = IntOffset.f((((long) i3) & 4294967295L) | (((long) i2) << 32));
            h(placeable);
            placeable.R0(IntOffset.o(f3, placeable.D), f2, function1);
        }

        public final void y(Placeable placeable, long j2, float f2, Function1 function1) {
            h(placeable);
            placeable.R0(IntOffset.o(j2, placeable.D), f2, function1);
        }

        public final void z(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            h(placeable);
            placeable.Q0(IntOffset.o(j2, placeable.D), f2, graphicsLayer);
        }
    }

    public Placeable() {
        long j2 = (long) 0;
        this.f17141B = IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    public final long A0() {
        return this.D;
    }

    public final int C0() {
        return this.f17140A;
    }

    public int E0() {
        return (int) (this.f17141B & 4294967295L);
    }

    public final long F0() {
        return this.f17141B;
    }

    public int H0() {
        return (int) (this.f17141B >> 32);
    }

    public final long J0() {
        return this.C;
    }

    public final int L0() {
        return this.f17142z;
    }

    public final void N0() {
        this.f17142z = RangesKt.o((int) (this.f17141B >> 32), Constraints.n(this.C), Constraints.l(this.C));
        int o2 = RangesKt.o((int) (this.f17141B & 4294967295L), Constraints.m(this.C), Constraints.k(this.C));
        this.f17140A = o2;
        int i2 = this.f17142z;
        long j2 = this.f17141B;
        this.D = IntOffset.f((((long) ((i2 - ((int) (j2 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((o2 - ((int) (j2 & 4294967295L))) / 2))));
    }

    public void Q0(long j2, float f2, GraphicsLayer graphicsLayer) {
        R0(j2, f2, (Function1) null);
    }

    public abstract void R0(long j2, float f2, Function1 function1);

    public final void S0(long j2) {
        if (!IntSize.e(this.f17141B, j2)) {
            this.f17141B = j2;
            N0();
        }
    }

    public final void T0(long j2) {
        if (!Constraints.f(this.C, j2)) {
            this.C = j2;
            N0();
        }
    }
}
