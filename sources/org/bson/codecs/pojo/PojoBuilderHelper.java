package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.bson.assertions.Assertions;
import org.bson.codecs.pojo.PropertyReflectionUtils;
import org.bson.codecs.pojo.TypeData;
import org.bson.codecs.pojo.TypeParameterMap;

final class PojoBuilderHelper {
    public static void a(PropertyMetadata propertyMetadata, Map map, TypeData typeData, List list, Type type) {
        TypeParameterMap h2 = h(list, type);
        map.put(propertyMetadata.h(), h2);
        propertyMetadata.v(h2, typeData);
    }

    public static void b(ClassModelBuilder classModelBuilder, Class cls) {
        ClassModelBuilder classModelBuilder2 = classModelBuilder;
        Class cls2 = cls;
        classModelBuilder2.v((Class) Assertions.d("clazz", cls2));
        ArrayList arrayList = new ArrayList();
        TreeSet<String> treeSet = new TreeSet<>();
        HashMap hashMap = new HashMap();
        String simpleName = cls.getSimpleName();
        HashMap hashMap2 = new HashMap();
        Class cls3 = cls2;
        TypeData typeData = null;
        while (!cls3.isEnum() && cls3.getSuperclass() != null) {
            arrayList.addAll(Arrays.asList(cls3.getDeclaredAnnotations()));
            ArrayList arrayList2 = new ArrayList();
            for (TypeVariable name : cls3.getTypeParameters()) {
                arrayList2.add(name.getName());
            }
            PropertyReflectionUtils.PropertyMethods a2 = PropertyReflectionUtils.a(cls3);
            for (Method method : a2.b()) {
                String d2 = PropertyReflectionUtils.d(method);
                treeSet.add(d2);
                Method method2 = method;
                ArrayList arrayList3 = arrayList2;
                Class cls4 = cls3;
                PropertyMetadata f2 = f(d2, simpleName, hashMap2, TypeData.h(method), hashMap, typeData, arrayList2, d(method));
                if (f2.j() == null) {
                    f2.u(method2);
                    for (Annotation b2 : method2.getDeclaredAnnotations()) {
                        f2.b(b2);
                    }
                }
                arrayList2 = arrayList3;
                cls3 = cls4;
            }
            ArrayList arrayList4 = arrayList2;
            Class cls5 = cls3;
            Iterator it = a2.a().iterator();
            while (it.hasNext()) {
                Method method3 = (Method) it.next();
                String d3 = PropertyReflectionUtils.d(method3);
                treeSet.add(d3);
                PropertyMetadata propertyMetadata = (PropertyMetadata) hashMap2.get(d3);
                if (propertyMetadata == null || propertyMetadata.g() == null) {
                    Iterator it2 = it;
                    Method method4 = method3;
                    PropertyMetadata f3 = f(d3, simpleName, hashMap2, TypeData.h(method3), hashMap, typeData, arrayList4, d(method3));
                    if (f3.g() == null) {
                        f3.t(method4);
                        for (Annotation a3 : method4.getDeclaredAnnotations()) {
                            f3.a(a3);
                        }
                    }
                    it = it2;
                }
            }
            Field[] declaredFields = cls5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                treeSet.add(field.getName());
                String str = simpleName;
                Field field2 = field;
                int i3 = i2;
                int i4 = length;
                PropertyMetadata e2 = e(field.getName(), simpleName, hashMap2, TypeData.g(field), hashMap, typeData, arrayList4, field.getGenericType());
                if (e2 != null && e2.f() == null) {
                    e2.c(field2);
                    for (Annotation annotation : field2.getDeclaredAnnotations()) {
                        e2.a(annotation);
                        e2.b(annotation);
                    }
                }
                i2 = i3 + 1;
                simpleName = str;
                length = i4;
            }
            String str2 = simpleName;
            Class cls6 = cls5;
            typeData = TypeData.i(cls5.getGenericSuperclass(), cls6);
            cls3 = cls6.getSuperclass();
        }
        Class cls7 = cls3;
        if (cls7.isInterface()) {
            arrayList.addAll(Arrays.asList(cls7.getDeclaredAnnotations()));
        }
        for (String str3 : treeSet) {
            PropertyMetadata propertyMetadata2 = (PropertyMetadata) hashMap2.get(str3);
            if (propertyMetadata2.q() || propertyMetadata2.o()) {
                classModelBuilder2.a(c(propertyMetadata2));
            }
        }
        Collections.reverse(arrayList);
        classModelBuilder2.b(arrayList);
        classModelBuilder2.t(hashMap);
        Constructor constructor = null;
        for (Constructor constructor2 : cls.getDeclaredConstructors()) {
            if (constructor2.getParameterTypes().length == 0 && (Modifier.isPublic(constructor2.getModifiers()) || Modifier.isProtected(constructor2.getModifiers()))) {
                constructor2.setAccessible(true);
                constructor = constructor2;
            }
        }
        classModelBuilder2.s(new InstanceCreatorFactoryImpl(new CreatorExecutable(cls2, constructor)));
    }

    public static PropertyModelBuilder c(PropertyMetadata propertyMetadata) {
        PropertyModelBuilder q2 = PropertyModel.a().m(propertyMetadata.h()).p(propertyMetadata.h()).t(propertyMetadata.h()).r(propertyMetadata.k()).o(propertyMetadata.i()).s(propertyMetadata.n()).n(new PropertyModelSerializationImpl()).l(new PropertyAccessorImpl(propertyMetadata)).q(propertyMetadata.e());
        if (propertyMetadata.m() != null) {
            j(q2, propertyMetadata);
        }
        return q2;
    }

    public static Type d(Method method) {
        return PropertyReflectionUtils.b(method) ? method.getGenericReturnType() : method.getGenericParameterTypes()[0];
    }

    public static PropertyMetadata e(String str, String str2, Map map, TypeData typeData, Map map2, TypeData typeData2, List list, Type type) {
        PropertyMetadata g2 = g(str, str2, map, typeData);
        if (!g2.k().getType().isAssignableFrom(typeData.getType())) {
            return null;
        }
        a(g2, map2, typeData2, list, type);
        return g2;
    }

    public static PropertyMetadata f(String str, String str2, Map map, TypeData typeData, Map map2, TypeData typeData2, List list, Type type) {
        PropertyMetadata g2 = g(str, str2, map, typeData);
        if (!i(g2.k().getType(), typeData.getType())) {
            g2.s(String.format("Property '%s' in %s, has differing data types: %s and %s.", new Object[]{str, str2, g2.k(), typeData}));
        }
        a(g2, map2, typeData2, list, type);
        return g2;
    }

    public static PropertyMetadata g(String str, String str2, Map map, TypeData typeData) {
        PropertyMetadata propertyMetadata = (PropertyMetadata) map.get(str);
        if (propertyMetadata != null) {
            return propertyMetadata;
        }
        PropertyMetadata propertyMetadata2 = new PropertyMetadata(str, str2, typeData);
        map.put(str, propertyMetadata2);
        return propertyMetadata2;
    }

    public static TypeParameterMap h(List list, Type type) {
        int indexOf = list.indexOf(type.toString());
        TypeParameterMap.Builder a2 = TypeParameterMap.a();
        if (indexOf != -1) {
            a2.a(indexOf);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            for (int i2 = 0; i2 < parameterizedType.getActualTypeArguments().length; i2++) {
                int indexOf2 = list.indexOf(parameterizedType.getActualTypeArguments()[i2].toString());
                if (indexOf2 != -1) {
                    a2.b(i2, indexOf2);
                }
            }
        }
        return a2.c();
    }

    public static boolean i(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static void j(PropertyModelBuilder propertyModelBuilder, PropertyMetadata propertyMetadata) {
        TypeData typeData;
        if (propertyMetadata.l().c() && !propertyMetadata.m().isEmpty()) {
            Map b2 = propertyMetadata.l().b();
            Integer num = (Integer) b2.get(-1);
            if (num != null) {
                typeData = (TypeData) propertyMetadata.m().get(num.intValue());
            } else {
                TypeData.Builder c2 = TypeData.c(propertyModelBuilder.g().getType());
                ArrayList arrayList = new ArrayList(propertyModelBuilder.g().a());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    for (Map.Entry entry : b2.entrySet()) {
                        if (((Integer) entry.getKey()).equals(Integer.valueOf(i2))) {
                            arrayList.set(i2, propertyMetadata.m().get(((Integer) entry.getValue()).intValue()));
                        }
                    }
                }
                c2.b(arrayList);
                typeData = c2.c();
            }
            propertyModelBuilder.r(typeData);
        }
    }

    public static Object k(String str, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.format("%s cannot be null", new Object[]{str}));
    }
}
