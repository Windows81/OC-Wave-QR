package androidx.navigation.serialization;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalNavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata
public final class NavTypeConverterKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22605a;

        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.navigation.serialization.InternalType[] r0 = androidx.navigation.serialization.InternalType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.INT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.BOOL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.LONG     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.STRING     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.STRING_NULLABLE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.ENUM     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.INT_NULLABLE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.BOOL_NULLABLE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.DOUBLE_NULLABLE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.FLOAT_NULLABLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.LONG_NULLABLE     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.INT_ARRAY     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.BOOL_ARRAY     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.DOUBLE_ARRAY     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.FLOAT_ARRAY     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.LONG_ARRAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.ARRAY     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.LIST     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                androidx.navigation.serialization.InternalType r1 = androidx.navigation.serialization.InternalType.ENUM_NULLABLE     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                f22605a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.NavTypeConverterKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Class a(SerialDescriptor serialDescriptor) {
        String K = StringsKt.K(serialDescriptor.a(), "?", "", false, 4, (Object) null);
        try {
            Class<?> cls = Class.forName(K);
            Intrinsics.h(cls, "forName(className)");
            return cls;
        } catch (ClassNotFoundException unused) {
            while (StringsKt.W(K, ".", false, 2, (Object) null)) {
                K = new Regex("(\\.+)(?!.*\\.)").e(K, "\\$");
                Class<?> cls2 = Class.forName(K);
                Intrinsics.h(cls2, "forName(className)");
                return cls2;
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + serialDescriptor.a() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    public static final NavType b(SerialDescriptor serialDescriptor) {
        NavType enumListType;
        Intrinsics.i(serialDescriptor, "<this>");
        InternalType d2 = d(serialDescriptor);
        int[] iArr = WhenMappings.f22605a;
        switch (iArr[d2.ordinal()]) {
            case 1:
                return NavType.f22400d;
            case 2:
                return NavType.f22410n;
            case 3:
                return NavType.f22407k;
            case 4:
                return NavType.f22404h;
            case 5:
                return InternalNavType.f22587a.h();
            case 6:
                return NavType.f22413q;
            case 7:
                NavType b2 = NavType.f22399c.b(a(serialDescriptor), false);
                return b2 == null ? UNKNOWN.f22633t : b2;
            case 8:
                return InternalNavType.f22587a.f();
            case 9:
                return InternalNavType.f22587a.a();
            case 10:
                return InternalNavType.f22587a.d();
            case 11:
                return InternalNavType.f22587a.c();
            case 12:
                return InternalNavType.f22587a.e();
            case 13:
                return InternalNavType.f22587a.g();
            case 14:
                return NavType.f22402f;
            case 15:
                return NavType.f22411o;
            case 16:
                return InternalNavType.f22587a.b();
            case 17:
                return NavType.f22408l;
            case 18:
                return NavType.f22405i;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                return d(serialDescriptor.j(0)) == InternalType.STRING ? NavType.f22414r : UNKNOWN.f22633t;
            case 20:
                switch (iArr[d(serialDescriptor.j(0)).ordinal()]) {
                    case 1:
                        return NavType.f22403g;
                    case 2:
                        return NavType.f22412p;
                    case 3:
                        return NavType.f22409m;
                    case 4:
                        return NavType.f22406j;
                    case 5:
                        return NavType.f22415s;
                    case 6:
                        return InternalNavType.f22587a.i();
                    case 7:
                        Class a2 = a(serialDescriptor.j(0));
                        Intrinsics.g(a2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        enumListType = new InternalNavType.EnumListType(a2);
                        break;
                    default:
                        return UNKNOWN.f22633t;
                }
            case 21:
                Class a3 = a(serialDescriptor);
                if (Enum.class.isAssignableFrom(a3)) {
                    Intrinsics.g(a3, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
                    enumListType = new InternalNavType.EnumNullableType(a3);
                    break;
                } else {
                    return UNKNOWN.f22633t;
                }
            default:
                return UNKNOWN.f22633t;
        }
        return enumListType;
    }

    public static final boolean c(SerialDescriptor serialDescriptor, KType kType) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(kType, "kType");
        if (serialDescriptor.c() != kType.c()) {
            return false;
        }
        KSerializer f2 = SerializersKt.f(kType);
        if (f2 != null) {
            return Intrinsics.d(serialDescriptor, f2.a());
        }
        throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
    }

    public static final InternalType d(SerialDescriptor serialDescriptor) {
        String K = StringsKt.K(serialDescriptor.a(), "?", "", false, 4, (Object) null);
        return Intrinsics.d(serialDescriptor.e(), SerialKind.ENUM.f42057a) ? serialDescriptor.c() ? InternalType.ENUM_NULLABLE : InternalType.ENUM : Intrinsics.d(K, "kotlin.Int") ? serialDescriptor.c() ? InternalType.INT_NULLABLE : InternalType.INT : Intrinsics.d(K, "kotlin.Boolean") ? serialDescriptor.c() ? InternalType.BOOL_NULLABLE : InternalType.BOOL : Intrinsics.d(K, "kotlin.Double") ? serialDescriptor.c() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE : Intrinsics.d(K, "kotlin.Double") ? InternalType.DOUBLE : Intrinsics.d(K, "kotlin.Float") ? serialDescriptor.c() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT : Intrinsics.d(K, "kotlin.Long") ? serialDescriptor.c() ? InternalType.LONG_NULLABLE : InternalType.LONG : Intrinsics.d(K, "kotlin.String") ? serialDescriptor.c() ? InternalType.STRING_NULLABLE : InternalType.STRING : Intrinsics.d(K, "kotlin.IntArray") ? InternalType.INT_ARRAY : Intrinsics.d(K, "kotlin.DoubleArray") ? InternalType.DOUBLE_ARRAY : Intrinsics.d(K, "kotlin.BooleanArray") ? InternalType.BOOL_ARRAY : Intrinsics.d(K, "kotlin.FloatArray") ? InternalType.FLOAT_ARRAY : Intrinsics.d(K, "kotlin.LongArray") ? InternalType.LONG_ARRAY : Intrinsics.d(K, "kotlin.Array") ? InternalType.ARRAY : StringsKt.Q(K, "kotlin.collections.ArrayList", false, 2, (Object) null) ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
