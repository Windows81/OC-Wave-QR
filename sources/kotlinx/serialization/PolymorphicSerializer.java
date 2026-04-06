package kotlinx.serialization;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

@Metadata
public final class PolymorphicSerializer<T> extends AbstractPolymorphicSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KClass f42001a;

    /* renamed from: b  reason: collision with root package name */
    public List f42002b = CollectionsKt.m();

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f42003c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new b(this));

    public PolymorphicSerializer(KClass kClass) {
        Intrinsics.i(kClass, "baseClass");
        this.f42001a = kClass;
    }

    public static final SerialDescriptor m(PolymorphicSerializer polymorphicSerializer) {
        return ContextAwareKt.c(SerialDescriptorsKt.g("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.f42027a, new SerialDescriptor[0], new c(polymorphicSerializer)), polymorphicSerializer.j());
    }

    public static final Unit n(PolymorphicSerializer polymorphicSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(classSerialDescriptorBuilder, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder, "type", BuiltinSerializersKt.I(StringCompanionObject.f40914a).a(), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder, "value", SerialDescriptorsKt.h("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.j().e() + '>', SerialKind.CONTEXTUAL.f42056a, new SerialDescriptor[0], (Function1) null, 8, (Object) null), (List) null, false, 12, (Object) null);
        classSerialDescriptorBuilder.h(polymorphicSerializer.f42002b);
        return Unit.f40552a;
    }

    public SerialDescriptor a() {
        return (SerialDescriptor) this.f42003c.getValue();
    }

    public KClass j() {
        return this.f42001a;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }
}
