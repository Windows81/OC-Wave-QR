package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextMenuColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f3235a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3236b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3237c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3238d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3239e;

    public /* synthetic */ ContextMenuColors(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    public final long a() {
        return this.f3235a;
    }

    public final long b() {
        return this.f3239e;
    }

    public final long c() {
        return this.f3238d;
    }

    public final long d() {
        return this.f3237c;
    }

    public final long e() {
        return this.f3236b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.n(this.f3235a, contextMenuColors.f3235a) && Color.n(this.f3236b, contextMenuColors.f3236b) && Color.n(this.f3237c, contextMenuColors.f3237c) && Color.n(this.f3238d, contextMenuColors.f3238d) && Color.n(this.f3239e, contextMenuColors.f3239e);
    }

    public int hashCode() {
        return (((((((Color.t(this.f3235a) * 31) + Color.t(this.f3236b)) * 31) + Color.t(this.f3237c)) * 31) + Color.t(this.f3238d)) * 31) + Color.t(this.f3239e);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + Color.u(this.f3235a) + ", textColor=" + Color.u(this.f3236b) + ", iconColor=" + Color.u(this.f3237c) + ", disabledTextColor=" + Color.u(this.f3238d) + ", disabledIconColor=" + Color.u(this.f3239e) + ')';
    }

    public ContextMenuColors(long j2, long j3, long j4, long j5, long j6) {
        this.f3235a = j2;
        this.f3236b = j3;
        this.f3237c = j4;
        this.f3238d = j5;
        this.f3239e = j6;
    }
}
