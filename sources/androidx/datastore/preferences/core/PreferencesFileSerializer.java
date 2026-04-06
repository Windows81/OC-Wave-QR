package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PreferencesFileSerializer implements Serializer<Preferences> {

    /* renamed from: a  reason: collision with root package name */
    public static final PreferencesFileSerializer f20712a = new PreferencesFileSerializer();

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20713a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase[] r0 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.FLOAT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.INTEGER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.LONG     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.STRING     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.BYTES     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto.Value.ValueCase.VALUE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f20713a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.PreferencesFileSerializer.WhenMappings.<clinit>():void");
        }
    }

    public Object c(InputStream inputStream, Continuation continuation) {
        PreferencesProto.PreferenceMap a2 = PreferencesMapCompat.f20694a.a(inputStream);
        MutablePreferences b2 = PreferencesFactory.b(new Preferences.Pair[0]);
        Map a0 = a2.a0();
        Intrinsics.h(a0, "preferencesProto.preferencesMap");
        for (Map.Entry entry : a0.entrySet()) {
            String str = (String) entry.getKey();
            PreferencesProto.Value value = (PreferencesProto.Value) entry.getValue();
            PreferencesFileSerializer preferencesFileSerializer = f20712a;
            Intrinsics.h(str, "name");
            Intrinsics.h(value, "value");
            preferencesFileSerializer.d(str, value, b2);
        }
        return b2.d();
    }

    public final void d(String str, PreferencesProto.Value value, MutablePreferences mutablePreferences) {
        PreferencesProto.Value.ValueCase p0 = value.p0();
        switch (p0 == null ? -1 : WhenMappings.f20713a[p0.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            case 1:
                mutablePreferences.j(PreferencesKeys.a(str), Boolean.valueOf(value.g0()));
                return;
            case 2:
                mutablePreferences.j(PreferencesKeys.d(str), Float.valueOf(value.k0()));
                return;
            case 3:
                mutablePreferences.j(PreferencesKeys.c(str), Double.valueOf(value.j0()));
                return;
            case 4:
                mutablePreferences.j(PreferencesKeys.e(str), Integer.valueOf(value.l0()));
                return;
            case 5:
                mutablePreferences.j(PreferencesKeys.f(str), Long.valueOf(value.m0()));
                return;
            case 6:
                Preferences.Key g2 = PreferencesKeys.g(str);
                String n0 = value.n0();
                Intrinsics.h(n0, "value.string");
                mutablePreferences.j(g2, n0);
                return;
            case 7:
                Preferences.Key h2 = PreferencesKeys.h(str);
                List c0 = value.o0().c0();
                Intrinsics.h(c0, "value.stringSet.stringsList");
                mutablePreferences.j(h2, CollectionsKt.R0(c0));
                return;
            case 8:
                Preferences.Key b2 = PreferencesKeys.b(str);
                byte[] P = value.h0().P();
                Intrinsics.h(P, "value.bytes.toByteArray()");
                mutablePreferences.j(b2, P);
                return;
            case 9:
                throw new CorruptionException("Value not set.", (Throwable) null, 2, (DefaultConstructorMarker) null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public Preferences a() {
        return PreferencesFactory.a();
    }

    public final PreferencesProto.Value f(Object obj) {
        if (obj instanceof Boolean) {
            GeneratedMessageLite s2 = PreferencesProto.Value.q0().I(((Boolean) obj).booleanValue()).d();
            Intrinsics.h(s2, "newBuilder().setBoolean(value).build()");
            return (PreferencesProto.Value) s2;
        } else if (obj instanceof Float) {
            GeneratedMessageLite s3 = PreferencesProto.Value.q0().L(((Number) obj).floatValue()).d();
            Intrinsics.h(s3, "newBuilder().setFloat(value).build()");
            return (PreferencesProto.Value) s3;
        } else if (obj instanceof Double) {
            GeneratedMessageLite s4 = PreferencesProto.Value.q0().K(((Number) obj).doubleValue()).d();
            Intrinsics.h(s4, "newBuilder().setDouble(value).build()");
            return (PreferencesProto.Value) s4;
        } else if (obj instanceof Integer) {
            GeneratedMessageLite s5 = PreferencesProto.Value.q0().M(((Number) obj).intValue()).d();
            Intrinsics.h(s5, "newBuilder().setInteger(value).build()");
            return (PreferencesProto.Value) s5;
        } else if (obj instanceof Long) {
            GeneratedMessageLite s6 = PreferencesProto.Value.q0().N(((Number) obj).longValue()).d();
            Intrinsics.h(s6, "newBuilder().setLong(value).build()");
            return (PreferencesProto.Value) s6;
        } else if (obj instanceof String) {
            GeneratedMessageLite s7 = PreferencesProto.Value.q0().O((String) obj).d();
            Intrinsics.h(s7, "newBuilder().setString(value).build()");
            return (PreferencesProto.Value) s7;
        } else if (obj instanceof Set) {
            PreferencesProto.Value.Builder q0 = PreferencesProto.Value.q0();
            PreferencesProto.StringSet.Builder d0 = PreferencesProto.StringSet.d0();
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            GeneratedMessageLite s8 = q0.P(d0.I((Set) obj)).d();
            Intrinsics.h(s8, "newBuilder()\n           …                 .build()");
            return (PreferencesProto.Value) s8;
        } else if (obj instanceof byte[]) {
            GeneratedMessageLite s9 = PreferencesProto.Value.q0().J(ByteString.q((byte[]) obj)).d();
            Intrinsics.h(s9, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (PreferencesProto.Value) s9;
        } else {
            throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
        }
    }

    /* renamed from: g */
    public Object b(Preferences preferences, OutputStream outputStream, Continuation continuation) {
        Map a2 = preferences.a();
        PreferencesProto.PreferenceMap.Builder d0 = PreferencesProto.PreferenceMap.d0();
        for (Map.Entry entry : a2.entrySet()) {
            d0.I(((Preferences.Key) entry.getKey()).a(), f(entry.getValue()));
        }
        ((PreferencesProto.PreferenceMap) d0.d()).p(outputStream);
        return Unit.f40552a;
    }
}
