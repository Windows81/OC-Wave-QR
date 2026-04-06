package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Selection {

    /* renamed from: a  reason: collision with root package name */
    public final AnchorInfo f6776a;

    /* renamed from: b  reason: collision with root package name */
    public final AnchorInfo f6777b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6778c;

    @Metadata
    public static final class AnchorInfo {

        /* renamed from: a  reason: collision with root package name */
        public final ResolvedTextDirection f6779a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6780b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6781c;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i2, long j2) {
            this.f6779a = resolvedTextDirection;
            this.f6780b = i2;
            this.f6781c = j2;
        }

        public static /* synthetic */ AnchorInfo b(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i2, long j2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                resolvedTextDirection = anchorInfo.f6779a;
            }
            if ((i3 & 2) != 0) {
                i2 = anchorInfo.f6780b;
            }
            if ((i3 & 4) != 0) {
                j2 = anchorInfo.f6781c;
            }
            return anchorInfo.a(resolvedTextDirection, i2, j2);
        }

        public final AnchorInfo a(ResolvedTextDirection resolvedTextDirection, int i2, long j2) {
            return new AnchorInfo(resolvedTextDirection, i2, j2);
        }

        public final ResolvedTextDirection c() {
            return this.f6779a;
        }

        public final int d() {
            return this.f6780b;
        }

        public final long e() {
            return this.f6781c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.f6779a == anchorInfo.f6779a && this.f6780b == anchorInfo.f6780b && this.f6781c == anchorInfo.f6781c;
        }

        public int hashCode() {
            return (((this.f6779a.hashCode() * 31) + Integer.hashCode(this.f6780b)) * 31) + Long.hashCode(this.f6781c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f6779a + ", offset=" + this.f6780b + ", selectableId=" + this.f6781c + ')';
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2) {
        this.f6776a = anchorInfo;
        this.f6777b = anchorInfo2;
        this.f6778c = z2;
    }

    public static /* synthetic */ Selection b(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            anchorInfo = selection.f6776a;
        }
        if ((i2 & 2) != 0) {
            anchorInfo2 = selection.f6777b;
        }
        if ((i2 & 4) != 0) {
            z2 = selection.f6778c;
        }
        return selection.a(anchorInfo, anchorInfo2, z2);
    }

    public final Selection a(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2) {
        return new Selection(anchorInfo, anchorInfo2, z2);
    }

    public final AnchorInfo c() {
        return this.f6777b;
    }

    public final boolean d() {
        return this.f6778c;
    }

    public final AnchorInfo e() {
        return this.f6776a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return Intrinsics.d(this.f6776a, selection.f6776a) && Intrinsics.d(this.f6777b, selection.f6777b) && this.f6778c == selection.f6778c;
    }

    public final Selection f(Selection selection) {
        if (selection == null) {
            return this;
        }
        boolean z2 = this.f6778c;
        if (z2 || selection.f6778c) {
            return new Selection(selection.f6778c ? selection.f6776a : selection.f6777b, z2 ? this.f6777b : this.f6776a, true);
        }
        return b(this, (AnchorInfo) null, selection.f6777b, false, 5, (Object) null);
    }

    public final long g() {
        return TextRangeKt.b(this.f6776a.d(), this.f6777b.d());
    }

    public int hashCode() {
        return (((this.f6776a.hashCode() * 31) + this.f6777b.hashCode()) * 31) + Boolean.hashCode(this.f6778c);
    }

    public String toString() {
        return "Selection(start=" + this.f6776a + ", end=" + this.f6777b + ", handlesCrossed=" + this.f6778c + ')';
    }
}
