package com.hansecom.abt.data.exceptions;

import com.hansecom.abt.R;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.ValidationError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FieldErrorsException extends Exception {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f33275A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final int f33276B = 8;

    /* renamed from: z  reason: collision with root package name */
    public final Map f33277z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StringValue b(ValidationError validationError) {
            String c2 = validationError.c();
            if (c2 != null) {
                Integer valueOf = Integer.valueOf(R.string.O3);
                List d2 = validationError.d();
                if (d2 == null) {
                    d2 = CollectionsKt.m();
                }
                return new StringValue.Key(c2, valueOf, d2);
            }
            String e2 = validationError.e();
            return e2 != null ? StringValueKt.d(e2) : StringValue.Companion.a();
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FieldErrorsException(Map map, String str) {
        super(str);
        Intrinsics.i(map, "validationErrors");
        this.f33277z = map;
    }

    public final StringValue a() {
        return (StringValue) this.f33277z.get("street");
    }

    public final StringValue b() {
        return (StringValue) this.f33277z.get("street_optional");
    }

    public final StringValue c() {
        return (StringValue) this.f33277z.get("city");
    }

    public final StringValue d() {
        return (StringValue) this.f33277z.get("country");
    }

    public final StringValue e() {
        return (StringValue) this.f33277z.get("email");
    }

    public final StringValue f() {
        return (StringValue) this.f33277z.get("cardId");
    }

    public final StringValue g() {
        return (StringValue) this.f33277z.get("securityCode");
    }

    public final StringValue h() {
        return (StringValue) this.f33277z.get("firstName");
    }

    public final StringValue i() {
        return (StringValue) this.f33277z.get("lastName");
    }

    public final StringValue j() {
        return (StringValue) this.f33277z.get("nickname");
    }

    public final StringValue k() {
        return (StringValue) this.f33277z.get("oldPassword");
    }

    public final StringValue l() {
        return (StringValue) this.f33277z.get("oldPin");
    }

    public final StringValue m() {
        return (StringValue) this.f33277z.get("password");
    }

    public final StringValue n() {
        return (StringValue) this.f33277z.get("phoneNumber");
    }

    public final StringValue o() {
        return (StringValue) this.f33277z.get("state");
    }

    public final StringValue p() {
        return (StringValue) this.f33277z.get("subject");
    }

    public final StringValue q() {
        return (StringValue) this.f33277z.get("text");
    }

    public final StringValue r() {
        return (StringValue) this.f33277z.get("zip");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FieldErrorsException(com.hansecom.abt.api.ApiValidationException r6) {
        /*
            r5 = this;
            java.lang.String r0 = "apiException"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.util.Map r0 = r6.d()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r0.size()
            int r2 = kotlin.collections.MapsKt.e(r2)
            r1.<init>(r2)
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.hansecom.abt.data.exceptions.FieldErrorsException$Companion r4 = f33275A
            java.lang.Object r2 = r2.getValue()
            com.hansecom.mapi.models.ValidationError r2 = (com.hansecom.mapi.models.ValidationError) r2
            com.hansecom.abt.util.resourcesResolvers.StringValue r2 = r4.b(r2)
            r1.put(r3, r2)
            goto L_0x0020
        L_0x0040:
            java.lang.String r6 = r6.getMessage()
            r5.<init>(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.exceptions.FieldErrorsException.<init>(com.hansecom.abt.api.ApiValidationException):void");
    }
}
