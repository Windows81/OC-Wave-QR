package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;

public abstract class CallableReference implements KCallable, Serializable {
    public static final Object F = NoReceiver.f40888z;

    /* renamed from: A  reason: collision with root package name */
    public final Object f40885A;

    /* renamed from: B  reason: collision with root package name */
    public final Class f40886B;
    public final String C;
    public final String D;
    public final boolean E;

    /* renamed from: z  reason: collision with root package name */
    public transient KCallable f40887z;

    public static class NoReceiver implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public static final NoReceiver f40888z = new NoReceiver();
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f40885A = obj;
        this.f40886B = cls;
        this.C = str;
        this.D = str2;
        this.E = z2;
    }

    public String getName() {
        return this.C;
    }

    public KCallable i() {
        KCallable kCallable = this.f40887z;
        if (kCallable != null) {
            return kCallable;
        }
        KCallable p2 = p();
        this.f40887z = p2;
        return p2;
    }

    public abstract KCallable p();

    public Object q() {
        return this.f40885A;
    }

    public KDeclarationContainer s() {
        Class cls = this.f40886B;
        if (cls == null) {
            return null;
        }
        return this.E ? Reflection.c(cls) : Reflection.b(cls);
    }

    public KCallable t() {
        KCallable i2 = i();
        if (i2 != this) {
            return i2;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public String u() {
        return this.D;
    }
}
