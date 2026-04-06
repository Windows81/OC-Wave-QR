package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.modules.SerializersModuleCollector;

@Metadata
public final class PolymorphismValidator implements SerializersModuleCollector {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42429a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42430b;

    public PolymorphismValidator(boolean z2, String str) {
        Intrinsics.i(str, "discriminator");
        this.f42429a = z2;
        this.f42430b = str;
    }

    public void a(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultSerializerProvider");
    }

    public void b(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(kClass2, "actualClass");
        Intrinsics.i(kSerializer, "actualSerializer");
        SerialDescriptor a2 = kSerializer.a();
        g(a2, kClass2);
        if (!this.f42429a) {
            f(a2, kClass2);
        }
    }

    public void c(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultDeserializerProvider");
    }

    public void d(KClass kClass, KSerializer kSerializer) {
        SerializersModuleCollector.DefaultImpls.b(this, kClass, kSerializer);
    }

    public void e(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(function1, "provider");
    }

    public final void f(SerialDescriptor serialDescriptor, KClass kClass) {
        int f2 = serialDescriptor.f();
        int i2 = 0;
        while (i2 < f2) {
            String g2 = serialDescriptor.g(i2);
            if (!Intrinsics.d(g2, this.f42430b)) {
                i2++;
            } else {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + g2 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void g(SerialDescriptor serialDescriptor, KClass kClass) {
        SerialKind e2 = serialDescriptor.e();
        if ((e2 instanceof PolymorphicKind) || Intrinsics.d(e2, SerialKind.CONTEXTUAL.f42056a)) {
            throw new IllegalArgumentException("Serializer for " + kClass.e() + " can't be registered as a subclass for polymorphic serialization because its kind " + e2 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (!this.f42429a) {
            if (Intrinsics.d(e2, StructureKind.LIST.f42059a) || Intrinsics.d(e2, StructureKind.MAP.f42060a) || (e2 instanceof PrimitiveKind) || (e2 instanceof SerialKind.ENUM)) {
                throw new IllegalArgumentException("Serializer for " + kClass.e() + " of kind " + e2 + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }
}
