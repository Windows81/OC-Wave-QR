package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class User {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer[] f39650j = {null, null, null, null, null, null, State.Companion.serializer(), new ArrayListSerializer(FareMedium$$serializer.f39396a), null};

    /* renamed from: a  reason: collision with root package name */
    public final Long f39651a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39652b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39653c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39654d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39655e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39656f;

    /* renamed from: g  reason: collision with root package name */
    public final State f39657g;

    /* renamed from: h  reason: collision with root package name */
    public final List f39658h;

    /* renamed from: i  reason: collision with root package name */
    public final UserAddress f39659i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<User> serializer() {
            return User$$serializer.f39660a;
        }

        public Companion() {
        }
    }

    @Metadata
    @Serializable
    public enum State {
        _0(0),
        _1(1),
        _2(2),
        _3(3);
        

        /* renamed from: A  reason: collision with root package name */
        public static final Lazy f39661A = null;
        public static final Companion Companion = null;

        /* renamed from: z  reason: collision with root package name */
        public final int f39663z;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer a() {
                return (KSerializer) State.f39661A.getValue();
            }

            public final KSerializer<State> serializer() {
                return a();
            }

            public Companion() {
            }
        }

        static {
            State[] d2;
            C = EnumEntriesKt.a(d2);
            Companion = new Companion((DefaultConstructorMarker) null);
            f39661A = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, Companion.AnonymousClass1.f39664z);
        }

        /* access modifiers changed from: public */
        State(int i2) {
            this.f39663z = i2;
        }
    }

    public /* synthetic */ User(int i2, Long l2, String str, String str2, String str3, String str4, String str5, State state, List list, UserAddress userAddress, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39651a = null;
        } else {
            this.f39651a = l2;
        }
        if ((i2 & 2) == 0) {
            this.f39652b = null;
        } else {
            this.f39652b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39653c = null;
        } else {
            this.f39653c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39654d = null;
        } else {
            this.f39654d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39655e = null;
        } else {
            this.f39655e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f39656f = null;
        } else {
            this.f39656f = str5;
        }
        if ((i2 & 64) == 0) {
            this.f39657g = null;
        } else {
            this.f39657g = state;
        }
        if ((i2 & 128) == 0) {
            this.f39658h = null;
        } else {
            this.f39658h = list;
        }
        if ((i2 & 256) == 0) {
            this.f39659i = null;
        } else {
            this.f39659i = userAddress;
        }
    }

    public static /* synthetic */ User c(User user, Long l2, String str, String str2, String str3, String str4, String str5, State state, List list, UserAddress userAddress, int i2, Object obj) {
        User user2 = user;
        int i3 = i2;
        return user.b((i3 & 1) != 0 ? user2.f39651a : l2, (i3 & 2) != 0 ? user2.f39652b : str, (i3 & 4) != 0 ? user2.f39653c : str2, (i3 & 8) != 0 ? user2.f39654d : str3, (i3 & 16) != 0 ? user2.f39655e : str4, (i3 & 32) != 0 ? user2.f39656f : str5, (i3 & 64) != 0 ? user2.f39657g : state, (i3 & 128) != 0 ? user2.f39658h : list, (i3 & 256) != 0 ? user2.f39659i : userAddress);
    }

    public static final /* synthetic */ void j(User user, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39650j;
        if (compositeEncoder.w(serialDescriptor, 0) || user.f39651a != null) {
            compositeEncoder.m(serialDescriptor, 0, LongSerializer.f42142a, user.f39651a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || user.f39652b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, user.f39652b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || user.f39653c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, user.f39653c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || user.f39654d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, user.f39654d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || user.f39655e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, user.f39655e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || user.f39656f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, user.f39656f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || user.f39657g != null) {
            compositeEncoder.m(serialDescriptor, 6, kSerializerArr[6], user.f39657g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || user.f39658h != null) {
            compositeEncoder.m(serialDescriptor, 7, kSerializerArr[7], user.f39658h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || user.f39659i != null) {
            compositeEncoder.m(serialDescriptor, 8, UserAddress$$serializer.f39673a, user.f39659i);
        }
    }

    public final User b(Long l2, String str, String str2, String str3, String str4, String str5, State state, List list, UserAddress userAddress) {
        return new User(l2, str, str2, str3, str4, str5, state, list, userAddress);
    }

    public final String d() {
        return this.f39653c;
    }

    public final String e() {
        return this.f39654d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Intrinsics.d(this.f39651a, user.f39651a) && Intrinsics.d(this.f39652b, user.f39652b) && Intrinsics.d(this.f39653c, user.f39653c) && Intrinsics.d(this.f39654d, user.f39654d) && Intrinsics.d(this.f39655e, user.f39655e) && Intrinsics.d(this.f39656f, user.f39656f) && this.f39657g == user.f39657g && Intrinsics.d(this.f39658h, user.f39658h) && Intrinsics.d(this.f39659i, user.f39659i);
    }

    public final String f() {
        return this.f39655e;
    }

    public final String g() {
        return this.f39656f;
    }

    public final State h() {
        return this.f39657g;
    }

    public int hashCode() {
        Long l2 = this.f39651a;
        int i2 = 0;
        int hashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.f39652b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39653c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39654d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39655e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39656f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        State state = this.f39657g;
        int hashCode7 = (hashCode6 + (state == null ? 0 : state.hashCode())) * 31;
        List list = this.f39658h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        UserAddress userAddress = this.f39659i;
        if (userAddress != null) {
            i2 = userAddress.hashCode();
        }
        return hashCode8 + i2;
    }

    public final UserAddress i() {
        return this.f39659i;
    }

    public String toString() {
        return "User(id=" + this.f39651a + ", userName=" + this.f39652b + ", email=" + this.f39653c + ", firstName=" + this.f39654d + ", lastName=" + this.f39655e + ", phoneNumber=" + this.f39656f + ", state=" + this.f39657g + ", fareMedia=" + this.f39658h + ", userAddresses=" + this.f39659i + ')';
    }

    public User(Long l2, String str, String str2, String str3, String str4, String str5, State state, List list, UserAddress userAddress) {
        this.f39651a = l2;
        this.f39652b = str;
        this.f39653c = str2;
        this.f39654d = str3;
        this.f39655e = str4;
        this.f39656f = str5;
        this.f39657g = state;
        this.f39658h = list;
        this.f39659i = userAddress;
    }
}
