package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class UserCreateRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer[] f39674i = {null, null, null, null, null, new ArrayListSerializer(SecurityQuestionRequest$$serializer.f39578a), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final String f39675a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39676b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39677c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39678d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f39679e;

    /* renamed from: f  reason: collision with root package name */
    public final List f39680f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39681g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39682h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserCreateRequest> serializer() {
            return UserCreateRequest$$serializer.f39683a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ UserCreateRequest(int i2, String str, String str2, String str3, String str4, Boolean bool, List list, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i2 & 15)) {
            PluginExceptionsKt.a(i2, 15, UserCreateRequest$$serializer.f39683a.a());
        }
        this.f39675a = str;
        this.f39676b = str2;
        this.f39677c = str3;
        this.f39678d = str4;
        if ((i2 & 16) == 0) {
            this.f39679e = null;
        } else {
            this.f39679e = bool;
        }
        if ((i2 & 32) == 0) {
            this.f39680f = null;
        } else {
            this.f39680f = list;
        }
        if ((i2 & 64) == 0) {
            this.f39681g = null;
        } else {
            this.f39681g = str5;
        }
        if ((i2 & 128) == 0) {
            this.f39682h = null;
        } else {
            this.f39682h = str6;
        }
    }

    public static final /* synthetic */ void b(UserCreateRequest userCreateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39674i;
        compositeEncoder.t(serialDescriptor, 0, userCreateRequest.f39675a);
        compositeEncoder.t(serialDescriptor, 1, userCreateRequest.f39676b);
        compositeEncoder.t(serialDescriptor, 2, userCreateRequest.f39677c);
        compositeEncoder.t(serialDescriptor, 3, userCreateRequest.f39678d);
        if (compositeEncoder.w(serialDescriptor, 4) || userCreateRequest.f39679e != null) {
            compositeEncoder.m(serialDescriptor, 4, BooleanSerializer.f42073a, userCreateRequest.f39679e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || userCreateRequest.f39680f != null) {
            compositeEncoder.m(serialDescriptor, 5, kSerializerArr[5], userCreateRequest.f39680f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || userCreateRequest.f39681g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, userCreateRequest.f39681g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || userCreateRequest.f39682h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, userCreateRequest.f39682h);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCreateRequest)) {
            return false;
        }
        UserCreateRequest userCreateRequest = (UserCreateRequest) obj;
        return Intrinsics.d(this.f39675a, userCreateRequest.f39675a) && Intrinsics.d(this.f39676b, userCreateRequest.f39676b) && Intrinsics.d(this.f39677c, userCreateRequest.f39677c) && Intrinsics.d(this.f39678d, userCreateRequest.f39678d) && Intrinsics.d(this.f39679e, userCreateRequest.f39679e) && Intrinsics.d(this.f39680f, userCreateRequest.f39680f) && Intrinsics.d(this.f39681g, userCreateRequest.f39681g) && Intrinsics.d(this.f39682h, userCreateRequest.f39682h);
    }

    public int hashCode() {
        int hashCode = ((((((this.f39675a.hashCode() * 31) + this.f39676b.hashCode()) * 31) + this.f39677c.hashCode()) * 31) + this.f39678d.hashCode()) * 31;
        Boolean bool = this.f39679e;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f39680f;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f39681g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39682h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "UserCreateRequest(email=" + this.f39675a + ", firstName=" + this.f39676b + ", lastName=" + this.f39677c + ", password=" + this.f39678d + ", allowNewsletter=" + this.f39679e + ", securityQuestions=" + this.f39680f + ", phoneNumber=" + this.f39681g + ", ivrPin=" + this.f39682h + ')';
    }

    public UserCreateRequest(String str, String str2, String str3, String str4, Boolean bool, List list, String str5, String str6) {
        Intrinsics.i(str, "email");
        Intrinsics.i(str2, "firstName");
        Intrinsics.i(str3, "lastName");
        Intrinsics.i(str4, "password");
        this.f39675a = str;
        this.f39676b = str2;
        this.f39677c = str3;
        this.f39678d = str4;
        this.f39679e = bool;
        this.f39680f = list;
        this.f39681g = str5;
        this.f39682h = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserCreateRequest(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Boolean r17, java.util.List r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r17
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r18
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r19
        L_0x001b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r20
        L_0x0023:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.UserCreateRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
