package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

@Metadata
final class ClassValueParametrizedCache<T> implements ParametrizedSerializerCache<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f42091a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassValueReferences f42092b = new ClassValueReferences();

    public ClassValueParametrizedCache(Function2 function2) {
        Intrinsics.i(function2, "compute");
        this.f42091a = function2;
    }

    public Object a(KClass kClass, List list) {
        Object obj;
        Intrinsics.i(kClass, "key");
        Intrinsics.i(list, "types");
        Object a2 = this.f42092b.get(JvmClassMappingKt.a(kClass));
        Intrinsics.h(a2, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) a2;
        Object obj2 = mutableSoftReference.f42153a.get();
        if (obj2 == null) {
            obj2 = mutableSoftReference.a(new ClassValueParametrizedCache$getgIAlus$$inlined$getOrSet$1());
        }
        ParametrizedCacheEntry parametrizedCacheEntry = (ParametrizedCacheEntry) obj2;
        Iterable<KType> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (KType kTypeWrapper : iterable) {
            arrayList.add(new KTypeWrapper(kTypeWrapper));
        }
        ConcurrentHashMap a3 = parametrizedCacheEntry.f42167a;
        Object obj3 = a3.get(arrayList);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.f40519A;
                obj = Result.b((KSerializer) this.f42091a.m(kClass, list));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.f40519A;
                obj = Result.b(ResultKt.a(th));
            }
            Result a4 = Result.a(obj);
            Object putIfAbsent = a3.putIfAbsent(arrayList, a4);
            obj3 = putIfAbsent == null ? a4 : putIfAbsent;
        }
        Intrinsics.h(obj3, "getOrPut(...)");
        return ((Result) obj3).j();
    }
}
