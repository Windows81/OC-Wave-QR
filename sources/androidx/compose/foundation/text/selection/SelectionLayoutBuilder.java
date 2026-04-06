package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectionLayoutBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final long f6851a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6852b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutCoordinates f6853c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6854d;

    /* renamed from: e  reason: collision with root package name */
    public final Selection f6855e;

    /* renamed from: f  reason: collision with root package name */
    public final Comparator f6856f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableLongIntMap f6857g;

    /* renamed from: h  reason: collision with root package name */
    public final List f6858h;

    /* renamed from: i  reason: collision with root package name */
    public int f6859i;

    /* renamed from: j  reason: collision with root package name */
    public int f6860j;

    /* renamed from: k  reason: collision with root package name */
    public int f6861k;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6862a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.selection.Direction[] r0 = androidx.compose.foundation.text.selection.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.selection.Direction r1 = androidx.compose.foundation.text.selection.Direction.BEFORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.selection.Direction r1 = androidx.compose.foundation.text.selection.Direction.ON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.selection.Direction r1 = androidx.compose.foundation.text.selection.Direction.AFTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6862a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionLayoutBuilder.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, layoutCoordinates, z2, selection, comparator);
    }

    public final SelectableInfo a(long j2, int i2, Direction direction, Direction direction2, int i3, Direction direction3, Direction direction4, int i4, TextLayoutResult textLayoutResult) {
        this.f6861k += 2;
        SelectableInfo selectableInfo = new SelectableInfo(j2, this.f6861k, i2, i3, i4, textLayoutResult);
        Direction direction5 = direction;
        Direction direction6 = direction2;
        this.f6859i = i(this.f6859i, direction, direction2);
        this.f6860j = i(this.f6860j, direction3, direction4);
        long j3 = j2;
        this.f6857g.n(j2, this.f6858h.size());
        this.f6858h.add(selectableInfo);
        return selectableInfo;
    }

    public final SelectionLayout b() {
        int i2 = this.f6861k + 1;
        int size = this.f6858h.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            MutableLongIntMap mutableLongIntMap = this.f6857g;
            List list = this.f6858h;
            int i3 = this.f6859i;
            int i4 = i3 == -1 ? i2 : i3;
            int i5 = this.f6860j;
            return new MultiSelectionLayout(mutableLongIntMap, list, i4, i5 == -1 ? i2 : i5, this.f6854d, this.f6855e);
        }
        SelectableInfo selectableInfo = (SelectableInfo) CollectionsKt.B0(this.f6858h);
        int i6 = this.f6859i;
        int i7 = i6 == -1 ? i2 : i6;
        int i8 = this.f6860j;
        return new SingleSelectionLayout(this.f6854d, i7, i8 == -1 ? i2 : i8, this.f6855e, selectableInfo);
    }

    public final LayoutCoordinates c() {
        return this.f6853c;
    }

    public final long d() {
        return this.f6851a;
    }

    public final long e() {
        return this.f6852b;
    }

    public final Selection f() {
        return this.f6855e;
    }

    public final Comparator g() {
        return this.f6856f;
    }

    public final boolean h() {
        return this.f6854d;
    }

    public final int i(int i2, Direction direction, Direction direction2) {
        if (i2 != -1) {
            return i2;
        }
        int i3 = WhenMappings.f6862a[SelectionLayoutKt.f(direction, direction2).ordinal()];
        if (i3 == 1) {
            return this.f6861k - 1;
        }
        if (i3 == 2) {
            return this.f6861k;
        }
        if (i3 == 3) {
            return i2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z2, Selection selection, Comparator comparator) {
        this.f6851a = j2;
        this.f6852b = j3;
        this.f6853c = layoutCoordinates;
        this.f6854d = z2;
        this.f6855e = selection;
        this.f6856f = comparator;
        this.f6857g = LongIntMapKt.a();
        this.f6858h = new ArrayList();
        this.f6859i = -1;
        this.f6860j = -1;
        this.f6861k = -1;
    }
}
