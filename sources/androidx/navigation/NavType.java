package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public abstract class NavType<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22399c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final NavType f22400d = new NavType$Companion$IntType$1();

    /* renamed from: e  reason: collision with root package name */
    public static final NavType f22401e = new NavType$Companion$ReferenceType$1();

    /* renamed from: f  reason: collision with root package name */
    public static final NavType f22402f = new NavType$Companion$IntArrayType$1();

    /* renamed from: g  reason: collision with root package name */
    public static final NavType f22403g = new NavType$Companion$IntListType$1();

    /* renamed from: h  reason: collision with root package name */
    public static final NavType f22404h = new NavType$Companion$LongType$1();

    /* renamed from: i  reason: collision with root package name */
    public static final NavType f22405i = new NavType$Companion$LongArrayType$1();

    /* renamed from: j  reason: collision with root package name */
    public static final NavType f22406j = new NavType$Companion$LongListType$1();

    /* renamed from: k  reason: collision with root package name */
    public static final NavType f22407k = new NavType$Companion$FloatType$1();

    /* renamed from: l  reason: collision with root package name */
    public static final NavType f22408l = new NavType$Companion$FloatArrayType$1();

    /* renamed from: m  reason: collision with root package name */
    public static final NavType f22409m = new NavType$Companion$FloatListType$1();

    /* renamed from: n  reason: collision with root package name */
    public static final NavType f22410n = new NavType$Companion$BoolType$1();

    /* renamed from: o  reason: collision with root package name */
    public static final NavType f22411o = new NavType$Companion$BoolArrayType$1();

    /* renamed from: p  reason: collision with root package name */
    public static final NavType f22412p = new NavType$Companion$BoolListType$1();

    /* renamed from: q  reason: collision with root package name */
    public static final NavType f22413q = new NavType$Companion$StringType$1();

    /* renamed from: r  reason: collision with root package name */
    public static final NavType f22414r = new NavType$Companion$StringArrayType$1();

    /* renamed from: s  reason: collision with root package name */
    public static final NavType f22415s = new NavType$Companion$StringListType$1();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22416a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22417b = "nav_type";

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NavType a(Object obj) {
            NavType serializableType;
            if (obj instanceof Integer) {
                NavType navType = NavType.f22400d;
                Intrinsics.g(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            } else if (obj instanceof int[]) {
                NavType navType2 = NavType.f22402f;
                Intrinsics.g(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            } else if (obj instanceof Long) {
                NavType navType3 = NavType.f22404h;
                Intrinsics.g(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType3;
            } else if (obj instanceof long[]) {
                NavType navType4 = NavType.f22405i;
                Intrinsics.g(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            } else if (obj instanceof Float) {
                NavType navType5 = NavType.f22407k;
                Intrinsics.g(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            } else if (obj instanceof float[]) {
                NavType navType6 = NavType.f22408l;
                Intrinsics.g(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType6;
            } else if (obj instanceof Boolean) {
                NavType navType7 = NavType.f22410n;
                Intrinsics.g(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType7;
            } else if (obj instanceof boolean[]) {
                NavType navType8 = NavType.f22411o;
                Intrinsics.g(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType8;
            } else if ((obj instanceof String) || obj == null) {
                NavType navType9 = NavType.f22413q;
                Intrinsics.g(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType9;
            } else if (!(obj instanceof Object[]) || !(((Object[]) obj) instanceof String[])) {
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    Intrinsics.f(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        Intrinsics.g(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        serializableType = new ParcelableArrayType(componentType2);
                        return serializableType;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    Intrinsics.f(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        Intrinsics.g(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        serializableType = new SerializableArrayType(componentType4);
                        return serializableType;
                    }
                }
                if (obj instanceof Parcelable) {
                    serializableType = new ParcelableType(obj.getClass());
                } else if (obj instanceof Enum) {
                    serializableType = new EnumType(obj.getClass());
                } else if (obj instanceof Serializable) {
                    serializableType = new SerializableType(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return serializableType;
            } else {
                NavType navType10 = NavType.f22414r;
                Intrinsics.g(navType10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType10;
            }
        }

        public final NavType b(Class cls, boolean z2) {
            Intrinsics.i(cls, "clazz");
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z2 ? new ParcelableArrayType(cls) : new ParcelableType(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z2) {
                return new EnumType(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z2 ? new SerializableArrayType(cls) : new SerializableType(cls);
            }
            return null;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        /* renamed from: u  reason: collision with root package name */
        public final Class f22418u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EnumType(Class cls) {
            super(false, cls);
            Intrinsics.i(cls, "type");
            if (cls.isEnum()) {
                this.f22418u = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        public String b() {
            String name = this.f22418u.getName();
            Intrinsics.h(name, "type.name");
            return name;
        }

        /* renamed from: n */
        public Enum l(String str) {
            Enum enumR;
            Intrinsics.i(str, "value");
            Object[] enumConstants = this.f22418u.getEnumConstants();
            Intrinsics.h(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumR = null;
                    break;
                }
                enumR = enumConstants[i2];
                if (StringsKt.B(((Enum) enumR).name(), str, true)) {
                    break;
                }
                i2++;
            }
            Enum enumR2 = enumR;
            if (enumR2 != null) {
                return enumR2;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f22418u.getName() + '.');
        }
    }

    @Metadata
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        /* renamed from: t  reason: collision with root package name */
        public final Class f22419t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class cls) {
            super(true);
            Intrinsics.i(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    Intrinsics.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.f22419t = cls2;
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        public String b() {
            String name = this.f22419t.getName();
            Intrinsics.h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!Intrinsics.d(ParcelableArrayType.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f22419t, ((ParcelableArrayType) obj).f22419t);
        }

        public int hashCode() {
            return this.f22419t.hashCode();
        }

        /* renamed from: k */
        public Parcelable[] a(Bundle bundle, String str) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: l */
        public Parcelable[] f(String str) {
            Intrinsics.i(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: m */
        public void h(Bundle bundle, String str, Parcelable[] parcelableArr) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            this.f22419t.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        /* renamed from: n */
        public boolean j(Parcelable[] parcelableArr, Parcelable[] parcelableArr2) {
            return ArraysKt.c(parcelableArr, parcelableArr2);
        }
    }

    @Metadata
    public static final class ParcelableType<D> extends NavType<D> {

        /* renamed from: t  reason: collision with root package name */
        public final Class f22420t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class cls) {
            super(true);
            Intrinsics.i(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f22420t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public Object a(Bundle bundle, String str) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            return bundle.get(str);
        }

        public String b() {
            String name = this.f22420t.getName();
            Intrinsics.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!Intrinsics.d(ParcelableType.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f22420t, ((ParcelableType) obj).f22420t);
        }

        public Object f(String str) {
            Intrinsics.i(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void h(Bundle bundle, String str, Object obj) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            this.f22420t.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.f22420t.hashCode();
        }
    }

    @Metadata
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        /* renamed from: t  reason: collision with root package name */
        public final Class f22421t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class cls) {
            super(true);
            Intrinsics.i(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    Intrinsics.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.f22421t = cls2;
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        public String b() {
            String name = this.f22421t.getName();
            Intrinsics.h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!Intrinsics.d(SerializableArrayType.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f22421t, ((SerializableArrayType) obj).f22421t);
        }

        public int hashCode() {
            return this.f22421t.hashCode();
        }

        /* renamed from: k */
        public Serializable[] a(Bundle bundle, String str) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: l */
        public Serializable[] f(String str) {
            Intrinsics.i(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.os.Bundle r2, java.lang.String r3, java.io.Serializable[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.i(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.i(r3, r0)
                java.lang.Class r0 = r1.f22421t
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType.SerializableArrayType.h(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }

        /* renamed from: n */
        public boolean j(Serializable[] serializableArr, Serializable[] serializableArr2) {
            return ArraysKt.c(serializableArr, serializableArr2);
        }
    }

    public NavType(boolean z2) {
        this.f22416a = z2;
    }

    public abstract Object a(Bundle bundle, String str);

    public String b() {
        return this.f22417b;
    }

    public boolean c() {
        return this.f22416a;
    }

    public final Object d(Bundle bundle, String str, String str2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
        Object f2 = f(str2);
        h(bundle, str, f2);
        return f2;
    }

    public final Object e(Bundle bundle, String str, String str2, Object obj) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        } else if (str2 == null) {
            return obj;
        } else {
            Object g2 = g(str2, obj);
            h(bundle, str, g2);
            return g2;
        }
    }

    public abstract Object f(String str);

    public Object g(String str, Object obj) {
        Intrinsics.i(str, "value");
        return f(str);
    }

    public abstract void h(Bundle bundle, String str, Object obj);

    public String i(Object obj) {
        return String.valueOf(obj);
    }

    public boolean j(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    public String toString() {
        return b();
    }

    @Metadata
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        /* renamed from: t  reason: collision with root package name */
        public final Class f22422t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableType(Class cls) {
            super(true);
            Intrinsics.i(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (!cls.isEnum()) {
                this.f22422t = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        public String b() {
            String name = this.f22422t.getName();
            Intrinsics.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return Intrinsics.d(this.f22422t, ((SerializableType) obj).f22422t);
        }

        public int hashCode() {
            return this.f22422t.hashCode();
        }

        /* renamed from: k */
        public Serializable a(Bundle bundle, String str) {
            Intrinsics.i(bundle, "bundle");
            Intrinsics.i(str, "key");
            return (Serializable) bundle.get(str);
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
            Intrinsics.i(serializable, "value");
            this.f22422t.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z2, Class cls) {
            super(z2);
            Intrinsics.i(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f22422t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
