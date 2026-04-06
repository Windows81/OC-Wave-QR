package retrofit2.converter.kotlinx.serialization;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.BinaryFormat;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

@Metadata
public abstract class Serializer {

    @Metadata
    public static final class FromBytes extends Serializer {

        /* renamed from: a  reason: collision with root package name */
        public final BinaryFormat f44324a;

        public Object a(DeserializationStrategy deserializationStrategy, ResponseBody responseBody) {
            Intrinsics.i(deserializationStrategy, "loader");
            Intrinsics.i(responseBody, "body");
            byte[] a2 = responseBody.a();
            BinaryFormat e2 = b();
            Intrinsics.f(a2);
            return e2.e(deserializationStrategy, a2);
        }

        public RequestBody d(MediaType mediaType, SerializationStrategy serializationStrategy, Object obj) {
            Intrinsics.i(mediaType, "contentType");
            Intrinsics.i(serializationStrategy, "saver");
            RequestBody e2 = RequestBody.e(mediaType, b().d(serializationStrategy, obj));
            Intrinsics.h(e2, "create(...)");
            return e2;
        }

        /* renamed from: e */
        public BinaryFormat b() {
            return this.f44324a;
        }
    }

    @Metadata
    public static final class FromString extends Serializer {

        /* renamed from: a  reason: collision with root package name */
        public final StringFormat f44325a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FromString(StringFormat stringFormat) {
            super((DefaultConstructorMarker) null);
            Intrinsics.i(stringFormat, "format");
            this.f44325a = stringFormat;
        }

        public Object a(DeserializationStrategy deserializationStrategy, ResponseBody responseBody) {
            Intrinsics.i(deserializationStrategy, "loader");
            Intrinsics.i(responseBody, "body");
            String k2 = responseBody.k();
            StringFormat e2 = b();
            Intrinsics.f(k2);
            return e2.b(deserializationStrategy, k2);
        }

        public RequestBody d(MediaType mediaType, SerializationStrategy serializationStrategy, Object obj) {
            Intrinsics.i(mediaType, "contentType");
            Intrinsics.i(serializationStrategy, "saver");
            RequestBody c2 = RequestBody.c(mediaType, b().c(serializationStrategy, obj));
            Intrinsics.h(c2, "create(...)");
            return c2;
        }

        /* renamed from: e */
        public StringFormat b() {
            return this.f44325a;
        }
    }

    public /* synthetic */ Serializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a(DeserializationStrategy deserializationStrategy, ResponseBody responseBody);

    public abstract SerialFormat b();

    public final KSerializer c(Type type) {
        Intrinsics.i(type, "type");
        return SerializersKt.c(b().a(), type);
    }

    public abstract RequestBody d(MediaType mediaType, SerializationStrategy serializationStrategy, Object obj);

    public Serializer() {
    }
}
