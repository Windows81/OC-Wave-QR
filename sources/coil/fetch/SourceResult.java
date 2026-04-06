package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SourceResult extends FetchResult {

    /* renamed from: a  reason: collision with root package name */
    public final ImageSource f23459a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23460b;

    /* renamed from: c  reason: collision with root package name */
    public final DataSource f23461c;

    public SourceResult(ImageSource imageSource, String str, DataSource dataSource) {
        super((DefaultConstructorMarker) null);
        this.f23459a = imageSource;
        this.f23460b = str;
        this.f23461c = dataSource;
    }

    public final DataSource a() {
        return this.f23461c;
    }

    public final ImageSource b() {
        return this.f23459a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceResult) {
            SourceResult sourceResult = (SourceResult) obj;
            return Intrinsics.d(this.f23459a, sourceResult.f23459a) && Intrinsics.d(this.f23460b, sourceResult.f23460b) && this.f23461c == sourceResult.f23461c;
        }
    }

    public int hashCode() {
        int hashCode = this.f23459a.hashCode() * 31;
        String str = this.f23460b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f23461c.hashCode();
    }
}
