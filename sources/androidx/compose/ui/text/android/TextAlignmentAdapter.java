package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextAlignmentAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final TextAlignmentAdapter f18576a = new TextAlignmentAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final Layout.Alignment f18577b;

    /* renamed from: c  reason: collision with root package name */
    public static final Layout.Alignment f18578c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.d(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.d(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f18577b = alignment;
        f18578c = alignment2;
    }

    public final Layout.Alignment a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? Layout.Alignment.ALIGN_NORMAL : f18578c : f18577b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
