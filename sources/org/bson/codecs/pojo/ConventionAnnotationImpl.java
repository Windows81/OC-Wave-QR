package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.codecs.pojo.annotations.BsonProperty;

final class ConventionAnnotationImpl implements Convention {
    public static void g(Class cls, PropertyModelBuilder propertyModelBuilder, Type type) {
        if (cls.isAssignableFrom(propertyModelBuilder.g().getType())) {
            propertyModelBuilder.r(TypeData.i(type, cls));
        }
    }

    public void a(ClassModelBuilder classModelBuilder) {
        for (Annotation d2 : classModelBuilder.i()) {
            d(classModelBuilder, d2);
        }
        for (PropertyModelBuilder f2 : classModelBuilder.o()) {
            f(classModelBuilder, f2);
        }
        e(classModelBuilder);
        c(classModelBuilder);
    }

    public final PropertyModelBuilder b(ClassModelBuilder classModelBuilder, String str, Class cls) {
        PropertyModelBuilder t2 = PojoBuilderHelper.c(new PropertyMetadata(str, classModelBuilder.p().getSimpleName(), TypeData.c(cls).c())).p((String) null).t(str);
        classModelBuilder.a(t2);
        return t2;
    }

    public final void c(ClassModelBuilder classModelBuilder) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (PropertyModelBuilder propertyModelBuilder : classModelBuilder.o()) {
            if (!propertyModelBuilder.j() && !propertyModelBuilder.k()) {
                arrayList.add(propertyModelBuilder.c());
            }
        }
        for (String u2 : arrayList) {
            classModelBuilder.u(u2);
        }
    }

    public final void d(ClassModelBuilder classModelBuilder, Annotation annotation) {
        if (annotation instanceof BsonDiscriminator) {
            BsonDiscriminator bsonDiscriminator = (BsonDiscriminator) annotation;
            String key = bsonDiscriminator.key();
            if (!key.equals("")) {
                classModelBuilder.g(key);
            }
            String value = bsonDiscriminator.value();
            if (!value.equals("")) {
                classModelBuilder.f(value);
            }
            classModelBuilder.h(true);
        }
    }

    public final void e(ClassModelBuilder classModelBuilder) {
        PropertyModelBuilder propertyModelBuilder;
        ClassModelBuilder classModelBuilder2 = classModelBuilder;
        Class p2 = classModelBuilder.p();
        Constructor[] declaredConstructors = p2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i2 = 0;
        CreatorExecutable creatorExecutable = null;
        while (true) {
            Class<BsonCreator> cls = BsonCreator.class;
            if (i2 < length) {
                Constructor constructor = declaredConstructors[i2];
                if (Modifier.isPublic(constructor.getModifiers()) && !constructor.isSynthetic()) {
                    for (Annotation annotationType : constructor.getDeclaredAnnotations()) {
                        if (annotationType.annotationType().equals(cls)) {
                            if (creatorExecutable == null) {
                                creatorExecutable = new CreatorExecutable(p2, constructor);
                            } else {
                                throw new CodecConfigurationException("Found multiple constructors annotated with @BsonCreator");
                            }
                        }
                    }
                    continue;
                }
                i2++;
            } else {
                boolean z2 = false;
                for (Class cls2 = p2; cls2 != null && !z2; cls2 = cls2.getSuperclass()) {
                    for (Method method : cls2.getDeclaredMethods()) {
                        if (Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge()) {
                            for (Annotation annotationType2 : method.getDeclaredAnnotations()) {
                                if (annotationType2.annotationType().equals(cls)) {
                                    if (creatorExecutable != null) {
                                        throw new CodecConfigurationException("Found multiple constructors / methods annotated with @BsonCreator");
                                    } else if (cls2.isAssignableFrom(method.getReturnType())) {
                                        creatorExecutable = new CreatorExecutable(p2, method);
                                        z2 = true;
                                    } else {
                                        throw new CodecConfigurationException(String.format("Invalid method annotated with @BsonCreator. Returns '%s', expected %s", new Object[]{method.getReturnType(), cls2}));
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
                if (creatorExecutable != null) {
                    List i3 = creatorExecutable.i();
                    List h2 = creatorExecutable.h();
                    List g2 = creatorExecutable.g();
                    if (i3.size() == h2.size()) {
                        int i4 = 0;
                        while (i4 < i3.size()) {
                            boolean z3 = creatorExecutable.d() != null && creatorExecutable.d().equals(Integer.valueOf(i4));
                            Class cls3 = (Class) h2.get(i4);
                            Type type = (Type) g2.get(i4);
                            if (z3) {
                                propertyModelBuilder = classModelBuilder2.n(classModelBuilder.m());
                            } else {
                                BsonProperty bsonProperty = (BsonProperty) i3.get(i4);
                                Iterator it = classModelBuilder.o().iterator();
                                PropertyModelBuilder propertyModelBuilder2 = null;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    PropertyModelBuilder propertyModelBuilder3 = (PropertyModelBuilder) it.next();
                                    if (bsonProperty.value().equals(propertyModelBuilder3.i())) {
                                        propertyModelBuilder2 = propertyModelBuilder3;
                                        break;
                                    } else if (bsonProperty.value().equals(propertyModelBuilder3.f())) {
                                        propertyModelBuilder2 = propertyModelBuilder3;
                                    }
                                }
                                PropertyModelBuilder n2 = propertyModelBuilder2 == null ? classModelBuilder2.n(bsonProperty.value()) : propertyModelBuilder2;
                                if (n2 == null) {
                                    propertyModelBuilder = b(classModelBuilder2, bsonProperty.value(), cls3);
                                } else {
                                    if (!bsonProperty.value().equals(n2.c())) {
                                        n2.t(bsonProperty.value());
                                    }
                                    g(cls3, n2, type);
                                    propertyModelBuilder = n2;
                                }
                            }
                            if (propertyModelBuilder.g().e(cls3)) {
                                i4++;
                            } else {
                                throw creatorExecutable.b(p2, String.format("Invalid Property type for '%s'. Expected %s, found %s.", new Object[]{propertyModelBuilder.i(), propertyModelBuilder.g().getType(), cls3}));
                            }
                        }
                        classModelBuilder2.s(new InstanceCreatorFactoryImpl(creatorExecutable));
                        return;
                    }
                    throw creatorExecutable.b(p2, "All parameters in the @BsonCreator method / constructor must be annotated with a @BsonProperty.");
                }
                return;
            }
        }
    }

    public final void f(ClassModelBuilder classModelBuilder, PropertyModelBuilder propertyModelBuilder) {
        for (Annotation annotation : propertyModelBuilder.e()) {
            if (annotation instanceof BsonProperty) {
                BsonProperty bsonProperty = (BsonProperty) annotation;
                if (!"".equals(bsonProperty.value())) {
                    propertyModelBuilder.p(bsonProperty.value());
                }
                propertyModelBuilder.b(bsonProperty.useDiscriminator());
                if (propertyModelBuilder.c().equals(classModelBuilder.m())) {
                    classModelBuilder.r((String) null);
                }
            } else if (annotation instanceof BsonId) {
                classModelBuilder.r(propertyModelBuilder.c());
            } else if (annotation instanceof BsonIgnore) {
                propertyModelBuilder.p((String) null);
            }
        }
        for (Annotation annotation2 : propertyModelBuilder.h()) {
            if (annotation2 instanceof BsonProperty) {
                BsonProperty bsonProperty2 = (BsonProperty) annotation2;
                if (!"".equals(bsonProperty2.value())) {
                    propertyModelBuilder.t(bsonProperty2.value());
                }
            } else if (annotation2 instanceof BsonIgnore) {
                propertyModelBuilder.t((String) null);
            }
        }
    }
}
