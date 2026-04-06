package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.reflect.Invokable;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public transient TypeResolver f29236A;

    /* renamed from: B  reason: collision with root package name */
    public transient TypeResolver f29237B;

    /* renamed from: z  reason: collision with root package name */
    public final Type f29238z;

    /* renamed from: com.google.common.reflect.TypeToken$1  reason: invalid class name */
    class AnonymousClass1 extends Invokable.MethodInvokable<Object> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ TypeToken f29239c;

        public TypeToken a() {
            return this.f29239c;
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            String invokable = super.toString();
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(invokable).length());
            sb.append(valueOf);
            sb.append(".");
            sb.append(invokable);
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$2  reason: invalid class name */
    class AnonymousClass2 extends Invokable.ConstructorInvokable<Object> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TypeToken f29240d;

        public TypeToken a() {
            return this.f29240d;
        }

        public Type[] b() {
            return this.f29240d.j().l(super.b());
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            String g2 = Joiner.i(", ").g(b());
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + String.valueOf(g2).length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(g2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$3  reason: invalid class name */
    class AnonymousClass3 extends TypeVisitor {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TypeToken f29241b;

        public void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        public void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        public void e(TypeVariable typeVariable) {
            String valueOf = String.valueOf(this.f29241b.f29238z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 58);
            sb.append(valueOf);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        public void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    public static class Bounds {
    }

    public final class ClassSet extends TypeToken<T>.TypeSet {

        /* renamed from: B  reason: collision with root package name */
        public transient ImmutableSet f29243B;
        public final /* synthetic */ TypeToken C;

        /* renamed from: Z */
        public Set Q() {
            ImmutableSet immutableSet = this.f29243B;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet q2 = FluentIterable.n(TypeCollector.f29245a.a().d(this.C)).h(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).q();
            this.f29243B = q2;
            return q2;
        }

        public Set b0() {
            return ImmutableSet.z(TypeCollector.f29246b.a().c(this.C.l()));
        }
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {

        /* renamed from: B  reason: collision with root package name */
        public final transient TypeSet f29244B;
        public transient ImmutableSet C;
        public final /* synthetic */ TypeToken D;

        /* renamed from: Z */
        public Set Q() {
            ImmutableSet immutableSet = this.C;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet q2 = FluentIterable.n(this.f29244B).h(TypeFilter.INTERFACE_ONLY).q();
            this.C = q2;
            return q2;
        }

        public Set b0() {
            return FluentIterable.n(TypeCollector.f29246b.c(this.D.l())).h(new b()).q();
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        public SimpleTypeToken(Type type) {
            super(type, (AnonymousClass1) null);
        }
    }

    public static abstract class TypeCollector<K> {

        /* renamed from: a  reason: collision with root package name */
        public static final TypeCollector f29245a = new TypeCollector<TypeToken<?>>() {
            /* renamed from: i */
            public Iterable e(TypeToken typeToken) {
                return typeToken.h();
            }

            /* renamed from: j */
            public Class f(TypeToken typeToken) {
                return typeToken.k();
            }

            /* renamed from: k */
            public TypeToken g(TypeToken typeToken) {
                return typeToken.i();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final TypeCollector f29246b = new TypeCollector<Class<?>>() {
            /* renamed from: i */
            public Iterable e(Class cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* renamed from: j */
            public Class f(Class cls) {
                return cls;
            }

            /* renamed from: k */
            public Class g(Class cls) {
                return cls.getSuperclass();
            }
        };

        public static class ForwardingTypeCollector<K> extends TypeCollector<K> {

            /* renamed from: c  reason: collision with root package name */
            public final TypeCollector f29249c;

            public ForwardingTypeCollector(TypeCollector typeCollector) {
                super((AnonymousClass1) null);
                this.f29249c = typeCollector;
            }

            public Iterable e(Object obj) {
                return this.f29249c.e(obj);
            }

            public Class f(Object obj) {
                return this.f29249c.f(obj);
            }

            public Object g(Object obj) {
                return this.f29249c.g(obj);
            }
        }

        public TypeCollector() {
        }

        public static ImmutableList h(final Map map, final Comparator comparator) {
            return new Ordering<Object>() {
                public int compare(Object obj, Object obj2) {
                    Comparator comparator = comparator;
                    Object obj3 = map.get(obj);
                    Objects.requireNonNull(obj3);
                    Object obj4 = map.get(obj2);
                    Objects.requireNonNull(obj4);
                    return comparator.compare(obj3, obj4);
                }
            }.b(map.keySet());
        }

        public final TypeCollector a() {
            return new ForwardingTypeCollector<K>(this, this) {
                public ImmutableList c(Iterable iterable) {
                    ImmutableList.Builder s2 = ImmutableList.s();
                    for (Object next : iterable) {
                        if (!f(next).isInterface()) {
                            s2.e(next);
                        }
                    }
                    return super.c(s2.l());
                }

                public Iterable e(Object obj) {
                    return ImmutableSet.D();
                }
            };
        }

        public final int b(Object obj, Map map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = f(obj).isInterface();
            for (Object b2 : e(obj)) {
                isInterface = Math.max(isInterface, b(b2, map));
            }
            Object g2 = g(obj);
            if (g2 != null) {
                isInterface = Math.max(isInterface, b(g2, map));
            }
            int i2 = isInterface + 1;
            map.put(obj, Integer.valueOf(i2));
            return i2;
        }

        public ImmutableList c(Iterable iterable) {
            HashMap z2 = Maps.z();
            for (Object b2 : iterable) {
                b(b2, z2);
            }
            return h(z2, Ordering.e().j());
        }

        public final ImmutableList d(Object obj) {
            return c(ImmutableList.E(obj));
        }

        public abstract Iterable e(Object obj);

        public abstract Class f(Object obj);

        public abstract Object g(Object obj);

        public /* synthetic */ TypeCollector(AnonymousClass1 r1) {
            this();
        }
    }

    public enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* renamed from: f */
            public boolean apply(TypeToken typeToken) {
                return !(typeToken.f29238z instanceof TypeVariable) && !(typeToken.f29238z instanceof WildcardType);
            }
        },
        INTERFACE_ONLY {
            /* renamed from: f */
            public boolean apply(TypeToken typeToken) {
                return typeToken.k().isInterface();
            }
        }
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public transient ImmutableSet f29254z;

        public TypeSet() {
        }

        /* renamed from: Z */
        public Set Q() {
            ImmutableSet immutableSet = this.f29254z;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet q2 = FluentIterable.n(TypeCollector.f29245a.d(TypeToken.this)).h(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).q();
            this.f29254z = q2;
            return q2;
        }

        public Set b0() {
            return ImmutableSet.z(TypeCollector.f29246b.c(TypeToken.this.l()));
        }
    }

    public /* synthetic */ TypeToken(Type type, AnonymousClass1 r2) {
        this(type);
    }

    public static TypeToken n(Class cls) {
        return new SimpleTypeToken(cls);
    }

    public static TypeToken o(Type type) {
        return new SimpleTypeToken(type);
    }

    public final TypeToken e(Type type) {
        TypeToken o2 = o(type);
        if (o2.k().isInterface()) {
            return null;
        }
        return o2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.f29238z.equals(((TypeToken) obj).f29238z);
        }
        return false;
    }

    public final ImmutableList f(Type[] typeArr) {
        ImmutableList.Builder s2 = ImmutableList.s();
        for (Type o2 : typeArr) {
            TypeToken o3 = o(o2);
            if (o3.k().isInterface()) {
                s2.e(o3);
            }
        }
        return s2.l();
    }

    public final TypeResolver g() {
        TypeResolver typeResolver = this.f29237B;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver d2 = TypeResolver.d(this.f29238z);
        this.f29237B = d2;
        return d2;
    }

    public final ImmutableList h() {
        Type type = this.f29238z;
        if (type instanceof TypeVariable) {
            return f(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.Builder s2 = ImmutableList.s();
        for (Type p2 : k().getGenericInterfaces()) {
            s2.e(p(p2));
        }
        return s2.l();
    }

    public int hashCode() {
        return this.f29238z.hashCode();
    }

    public final TypeToken i() {
        Type type = this.f29238z;
        if (type instanceof TypeVariable) {
            return e(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = k().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return p(genericSuperclass);
    }

    public final TypeResolver j() {
        TypeResolver typeResolver = this.f29236A;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver f2 = TypeResolver.f(this.f29238z);
        this.f29236A = f2;
        return f2;
    }

    public final Class k() {
        return (Class) l().iterator().next();
    }

    public final ImmutableSet l() {
        final ImmutableSet.Builder s2 = ImmutableSet.s();
        new TypeVisitor(this) {
            public void b(Class cls) {
                s2.e(cls);
            }

            public void c(GenericArrayType genericArrayType) {
                s2.e(Types.h(TypeToken.o(genericArrayType.getGenericComponentType()).k()));
            }

            public void d(ParameterizedType parameterizedType) {
                s2.e((Class) parameterizedType.getRawType());
            }

            public void e(TypeVariable typeVariable) {
                a(typeVariable.getBounds());
            }

            public void f(WildcardType wildcardType) {
                a(wildcardType.getUpperBounds());
            }
        }.a(this.f29238z);
        return s2.l();
    }

    public final TypeSet m() {
        return new TypeSet();
    }

    public final TypeToken p(Type type) {
        TypeToken o2 = o(g().j(type));
        o2.f29237B = this.f29237B;
        o2.f29236A = this.f29236A;
        return o2;
    }

    public String toString() {
        return Types.s(this.f29238z);
    }

    public TypeToken(Type type) {
        this.f29238z = (Type) Preconditions.q(type);
    }
}
