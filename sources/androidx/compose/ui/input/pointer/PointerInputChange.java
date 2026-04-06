package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PointerInputChange {

    /* renamed from: a  reason: collision with root package name */
    public final long f16874a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16875b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16876c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16877d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16878e;

    /* renamed from: f  reason: collision with root package name */
    public final long f16879f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16880g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16881h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16882i;

    /* renamed from: j  reason: collision with root package name */
    public final long f16883j;

    /* renamed from: k  reason: collision with root package name */
    public List f16884k;

    /* renamed from: l  reason: collision with root package name */
    public long f16885l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16886m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16887n;

    /* renamed from: o  reason: collision with root package name */
    public PointerInputChange f16888o;

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, i2, j7);
    }

    public static /* synthetic */ PointerInputChange c(PointerInputChange pointerInputChange, long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, List list, long j7, int i3, Object obj) {
        PointerInputChange pointerInputChange2 = pointerInputChange;
        int i4 = i3;
        return pointerInputChange.b((i4 & 1) != 0 ? pointerInputChange2.f16874a : j2, (i4 & 2) != 0 ? pointerInputChange2.f16875b : j3, (i4 & 4) != 0 ? pointerInputChange2.f16876c : j4, (i4 & 8) != 0 ? pointerInputChange2.f16877d : z2, (i4 & 16) != 0 ? pointerInputChange2.f16879f : j5, (i4 & 32) != 0 ? pointerInputChange2.f16880g : j6, (i4 & 64) != 0 ? pointerInputChange2.f16881h : z3, (i4 & 128) != 0 ? pointerInputChange2.f16882i : i2, list, (i4 & 512) != 0 ? pointerInputChange2.f16883j : j7);
    }

    public final void a() {
        PointerInputChange pointerInputChange = this.f16888o;
        if (pointerInputChange == null) {
            this.f16886m = true;
            this.f16887n = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.a();
        }
    }

    public final PointerInputChange b(long j2, long j3, long j4, boolean z2, long j5, long j6, boolean z3, int i2, List list, long j7) {
        PointerInputChange d2 = d(j2, j3, j4, z2, this.f16878e, j5, j6, z3, i2, list, j7);
        PointerInputChange pointerInputChange = this.f16888o;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        d2.f16888o = pointerInputChange;
        return d2;
    }

    public final PointerInputChange d(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, int i2, List list, long j7) {
        long j8 = j2;
        PointerInputChange pointerInputChange = r1;
        PointerInputChange pointerInputChange2 = new PointerInputChange(j2, j3, j4, z2, f2, j5, j6, z3, false, i2, list, j7, this.f16885l, (DefaultConstructorMarker) null);
        PointerInputChange pointerInputChange3 = this.f16888o;
        if (pointerInputChange3 == null) {
            pointerInputChange3 = this;
        }
        PointerInputChange pointerInputChange4 = pointerInputChange;
        pointerInputChange4.f16888o = pointerInputChange3;
        return pointerInputChange4;
    }

    public final List e() {
        List list = this.f16884k;
        return list == null ? CollectionsKt.m() : list;
    }

    public final long f() {
        return this.f16874a;
    }

    public final long g() {
        return this.f16885l;
    }

    public final long h() {
        return this.f16876c;
    }

    public final boolean i() {
        return this.f16877d;
    }

    public final float j() {
        return this.f16878e;
    }

    public final long k() {
        return this.f16880g;
    }

    public final boolean l() {
        return this.f16881h;
    }

    public final long m() {
        return this.f16883j;
    }

    public final int n() {
        return this.f16882i;
    }

    public final long o() {
        return this.f16875b;
    }

    public final boolean p() {
        PointerInputChange pointerInputChange = this.f16888o;
        return pointerInputChange != null ? pointerInputChange.p() : this.f16886m || this.f16887n;
    }

    public String toString() {
        return "PointerInputChange(id=" + PointerId.e(this.f16874a) + ", uptimeMillis=" + this.f16875b + ", position=" + Offset.s(this.f16876c) + ", pressed=" + this.f16877d + ", pressure=" + this.f16878e + ", previousUptimeMillis=" + this.f16879f + ", previousPosition=" + Offset.s(this.f16880g) + ", previousPressed=" + this.f16881h + ", isConsumed=" + p() + ", type=" + PointerType.j(this.f16882i) + ", historical=" + e() + ",scrollDelta=" + Offset.s(this.f16883j) + ')';
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, List list, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, i2, list, j7, j8);
    }

    public PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, long j7) {
        boolean z5 = z4;
        this.f16874a = j2;
        this.f16875b = j3;
        this.f16876c = j4;
        this.f16877d = z2;
        this.f16878e = f2;
        this.f16879f = j5;
        this.f16880g = j6;
        this.f16881h = z3;
        this.f16882i = i2;
        this.f16883j = j7;
        this.f16885l = Offset.f15855b.c();
        this.f16886m = z5;
        this.f16887n = z5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PointerInputChange(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, boolean r35, int r36, long r37, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x000f
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.d()
            r17 = r1
            goto L_0x0011
        L_0x000f:
            r17 = r36
        L_0x0011:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r0 = r0.c()
            r18 = r0
            goto L_0x0020
        L_0x001e:
            r18 = r37
        L_0x0020:
            r20 = 0
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r11 = r30
            r13 = r32
            r15 = r34
            r16 = r35
            r2.<init>(r3, r5, r7, r9, r10, r11, r13, r15, r16, r17, r18, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInputChange.<init>(long, long, long, boolean, float, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PointerInputChange(long j2, long j3, long j4, boolean z2, float f2, long j5, long j6, boolean z3, boolean z4, int i2, List list, long j7, long j8) {
        this(j2, j3, j4, z2, f2, j5, j6, z3, z4, i2, j7, (DefaultConstructorMarker) null);
        this.f16884k = list;
        this.f16885l = j8;
    }
}
