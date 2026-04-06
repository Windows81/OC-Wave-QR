package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class RadioButtonColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10694a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10695b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10696c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10697d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.n(this.f10694a, radioButtonColors.f10694a) && Color.n(this.f10695b, radioButtonColors.f10695b) && Color.n(this.f10696c, radioButtonColors.f10696c) && Color.n(this.f10697d, radioButtonColors.f10697d);
    }

    public int hashCode() {
        return (((((Color.t(this.f10694a) * 31) + Color.t(this.f10695b)) * 31) + Color.t(this.f10696c)) * 31) + Color.t(this.f10697d);
    }
}
