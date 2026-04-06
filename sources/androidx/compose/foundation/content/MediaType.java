package androidx.compose.foundation.content;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MediaType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f3192b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final MediaType f3193c = new MediaType("text/*");

    /* renamed from: d  reason: collision with root package name */
    public static final MediaType f3194d = new MediaType("text/plain");

    /* renamed from: e  reason: collision with root package name */
    public static final MediaType f3195e = new MediaType("text/html");

    /* renamed from: f  reason: collision with root package name */
    public static final MediaType f3196f = new MediaType("image/*");

    /* renamed from: g  reason: collision with root package name */
    public static final MediaType f3197g = new MediaType("*/*");

    /* renamed from: a  reason: collision with root package name */
    public final String f3198a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType a() {
            return MediaType.f3197g;
        }

        public final MediaType b() {
            return MediaType.f3193c;
        }

        public Companion() {
        }
    }

    public MediaType(String str) {
        this.f3198a = str;
    }

    public final String c() {
        return this.f3198a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        return Intrinsics.d(this.f3198a, ((MediaType) obj).f3198a);
    }

    public int hashCode() {
        return this.f3198a.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.f3198a + "')";
    }
}
