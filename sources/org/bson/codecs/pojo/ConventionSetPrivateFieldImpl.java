package org.bson.codecs.pojo;

import java.lang.reflect.Modifier;
import org.bson.codecs.configuration.CodecConfigurationException;

final class ConventionSetPrivateFieldImpl implements Convention {

    public static final class PrivatePropertyAccessor<T> implements PropertyAccessor<T> {

        /* renamed from: a  reason: collision with root package name */
        public final PropertyAccessorImpl f43781a;

        public void a(Object obj, Object obj2) {
            try {
                this.f43781a.c().f().set(obj, obj2);
            } catch (Exception e2) {
                throw new CodecConfigurationException(String.format("Unable to set value for property '%s' in %s", new Object[]{this.f43781a.c().h(), this.f43781a.c().d()}), e2);
            }
        }

        public Object get(Object obj) {
            return this.f43781a.get(obj);
        }

        public PrivatePropertyAccessor(PropertyAccessorImpl propertyAccessorImpl) {
            this.f43781a = propertyAccessorImpl;
            try {
                propertyAccessorImpl.c().f().setAccessible(true);
            } catch (Exception e2) {
                throw new CodecConfigurationException(String.format("Unable to make private field accessible '%s' in %s", new Object[]{propertyAccessorImpl.c().h(), propertyAccessorImpl.c().d()}), e2);
            }
        }
    }

    public void a(ClassModelBuilder classModelBuilder) {
        for (PropertyModelBuilder propertyModelBuilder : classModelBuilder.o()) {
            if (propertyModelBuilder.d() instanceof PropertyAccessorImpl) {
                PropertyMetadata c2 = ((PropertyAccessorImpl) propertyModelBuilder.d()).c();
                if (!c2.o() && c2.f() != null && Modifier.isPrivate(c2.f().getModifiers())) {
                    b(propertyModelBuilder);
                }
            } else {
                throw new CodecConfigurationException(String.format("The SET_PRIVATE_FIELDS_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", new Object[]{propertyModelBuilder.d().getClass().getName()}));
            }
        }
    }

    public final void b(PropertyModelBuilder propertyModelBuilder) {
        propertyModelBuilder.l(new PrivatePropertyAccessor((PropertyAccessorImpl) propertyModelBuilder.d()));
    }
}
