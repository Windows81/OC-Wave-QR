package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final Companion M = new Companion((DefaultConstructorMarker) null);
    public static final Function1 N = LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.f17324z;
    public RulerScope E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final Placeable.PlacementScope I = PlaceableKt.a(this);
    public MutableObjectFloatMap J;
    public MutableObjectFloatMap K;
    public MutableScatterMap L;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final boolean C1() {
        return this.H;
    }

    public final boolean F1() {
        return this.G;
    }

    public final void H1(MutableScatterSet mutableScatterSet) {
        LayoutNode layoutNode;
        Object[] objArr = mutableScatterSet.f1967b;
        long[] jArr = mutableScatterSet.f1966a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i2 << 3) + i4]).get()) != null) {
                            if (w1()) {
                                layoutNode.A1(false);
                            } else {
                                layoutNode.E1(false);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void L1();

    public void M1(boolean z2) {
        this.F = z2;
    }

    public MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
        if (!((i2 & -16777216) == 0 && (-16777216 & i3) == 0)) {
            InlineClassHelperKt.c("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new LookaheadCapablePlaceable$layout$1(i2, i3, map, function1, function12, this);
    }

    public final void V1(boolean z2) {
        this.H = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W0(androidx.compose.ui.node.LayoutNode r30, androidx.compose.ui.layout.Ruler r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            androidx.collection.MutableScatterMap r2 = r0.L
            r5 = 255(0xff, double:1.26E-321)
            r7 = 7
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = 8
            if (r2 == 0) goto L_0x0115
            java.lang.Object[] r13 = r2.f1961c
            long[] r2 = r2.f1959a
            int r14 = r2.length
            int r14 = r14 + -2
            if (r14 < 0) goto L_0x0115
            r15 = 0
        L_0x001c:
            r11 = r2[r15]
            long r3 = ~r11
            long r3 = r3 << r7
            long r3 = r3 & r11
            long r3 = r3 & r8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00fb
            int r3 = r15 - r14
            int r3 = ~r3
            int r3 = r3 >>> 31
            int r3 = 8 - r3
            r4 = 0
        L_0x002e:
            if (r4 >= r3) goto L_0x00ef
            long r18 = r11 & r5
            r16 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x00d2
            int r18 = r15 << 3
            int r18 = r18 + r4
            r18 = r13[r18]
            r5 = r18
            androidx.collection.MutableScatterSet r5 = (androidx.collection.MutableScatterSet) r5
            java.lang.Object[] r6 = r5.f1967b
            long[] r10 = r5.f1966a
            int r8 = r10.length
            int r8 = r8 + -2
            r23 = r2
            if (r8 < 0) goto L_0x00cb
            r9 = 0
        L_0x004e:
            r1 = r10[r9]
            r24 = r13
            r25 = r14
            long r13 = ~r1
            long r13 = r13 << r7
            long r13 = r13 & r1
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r21
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto L_0x00b9
            int r13 = r9 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r14 = 0
        L_0x006c:
            if (r14 >= r13) goto L_0x00b0
            r19 = 255(0xff, double:1.26E-321)
            long r26 = r1 & r19
            r16 = 128(0x80, double:6.32E-322)
            int r26 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r26 >= 0) goto L_0x00a2
            int r26 = r9 << 3
            int r7 = r26 + r14
            r26 = r6[r7]
            androidx.compose.ui.node.WeakReference r26 = (androidx.compose.ui.node.WeakReference) r26
            java.lang.Object r26 = r26.get()
            androidx.compose.ui.node.LayoutNode r26 = (androidx.compose.ui.node.LayoutNode) r26
            r28 = r6
            if (r26 == 0) goto L_0x0097
            boolean r6 = r26.b()
            r26 = r10
            r10 = 1
            if (r6 != r10) goto L_0x0095
            r10 = 1
            goto L_0x009a
        L_0x0095:
            r10 = 0
            goto L_0x009a
        L_0x0097:
            r26 = r10
            goto L_0x0095
        L_0x009a:
            if (r10 != 0) goto L_0x009f
            r5.A(r7)
        L_0x009f:
            r6 = 8
            goto L_0x00a7
        L_0x00a2:
            r28 = r6
            r26 = r10
            goto L_0x009f
        L_0x00a7:
            long r1 = r1 >> r6
            int r14 = r14 + 1
            r10 = r26
            r6 = r28
            r7 = 7
            goto L_0x006c
        L_0x00b0:
            r28 = r6
            r26 = r10
            r6 = 8
            if (r13 != r6) goto L_0x00cf
            goto L_0x00bd
        L_0x00b9:
            r28 = r6
            r26 = r10
        L_0x00bd:
            if (r9 == r8) goto L_0x00cf
            int r9 = r9 + 1
            r13 = r24
            r14 = r25
            r10 = r26
            r6 = r28
            r7 = 7
            goto L_0x004e
        L_0x00cb:
            r24 = r13
            r25 = r14
        L_0x00cf:
            r1 = 8
            goto L_0x00d9
        L_0x00d2:
            r23 = r2
            r24 = r13
            r25 = r14
            r1 = r10
        L_0x00d9:
            long r11 = r11 >> r1
            int r4 = r4 + 1
            r10 = r1
            r2 = r23
            r13 = r24
            r14 = r25
            r5 = 255(0xff, double:1.26E-321)
            r7 = 7
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r1 = r31
            goto L_0x002e
        L_0x00ef:
            r23 = r2
            r1 = r10
            r24 = r13
            r25 = r14
            if (r3 != r1) goto L_0x0115
            r14 = r25
            goto L_0x00ff
        L_0x00fb:
            r23 = r2
            r24 = r13
        L_0x00ff:
            if (r15 == r14) goto L_0x0115
            int r15 = r15 + 1
            r1 = r31
            r2 = r23
            r13 = r24
            r5 = 255(0xff, double:1.26E-321)
            r7 = 7
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = 8
            goto L_0x001c
        L_0x0115:
            androidx.collection.MutableScatterMap r1 = r0.L
            if (r1 == 0) goto L_0x017a
            long[] r2 = r1.f1959a
            int r3 = r2.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x017a
            r4 = 0
        L_0x0121:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x016f
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r8 = 0
        L_0x013b:
            if (r8 >= r7) goto L_0x0166
            r12 = 255(0xff, double:1.26E-321)
            long r14 = r5 & r12
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x015f
            int r14 = r4 << 3
            int r14 = r14 + r8
            java.lang.Object[] r15 = r1.f1960b
            r15 = r15[r14]
            java.lang.Object[] r9 = r1.f1961c
            r9 = r9[r14]
            androidx.collection.MutableScatterSet r9 = (androidx.collection.MutableScatterSet) r9
            androidx.compose.ui.layout.Ruler r15 = (androidx.compose.ui.layout.Ruler) r15
            boolean r9 = r9.d()
            if (r9 == 0) goto L_0x015f
            r1.v(r14)
        L_0x015f:
            r9 = 8
            long r5 = r5 >> r9
            int r8 = r8 + 1
            r9 = 7
            goto L_0x013b
        L_0x0166:
            r9 = 8
            r12 = 255(0xff, double:1.26E-321)
            r16 = 128(0x80, double:6.32E-322)
            if (r7 != r9) goto L_0x017a
            goto L_0x0175
        L_0x016f:
            r9 = 8
            r12 = 255(0xff, double:1.26E-321)
            r16 = 128(0x80, double:6.32E-322)
        L_0x0175:
            if (r4 == r3) goto L_0x017a
            int r4 = r4 + 1
            goto L_0x0121
        L_0x017a:
            androidx.collection.MutableScatterMap r1 = r0.L
            r2 = 0
            if (r1 != 0) goto L_0x018b
            androidx.collection.MutableScatterMap r1 = new androidx.collection.MutableScatterMap
            r3 = 1
            r4 = 0
            r1.<init>(r4, r3, r2)
            r0.L = r1
        L_0x0188:
            r5 = r31
            goto L_0x018e
        L_0x018b:
            r3 = 1
            r4 = 0
            goto L_0x0188
        L_0x018e:
            java.lang.Object r6 = r1.e(r5)
            if (r6 != 0) goto L_0x019c
            androidx.collection.MutableScatterSet r6 = new androidx.collection.MutableScatterSet
            r6.<init>(r4, r3, r2)
            r1.x(r5, r6)
        L_0x019c:
            androidx.collection.MutableScatterSet r6 = (androidx.collection.MutableScatterSet) r6
            androidx.compose.ui.node.WeakReference r1 = new androidx.compose.ui.node.WeakReference
            r2 = r30
            r1.<init>(r2)
            r6.x(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.W0(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Ruler):void");
    }

    public final void W1(boolean z2) {
        this.G = z2;
    }

    public abstract int X0(AlignmentLine alignmentLine);

    public abstract LayoutNode X1();

    public final void Y0(PlaceableResult placeableResult) {
        LookaheadCapablePlaceable h1;
        MutableScatterSet mutableScatterSet;
        OwnerSnapshotObserver snapshotObserver;
        PlaceableResult placeableResult2 = placeableResult;
        if (!this.H) {
            Function1 s2 = placeableResult.b().s();
            MutableScatterMap mutableScatterMap = this.L;
            char c2 = 7;
            long j2 = -9187201950435737472L;
            if (s2 != null) {
                MutableObjectFloatMap mutableObjectFloatMap = this.K;
                if (mutableObjectFloatMap == null) {
                    mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, (DefaultConstructorMarker) null);
                    this.K = mutableObjectFloatMap;
                }
                MutableObjectFloatMap mutableObjectFloatMap2 = this.J;
                if (mutableObjectFloatMap2 == null) {
                    mutableObjectFloatMap2 = new MutableObjectFloatMap(0, 1, (DefaultConstructorMarker) null);
                    this.J = mutableObjectFloatMap2;
                }
                mutableObjectFloatMap.o(mutableObjectFloatMap2);
                mutableObjectFloatMap2.h();
                Owner B0 = X1().B0();
                if (!(B0 == null || (snapshotObserver = B0.getSnapshotObserver()) == null)) {
                    snapshotObserver.i(placeableResult2, N, new LookaheadCapablePlaceable$captureRulers$3(placeableResult2, this));
                }
                if (mutableScatterMap != null) {
                    Object[] objArr = mutableObjectFloatMap.f1926b;
                    float[] fArr = mutableObjectFloatMap.f1927c;
                    long[] jArr = mutableObjectFloatMap.f1925a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j3 = jArr[i2];
                            if ((((~j3) << 7) & j3 & j2) != j2) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                long j4 = j3;
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j4 & 255) < 128) {
                                        int i5 = (i2 << 3) + i4;
                                        Ruler ruler = (Ruler) objArr[i5];
                                        if (!(mutableObjectFloatMap2.d(ruler, Float.NaN) == fArr[i5] || (mutableScatterSet = (MutableScatterSet) mutableScatterMap.u(ruler)) == null)) {
                                            H1(mutableScatterSet);
                                        }
                                    }
                                    j4 >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                            j2 = -9187201950435737472L;
                        }
                    }
                }
                Object[] objArr2 = mutableObjectFloatMap2.f1926b;
                long[] jArr2 = mutableObjectFloatMap2.f1925a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr2[i6];
                        if ((((~j5) << c2) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j5 & 255) < 128) {
                                    Ruler ruler2 = (Ruler) objArr2[(i6 << 3) + i8];
                                    if (!mutableObjectFloatMap.a(ruler2) && (h1 = h1()) != null) {
                                        h1.v1(ruler2);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length2) {
                            break;
                        }
                        i6++;
                        c2 = 7;
                    }
                }
                mutableObjectFloatMap.h();
            } else if (mutableScatterMap != null) {
                Object[] objArr3 = mutableScatterMap.f1961c;
                long[] jArr3 = mutableScatterMap.f1959a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j6 = jArr3[i9];
                        if ((((~j6) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j6 & 255) < 128) {
                                    H1((MutableScatterSet) objArr3[(i9 << 3) + i11]);
                                }
                                j6 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length3) {
                            break;
                        }
                        i9++;
                    }
                }
                mutableScatterMap.k();
            }
        }
    }

    public final void Z0(MeasureResult measureResult) {
        if (measureResult != null) {
            Y0(new PlaceableResult(measureResult, this));
            return;
        }
        MutableScatterMap mutableScatterMap = this.L;
        if (mutableScatterMap != null) {
            Object[] objArr = mutableScatterMap.f1961c;
            long[] jArr = mutableScatterMap.f1959a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                H1((MutableScatterSet) objArr[(i2 << 3) + i4]);
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
        MutableScatterMap mutableScatterMap2 = this.L;
        if (mutableScatterMap2 != null) {
            mutableScatterMap2.k();
        }
        MutableObjectFloatMap mutableObjectFloatMap = this.J;
        if (mutableObjectFloatMap != null) {
            mutableObjectFloatMap.h();
        }
    }

    public final LookaheadCapablePlaceable b1(Ruler ruler) {
        LookaheadCapablePlaceable h1;
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap mutableObjectFloatMap = lookaheadCapablePlaceable.J;
            if ((mutableObjectFloatMap != null && mutableObjectFloatMap.a(ruler)) || (h1 = lookaheadCapablePlaceable.h1()) == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = h1;
        }
    }

    public final float c1(Ruler ruler, float f2) {
        if (this.H) {
            return f2;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap mutableObjectFloatMap = lookaheadCapablePlaceable.J;
            float f3 = Float.NaN;
            if (mutableObjectFloatMap != null) {
                f3 = mutableObjectFloatMap.d(ruler, Float.NaN);
            }
            if (!Float.isNaN(f3)) {
                lookaheadCapablePlaceable.W0(X1(), ruler);
                return ruler.a(f3, lookaheadCapablePlaceable.e1(), e1());
            }
            LookaheadCapablePlaceable h1 = lookaheadCapablePlaceable.h1();
            if (h1 == null) {
                lookaheadCapablePlaceable.W0(X1(), ruler);
                return f2;
            }
            lookaheadCapablePlaceable = h1;
        }
    }

    public abstract LookaheadCapablePlaceable d1();

    public abstract LayoutCoordinates e1();

    public final int f0(AlignmentLine alignmentLine) {
        int X0;
        if (!f1() || (X0 = X0(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return X0 + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.k(A0()) : IntOffset.l(A0()));
    }

    public abstract boolean f1();

    public abstract MeasureResult g1();

    public void h0(boolean z2) {
        LookaheadCapablePlaceable h1 = h1();
        LayoutNode.LayoutState layoutState = null;
        LayoutNode X1 = h1 != null ? h1.X1() : null;
        if (Intrinsics.d(X1, X1())) {
            M1(z2);
            return;
        }
        if ((X1 != null ? X1.h0() : null) != LayoutNode.LayoutState.LayingOut) {
            if (X1 != null) {
                layoutState = X1.h0();
            }
            if (layoutState != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        M1(z2);
    }

    public abstract LookaheadCapablePlaceable h1();

    public final Placeable.PlacementScope i1() {
        return this.I;
    }

    public abstract long j1();

    public final RulerScope q1() {
        RulerScope rulerScope = this.E;
        return rulerScope == null ? new LookaheadCapablePlaceable$rulerScope$1(this) : rulerScope;
    }

    public final void t1(NodeCoordinator nodeCoordinator) {
        AlignmentLines q2;
        NodeCoordinator V2 = nodeCoordinator.V2();
        if (!Intrinsics.d(V2 != null ? V2.X1() : null, nodeCoordinator.X1())) {
            nodeCoordinator.K2().q().m();
            return;
        }
        AlignmentLinesOwner U = nodeCoordinator.K2().U();
        if (U != null && (q2 = U.q()) != null) {
            q2.m();
        }
    }

    public final void v1(Ruler ruler) {
        MutableScatterMap mutableScatterMap = b1(ruler).L;
        MutableScatterSet mutableScatterSet = mutableScatterMap != null ? (MutableScatterSet) mutableScatterMap.u(ruler) : null;
        if (mutableScatterSet != null) {
            H1(mutableScatterSet);
        }
    }

    public boolean w1() {
        return false;
    }

    public boolean x1() {
        return this.F;
    }
}
