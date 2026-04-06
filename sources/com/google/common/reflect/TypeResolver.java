package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
public final class TypeResolver {

    /* renamed from: a  reason: collision with root package name */
    public final TypeTable f29225a;

    public static final class TypeMappingIntrospector extends TypeVisitor {

        /* renamed from: b  reason: collision with root package name */
        public final Map f29228b = Maps.z();

        public static ImmutableMap g(Type type) {
            Preconditions.q(type);
            TypeMappingIntrospector typeMappingIntrospector = new TypeMappingIntrospector();
            typeMappingIntrospector.a(type);
            return ImmutableMap.e(typeMappingIntrospector.f29228b);
        }

        public void b(Class cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        public void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.w(typeParameters.length == actualTypeArguments.length);
            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                h(new TypeVariableKey(typeParameters[i2]), actualTypeArguments[i2]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        public void e(TypeVariable typeVariable) {
            a(typeVariable.getBounds());
        }

        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.reflect.Type} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(com.google.common.reflect.TypeResolver.TypeVariableKey r3, java.lang.reflect.Type r4) {
            /*
                r2 = this;
                java.util.Map r0 = r2.f29228b
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                r0 = r4
            L_0x000a:
                if (r0 == 0) goto L_0x0030
                boolean r1 = r3.a(r0)
                if (r1 == 0) goto L_0x0023
            L_0x0012:
                if (r4 == 0) goto L_0x0022
                java.util.Map r3 = r2.f29228b
                com.google.common.reflect.TypeResolver$TypeVariableKey r4 = com.google.common.reflect.TypeResolver.TypeVariableKey.c(r4)
                java.lang.Object r3 = r3.remove(r4)
                r4 = r3
                java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
                goto L_0x0012
            L_0x0022:
                return
            L_0x0023:
                java.util.Map r1 = r2.f29228b
                com.google.common.reflect.TypeResolver$TypeVariableKey r0 = com.google.common.reflect.TypeResolver.TypeVariableKey.c(r0)
                java.lang.Object r0 = r1.get(r0)
                java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
                goto L_0x000a
            L_0x0030:
                java.util.Map r0 = r2.f29228b
                r0.put(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.reflect.TypeResolver.TypeMappingIntrospector.h(com.google.common.reflect.TypeResolver$TypeVariableKey, java.lang.reflect.Type):void");
        }
    }

    public static final class TypeVariableKey {

        /* renamed from: a  reason: collision with root package name */
        public final TypeVariable f29232a;

        public TypeVariableKey(TypeVariable typeVariable) {
            this.f29232a = (TypeVariable) Preconditions.q(typeVariable);
        }

        public static TypeVariableKey c(Type type) {
            if (type instanceof TypeVariable) {
                return new TypeVariableKey((TypeVariable) type);
            }
            return null;
        }

        public boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public final boolean b(TypeVariable typeVariable) {
            return this.f29232a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f29232a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof TypeVariableKey) {
                return b(((TypeVariableKey) obj).f29232a);
            }
            return false;
        }

        public int hashCode() {
            return Objects.b(this.f29232a.getGenericDeclaration(), this.f29232a.getName());
        }

        public String toString() {
            return this.f29232a.toString();
        }
    }

    public static class WildcardCapturer {

        /* renamed from: b  reason: collision with root package name */
        public static final WildcardCapturer f29233b = new WildcardCapturer();

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f29234a;

