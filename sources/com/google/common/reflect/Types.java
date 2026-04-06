package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@ElementTypesAreNonnullByDefault
final class Types {

    /* renamed from: a  reason: collision with root package name */
    public static final Joiner f29256a = Joiner.i(", ").k("null");

    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS {
            public Class h(Class cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            public Class h(Class cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        

        /* renamed from: B  reason: collision with root package name */
        public static final ClassOwnership f29259B = null;

        static {
            f29259B = f();
        }

        public static ClassOwnership f() {
            new AnonymousClass1LocalClass<String>() {
            };
            ParameterizedType parameterizedType = (ParameterizedType) AnonymousClass3.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.h(AnonymousClass1LocalClass.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        public abstract Class h(Class cls);
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Type f29261z;

        public GenericArrayTypeImpl(Type type) {
            this.f29261z = JavaVersion.D.l(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        public Type getGenericComponentType() {
            return this.f29261z;
        }

        public int hashCode() {
            return this.f29261z.hashCode();
        }

        public String toString() {
            return String.valueOf(Types.s(this.f29261z)).concat("[]");
        }
    }

    public enum JavaVersion {
        JAVA6 {
            public Type l(Type type) {
                Preconditions.q(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }

            /* renamed from: m */
            public GenericArrayType h(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        },
        JAVA7 {
            public Type h(Type type) {
                return type instanceof Class ? Types.h((Class) type) : new GenericArrayTypeImpl(type);
            }

            public Type l(Type type) {
                return (Type) Preconditions.q(type);
            }
        },
        JAVA8 {
            public Type h(Type type) {
                return JavaVersion.JAVA7.h(type);
            }

            public String j(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", (Class[]) null).invoke(type, (Object[]) null);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            }

            public Type l(Type type) {
                return JavaVersion.JAVA7.l(type);
            }
        },
        JAVA9 {
            public boolean f() {
                return false;
            }

            public Type h(Type type) {
                return JavaVersion.JAVA8.h(type);
            }

            public String j(Type type) {
                return JavaVersion.JAVA8.j(type);
            }

            public Type l(Type type) {
                return JavaVersion.JAVA8.l(type);
            }
        };
        
        public static final JavaVersion D = null;

        public boolean f() {
            return true;
        }

        public abstract Type h(Type type);

        public String j(Type type) {
            return Types.s(type);
        }

        public final ImmutableList k(Type[] typeArr) {
            ImmutableList.Builder s2 = ImmutableList.s();
            for (Type l2 : typeArr) {
                s2.e(l(l2));
            }
            return s2.l();
        }

        public abstract Type l(Type type);
    }

    public static final class NativeTypeVariableEquals<X> {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f29265a;

        static {
            Class<NativeTypeVariableEquals> cls = NativeTypeVariableEquals.class;
            f29265a = !cls.getTypeParameters()[0].equals(Types.k(cls, "X", new Type[0]));
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableList f29266A;

        /* renamed from: B  reason: collision with root package name */
        public final Class f29267B;

        /* renamed from: z  reason: collision with root package name */
        public final Type f29268z;

        public ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
            Preconditions.q(cls);
            Preconditions.d(typeArr.length == cls.getTypeParameters().length);
            Types.f(typeArr, "type parameter");
            this.f29268z = type;
            this.f29267B = cls;
            this.f29266A = JavaVersion.D.k(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.Objects.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        public Type[] getActualTypeArguments() {
            return Types.r(this.f29266A);
        }

        public Type getOwnerType() {
            return this.f29268z;
        }

        public Type getRawType() {
            return this.f29267B;
        }

        public int hashCode() {
            Type type = this.f29268z;
            return ((type == null ? 0 : type.hashCode()) ^ this.f29266A.hashCode()) ^ this.f29267B.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f29268z != null) {
                JavaVersion javaVersion = JavaVersion.D;
                if (javaVersion.f()) {
                    sb.append(javaVersion.j(this.f29268z));
                    sb.append('.');
                }
            }
            sb.append(this.f29267B.getName());
            sb.append('<');
            Joiner d2 = Types.f29256a;
            ImmutableList immutableList = this.f29266A;
            JavaVersion javaVersion2 = JavaVersion.D;
            Objects.requireNonNull(javaVersion2);
            sb.append(d2.e(Iterables.s(immutableList, new c(javaVersion2))));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* renamed from: a  reason: collision with root package name */
        public final GenericDeclaration f29269a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29270b;

        /* renamed from: c  reason: collision with root package name */
        public final ImmutableList f29271c;

        public TypeVariableImpl(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.f(typeArr, "bound for type variable");
            this.f29269a = (GenericDeclaration) Preconditions.q(genericDeclaration);
            this.f29270b = (String) Preconditions.q(str);
            this.f29271c = ImmutableList.A(typeArr);
        }

        public GenericDeclaration a() {
            return this.f29269a;
        }

        public String b() {
            return this.f29270b;
        }

        public boolean equals(Object obj) {
            if (NativeTypeVariableEquals.f29265a) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                    return false;
                }
                TypeVariableImpl a2 = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f29273a;
                return this.f29270b.equals(a2.b()) && this.f29269a.equals(a2.a()) && this.f29271c.equals(a2.f29271c);
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f29270b.equals(typeVariable.getName()) && this.f29269a.equals(typeVariable.getGenericDeclaration());
            }
        }

        public int hashCode() {
            return this.f29269a.hashCode() ^ this.f29270b.hashCode();
        }

        public String toString() {
            return this.f29270b;
        }
    }

    public static final class TypeVariableInvocationHandler implements InvocationHandler {

        /* renamed from: b  reason: collision with root package name */
        public static final ImmutableMap f29272b;

        /* renamed from: a  reason: collision with root package name */
        public final TypeVariableImpl f29273a;

        static {
            ImmutableMap.Builder a2 = ImmutableMap.a();
            Class<TypeVariableImpl> cls = TypeVariableImpl.class;
            for (Method method : cls.getMethods()) {
                if (method.getDeclaringClass().equals(cls)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    a2.g(method.getName(), method);
                }
            }
            f29272b = a2.c();
        }

        public TypeVariableInvocationHandler(TypeVariableImpl typeVariableImpl) {
            this.f29273a = typeVariableImpl;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Method method2 = (Method) f29272b.get(name);
            if (method2 != null) {
                try {
                    return method2.invoke(this.f29273a, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                throw new UnsupportedOperationException(name);
            }
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableList f29274A;

        /* renamed from: z  reason: collision with root package name */
        public final ImmutableList f29275z;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.f(typeArr, "lower bound for wildcard");
            Types.f(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.D;
            this.f29275z = javaVersion.k(typeArr);
            this.f29274A = javaVersion.k(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f29275z.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f29274A.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        public Type[] getLowerBounds() {
            return Types.r(this.f29275z);
        }

        public Type[] getUpperBounds() {
            return Types.r(this.f29274A);
        }

        public int hashCode() {
            return this.f29275z.hashCode() ^ this.f29274A.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableIterator o2 = this.f29275z.iterator();
            while (o2.hasNext()) {
                sb.append(" super ");
                sb.append(JavaVersion.D.j((Type) o2.next()));
            }
            for (Type j2 : Types.g(this.f29274A)) {
                sb.append(" extends ");
                sb.append(JavaVersion.D.j(j2));
            }
            return sb.toString();
        }
    }

    public static void f(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                Preconditions.l(!cls2.isPrimitive(), "Primitive type '%s' used as %s", cls2, str);
            }
        }
    }

    public static Iterable g(Iterable iterable) {
        return Iterables.e(iterable, Predicates.j(Predicates.f(Object.class)));
    }

    public static Class h(Class cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static Type i(Type type) {
        Preconditions.q(type);
        final AtomicReference atomicReference = new AtomicReference();
        new TypeVisitor() {
            public void b(Class cls) {
                atomicReference.set(cls.getComponentType());
            }

            public void c(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            public void e(TypeVariable typeVariable) {
                atomicReference.set(Types.p(typeVariable.getBounds()));
            }

            public void f(WildcardType wildcardType) {
                atomicReference.set(Types.p(wildcardType.getUpperBounds()));
            }
        }.a(type);
        return (Type) atomicReference.get();
    }

    public static Type j(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.D.h(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z2 = true;
        Preconditions.e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z2 = false;
        }
        Preconditions.e(z2, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    public static TypeVariable k(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(genericDeclaration, str, typeArr);
    }

    public static ParameterizedType l(Class cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.f29259B.h(cls), cls, typeArr);
    }

    public static ParameterizedType m(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return l(cls, typeArr);
        }
        Preconditions.q(typeArr);
        Preconditions.j(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    public static TypeVariable n(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        return (TypeVariable) Reflection.a(TypeVariable.class, new TypeVariableInvocationHandler(new TypeVariableImpl(genericDeclaration, str, typeArr)));
    }

    public static WildcardType o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    public static Type p(Type[] typeArr) {
        for (Type i2 : typeArr) {
            Type i3 = i(i2);
            if (i3 != null) {
                if (i3 instanceof Class) {
                    Class cls = (Class) i3;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(i3);
            }
        }
        return null;
    }

    public static WildcardType q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    public static Type[] r(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    public static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
