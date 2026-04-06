package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata
public final class SerializersModuleBuilder implements SerializersModuleCollector {

    /* renamed from: a  reason: collision with root package name */
    public final Map f42475a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f42476b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f42477c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map f42478d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map f42479e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public boolean f42480f;

    public static /* synthetic */ void k(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        serializersModuleBuilder.j(kClass, kClass2, kSerializer, z2);
    }

    public static /* synthetic */ void m(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        serializersModuleBuilder.l(kClass, contextualProvider, z2);
    }

    public void a(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultSerializerProvider");
        i(kClass, function1, false);
    }

    public void b(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(kClass2, "actualClass");
        Intrinsics.i(kSerializer, "actualSerializer");
        k(this, kClass, kClass2, kSerializer, false, 8, (Object) null);
    }

    public void c(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultDeserializerProvider");
        h(kClass, function1, false);
    }

    public void d(KClass kClass, KSerializer kSerializer) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(kSerializer, "serializer");
        m(this, kClass, new ContextualProvider.Argless(kSerializer), false, 4, (Object) null);
    }

    public void e(KClass kClass, Function1 function1) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(function1, "provider");
        m(this, kClass, new ContextualProvider.WithTypeArguments(function1), false, 4, (Object) null);
    }

    public final SerializersModule f() {
        return new SerialModuleImpl(this.f42475a, this.f42476b, this.f42477c, this.f42478d, this.f42479e, this.f42480f);
    }

    public final void g(SerializersModule serializersModule) {
        Intrinsics.i(serializersModule, "module");
        serializersModule.a(this);
    }

    public final void h(KClass kClass, Function1 function1, boolean z2) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultDeserializerProvider");
        Function1 function12 = (Function1) this.f42479e.get(kClass);
        if (function12 == null || Intrinsics.d(function12, function1) || z2) {
            this.f42479e.put(kClass, function1);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + kClass + " is already registered: " + function12);
    }

    public final void i(KClass kClass, Function1 function1, boolean z2) {
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(function1, "defaultSerializerProvider");
        Function1 function12 = (Function1) this.f42477c.get(kClass);
        if (function12 == null || Intrinsics.d(function12, function1) || z2) {
            this.f42477c.put(kClass, function1);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + kClass + " is already registered: " + function12);
    }

    public final void j(KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z2) {
        Object obj;
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(kClass2, "concreteClass");
        Intrinsics.i(kSerializer, "concreteSerializer");
        String a2 = kSerializer.a().a();
        Map map = this.f42476b;
        Object obj2 = map.get(kClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(kClass, obj2);
        }
        Map map2 = (Map) obj2;
        KSerializer kSerializer2 = (KSerializer) map2.get(kClass2);
        Map map3 = this.f42478d;
        Object obj3 = map3.get(kClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(kClass, obj3);
        }
        Map map4 = (Map) obj3;
        if (z2) {
            if (kSerializer2 != null) {
                map4.remove(kSerializer2.a().a());
            }
            map2.put(kClass2, kSerializer);
            map4.put(a2, kSerializer);
            return;
        }
        if (kSerializer2 != null) {
            if (Intrinsics.d(kSerializer2, kSerializer)) {
                KSerializer kSerializer3 = (KSerializer) map4.remove(kSerializer2.a().a());
            } else {
                throw new SerializerAlreadyRegisteredException(kClass, kClass2);
            }
        }
        KSerializer kSerializer4 = (KSerializer) map4.get(a2);
        if (kSerializer4 != null) {
            Object obj4 = this.f42476b.get(kClass);
            Intrinsics.f(obj4);
            Iterator it = MapsKt.v((Map) obj4).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Map.Entry) obj).getValue() == kSerializer4) {
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + kClass + "' have the same serial name '" + a2 + "': '" + kClass2 + "' and '" + ((Map.Entry) obj) + '\'');
        }
        map2.put(kClass2, kSerializer);
        map4.put(a2, kSerializer);
    }

    public final void l(KClass kClass, ContextualProvider contextualProvider, boolean z2) {
        ContextualProvider contextualProvider2;
        Intrinsics.i(kClass, "forClass");
        Intrinsics.i(contextualProvider, "provider");
        if (z2 || (contextualProvider2 = (ContextualProvider) this.f42475a.get(kClass)) == null || Intrinsics.d(contextualProvider2, contextualProvider)) {
            this.f42475a.put(kClass, contextualProvider);
            if (PlatformKt.l(kClass)) {
                this.f42480f = true;
                return;
            }
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
    }
}
