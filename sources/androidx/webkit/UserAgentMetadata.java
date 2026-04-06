package androidx.webkit;

import java.util.List;
import java.util.Objects;

public final class UserAgentMetadata {

    /* renamed from: a  reason: collision with root package name */
    public final List f23106a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23107b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23108c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23109d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23110e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23111f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23112g;

    /* renamed from: h  reason: collision with root package name */
    public int f23113h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23114i;

    public static final class BrandVersion {

        /* renamed from: a  reason: collision with root package name */
        public final String f23115a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23116b;

        /* renamed from: c  reason: collision with root package name */
        public final String f23117c;

        public static final class Builder {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandVersion)) {
                return false;
            }
            BrandVersion brandVersion = (BrandVersion) obj;
            return Objects.equals(this.f23115a, brandVersion.f23115a) && Objects.equals(this.f23116b, brandVersion.f23116b) && Objects.equals(this.f23117c, brandVersion.f23117c);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f23115a, this.f23116b, this.f23117c});
        }

        public String toString() {
            return this.f23115a + "," + this.f23116b + "," + this.f23117c;
        }
    }

    public static final class Builder {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAgentMetadata)) {
            return false;
        }
        UserAgentMetadata userAgentMetadata = (UserAgentMetadata) obj;
        return this.f23112g == userAgentMetadata.f23112g && this.f23113h == userAgentMetadata.f23113h && this.f23114i == userAgentMetadata.f23114i && Objects.equals(this.f23106a, userAgentMetadata.f23106a) && Objects.equals(this.f23107b, userAgentMetadata.f23107b) && Objects.equals(this.f23108c, userAgentMetadata.f23108c) && Objects.equals(this.f23109d, userAgentMetadata.f23109d) && Objects.equals(this.f23110e, userAgentMetadata.f23110e) && Objects.equals(this.f23111f, userAgentMetadata.f23111f);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f23106a, this.f23107b, this.f23108c, this.f23109d, this.f23110e, this.f23111f, Boolean.valueOf(this.f23112g), Integer.valueOf(this.f23113h), Boolean.valueOf(this.f23114i)});
    }
}
