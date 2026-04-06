package kotlinx.serialization;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
@ExperimentalSerializationApi
public final class ContextualSerializer<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KClass f41993a;

    /* renamed from: b  reason: collision with root package name */
    public final KSerializer f41994b;

    /* renamed from: c  reason: collision with root package name */
    public final List f41995c;

    /* renamed from: d  reason: collision with root package name */
    public final SerialDescriptor f41996d;

    public ContextualSerializer(KClass kClass, KSerializer kSerializer, KSerializer[] kSerializerArr) {
        Intrinsics.i(kClass, "serializableClass");
        Intrinsics.i(kSerializerArr, "typeArgumentsSerializers");
        this.f41993a = kClass;
        this.f41994b = kSerializer;
        this.f41995c = ArraysKt.d(kSerializerArr);
        this.f41996d = ContextAwareKt.c(SerialDescriptorsKt.g("kotlinx.serialization.ContextualSerializer", SerialKind.CONTEXTUAL.f42056a, new SerialDescriptor[0], new a(this)), kClass);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Unit g(kotlinx.serialization.ContextualSerializer r1, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder r2) {
        /*
            java.lang.String r0 = "$this$buildSerialDescriptor"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            kotlinx.serialization.KSerializer r1 = r1.f41994b
            if (r1 == 0) goto L_0x0014
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r1.a()
            if (r1 == 0) goto L_0x0014
            java.util.List r1 = r1.getAnnotations()
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 != 0) goto L_0x001b
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
        L_0x001b:
            r2.h(r1)
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.ContextualSerializer.g(kotlinx.serialization.ContextualSerializer, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder):kotlin.Unit");
    }

    public SerialDescriptor a() {
        return this.f41996d;
    }

    public Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return decoder.C(h(decoder.a()));
    }

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        encoder.e(h(encoder.a()), obj);
    }

    public final KSerializer h(SerializersModule serializersModule) {
        KSerializer b2 = serializersModule.b(this.f41993a, this.f41995c);
        if (b2 != null || (b2 = this.f41994b) != null) {
            return b2;
        }
        Platform_commonKt.f(this.f41993a);
        throw new KotlinNothingValueException();
    }
}
