package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class CrossAxisAlignment {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f3867a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final CrossAxisAlignment f3868b = CenterCrossAxisAlignment.f3872e;

    /* renamed from: c  reason: collision with root package name */
    public static final CrossAxisAlignment f3869c = StartCrossAxisAlignment.f3875e;

    /* renamed from: d  reason: collision with root package name */
    public static final CrossAxisAlignment f3870d = EndCrossAxisAlignment.f3873e;

    @Metadata
    public static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: e  reason: collision with root package name */
        public final AlignmentLineProvider f3871e;

        public AlignmentLineCrossAxisAlignment(AlignmentLineProvider alignmentLineProvider) {
            super((DefaultConstructorMarker) null);
            this.f3871e = alignmentLineProvider;
        }

        public int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            int a2 = this.f3871e.a(placeable);
            if (a2 == Integer.MIN_VALUE) {
                return 0;
            }
            int i4 = i3 - a2;
            return layoutDirection == LayoutDirection.Rtl ? i2 - i4 : i4;
        }

        public Integer b(Placeable placeable) {
            return Integer.valueOf(this.f3871e.a(placeable));
        }

        public boolean c() {
            return true;
        }
    }

    @Metadata
    public static final class CenterCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: e  reason: collision with root package name */
        public static final CenterCrossAxisAlignment f3872e = new CenterCrossAxisAlignment();

        public CenterCrossAxisAlignment() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return i2 / 2;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrossAxisAlignment a(AlignmentLineProvider alignmentLineProvider) {
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        public final CrossAxisAlignment b(Alignment.Horizontal horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final CrossAxisAlignment c(Alignment.Vertical vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class EndCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: e  reason: collision with root package name */
        public static final EndCrossAxisAlignment f3873e = new EndCrossAxisAlignment();

        public EndCrossAxisAlignment() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i2;
            }
            return 0;
        }
    }

    @Metadata
    public static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: e  reason: collision with root package name */
        public final Alignment.Horizontal f3874e;

        public HorizontalCrossAxisAlignment(Alignment.Horizontal horizontal) {
            super((DefaultConstructorMarker) null);
            this.f3874e = horizontal;
        }

        public int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return this.f3874e.a(0, i2, layoutDirection);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && Intrinsics.d(this.f3874e, ((HorizontalCrossAxisAlignment) obj).f3874e);
        }

        public int hashCode() {
            return this.f3874e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f3874e + ')';
        }
    }

    @Metadata
    public static final class StartCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: e  reason: collision with root package name */
        public static final StartCrossAxisAlignment f3875e = new StartCrossAxisAlignment();

        public StartCrossAxisAlignment() {
            super((DefaultConstructorMarker) null);
        }

        public int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i2;
        }
    }

    @Metadata
    public static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {

        /* renamed from: e  reason: collision with root package name */
        public final Alignment.Vertical f3876e;

        public VerticalCrossAxisAlignment(Alignment.Vertical vertical) {
            super((DefaultConstructorMarker) null);
            this.f3876e = vertical;
        }

        public int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
            return this.f3876e.a(0, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && Intrinsics.d(this.f3876e, ((VerticalCrossAxisAlignment) obj).f3876e);
        }

        public int hashCode() {
            return this.f3876e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f3876e + ')';
        }
    }

    public /* synthetic */ CrossAxisAlignment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i2, LayoutDirection layoutDirection, Placeable placeable, int i3);

    public Integer b(Placeable placeable) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public CrossAxisAlignment() {
    }
}
