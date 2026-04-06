package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringJsonLexerKt;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public abstract class Json implements StringFormat {

    /* renamed from: d  reason: collision with root package name */
    public static final Default f42261d = new Default((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final JsonConfiguration f42262a;

    /* renamed from: b  reason: collision with root package name */
    public final SerializersModule f42263b;

    /* renamed from: c  reason: collision with root package name */
    public final DescriptorSchemaCache f42264c;

    @Metadata
    public static final class Default extends Json {
        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Default() {
            /*
                r21 = this;
                kotlinx.serialization.json.JsonConfiguration r15 = new kotlinx.serialization.json.JsonConfiguration
                r0 = r15
                r18 = 131071(0x1ffff, float:1.8367E-40)
                r19 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r20 = r15
                r15 = r16
                r17 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                kotlinx.serialization.modules.SerializersModule r0 = kotlinx.serialization.modules.SerializersModuleBuildersKt.a()
                r1 = 0
                r2 = r21
                r3 = r20
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.Json.Default.<init>():void");
        }
    }

    public /* synthetic */ Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, serializersModule);
    }

    public SerializersModule a() {
        return this.f42263b;
    }

    public final Object b(DeserializationStrategy deserializationStrategy, String str) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        Intrinsics.i(str, "string");
        StringJsonLexer a2 = StringJsonLexerKt.a(this, str);
        Object C = new StreamingJsonDecoder(this, WriteMode.OBJ, a2, deserializationStrategy.a(), (StreamingJsonDecoder.DiscriminatorHolder) null).C(deserializationStrategy);
        a2.v();
        return C;
    }

    public final String c(SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serializationStrategy, "serializer");
        JsonToStringWriter jsonToStringWriter = new JsonToStringWriter();
        try {
            JsonStreamsKt.a(this, jsonToStringWriter, serializationStrategy, obj);
            return jsonToStringWriter.toString();
        } finally {
            jsonToStringWriter.g();
        }
    }

    public final Object f(DeserializationStrategy deserializationStrategy, JsonElement jsonElement) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        Intrinsics.i(jsonElement, "element");
        return TreeJsonDecoderKt.a(this, jsonElement, deserializationStrategy);
    }

    public final JsonConfiguration g() {
        return this.f42262a;
    }

    public final DescriptorSchemaCache h() {
        return this.f42264c;
    }

    public Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        this.f42262a = jsonConfiguration;
        this.f42263b = serializersModule;
        this.f42264c = new DescriptorSchemaCache();
    }
}
