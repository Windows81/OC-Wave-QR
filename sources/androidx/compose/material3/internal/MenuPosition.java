package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class MenuPosition {

    /* renamed from: a  reason: collision with root package name */
    public static final MenuPosition f12304a = new MenuPosition();

    @Metadata
    public interface Horizontal {
        int a(IntRect intRect, long j2, int i2, LayoutDirection layoutDirection);
    }

    @Metadata
    public interface Vertical {
        int a(IntRect intRect, long j2, int i2);
    }

    public static /* synthetic */ Vertical b(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.a(i2);
    }

    public static /* synthetic */ Horizontal f(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.e(i2);
    }

    public static /* synthetic */ Horizontal h(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.g(i2);
    }

    public static /* synthetic */ Horizontal j(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.i(i2);
    }

    public static /* synthetic */ Horizontal l(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.k(i2);
    }

    public static /* synthetic */ Vertical n(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.m(i2);
    }

    public final Vertical a(int i2) {
        Alignment.Companion companion = Alignment.f15444a;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.a(), companion.l(), i2);
    }

    public final Vertical c(int i2) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.f15444a.a(), i2);
    }

    public final Vertical d(int i2) {
        Alignment.Companion companion = Alignment.f15444a;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.i(), companion.l(), i2);
    }

    public final Horizontal e(int i2) {
        Alignment.Companion companion = Alignment.f15444a;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.j(), companion.j(), i2);
    }

    public final Horizontal g(int i2) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.f15434a.a(), i2);
    }

    public final Horizontal i(int i2) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.f15434a.b(), i2);
    }

    public final Horizontal k(int i2) {
        Alignment.Companion companion = Alignment.f15444a;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.k(), companion.k(), i2);
    }

    public final Vertical m(int i2) {
        Alignment.Companion companion = Alignment.f15444a;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.l(), companion.a(), i2);
    }

    public final Vertical o(int i2) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.f15444a.l(), i2);
    }
}
