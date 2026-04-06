package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;

@Metadata
public final class FormBody extends RequestBody {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f42639d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final MediaType f42640e = MediaType.f42680e.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    public final List f42641b;

    /* renamed from: c  reason: collision with root package name */
    public final List f42642c;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f42643a;

        /* renamed from: b  reason: collision with root package name */
        public final List f42644b;

        /* renamed from: c  reason: collision with root package name */
        public final List f42645c;

        public Builder() {
            this((Charset) null, 1, (DefaultConstructorMarker) null);
        }

        public final Builder a(String str, String str2) {
            String str3 = str;
            Intrinsics.i(str3, "name");
            Intrinsics.i(str2, "value");
            HttpUrl.Companion companion = HttpUrl.f42657k;
            this.f42644b.add(HttpUrl.Companion.b(companion, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f42643a, 91, (Object) null));
            this.f42645c.add(HttpUrl.Companion.b(companion, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f42643a, 91, (Object) null));
            return this;
        }

        public final Builder b(String str, String str2) {
            String str3 = str;
            Intrinsics.i(str3, "name");
            Intrinsics.i(str2, "value");
            HttpUrl.Companion companion = HttpUrl.f42657k;
            this.f42644b.add(HttpUrl.Companion.b(companion, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f42643a, 83, (Object) null));
            this.f42645c.add(HttpUrl.Companion.b(companion, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f42643a, 83, (Object) null));
            return this;
        }

        public final FormBody c() {
            return new FormBody(this.f42644b, this.f42645c);
        }

        public Builder(Charset charset) {
            this.f42643a = charset;
            this.f42644b = new ArrayList();
            this.f42645c = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Charset charset, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : charset);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public FormBody(List list, List list2) {
        Intrinsics.i(list, "encodedNames");
        Intrinsics.i(list2, "encodedValues");
        this.f42641b = Util.V(list);
        this.f42642c = Util.V(list2);
    }

    public long a() {
        return i((BufferedSink) null, true);
    }

    public MediaType b() {
        return f42640e;
    }

    public void h(BufferedSink bufferedSink) {
        Intrinsics.i(bufferedSink, "sink");
        i(bufferedSink, false);
    }

    public final long i(BufferedSink bufferedSink, boolean z2) {
        Buffer buffer;
        if (z2) {
            buffer = new Buffer();
        } else {
            Intrinsics.f(bufferedSink);
            buffer = bufferedSink.s();
        }
        int size = this.f42641b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer.writeByte(38);
            }
            buffer.K0((String) this.f42641b.get(i2));
            buffer.writeByte(61);
            buffer.K0((String) this.f42642c.get(i2));
        }
        if (!z2) {
            return 0;
        }
        long n0 = buffer.n0();
        buffer.b();
        return n0;
    }
}
