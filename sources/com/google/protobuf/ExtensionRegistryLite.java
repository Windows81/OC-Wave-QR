package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

public class ExtensionRegistryLite {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f32107b = true;

    /* renamed from: c  reason: collision with root package name */
    public static volatile ExtensionRegistryLite f32108c;

    /* renamed from: d  reason: collision with root package name */
    public static final ExtensionRegistryLite f32109d = new ExtensionRegistryLite(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f32110a = Collections.emptyMap();

    public static class ExtensionClassHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Class f32111a = a();

        public static Class a() {
            try {
                return Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
    }

    public static final class ObjectIntPair {

        /* renamed from: a  reason: collision with root package name */
        public final Object f32112a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32113b;

        public ObjectIntPair(Object obj, int i2) {
            this.f32112a = obj;
            this.f32113b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f32112a == objectIntPair.f32112a && this.f32113b == objectIntPair.f32113b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f32112a) * 65535) + this.f32113b;
        }
    }

    public ExtensionRegistryLite(boolean z2) {
    }

    public static ExtensionRegistryLite b() {
        ExtensionRegistryLite extensionRegistryLite = f32108c;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = f32108c;
                    if (extensionRegistryLite == null) {
                        extensionRegistryLite = f32107b ? ExtensionRegistryFactory.a() : f32109d;
                        f32108c = extensionRegistryLite;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return extensionRegistryLite;
    }

    public GeneratedMessageLite.GeneratedExtension a(MessageLite messageLite, int i2) {
        return (GeneratedMessageLite.GeneratedExtension) this.f32110a.get(new ObjectIntPair(messageLite, i2));
    }
}
