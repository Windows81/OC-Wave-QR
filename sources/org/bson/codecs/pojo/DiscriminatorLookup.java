package org.bson.codecs.pojo;

import java.util.Map;
import java.util.Set;
import org.bson.codecs.configuration.CodecConfigurationException;

final class DiscriminatorLookup {

    /* renamed from: a  reason: collision with root package name */
    public final Map f43797a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f43798b;

    public void a(ClassModel classModel) {
        if (classModel.b() != null) {
            this.f43797a.put(classModel.b(), classModel.l());
        }
    }

    public final Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public Class c(String str) {
        if (this.f43797a.containsKey(str)) {
            return (Class) this.f43797a.get(str);
        }
        Class b2 = b(str);
        if (b2 == null) {
            b2 = d(str);
        }
        if (b2 != null) {
            this.f43797a.put(str, b2);
            return b2;
        }
        throw new CodecConfigurationException(String.format("A class could not be found for the discriminator: '%s'.", new Object[]{str}));
    }

    public final Class d(String str) {
        Class cls = null;
        for (String str2 : this.f43798b) {
            cls = b(str2 + "." + str);
            if (cls != null) {
                break;
            }
        }
        return cls;
    }
}
