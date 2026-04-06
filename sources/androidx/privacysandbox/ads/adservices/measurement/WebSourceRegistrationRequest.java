package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebSourceRegistrationRequest {

    /* renamed from: a  reason: collision with root package name */
    public final List f22739a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f22740b;

    /* renamed from: c  reason: collision with root package name */
    public final InputEvent f22741c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f22742d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f22743e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f22744f;

    @Metadata
    public static final class Builder {
    }

    public final Uri a() {
        return this.f22742d;
    }

    public final InputEvent b() {
        return this.f22741c;
    }

    public final Uri c() {
        return this.f22740b;
    }

    public final Uri d() {
        return this.f22744f;
    }

    public final Uri e() {
        return this.f22743e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) obj;
        return Intrinsics.d(this.f22739a, webSourceRegistrationRequest.f22739a) && Intrinsics.d(this.f22743e, webSourceRegistrationRequest.f22743e) && Intrinsics.d(this.f22742d, webSourceRegistrationRequest.f22742d) && Intrinsics.d(this.f22740b, webSourceRegistrationRequest.f22740b) && Intrinsics.d(this.f22741c, webSourceRegistrationRequest.f22741c) && Intrinsics.d(this.f22744f, webSourceRegistrationRequest.f22744f);
    }

    public final List f() {
        return this.f22739a;
    }

    public int hashCode() {
        int hashCode = (this.f22739a.hashCode() * 31) + this.f22740b.hashCode();
        InputEvent inputEvent = this.f22741c;
        if (inputEvent != null) {
            hashCode = (hashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.f22742d;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f22743e;
        if (uri2 != null) {
            hashCode = (hashCode * 31) + uri2.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.f22740b.hashCode();
        InputEvent inputEvent2 = this.f22741c;
        if (inputEvent2 != null) {
            hashCode2 = (hashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.f22744f;
        return uri3 != null ? (hashCode2 * 31) + uri3.hashCode() : hashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.f22739a + "], TopOriginUri=" + this.f22740b + ", InputEvent=" + this.f22741c + ", AppDestination=" + this.f22742d + ", WebDestination=" + this.f22743e + ", VerifiedDestination=" + this.f22744f) + " }";
    }
}
