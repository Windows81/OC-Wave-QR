package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BulletSpanWithLevel {

    /* renamed from: a  reason: collision with root package name */
    public final Bullet f18262a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18263b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18264c;

    public BulletSpanWithLevel(Bullet bullet, int i2, int i3) {
        this.f18262a = bullet;
        this.f18263b = i2;
        this.f18264c = i3;
    }

    public final Bullet a() {
        return this.f18262a;
    }

    public final int b() {
        return this.f18263b;
    }

    public final int c() {
        return this.f18264c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return Intrinsics.d(this.f18262a, bulletSpanWithLevel.f18262a) && this.f18263b == bulletSpanWithLevel.f18263b && this.f18264c == bulletSpanWithLevel.f18264c;
    }

    public int hashCode() {
        return (((this.f18262a.hashCode() * 31) + Integer.hashCode(this.f18263b)) * 31) + Integer.hashCode(this.f18264c);
    }

    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.f18262a + ", indentationLevel=" + this.f18263b + ", start=" + this.f18264c + ')';
    }
}
