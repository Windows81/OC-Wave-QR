package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final long f12226a;

    /* renamed from: b  reason: collision with root package name */
    public final Density f12227b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12228c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f12229d;

    /* renamed from: e  reason: collision with root package name */
    public final MenuPosition.Horizontal f12230e;

    /* renamed from: f  reason: collision with root package name */
    public final MenuPosition.Horizontal f12231f;

    /* renamed from: g  reason: collision with root package name */
    public final MenuPosition.Horizontal f12232g;

    /* renamed from: h  reason: collision with root package name */
    public final MenuPosition.Horizontal f12233h;

    /* renamed from: i  reason: collision with root package name */
    public final MenuPosition.Vertical f12234i;

    /* renamed from: j  reason: collision with root package name */
    public final MenuPosition.Vertical f12235j;

    /* renamed from: k  reason: collision with root package name */
    public final MenuPosition.Vertical f12236k;

    /* renamed from: l  reason: collision with root package name */
    public final MenuPosition.Vertical f12237l;

    /* renamed from: m  reason: collision with root package name */
    public final MenuPosition.Vertical f12238m;

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, i2, function2);
    }

    /* access modifiers changed from: private */
    public static final Unit c(IntRect intRect, IntRect intRect2) {
        return Unit.f40552a;
    }

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2;
        int i3;
        int i4;
        IntRect intRect2 = intRect;
        long j4 = j2;
        long j5 = j3;
        char c2 = ' ';
        int i5 = (int) (j4 >> 32);
        List p2 = CollectionsKt.p(this.f12230e, this.f12231f, IntOffset.k(intRect.e()) < i5 / 2 ? this.f12232g : this.f12233h);
        int size = p2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i2 = 0;
                break;
            }
            int i7 = (int) (j5 >> c2);
            int i8 = size;
            int i9 = i6;
            List list = p2;
            int i10 = i5;
            i2 = ((MenuPosition.Horizontal) p2.get(i6)).a(intRect, j2, i7, layoutDirection);
            if (i9 == CollectionsKt.o(list) || (i2 >= 0 && i7 + i2 <= i10)) {
                break;
            }
            i6 = i9 + 1;
            size = i8;
            i5 = i10;
            p2 = list;
            c2 = ' ';
        }
        int i11 = (int) (j4 & 4294967295L);
        List p3 = CollectionsKt.p(this.f12234i, this.f12235j, this.f12236k, IntOffset.l(intRect.e()) < i11 / 2 ? this.f12237l : this.f12238m);
        int size2 = p3.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                i3 = 0;
                break;
            }
            int i13 = (int) (j5 & 4294967295L);
            i3 = ((MenuPosition.Vertical) p3.get(i12)).a(intRect2, j4, i13);
            if (i12 == CollectionsKt.o(p3) || (i3 >= (i4 = this.f12228c) && i13 + i3 <= i11 - i4)) {
                break;
            }
            i12++;
        }
        long f2 = IntOffset.f((((long) i2) << 32) | (((long) i3) & 4294967295L));
        this.f12229d.m(intRect2, IntRectKt.a(f2, j5));
        return f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.e(this.f12226a, dropdownMenuPositionProvider.f12226a) && Intrinsics.d(this.f12227b, dropdownMenuPositionProvider.f12227b) && this.f12228c == dropdownMenuPositionProvider.f12228c && Intrinsics.d(this.f12229d, dropdownMenuPositionProvider.f12229d);
    }

    public int hashCode() {
        return (((((DpOffset.h(this.f12226a) * 31) + this.f12227b.hashCode()) * 31) + Integer.hashCode(this.f12228c)) * 31) + this.f12229d.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.i(this.f12226a) + ", density=" + this.f12227b + ", verticalMargin=" + this.f12228c + ", onPositionCalculated=" + this.f12229d + ')';
    }

    public DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2) {
        this.f12226a = j2;
        this.f12227b = density;
        this.f12228c = i2;
        this.f12229d = function2;
        int P1 = density.P1(DpOffset.f(j2));
        MenuPosition menuPosition = MenuPosition.f12304a;
        this.f12230e = menuPosition.k(P1);
        this.f12231f = menuPosition.e(P1);
        this.f12232g = menuPosition.g(0);
        this.f12233h = menuPosition.i(0);
        int P12 = density.P1(DpOffset.g(j2));
        this.f12234i = menuPosition.m(P12);
        this.f12235j = menuPosition.a(P12);
        this.f12236k = menuPosition.d(P12);
        this.f12237l = menuPosition.o(i2);
        this.f12238m = menuPosition.c(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DropdownMenuPositionProvider(long r8, androidx.compose.ui.unit.Density r10, int r11, kotlin.jvm.functions.Function2 r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 4
            if (r14 == 0) goto L_0x000c
            float r11 = androidx.compose.material3.MenuKt.n()
            int r11 = r10.P1(r11)
        L_0x000c:
            r4 = r11
            r11 = r13 & 8
            if (r11 == 0) goto L_0x0016
            androidx.compose.material3.internal.P r12 = new androidx.compose.material3.internal.P
            r12.<init>()
        L_0x0016:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.DropdownMenuPositionProvider.<init>(long, androidx.compose.ui.unit.Density, int, kotlin.jvm.functions.Function2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
