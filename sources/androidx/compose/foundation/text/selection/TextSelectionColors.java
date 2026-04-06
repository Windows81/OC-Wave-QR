package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextSelectionColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7034a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7035b;

    public /* synthetic */ TextSelectionColors(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public final long a() {
        return this.f7035b;
    }

    public final long b() {
        return this.f7034a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.n(this.f7034a, textSelectionColors.f7034a) && Color.n(this.f7035b, textSelectionColors.f7035b);
    }

    public int hashCode() {
        return (Color.t(this.f7034a) * 31) + Color.t(this.f7035b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + Color.u(this.f7034a) + ", selectionBackgroundColor=" + Color.u(this.f7035b) + ')';
    }

    public TextSelectionColors(long j2, long j3) {
        this.f7034a = j2;
        this.f7035b = j3;
    }
}
