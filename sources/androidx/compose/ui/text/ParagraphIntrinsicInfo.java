package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ParagraphIntrinsicInfo {

    /* renamed from: a  reason: collision with root package name */
    public final ParagraphIntrinsics f18316a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18317b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18318c;

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics, int i2, int i3) {
        this.f18316a = paragraphIntrinsics;
        this.f18317b = i2;
        this.f18318c = i3;
    }

    public final int a() {
        return this.f18318c;
    }

    public final ParagraphIntrinsics b() {
        return this.f18316a;
    }

    public final int c() {
        return this.f18317b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return Intrinsics.d(this.f18316a, paragraphIntrinsicInfo.f18316a) && this.f18317b == paragraphIntrinsicInfo.f18317b && this.f18318c == paragraphIntrinsicInfo.f18318c;
    }

    public int hashCode() {
        return (((this.f18316a.hashCode() * 31) + Integer.hashCode(this.f18317b)) * 31) + Integer.hashCode(this.f18318c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f18316a + ", startIndex=" + this.f18317b + ", endIndex=" + this.f18318c + ')';
    }
}
