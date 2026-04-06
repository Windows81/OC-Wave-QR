package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LoadedFontFamily extends FontFamily {
    public final Typeface G;

    public LoadedFontFamily(Typeface typeface) {
        super(true, (DefaultConstructorMarker) null);
        this.G = typeface;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadedFontFamily) && Intrinsics.d(this.G, ((LoadedFontFamily) obj).G);
    }

    public int hashCode() {
        return this.G.hashCode();
    }

    public final Typeface n() {
        return this.G;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.G + ')';
    }
}
