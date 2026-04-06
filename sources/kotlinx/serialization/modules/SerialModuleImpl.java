package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata
public final class SerialModuleImpl extends SerializersModule {

    /* renamed from: a  reason: collision with root package name */
    public final Map f42469a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f42470b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f42471c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f42472d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f42473e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f42474f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerialModuleImpl(Map map, Map map2, Map map3, Map map4, Map map5, boolean z2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.i(map, "class2ContextualFactory");
        Intrinsics.i(map2, "polyBase2Serializers");
        Intrinsics.i(map3, "polyBase2DefaultSerializerProvider");
        Intrinsics.i(map4, "polyBase2NamedSerializers");
        Intrinsics.i(map5, "polyBase2DefaultDeserializerProvider");
        this.f42469a = map;
        this.f42470b = map2;
        this.f42471c = map3;
        this.f42472d = map4;
        this.f42473e = map5;
        this.f42474f = z2;
    }

    public void a(SerializersModuleCollector serializersModuleCollector) {
        Intrinsics.i(serializersModuleCollector, "collector");
        for (Map.Entry entry : this.f42469a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            ContextualProvider contextualProvider = (ContextualProvider) entry.getValue();
            if (contextualProvider instanceof ContextualProvider.Argless) {
                Intrinsics.g(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer b2 = ((ContextualProvider.Argless) contextualProvider).b();
                Intrinsics.g(b2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                serializersModuleCollector.d(kClass, b2);
            } else if (contextualProvider instanceof ContextualProvider.WithTypeArguments) {
                serializersModuleCollector.e(kClass, ((ContextualProvider.WithTypeArguments) contextualProvider).b());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        for (Map.Entry entry2 : this.f42470b.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                Intrinsics.g(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.g(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.g(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                serializersModuleCollector.b(kClass2, kClass3, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.f42471c.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.g(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            serializersModuleCollector.a(kClass4, (Function1) TypeIntrinsics.e(function1, 1));
        }
        for (Map.Entry entry5 : this.f42473e.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.g(kClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.g(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            serializersModuleCollector.c(kClass5, (Function1) TypeIntrinsics.e(function12, 1));
        }
    }

    public KSerializer b(KClass kClass, List list) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(list, "typeArgumentsSerializers");
        ContextualProvider contextualProvider = (ContextualProvider) this.f42469a.get(kClass);
        KSerializer a2 = contextualProvider != null ? contextualProvider.a(list) : null;
        if (a2 instanceof KSerializer) {
            return a2;
        }
        return null;
    }

    public boolean d() {
        return this.f42474f;
    }

    public DeserializationStrategy e(KClass kClass, String str) {
        Intrinsics.i(kClass, "baseClass");
        Map map = (Map) this.f42472d.get(kClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f42473e.get(kClass);
        Function1 function1 = TypeIntrinsics.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (DeserializationStrategy) function1.invoke(str);
        }
        return null;
    }

    public SerializationStrategy f(KClass kClass, Object obj) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(obj, "value");
        if (!kClass.h(obj)) {
            return null;
        }
        Map map = (Map) this.f42470b.get(kClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(Reflection.b(obj.getClass())) : null;
        SerializationStrategy serializationStrategy = kSerializer instanceof SerializationStrategy ? kSerializer : null;
        if (serializationStrategy != null) {
            return serializationStrategy;
        }
        Object obj2 = this.f42471c.get(kClass);
        Function1 function1 = TypeIntrinsics.k(obj2, 1) ? (Function1) obj2 : null;
        if (function1 != null) {
            return (SerializationStrategy) function1.invoke(obj);
        }
        return null;
    }
}
