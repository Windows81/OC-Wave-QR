package kotlinx.serialization.json;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class JsonArraySerializer implements KSerializer<JsonArray> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonArraySerializer f42266a = new JsonArraySerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42267b = JsonArrayDescriptor.f42268b;

    @Metadata
    public static final class JsonArrayDescriptor implements SerialDescriptor {

        /* renamed from: b  reason: collision with root package name */
        public static final JsonArrayDescriptor f42268b = new JsonArrayDescriptor();

        /* renamed from: c  reason: collision with root package name */
        public static final String f42269c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f42270a = BuiltinSerializersKt.h(JsonElementSerializer.f42310a).a();

        public String a() {
            return f42269c;
        }

        public boolean c() {
            return this.f42270a.c();
        }

        public int d(String str) {
            Intrinsics.i(str, "name");
            return this.f42270a.d(str);
        }

        public SerialKind e() {
            return this.f42270a.e();
        }

        public int f() {
            return this.f42270a.f();
        }

        public String g(int i2) {
            return this.f42270a.g(i2);
        }

        public List getAnnotations() {
            return this.f42270a.getAnnotations();
        }

        public boolean h() {
            return this.f42270a.h();
        }

        public List i(int i2) {
            return this.f42270a.i(i2);
        }

        public SerialDescriptor j(int i2) {
            return this.f42270a.j(i2);
        }

        public boolean k(int i2) {
            return this.f42270a.k(i2);
        }
    }

    public SerialDescriptor a() {
        return f42267b;
    }

    /* renamed from: f */
    public JsonArray c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonElementSerializersKt.g(decoder);
        return new JsonArray((List) BuiltinSerializersKt.h(JsonElementSerializer.f42310a).c(decoder));
    }

    /* renamed from: g */
    public void d(Encoder encoder, JsonArray jsonArray) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(jsonArray, "value");
        JsonElementSerializersKt.h(encoder);
        BuiltinSerializersKt.h(JsonElementSerializer.f42310a).d(encoder, jsonArray);
    }
}
