package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SearchBarColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10783a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10784b;

    /* renamed from: c  reason: collision with root package name */
    public final TextFieldColors f10785c;

    public final long a() {
        return this.f10783a;
    }

    public final long b() {
        return this.f10784b;
    }

    public final TextFieldColors c() {
        return this.f10785c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarColors)) {
            return false;
        }
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        return Color.n(this.f10783a, searchBarColors.f10783a) && Color.n(this.f10784b, searchBarColors.f10784b) && Intrinsics.d(this.f10785c, searchBarColors.f10785c);
    }

    public int hashCode() {
        return (((Color.t(this.f10783a) * 31) + Color.t(this.f10784b)) * 31) + this.f10785c.hashCode();
    }
}
