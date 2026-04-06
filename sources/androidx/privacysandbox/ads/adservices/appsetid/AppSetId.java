package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AppSetId {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22685c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f22686a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22687b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AppSetId(String str, int i2) {
        Intrinsics.i(str, "id");
        this.f22686a = str;
        this.f22687b = i2;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return Intrinsics.d(this.f22686a, appSetId.f22686a) && this.f22687b == appSetId.f22687b;
    }

    public int hashCode() {
        return (this.f22686a.hashCode() * 31) + Integer.hashCode(this.f22687b);
    }

    public String toString() {
        String str = this.f22687b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER";
        return "AppSetId: id=" + this.f22686a + ", scope=" + str;
    }
}
