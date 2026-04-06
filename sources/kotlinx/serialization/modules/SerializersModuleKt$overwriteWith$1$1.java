package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata
public final class SerializersModuleKt$overwriteWith$1$1 implements SerializersModuleCollector {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SerializersModuleBuilder f42483a;

    public void a(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultSerializerProvider");
        this.f42483a.i(kClass, function1, true);
    }

    public void b(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(kClass2, "actualClass");
        Intrinsics.i(kSerializer, "actualSerializer");
        this.f42483a.j(kClass, kClass2, kSerializer, true);
    }

    public void c(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultDeserializerProvider");
        this.f42483a.h(kClass, function1, true);
    }

    public void d(KClass kClass, KSerializer kSerializer) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(kSerializer, "serializer");
        this.f42483a.l(kClass, new ContextualProvider.Argless(kSerializer), true);
    }

    public void e(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(function1, "provider");
        this.f42483a.l(kClass, new ContextualProvider.WithTypeArguments(function1), true);
    }
}
