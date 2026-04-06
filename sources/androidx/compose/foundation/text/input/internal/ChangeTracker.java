package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeTracker implements TextFieldBuffer.ChangeList {

    /* renamed from: a  reason: collision with root package name */
    public MutableVector f6127a;

    /* renamed from: b  reason: collision with root package name */
    public MutableVector f6128b;

    @Metadata
    public static final class Change {

        /* renamed from: a  reason: collision with root package name */
        public int f6129a;

        /* renamed from: b  reason: collision with root package name */
        public int f6130b;

        /* renamed from: c  reason: collision with root package name */
        public int f6131c;

        /* renamed from: d  reason: collision with root package name */
        public int f6132d;

        public Change(int i2, int i3, int i4, int i5) {
            this.f6129a = i2;
            this.f6130b = i3;
            this.f6131c = i4;
            this.f6132d = i5;
        }

        public final int a() {
            return this.f6132d;
        }

        public final int b() {
            return this.f6131c;
        }

        public final int c() {
            return this.f6130b;
        }

        public final int d() {
            return this.f6129a;
        }

        public final void e(int i2) {
            this.f6132d = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.f6129a == change.f6129a && this.f6130b == change.f6130b && this.f6131c == change.f6131c && this.f6132d == change.f6132d;
        }

        public final void f(int i2) {
            this.f6131c = i2;
        }

        public final void g(int i2) {
            this.f6130b = i2;
        }

        public final void h(int i2) {
            this.f6129a = i2;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f6129a) * 31) + Integer.hashCode(this.f6130b)) * 31) + Integer.hashCode(this.f6131c)) * 31) + Integer.hashCode(this.f6132d);
        }

        public String toString() {
            return "Change(preStart=" + this.f6129a + ", preEnd=" + this.f6130b + ", originalStart=" + this.f6131c + ", originalEnd=" + this.f6132d + ')';
        }
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector mutableVector;
        this.f6127a = new MutableVector(new Change[16], 0);
        this.f6128b = new MutableVector(new Change[16], 0);
        if (changeTracker != null && (mutableVector = changeTracker.f6127a) != null) {
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            for (int i2 = 0; i2 < p2; i2++) {
                Change change = (Change) objArr[i2];
                this.f6127a.d(new Change(change.d(), change.c(), change.b(), change.a()));
            }
        }
    }

    public int a() {
        return this.f6127a.p();
    }

    public long b(int i2) {
        Change change = (Change) this.f6127a.f15005z[i2];
        return TextRangeKt.b(change.b(), change.a());
    }

    public long c(int i2) {
        Change change = (Change) this.f6127a.f15005z[i2];
        return TextRangeKt.b(change.d(), change.c());
    }

    public final void d(Change change, int i2, int i3, int i4) {
        int i5;
        if (this.f6128b.p() == 0) {
            i5 = 0;
        } else {
            Change change2 = (Change) this.f6128b.s();
            i5 = change2.c() - change2.a();
        }
        if (change == null) {
            int i6 = i2 - i5;
            change = new Change(i2, i3 + i4, i6, (i3 - i2) + i6);
        } else {
            if (change.d() > i2) {
                change.h(i2);
                change.f(i2);
            }
            if (i3 > change.c()) {
                change.g(i3);
                change.e(i3 - (change.c() - change.a()));
            }
            change.g(change.c() + i4);
        }
        this.f6128b.d(change);
    }

    public final void e() {
        this.f6127a.l();
    }

    public final void f(int i2, int i3, int i4) {
        int c2;
        if (i2 != i3 || i4 != 0) {
            int min = Math.min(i2, i3);
            int max = Math.max(i2, i3);
            int i5 = i4 - (max - min);
            Change change = null;
            boolean z2 = false;
            for (int i6 = 0; i6 < this.f6127a.p(); i6++) {
                Change change2 = (Change) this.f6127a.f15005z[i6];
                int d2 = change2.d();
                if ((min > d2 || d2 > max) && (min > (c2 = change2.c()) || c2 > max)) {
                    int d3 = change2.d();
                    if (min > change2.c() || d3 > min) {
                        int d4 = change2.d();
                        if (max > change2.c() || d4 > max) {
                            if (change2.d() > max && !z2) {
                                d(change, min, max, i5);
                                z2 = true;
                            }
                            if (z2) {
                                change2.h(change2.d() + i5);
                                change2.g(change2.c() + i5);
                            }
                            this.f6128b.d(change2);
                        }
                    }
                }
                if (change == null) {
                    change = change2;
                } else {
                    change.g(change2.c());
                    change.e(change2.a());
                }
            }
            if (!z2) {
                d(change, min, max, i5);
            }
            MutableVector mutableVector = this.f6127a;
            this.f6127a = this.f6128b;
            this.f6128b = mutableVector;
            mutableVector.l();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList(changes=[");
        MutableVector mutableVector = this.f6127a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            Change change = (Change) objArr[i2];
            sb.append('(' + change.b() + ',' + change.a() + ")->(" + change.d() + ',' + change.c() + ')');
            if (i2 < a() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : changeTracker);
    }
}
