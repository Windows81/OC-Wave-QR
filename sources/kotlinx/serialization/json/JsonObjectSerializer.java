package kotlinx.serialization.json;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class JsonObjectSerializer implements KSerializer<JsonObject> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonObjectSerializer f42326a = new JsonObjectSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42327b = JsonObjectDescriptor.f42328b;

    @Metadata
    public static final class JsonObjectDescriptor implements SerialDescriptor {

        /* renamed from: b  reason: collision with root package name */
        public static final JsonObjectDescriptor f42328b = new JsonObjectDescriptor();

        /* renamed from: c  reason: collision with root package name */
        public static final String f42329c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f42330a = BuiltinSerializersKt.k(BuiltinSerializersKt.I(StringCompanionObject.f40914a), JsonElementSerializer.f42310a).a();

        public String a() {
            return f42329c;
        }

        public boolean c() {
            return this.f42330a.c();
        }

        public int d(String str) {
            Intrinsics.i(str, "name");
            return this.f42330a.d(str);
        }

        public SerialKind e() {
            return this.f42330a.e();
        }

        public int f() {
            return this.f42330a.f();
        }

        public String g(int i2) {
            return this.f42330a.g(i2);
        }

        public List getAnnotations() {
            return this.f42330a.getAnnotations();
        }

        public boolean h() {
            return this.f42330a.h();
        }

        public List i(int i2) {
            return this.f42330a.i(i2);
        }

        public SerialDescriptor j(int i2) {
            return this.f42330a.j(i2);
        }

        public boolean k(int i2) {
            return this.f42330a.k(i2);
        }
    }

    public SerialDescriptor a() {
        return f42327b;
    }

    /* renamed from: f */
    public JsonObject c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonElementSerializersKt.g(decoder);
        return new JsonObject((Map) BuiltinSerializersKt.k(BuiltinSerializersKt.I(StringCompanionObject.f40914a), JsonElementSerializer.f42310a).c(decoder));
    }

    /* renamed from: g */
    public void d(Encoder encoder, JsonObject jsonObject) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(jsonObject, "value");
        JsonElementSerializersKt.h(encoder);
        BuiltinSerializersKt.k(BuiltinSerializersKt.I(StringCompanionObject.f40914a), JsonElementSerializer.f42310a).d(encoder, jsonObject);
    }
}
