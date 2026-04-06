package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class AlignmentLines {

    /* renamed from: a  reason: collision with root package name */
    public final AlignmentLinesOwner f17199a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17200b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17201c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17202d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17203e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17204f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17205g;

    /* renamed from: h  reason: collision with root package name */
    public AlignmentLinesOwner f17206h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f17207i;

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLinesOwner);
    }

    public final void c(AlignmentLine alignmentLine, int i2, NodeCoordinator nodeCoordinator) {
        float f2 = (float) i2;
        long e2 = Offset.e((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        while (true) {
            e2 = d(nodeCoordinator, e2);
            nodeCoordinator = nodeCoordinator.W2();
            Intrinsics.f(nodeCoordinator);
            if (Intrinsics.d(nodeCoordinator, this.f17199a.M())) {
                break;
            } else if (e(nodeCoordinator).containsKey(alignmentLine)) {
                float i3 = (float) i(nodeCoordinator, alignmentLine);
                e2 = Offset.e((((long) Float.floatToRawIntBits(i3)) << 32) | (((long) Float.floatToRawIntBits(i3)) & 4294967295L));
            }
        }
        int round = Math.round(alignmentLine instanceof HorizontalAlignmentLine ? Float.intBitsToFloat((int) (e2 & 4294967295L)) : Float.intBitsToFloat((int) (e2 >> 32)));
        Map map = this.f17207i;
        if (map.containsKey(alignmentLine)) {
            round = AlignmentLineKt.c(alignmentLine, ((Number) MapsKt.i(this.f17207i, alignmentLine)).intValue(), round);
        }
        map.put(alignmentLine, Integer.valueOf(round));
    }

    public abstract long d(NodeCoordinator nodeCoordinator, long j2);

    public abstract Map e(NodeCoordinator nodeCoordinator);

    public final AlignmentLinesOwner f() {
        return this.f17199a;
    }

    public final boolean g() {
        return this.f17200b;
    }

    public final Map h() {
        return this.f17207i;
    }

    public abstract int i(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean j() {
        return this.f17201c || this.f17203e || this.f17204f || this.f17205g;
    }

    public final boolean k() {
        o();
        return this.f17206h != null;
    }

    public final boolean l() {
        return this.f17202d;
    }

    public final void m() {
        this.f17200b = true;
        AlignmentLinesOwner U = this.f17199a.U();
        if (U != null) {
            if (this.f17201c) {
                U.p0();
            } else if (this.f17203e || this.f17202d) {
                U.requestLayout();
            }
            if (this.f17204f) {
                this.f17199a.p0();
            }
            if (this.f17205g) {
                this.f17199a.requestLayout();
            }
            U.q().m();
        }
    }

    public final void n() {
        this.f17207i.clear();
        this.f17199a.n0(new AlignmentLines$recalculate$1(this));
        this.f17207i.putAll(e(this.f17199a.M()));
        this.f17200b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r0 = r0.q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r2 = this;
            boolean r0 = r2.j()
            if (r0 == 0) goto L_0x0009
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r2.f17199a
            goto L_0x0053
        L_0x0009:
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r2.f17199a
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r0.U()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            androidx.compose.ui.node.AlignmentLines r0 = r0.q()
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r0.f17206h
            if (r0 == 0) goto L_0x0025
            androidx.compose.ui.node.AlignmentLines r1 = r0.q()
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x0025
            goto L_0x0053
        L_0x0025:
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r2.f17206h
            if (r0 == 0) goto L_0x0055
            androidx.compose.ui.node.AlignmentLines r1 = r0.q()
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x0034
            goto L_0x0055
        L_0x0034:
            androidx.compose.ui.node.AlignmentLinesOwner r1 = r0.U()
            if (r1 == 0) goto L_0x0043
            androidx.compose.ui.node.AlignmentLines r1 = r1.q()
            if (r1 == 0) goto L_0x0043
            r1.o()
        L_0x0043:
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r0.U()
            if (r0 == 0) goto L_0x0052
            androidx.compose.ui.node.AlignmentLines r0 = r0.q()
            if (r0 == 0) goto L_0x0052
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r0.f17206h
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            r2.f17206h = r0
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.AlignmentLines.o():void");
    }

    public final void p() {
        this.f17200b = true;
        this.f17201c = false;
        this.f17203e = false;
        this.f17202d = false;
        this.f17204f = false;
        this.f17205g = false;
        this.f17206h = null;
    }

    public final void q(boolean z2) {
        this.f17203e = z2;
    }

    public final void r(boolean z2) {
        this.f17205g = z2;
    }

    public final void s(boolean z2) {
        this.f17204f = z2;
    }

    public final void t(boolean z2) {
        this.f17202d = z2;
    }

    public final void u(boolean z2) {
        this.f17201c = z2;
    }

    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.f17199a = alignmentLinesOwner;
        this.f17200b = true;
        this.f17207i = new HashMap();
    }
}
