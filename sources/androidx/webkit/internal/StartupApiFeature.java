package androidx.webkit.internal;

import java.util.HashSet;
import java.util.Set;

public abstract class StartupApiFeature {

    /* renamed from: c  reason: collision with root package name */
    public static final Set f23156c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final String f23157a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23158b;

    public static class NoFramework extends StartupApiFeature {
        public NoFramework(String str, String str2) {
            super(str, str2);
        }
    }

    public static class P extends StartupApiFeature {
        public P(String str, String str2) {
            super(str, str2);
        }
    }

    public StartupApiFeature(String str, String str2) {
        this.f23157a = str;
        this.f23158b = str2;
        f23156c.add(this);
    }
}
