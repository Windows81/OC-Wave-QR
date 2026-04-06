package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

public class ExtensionRegistryLite {

    /* renamed from: b  reason: collision with root package name */
    public static volatile ExtensionRegistryLite f20943b;

    /* renamed from: c  reason: collision with root package name */
    public static final ExtensionRegistryLite f20944c = new ExtensionRegistryLite(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f20945a = Collections.emptyMap();

    public static class ExtensionClassHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Class f20946a = a();

        public static Class a() {
            try {
                return Class.forName("androidx.datastore.preferences.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public static final class ObjectIntPair {

        /* renamed from: a  reason: collision with root package name */
        public final Object f20947a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20948b;

        public ObjectIntPair(Object obj, int i2) {
            this.f20947a = obj;
            this.f20948b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f20947a == objectIntPair.f20947a && this.f20948b == objectIntPair.f20948b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f20947a) * 65535) + this.f20948b;
        }
    }

    public ExtensionRegistryLite(boolean z2) {
    }

    public static ExtensionRegistryLite b() {
        if (Protobuf.f21108d) {
            return f20944c;
        }
        ExtensionRegistryLite extensionRegistryLite = f20943b;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = f20943b;
                    if (extensionRegistryLite == null) {
                        extensionRegistryLite = ExtensionRegistryFactory.a();
                        f20943b = extensionRegistryLite;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return extensionRegistryLite;
    }

    public GeneratedMessageLite.GeneratedExtension a(MessageLite messageLite, int i2) {
        return (GeneratedMessageLite.GeneratedExtension) this.f20945a.get(new ObjectIntPair(messageLite, i2));
    }
}
