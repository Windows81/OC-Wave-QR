package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class AlignmentLineKt {

    /* renamed from: a  reason: collision with root package name */
    public static final HorizontalAlignmentLine f16988a = new HorizontalAlignmentLine(AlignmentLineKt$FirstBaseline$1.I);

    /* renamed from: b  reason: collision with root package name */
    public static final HorizontalAlignmentLine f16989b = new HorizontalAlignmentLine(AlignmentLineKt$LastBaseline$1.I);

    public static final HorizontalAlignmentLine a() {
        return f16988a;
    }

    public static final HorizontalAlignmentLine b() {
        return f16989b;
    }

    public static final int c(AlignmentLine alignmentLine, int i2, int i3) {
        return ((Number) alignmentLine.a().m(Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
    }
}