        public final Type a(Type type) {
            Preconditions.q(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    actualTypeArguments[i2] = d(typeParameters[i2]).a(actualTypeArguments[i2]);
                }
                return Types.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        public TypeVariable b(Type[] typeArr) {
            int incrementAndGet = this.f29234a.incrementAndGet();
            String g2 = Joiner.h('&').g(typeArr);
            StringBuilder sb = new StringBuilder(String.valueOf(g2).length() + 33);
            sb.append("capture#");
            sb.append(incrementAndGet);
            sb.append("-of ? extends ");
            sb.append(g2);
            return Types.k(WildcardCapturer.class, sb.toString(), typeArr);
        }

        public final Type c(Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        public final WildcardCapturer d(final TypeVariable typeVariable) {
            return new WildcardCapturer(this, this.f29234a) {
                public TypeVariable b(Type[] typeArr) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                    linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        public final WildcardCapturer e() {
            return new WildcardCapturer(this.f29234a);
        }

        public WildcardCapturer() {
            this(new AtomicInteger());
        }

        public WildcardCapturer(AtomicInteger atomicInteger) {
            this.f29234a = atomicInteger;
        }
    }

    public static TypeResolver d(Type type) {
        return new TypeResolver().n(TypeMappingIntrospector.g(type));
    }

    public static Object e(Class cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(obj);
            String simpleName = cls.getSimpleName();
            StringBuilder sb = new StringBuilder(valueOf.length() + 10 + simpleName.length());
            sb.append(valueOf);
            sb.append(" is not a ");
            sb.append(simpleName);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static TypeResolver f(Type type) {
        return new TypeResolver().n(TypeMappingIntrospector.g(WildcardCapturer.f29233b.a(type)));
    }

    public static void g(final Map map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new TypeVisitor() {
                public void b(Class cls) {
                    if (!(type2 instanceof WildcardType)) {
                        String valueOf = String.valueOf(cls);
                        String valueOf2 = String.valueOf(type2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 25 + valueOf2.length());
                        sb.append("No type mapping from ");
                        sb.append(valueOf);
                        sb.append(" to ");
                        sb.append(valueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }

                public void c(GenericArrayType genericArrayType) {
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        Type i2 = Types.i(type);
                        Preconditions.j(i2 != null, "%s is not an array type.", type2);
                        TypeResolver.g(map, genericArrayType.getGenericComponentType(), i2);
                    }
                }

                public void d(ParameterizedType parameterizedType) {
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) TypeResolver.e(ParameterizedType.class, type);
                        if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                            TypeResolver.g(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                        }
                        Preconditions.l(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                        Preconditions.l(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                            TypeResolver.g(map, actualTypeArguments[i2], actualTypeArguments2[i2]);
                        }
                    }
                }

                public void e(TypeVariable typeVariable) {
                    map.put(new TypeVariableKey(typeVariable), type2);
                }

                public void f(WildcardType wildcardType) {
                    Type type = type2;
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        Preconditions.l(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type2);
                        for (int i2 = 0; i2 < upperBounds.length; i2++) {
                            TypeResolver.g(map, upperBounds[i2], upperBounds2[i2]);
                        }
                        for (int i3 = 0; i3 < lowerBounds.length; i3++) {
                            TypeResolver.g(map, lowerBounds[i3], lowerBounds2[i3]);
                        }
                    }
                }
            }.a(type);
        }
    }

    public final Type h(GenericArrayType genericArrayType) {
        return Types.j(j(genericArrayType.getGenericComponentType()));
    }

    public final ParameterizedType i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.m(ownerType == null ? null : j(ownerType), (Class) j(parameterizedType.getRawType()), k(parameterizedType.getActualTypeArguments()));
    }

    public Type j(Type type) {
        Preconditions.q(type);
        return type instanceof TypeVariable ? this.f29225a.a((TypeVariable) type) : type instanceof ParameterizedType ? i((ParameterizedType) type) : type instanceof GenericArrayType ? h((GenericArrayType) type) : type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    public final Type[] k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr2[i2] = j(typeArr[i2]);
        }
        return typeArr2;
    }

    public Type[] l(Type[] typeArr) {
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr[i2] = j(typeArr[i2]);
        }
        return typeArr;
    }

    public final WildcardType m(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(k(wildcardType.getLowerBounds()), k(wildcardType.getUpperBounds()));
    }

    public TypeResolver n(Map map) {
        return new TypeResolver(this.f29225a.c(map));
    }

    public static class TypeTable {

        /* renamed from: a  reason: collision with root package name */
        public final ImmutableMap f29229a;

        public TypeTable() {
            this.f29229a = ImmutableMap.o();
        }

        public final Type a(final TypeVariable typeVariable) {
            return b(typeVariable, new TypeTable(this) {
                public Type b(TypeVariable typeVariable, TypeTable typeTable) {
                    return typeVariable.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable : this.b(typeVariable, typeTable);
                }
            });
        }

        public Type b(TypeVariable typeVariable, TypeTable typeTable) {
            Type type = (Type) this.f29229a.get(new TypeVariableKey(typeVariable));
            if (type != null) {
                return new TypeResolver(typeTable).j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] c2 = new TypeResolver(typeTable).k(bounds);
            return (!Types.NativeTypeVariableEquals.f29265a || !Arrays.equals(bounds, c2)) ? Types.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), c2) : typeVariable;
        }

        public final TypeTable c(Map map) {
            ImmutableMap.Builder a2 = ImmutableMap.a();
            a2.j(this.f29229a);
            for (Map.Entry entry : map.entrySet()) {
                TypeVariableKey typeVariableKey = (TypeVariableKey) entry.getKey();
                Type type = (Type) entry.getValue();
                Preconditions.j(!typeVariableKey.a(type), "Type variable %s bound to itself", typeVariableKey);
                a2.g(typeVariableKey, type);
            }
            return new TypeTable(a2.d());
        }

        public TypeTable(ImmutableMap immutableMap) {
            this.f29229a = immutableMap;
        }
    }

    public TypeResolver() {
        this.f29225a = new TypeTable();
    }

    public TypeResolver(TypeTable typeTable) {
        this.f29225a = typeTable;
    }
}
