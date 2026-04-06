package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class GenericFontFamily extends SystemFontFamily {
    public final String G;
    public final String H;

    public GenericFontFamily(String str, String str2) {
        super((DefaultConstructorMarker) null);
        this.G = str;
        this.H = str2;
    }

    public final String n() {
        return this.G;
    }

    public String toString() {
        return this.H;
    }
}
