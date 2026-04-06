package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;

@Metadata
public final class Placeholder {

    /* renamed from: a  reason: collision with root package name */
    public final long f18329a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18330b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18331c;

    public final long a() {
        return this.f18330b;
    }

    public final int b() {
        return this.f18331c;
    }

    public final long c() {
        return this.f18329a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.e(this.f18329a, placeholder.f18329a) && TextUnit.e(this.f18330b, placeholder.f18330b) && PlaceholderVerticalAlign.j(this.f18331c, placeholder.f18331c);
    }

    public int hashCode() {
        return (((TextUnit.i(this.f18329a) * 31) + TextUnit.i(this.f18330b)) * 31) + PlaceholderVerticalAlign.k(this.f18331c);
    }

    public String toString() {
        return "Placeholder(width=" + TextUnit.l(this.f18329a) + ", height=" + TextUnit.l(this.f18330b) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.l(this.f18331c) + ')';
    }
}
