package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class ObjectSerializer<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f42163a;

    /* renamed from: b  reason: collision with root package name */
    public List f42164b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f42165c;

    public ObjectSerializer(String str, Object obj) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(obj, "objectInstance");
        this.f42163a = obj;
        this.f42164b = CollectionsKt.m();
        this.f42165c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new e(str, this));
    }

    public static final SerialDescriptor h(String str, ObjectSerializer objectSerializer) {
        return SerialDescriptorsKt.g(str, StructureKind.OBJECT.f42061a, new SerialDescriptor[0], new f(objectSerializer));
    }

    public static final Unit i(ObjectSerializer objectSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(classSerialDescriptorBuilder, "$this$buildSerialDescriptor");
        classSerialDescriptorBuilder.h(objectSerializer.f42164b);
        return Unit.f40552a;
    }

    public SerialDescriptor a() {
        return (SerialDescriptor) this.f42165c.getValue();
    }

    public Object c(Decoder decoder) {
        int x2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (!c2.y() && (x2 = c2.x(a())) != -1) {
            throw new SerializationException("Unexpected index " + x2);
        }
        Unit unit = Unit.f40552a;
        c2.b(a2);
        return this.f42163a;
    }

    public void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        encoder.c(a()).b(a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        Intrinsics.i(str, "serialName");
        Intrinsics.i(obj, "objectInstance");
        Intrinsics.i(annotationArr, "classAnnotations");
        this.f42164b = ArraysKt.d(annotationArr);
    }
}
