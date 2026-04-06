package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class MultiSelectionLayout implements SelectionLayout {

    /* renamed from: a  reason: collision with root package name */
    public final LongIntMap f6753a;

    /* renamed from: b  reason: collision with root package name */
    public final List f6754b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6755c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6756d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6757e;

    /* renamed from: f  reason: collision with root package name */
    public final Selection f6758f;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6759a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.selection.CrossStatus[] r0 = androidx.compose.foundation.text.selection.CrossStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.selection.CrossStatus r1 = androidx.compose.foundation.text.selection.CrossStatus.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.selection.CrossStatus r1 = androidx.compose.foundation.text.selection.CrossStatus.NOT_CROSSED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.selection.CrossStatus r1 = androidx.compose.foundation.text.selection.CrossStatus.CROSSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6759a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiSelectionLayout.WhenMappings.<clinit>():void");
        }
    }

    public MultiSelectionLayout(LongIntMap longIntMap, List list, int i2, int i3, boolean z2, Selection selection) {
        this.f6753a = longIntMap;
        this.f6754b = list;
        this.f6755c = i2;
        this.f6756d = i3;
        this.f6757e = z2;
        this.f6758f = selection;
        if (!(list.size() <= 1 ? false : true)) {
            InlineClassHelperKt.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
        }
    }

    public boolean a() {
        return this.f6757e;
    }

    public SelectableInfo b() {
        return a() ? l() : i();
    }

    public Selection c() {
        return this.f6758f;
    }

    public SelectableInfo d() {
        return j() == CrossStatus.CROSSED ? i() : l();
    }

    public int e() {
        return this.f6754b.size();
    }

    public LongObjectMap f(Selection selection) {
        if (selection.e().e() == selection.c().e()) {
            if (!((selection.d() && selection.e().d() >= selection.c().d()) || (!selection.d() && selection.e().d() <= selection.c().d()))) {
                InlineClassHelperKt.c("unexpectedly miss-crossed selection: " + selection);
            }
            return LongObjectMapKt.b(selection.e().e(), selection);
        }
        MutableLongObjectMap c2 = LongObjectMapKt.c();
        o(c2, selection, d(), (selection.d() ? selection.c() : selection.e()).d(), d().l());
        k(new MultiSelectionLayout$createSubSelections$2$1(this, c2, selection));
        o(c2, selection, q(), 0, (selection.d() ? selection.e() : selection.c()).d());
        return c2;
    }

    public boolean g(SelectionLayout selectionLayout) {
        return c() == null || selectionLayout == null || !(selectionLayout instanceof MultiSelectionLayout) || a() != selectionLayout.a() || m() != selectionLayout.m() || h() != selectionLayout.h() || r((MultiSelectionLayout) selectionLayout);
    }

    public int h() {
        return this.f6756d;
    }

    public SelectableInfo i() {
        return (SelectableInfo) this.f6754b.get(t(h(), false));
    }

    public CrossStatus j() {
        return m() < h() ? CrossStatus.NOT_CROSSED : m() > h() ? CrossStatus.CROSSED : ((SelectableInfo) this.f6754b.get(m() / 2)).d();
    }

    public void k(Function1 function1) {
        int p2 = p(d().h());
        int p3 = p(q().h());
        int i2 = p2 + 1;
        if (i2 < p3) {
            while (i2 < p3) {
                function1.invoke(this.f6754b.get(i2));
                i2++;
            }
        }
    }

    public SelectableInfo l() {
        return (SelectableInfo) this.f6754b.get(t(m(), true));
    }

    public int m() {
        return this.f6755c;
    }

    public final void o(MutableLongObjectMap mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i2, int i3) {
        Selection m2 = selection.d() ? selectableInfo.m(i3, i2) : selectableInfo.m(i2, i3);
        if (!(i2 <= i3)) {
            InlineClassHelperKt.c("minOffset should be less than or equal to maxOffset: " + m2);
        }
        mutableLongObjectMap.n(selectableInfo.h(), m2);
    }

    public final int p(long j2) {
        try {
            return this.f6753a.b(j2);
        } catch (NoSuchElementException e2) {
            throw new IllegalStateException("Invalid selectableId: " + j2, e2);
        }
    }

    public SelectableInfo q() {
        return j() == CrossStatus.CROSSED ? l() : i();
    }

    public final boolean r(MultiSelectionLayout multiSelectionLayout) {
        if (e() != multiSelectionLayout.e()) {
            return true;
        }
        int size = this.f6754b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((SelectableInfo) this.f6754b.get(i2)).n((SelectableInfo) multiSelectionLayout.f6754b.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public final int s(int i2, boolean z2) {
        return (i2 - (z2 ^ true ? 1 : 0)) / 2;
    }

    public final int t(int i2, boolean z2) {
        int i3 = WhenMappings.f6759a[j().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else if (z2) {
                    z2 = false;
                }
            }
            return s(i2, z2);
        }
        z2 = true;
        return s(i2, z2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiSelectionLayout(isStartHandle=");
        sb.append(a());
        sb.append(", startPosition=");
        boolean z2 = true;
        float f2 = (float) 2;
        sb.append(((float) (m() + 1)) / f2);
        sb.append(", endPosition=");
        sb.append(((float) (h() + 1)) / f2);
        sb.append(", crossed=");
        sb.append(j());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\n\t");
        List list = this.f6754b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            SelectableInfo selectableInfo = (SelectableInfo) list.get(i2);
            if (z2) {
                z2 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i2++;
            sb3.append(i2);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String sb4 = sb2.toString();
        Intrinsics.h(sb4, "toString(...)");
        sb.append(sb4);
        sb.append(')');
        return sb.toString();
    }
}
