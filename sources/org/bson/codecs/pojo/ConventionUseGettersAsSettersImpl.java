package org.bson.codecs.pojo;

import java.util.Collection;
import java.util.Map;
import org.bson.codecs.configuration.CodecConfigurationException;

final class ConventionUseGettersAsSettersImpl implements Convention {

    public static final class PrivatePropertyAccessor<T> implements PropertyAccessor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final PropertyAccessorImpl f43782a;

        public void a(Object obj, Object obj2) {
            if (obj2 instanceof Collection) {
                b(obj, (Collection) obj2);
            } else if (obj2 instanceof Map) {
                c(obj, (Map) obj2);
            } else {
                d(String.format("Unexpected type: '%s'", new Object[]{obj2.getClass()}), (Exception) null);
            }
        }

        public final void b(Object obj, Collection collection) {
            Collection collection2 = (Collection) get(obj);
            if (collection2 == null) {
                d("The getter returned null.", (Exception) null);
            } else if (!collection2.isEmpty()) {
                d("The getter returned a non empty collection.", (Exception) null);
            } else {
                try {
                    collection2.addAll(collection);
                } catch (Exception e2) {
                    d("collection#addAll failed.", e2);
                }
            }
        }

        public final void c(Object obj, Map map) {
            Map map2 = (Map) get(obj);
            if (map2 == null) {
                d("The getter returned null.", (Exception) null);
            } else if (!map2.isEmpty()) {
                d("The getter returned a non empty map.", (Exception) null);
            } else {
                try {
                    map2.putAll(map);
                } catch (Exception e2) {
                    d("map#putAll failed.", e2);
                }
            }
        }

        public final void d(String str, Exception exc) {
            throw new CodecConfigurationException(String.format("Cannot use getter in '%s' to set '%s'. %s", new Object[]{this.f43782a.c().d(), this.f43782a.c().h(), str}), exc);
        }

        public Object get(Object obj) {
            return this.f43782a.get(obj);
        }

        public PrivatePropertyAccessor(PropertyAccessorImpl propertyAccessorImpl) {
            this.f43782a = propertyAccessorImpl;
        }
    }

    private void c(PropertyModelBuilder propertyModelBuilder) {
        propertyModelBuilder.l(new PrivatePropertyAccessor((PropertyAccessorImpl) propertyModelBuilder.d()));
    }

    public void a(ClassModelBuilder classModelBuilder) {
        for (PropertyModelBuilder propertyModelBuilder : classModelBuilder.o()) {
            if (propertyModelBuilder.d() instanceof PropertyAccessorImpl) {
                PropertyMetadata c2 = ((PropertyAccessorImpl) propertyModelBuilder.d()).c();
                if (!c2.o() && c2.q() && b(c2.k().getType())) {
                    c(propertyModelBuilder);
                }
            } else {
                throw new CodecConfigurationException(String.format("The USE_GETTER_AS_SETTER_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", new Object[]{propertyModelBuilder.d().getClass().getName()}));
            }
        }
    }

    public final boolean b(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }
}
