package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

@Metadata
public final class TypeReference implements KType {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final List f40919A;

    /* renamed from: B  reason: collision with root package name */
    public final KType f40920B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final KClassifier f40921z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40922a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f40922a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.TypeReference.WhenMappings.<clinit>():void");
        }
    }

    public TypeReference(KClassifier kClassifier, List list, KType kType, int i2) {
        Intrinsics.i(kClassifier, "classifier");
        Intrinsics.i(list, "arguments");
        this.f40921z = kClassifier;
        this.f40919A = list;
        this.f40920B = kType;
        this.C = i2;
    }

    public static final CharSequence l(TypeReference typeReference, KTypeProjection kTypeProjection) {
        Intrinsics.i(kTypeProjection, "it");
        return typeReference.i(kTypeProjection);
    }

    public boolean c() {
        return (this.C & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            return Intrinsics.d(g(), typeReference.g()) && Intrinsics.d(f(), typeReference.f()) && Intrinsics.d(this.f40920B, typeReference.f40920B) && this.C == typeReference.C;
        }
    }

    public List f() {
        return this.f40919A;
    }

    public KClassifier g() {
        return this.f40921z;
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(this.C);
    }

    public final String i(KTypeProjection kTypeProjection) {
        String str;
        if (kTypeProjection.d() == null) {
            return "*";
        }
        KType c2 = kTypeProjection.c();
        TypeReference typeReference = c2 instanceof TypeReference ? (TypeReference) c2 : null;
        if (typeReference == null || (str = typeReference.j(true)) == null) {
            str = String.valueOf(kTypeProjection.c());
        }
        KVariance d2 = kTypeProjection.d();
        int i2 = d2 == null ? -1 : WhenMappings.f40922a[d2.ordinal()];
        if (i2 == 1) {
            return str;
        }
        if (i2 == 2) {
            return "in " + str;
        } else if (i2 == 3) {
            return "out " + str;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String j(boolean z2) {
        String str;
        KClassifier g2 = g();
        Class cls = null;
        KClass kClass = g2 instanceof KClass ? (KClass) g2 : null;
        if (kClass != null) {
            cls = JvmClassMappingKt.a(kClass);
        }
        if (cls == null) {
            str = g().toString();
        } else if ((this.C & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            str = m(cls);
        } else if (!z2 || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            KClassifier g3 = g();
            Intrinsics.g(g3, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            str = JvmClassMappingKt.b((KClass) g3).getName();
        }
        String str2 = "";
        String n0 = f().isEmpty() ? str2 : CollectionsKt.n0(f(), ", ", "<", ">", 0, (CharSequence) null, new a(this), 24, (Object) null);
        if (c()) {
            str2 = "?";
        }
        String str3 = str + n0 + str2;
        KType kType = this.f40920B;
        if (!(kType instanceof TypeReference)) {
            return str3;
        }
        String j2 = ((TypeReference) kType).j(true);
        if (Intrinsics.d(j2, str3)) {
            return str3;
        }
        if (Intrinsics.d(j2, str3 + '?')) {
            return str3 + '!';
        }
        return '(' + str3 + ".." + j2 + ')';
    }

    public final String m(Class cls) {
        return Intrinsics.d(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.d(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.d(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.d(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.d(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.d(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.d(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.d(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public String toString() {
        return j(false) + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TypeReference(KClassifier kClassifier, List list, boolean z2) {
        this(kClassifier, list, (KType) null, z2 ? 1 : 0);
        Intrinsics.i(kClassifier, "classifier");
        Intrinsics.i(list, "arguments");
    }
}
