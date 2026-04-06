package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ContentCaptureEvent {

    /* renamed from: a  reason: collision with root package name */
    public final int f15641a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15642b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentCaptureEventType f15643c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewStructureCompat f15644d;

    public ContentCaptureEvent(int i2, long j2, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.f15641a = i2;
        this.f15642b = j2;
        this.f15643c = contentCaptureEventType;
        this.f15644d = viewStructureCompat;
    }

    public final int a() {
        return this.f15641a;
    }

    public final ViewStructureCompat b() {
        return this.f15644d;
    }

    public final ContentCaptureEventType c() {
        return this.f15643c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.f15641a == contentCaptureEvent.f15641a && this.f15642b == contentCaptureEvent.f15642b && this.f15643c == contentCaptureEvent.f15643c && Intrinsics.d(this.f15644d, contentCaptureEvent.f15644d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f15641a) * 31) + Long.hashCode(this.f15642b)) * 31) + this.f15643c.hashCode()) * 31;
        ViewStructureCompat viewStructureCompat = this.f15644d;
        return hashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f15641a + ", timestamp=" + this.f15642b + ", type=" + this.f15643c + ", structureCompat=" + this.f15644d + ')';
    }
}
