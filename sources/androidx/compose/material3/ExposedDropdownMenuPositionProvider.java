package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Density f9965a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9966b;

    /* renamed from: c  reason: collision with root package name */
    public final State f9967c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9968d;

    /* renamed from: e  reason: collision with root package name */
    public final Function2 f9969e;

    /* renamed from: f  reason: collision with root package name */
    public final MenuPosition.Horizontal f9970f;

    /* renamed from: g  reason: collision with root package name */
    public final MenuPosition.Horizontal f9971g;

    /* renamed from: h  reason: collision with root package name */
    public final MenuPosition.Horizontal f9972h;

    /* renamed from: i  reason: collision with root package name */
    public final MenuPosition.Horizontal f9973i;

    /* renamed from: j  reason: collision with root package name */
    public final MenuPosition.Vertical f9974j;

    /* renamed from: k  reason: collision with root package name */
    public final MenuPosition.Vertical f9975k;

    /* renamed from: l  reason: collision with root package name */
    public final MenuPosition.Vertical f9976l;

    /* renamed from: m  reason: collision with root package name */
    public final MenuPosition.Vertical f9977m;

    public ExposedDropdownMenuPositionProvider(Density density, int i2, State state, int i3, Function2 function2) {
        this.f9965a = density;
        this.f9966b = i2;
        this.f9967c = state;
        this.f9968d = i3;
        this.f9969e = function2;
        MenuPosition menuPosition = MenuPosition.f12304a;
        this.f9970f = MenuPosition.l(menuPosition, 0, 1, (Object) null);
        this.f9971g = MenuPosition.f(menuPosition, 0, 1, (Object) null);
        this.f9972h = MenuPosition.h(menuPosition, 0, 1, (Object) null);
        this.f9973i = MenuPosition.j(menuPosition, 0, 1, (Object) null);
        this.f9974j = MenuPosition.n(menuPosition, 0, 1, (Object) null);
        this.f9975k = MenuPosition.b(menuPosition, 0, 1, (Object) null);
        this.f9976l = menuPosition.o(i3);
        this.f9977m = menuPosition.c(i3);
    }

    public static final Unit c(IntRect intRect, IntRect intRect2) {
        return Unit.f40552a;
    }

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long j4;
        int i2;
        int a2;
        int a3;
        int i3;
        IntRect intRect2 = intRect;
        long j5 = j3;
        State state = this.f9967c;
        if (state != null) {
            state.getValue();
        }
        char c2 = ' ';
        long c3 = IntSize.c((((long) (((int) (j2 & 4294967295L)) + this.f9966b)) & 4294967295L) | (((long) ((int) (j2 >> 32))) << 32));
        int i4 = (int) (c3 >> 32);
        List p2 = CollectionsKt.p(this.f9970f, this.f9971g, IntOffset.k(intRect.e()) < i4 / 2 ? this.f9972h : this.f9973i);
        int size = p2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                j4 = c3;
                i2 = 0;
                break;
            }
            int i6 = i4;
            int i7 = (int) (j5 >> c2);
            int i8 = size;
            int i9 = i5;
            j4 = c3;
            a3 = ((MenuPosition.Horizontal) p2.get(i5)).a(intRect, c3, i7, layoutDirection);
            if (i9 == CollectionsKt.o(p2)) {
                break;
            }
            if (a3 >= 0) {
                i3 = i6;
                if (i7 + a3 <= i3) {
                    break;
                }
            } else {
                i3 = i6;
            }
            i5 = i9 + 1;
            size = i8;
            c3 = j4;
            c2 = ' ';
            i4 = i3;
        }
        i2 = a3;
        long j6 = j4;
        int i10 = (int) (j6 & 4294967295L);
        int i11 = 0;
        List p3 = CollectionsKt.p(this.f9974j, this.f9975k, IntOffset.l(intRect.e()) < i10 / 2 ? this.f9976l : this.f9977m);
        int size2 = p3.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                break;
            }
            int i13 = (int) (j5 & 4294967295L);
            a2 = ((MenuPosition.Vertical) p3.get(i12)).a(intRect2, j6, i13);
            if (i12 == CollectionsKt.o(p3) || (a2 >= 0 && i13 + a2 <= i10)) {
                i11 = a2;
            } else {
                i12++;
            }
        }
        i11 = a2;
        long f2 = IntOffset.f((((long) i2) << 32) | (((long) i11) & 4294967295L));
        this.f9969e.m(intRect2, IntRectKt.a(f2, j5));
        return f2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ExposedDropdownMenuPositionProvider(androidx.compose.ui.unit.Density r7, int r8, androidx.compose.runtime.State r9, int r10, kotlin.jvm.functions.Function2 r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0012
            float r9 = androidx.compose.material3.MenuKt.n()
            int r10 = r7.P1(r9)
        L_0x0012:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L_0x001c
            androidx.compose.material3.M2 r11 = new androidx.compose.material3.M2
            r11.<init>()
        L_0x001c:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuPositionProvider.<init>(androidx.compose.ui.unit.Density, int, androidx.compose.runtime.State, int, kotlin.jvm.functions.Function2, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
