package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

@Metadata
final class KTypeWrapper implements KType {

    /* renamed from: z  reason: collision with root package name */
    public final KType f42132z;

    public KTypeWrapper(KType kType) {
        Intrinsics.i(kType, "origin");
        this.f42132z = kType;
    }

    public boolean c() {
        return this.f42132z.c();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.f42132z;
        KClassifier kClassifier = null;
        KTypeWrapper kTypeWrapper = obj instanceof KTypeWrapper ? (KTypeWrapper) obj : null;
        if (!Intrinsics.d(kType, kTypeWrapper != null ? kTypeWrapper.f42132z : null)) {
            return false;
        }
        KClassifier g2 = g();
        if (g2 instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            if (kType2 != null) {
                kClassifier = kType2.g();
            }
            if (kClassifier != null && (kClassifier instanceof KClass)) {
                return Intrinsics.d(JvmClassMappingKt.a((KClass) g2), JvmClassMappingKt.a((KClass) kClassifier));
            }
        }
        return false;
    }

    public List f() {
        return this.f42132z.f();
    }

    public KClassifier g() {
        return this.f42132z.g();
    }

    public int hashCode() {
        return this.f42132z.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f42132z;
    }
}
