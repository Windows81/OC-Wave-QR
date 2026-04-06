package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType {

    /* renamed from: a  reason: collision with root package name */
    public static final InternalNavType f22587a = new InternalNavType();

    /* renamed from: b  reason: collision with root package name */
    public static final NavType f22588b = new InternalNavType$IntNullableType$1();

    /* renamed from: c  reason: collision with root package name */
    public static final NavType f22589c = new InternalNavType$BoolNullableType$1();

    /* renamed from: d  reason: collision with root package name */
    public static final NavType f22590d = new InternalNavType$DoubleType$1();

    /* renamed from: e  reason: collision with root package name */
    public static final NavType f22591e = new InternalNavType$DoubleNullableType$1();

    /* renamed from: f  reason: collision with root package name */
    public static final NavType f22592f = new InternalNavType$FloatNullableType$1();

    /* renamed from: g  reason: collision with root package name */
    public static final NavType f22593g = new InternalNavType$LongNullableType$1();

    /* renamed from: h  reason: collision with root package name */
    public static final NavType f22594h = new InternalNavType$StringNonNullableType$1();

    /* renamed from: i  reason: collision with root package name */
    public static final NavType f22595i = new InternalNavType$StringNullableArrayType$1();

    /* renamed from: j  reason: collision with root package name */
    public static final NavType f22596j = new InternalNavType$StringNullableListType$1();

    /* renamed from: k  reason: collision with root package name */
    public static final NavType f22597k = new InternalNavType$DoubleArrayType$1();

    /* renamed from: l  reason: collision with root package name */
    public static final NavType f22598l = new InternalNavType$DoubleListType$1();

    @Metadata
    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {

        /* renamed from: t  reason: collision with root package name */
        public final NavType.EnumType f22599t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EnumListType(Class cls) {
            super(true);
            Intrinsics.i(cls, "type");
            this.f22599t = new NavType.EnumType(cls);
        }

        public String b() {
            return "List<" + this.f22599t.b() + "}>";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumListType)) {
                return false;
            }
            return Intrinsics.d(this.f22599t, ((EnumListType) obj).f22599t);
        }

        public int hashCode() {
            return this.f22599t.hashCode();
        }

        /* renamed from: m */
        public List k() {
            return CollectionsKt.m();
        }

        /* renamed from: n */
        public List a(Bundle bundle, String str) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            Object obj = bundle.get(str);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        /* renamed from: o */
        public List f(String str) {
            Intrinsics.i(str, "value");
            return CollectionsKt.e(this.f22599t.l(str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = kotlin.collections.CollectionsKt.x0(r3, o(r2));
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List g(java.lang.String r2, java.util.List r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.i(r2, r0)
                if (r3 == 0) goto L_0x0015
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.List r0 = r1.f(r2)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r3 = kotlin.collections.CollectionsKt.x0(r3, r0)
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                java.util.List r3 = r1.f(r2)
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType.EnumListType.g(java.lang.String, java.util.List):java.util.List");
        }

        /* renamed from: q */
        public void h(Bundle bundle, String str, List list) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
        }

        /* renamed from: r */
        public List l(List list) {
            if (list == null) {
                return CollectionsKt.m();
            }
            Iterable<Enum> iterable = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
            for (Enum enumR : iterable) {
                arrayList.add(enumR.toString());
            }
            return arrayList;
        }

        /* renamed from: s */
        public boolean j(List list, List list2) {
            ArrayList arrayList = null;
            ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
            if (list2 != null) {
                arrayList = new ArrayList(list2);
            }
            return Intrinsics.d(arrayList2, arrayList);
        }
    }

    @Metadata
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {

        /* renamed from: u  reason: collision with root package name */
        public final Class f22600u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EnumNullableType(Class cls) {
            super(cls);
            Intrinsics.i(cls, "type");
            if (cls.isEnum()) {
                this.f22600u = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        public String b() {
            String name = this.f22600u.getName();
            Intrinsics.h(name, "type.name");
            return name;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[]} */
        /* JADX WARNING: type inference failed for: r4v0 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Enum l(java.lang.String r8) {
            /*
                r7 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.i(r8, r0)
                java.lang.String r0 = "null"
                boolean r0 = kotlin.jvm.internal.Intrinsics.d(r8, r0)
                r1 = 0
                if (r0 == 0) goto L_0x000f
                goto L_0x0038
            L_0x000f:
                java.lang.Class r0 = r7.f22600u
                java.lang.Object[] r0 = r0.getEnumConstants()
                kotlin.jvm.internal.Intrinsics.f(r0)
                int r2 = r0.length
                r3 = 0
            L_0x001a:
                if (r3 >= r2) goto L_0x0034
                r4 = r0[r3]
                r5 = r4
                java.lang.Enum r5 = (java.lang.Enum) r5
                kotlin.jvm.internal.Intrinsics.f(r5)
                java.lang.String r5 = r5.name()
                r6 = 1
                boolean r5 = kotlin.text.StringsKt.B(r5, r8, r6)
                if (r5 == 0) goto L_0x0031
                r1 = r4
                goto L_0x0034
            L_0x0031:
                int r3 = r3 + 1
                goto L_0x001a
            L_0x0034:
                java.lang.Enum r1 = (java.lang.Enum) r1
                if (r1 == 0) goto L_0x0039
            L_0x0038:
                return r1
            L_0x0039:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Enum value "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = " not found for type "
                r1.append(r8)
                java.lang.Class r8 = r7.f22600u
                java.lang.String r8 = r8.getName()
                r1.append(r8)
                r8 = 46
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType.EnumNullableType.l(java.lang.String):java.lang.Enum");
        }
    }

    @Metadata
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {

        /* renamed from: t  reason: collision with root package name */
        public final Class f22601t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(Class cls) {
            super(true);
            Intrinsics.i(cls, "type");
            this.f22601t = cls;
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        public String b() {
            String name = this.f22601t.getName();
            Intrinsics.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableNullableType)) {
                return false;
            }
            return Intrinsics.d(this.f22601t, ((SerializableNullableType) obj).f22601t);
        }

        public int hashCode() {
            return this.f22601t.hashCode();
        }

        /* renamed from: k */
        public Serializable a(Bundle bundle, String str) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            Object obj = bundle.get(str);
            if (obj instanceof Serializable) {
                return (Serializable) obj;
            }
            return null;
        }

        /* renamed from: l */
        public Serializable f(String str) {
            Intrinsics.i(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: m */
        public void h(Bundle bundle, String str, Serializable serializable) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            bundle.putSerializable(str, (Serializable) this.f22601t.cast(serializable));
        }
    }

    public final NavType a() {
        return f22589c;
    }

    public final NavType b() {
        return f22597k;
    }

    public final NavType c() {
        return f22591e;
    }

    public final NavType d() {
        return f22590d;
    }

    public final NavType e() {
        return f22592f;
    }

    public final NavType f() {
        return f22588b;
    }

    public final NavType g() {
        return f22593g;
    }

    public final NavType h() {
        return f22594h;
    }

    public final NavType i() {
        return f22596j;
    }
}
