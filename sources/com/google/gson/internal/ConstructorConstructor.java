package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ConstructorConstructor {

    /* renamed from: a  reason: collision with root package name */
    public final Map f31700a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31701b;

    /* renamed from: c  reason: collision with root package name */
    public final List f31702c;

    public ConstructorConstructor(Map map, boolean z2, List list) {
        this.f31700a = map;
        this.f31701b = z2;
        this.f31702c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r3 = com.google.gson.internal.reflect.ReflectionHelper.m(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.internal.ObjectConstructor c(java.lang.Class r3, com.google.gson.ReflectionAccessFilter.FilterResult r4) {
        /*
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0059 }
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r4 == r2) goto L_0x0045
            boolean r1 = com.google.gson.internal.ReflectionAccessFilterHelper.a(r0, r1)
            if (r1 == 0) goto L_0x0029
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r4 != r1) goto L_0x0045
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unable to invoke no-args constructor of "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.gson.internal.ConstructorConstructor$7 r4 = new com.google.gson.internal.ConstructorConstructor$7
            r4.<init>(r3)
            return r4
        L_0x0045:
            if (r4 != r2) goto L_0x0053
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.m(r0)
            if (r3 == 0) goto L_0x0053
            com.google.gson.internal.ConstructorConstructor$8 r4 = new com.google.gson.internal.ConstructorConstructor$8
            r4.<init>(r3)
            return r4
        L_0x0053:
            com.google.gson.internal.ConstructorConstructor$9 r3 = new com.google.gson.internal.ConstructorConstructor$9
            r3.<init>(r0)
            return r3
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.ConstructorConstructor.c(java.lang.Class, com.google.gson.ReflectionAccessFilter$FilterResult):com.google.gson.internal.ObjectConstructor");
    }

    public static ObjectConstructor d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new ObjectConstructor<Object>() {
                public Object a() {
                    return new TreeSet();
                }
            } : Set.class.isAssignableFrom(cls) ? new ObjectConstructor<Object>() {
                public Object a() {
                    return new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(cls) ? new ObjectConstructor<Object>() {
                public Object a() {
                    return new ArrayDeque();
                }
            } : new ObjectConstructor<Object>() {
                public Object a() {
                    return new ArrayList();
                }
            };
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    return new ConcurrentSkipListMap();
                }
            };
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    return new ConcurrentHashMap();
                }
            };
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    return new TreeMap();
                }
            };
        }
        if (type instanceof ParameterizedType) {
            if (!String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new ObjectConstructor<Object>() {
                    public Object a() {
                        return new LinkedHashMap();
                    }
                };
            }
        }
        return new ObjectConstructor<Object>() {
            public Object a() {
                return new LinkedTreeMap();
            }
        };
    }

    public static ObjectConstructor e(final Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    Type type = type;
                    if (type instanceof ParameterizedType) {
                        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                        if (type2 instanceof Class) {
                            return EnumSet.noneOf((Class) type2);
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                    }
                    throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                }
            };
        }
        if (cls == EnumMap.class) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    Type type = type;
                    if (type instanceof ParameterizedType) {
                        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                        if (type2 instanceof Class) {
                            return new EnumMap((Class) type2);
                        }
                        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
                    }
                    throw new JsonIOException("Invalid EnumMap type: " + type.toString());
                }
            };
        }
        return null;
    }

    public ObjectConstructor b(TypeToken typeToken) {
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        final InstanceCreator instanceCreator = (InstanceCreator) this.f31700a.get(type);
        if (instanceCreator != null) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    return instanceCreator.a(type);
                }
            };
        }
        final InstanceCreator instanceCreator2 = (InstanceCreator) this.f31700a.get(rawType);
        if (instanceCreator2 != null) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    return instanceCreator2.a(type);
                }
            };
        }
        ObjectConstructor e2 = e(type, rawType);
        if (e2 != null) {
            return e2;
        }
        ReflectionAccessFilter.FilterResult b2 = ReflectionAccessFilterHelper.b(this.f31702c, rawType);
        ObjectConstructor c2 = c(rawType, b2);
        if (c2 != null) {
            return c2;
        }
        ObjectConstructor d2 = d(type, rawType);
        if (d2 != null) {
            return d2;
        }
        final String a2 = a(rawType);
        if (a2 != null) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    throw new JsonIOException(a2);
                }
            };
        }
        if (b2 == ReflectionAccessFilter.FilterResult.ALLOW) {
            return f(rawType);
        }
        final String str = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new ObjectConstructor<Object>() {
            public Object a() {
                throw new JsonIOException(str);
            }
        };
    }

    public final ObjectConstructor f(final Class cls) {
        if (this.f31701b) {
            return new ObjectConstructor<Object>() {
                public Object a() {
                    try {
                        return UnsafeAllocator.f31752a.d(cls);
                    } catch (Exception e2) {
                        throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
                    }
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        return new ObjectConstructor<Object>() {
            public Object a() {
                throw new JsonIOException(str);
            }
        };
    }

    public String toString() {
        return this.f31700a.toString();
    }
}
