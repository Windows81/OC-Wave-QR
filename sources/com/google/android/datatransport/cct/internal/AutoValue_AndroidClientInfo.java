package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AndroidClientInfo;

final class AutoValue_AndroidClientInfo extends AndroidClientInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f23900a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23901b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23902c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23903d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23904e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23905f;

    /* renamed from: g  reason: collision with root package name */
    public final String f23906g;

    /* renamed from: h  reason: collision with root package name */
    public final String f23907h;

    /* renamed from: i  reason: collision with root package name */
    public final String f23908i;

    /* renamed from: j  reason: collision with root package name */
    public final String f23909j;

    /* renamed from: k  reason: collision with root package name */
    public final String f23910k;

    /* renamed from: l  reason: collision with root package name */
    public final String f23911l;

    public static final class Builder extends AndroidClientInfo.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Integer f23912a;

        /* renamed from: b  reason: collision with root package name */
        public String f23913b;

        /* renamed from: c  reason: collision with root package name */
        public String f23914c;

        /* renamed from: d  reason: collision with root package name */
        public String f23915d;

        /* renamed from: e  reason: collision with root package name */
        public String f23916e;

        /* renamed from: f  reason: collision with root package name */
        public String f23917f;

        /* renamed from: g  reason: collision with root package name */
        public String f23918g;

        /* renamed from: h  reason: collision with root package name */
        public String f23919h;

        /* renamed from: i  reason: collision with root package name */
        public String f23920i;

        /* renamed from: j  reason: collision with root package name */
        public String f23921j;

        /* renamed from: k  reason: collision with root package name */
        public String f23922k;

        /* renamed from: l  reason: collision with root package name */
        public String f23923l;

        public AndroidClientInfo a() {
            return new AutoValue_AndroidClientInfo(this.f23912a, this.f23913b, this.f23914c, this.f23915d, this.f23916e, this.f23917f, this.f23918g, this.f23919h, this.f23920i, this.f23921j, this.f23922k, this.f23923l);
        }

        public AndroidClientInfo.Builder b(String str) {
            this.f23923l = str;
            return this;
        }

        public AndroidClientInfo.Builder c(String str) {
            this.f23921j = str;
            return this;
        }

        public AndroidClientInfo.Builder d(String str) {
            this.f23915d = str;
            return this;
        }

        public AndroidClientInfo.Builder e(String str) {
            this.f23919h = str;
            return this;
        }

        public AndroidClientInfo.Builder f(String str) {
            this.f23914c = str;
            return this;
        }

        public AndroidClientInfo.Builder g(String str) {
            this.f23920i = str;
            return this;
        }

        public AndroidClientInfo.Builder h(String str) {
            this.f23918g = str;
            return this;
        }

        public AndroidClientInfo.Builder i(String str) {
            this.f23922k = str;
            return this;
        }

        public AndroidClientInfo.Builder j(String str) {
            this.f23913b = str;
            return this;
        }

        public AndroidClientInfo.Builder k(String str) {
            this.f23917f = str;
            return this;
        }

        public AndroidClientInfo.Builder l(String str) {
            this.f23916e = str;
            return this;
        }

        public AndroidClientInfo.Builder m(Integer num) {
            this.f23912a = num;
            return this;
        }
    }

    public String b() {
        return this.f23911l;
    }

    public String c() {
        return this.f23909j;
    }

    public String d() {
        return this.f23903d;
    }

    public String e() {
        return this.f23907h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        Integer num = this.f23900a;
        if (num != null ? num.equals(androidClientInfo.m()) : androidClientInfo.m() == null) {
            String str = this.f23901b;
            if (str != null ? str.equals(androidClientInfo.j()) : androidClientInfo.j() == null) {
                String str2 = this.f23902c;
                if (str2 != null ? str2.equals(androidClientInfo.f()) : androidClientInfo.f() == null) {
                    String str3 = this.f23903d;
                    if (str3 != null ? str3.equals(androidClientInfo.d()) : androidClientInfo.d() == null) {
                        String str4 = this.f23904e;
                        if (str4 != null ? str4.equals(androidClientInfo.l()) : androidClientInfo.l() == null) {
                            String str5 = this.f23905f;
                            if (str5 != null ? str5.equals(androidClientInfo.k()) : androidClientInfo.k() == null) {
                                String str6 = this.f23906g;
                                if (str6 != null ? str6.equals(androidClientInfo.h()) : androidClientInfo.h() == null) {
                                    String str7 = this.f23907h;
                                    if (str7 != null ? str7.equals(androidClientInfo.e()) : androidClientInfo.e() == null) {
                                        String str8 = this.f23908i;
                                        if (str8 != null ? str8.equals(androidClientInfo.g()) : androidClientInfo.g() == null) {
                                            String str9 = this.f23909j;
                                            if (str9 != null ? str9.equals(androidClientInfo.c()) : androidClientInfo.c() == null) {
                                                String str10 = this.f23910k;
                                                if (str10 != null ? str10.equals(androidClientInfo.i()) : androidClientInfo.i() == null) {
                                                    String str11 = this.f23911l;
                                                    if (str11 == null) {
                                                        if (androidClientInfo.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(androidClientInfo.b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f23902c;
    }

    public String g() {
        return this.f23908i;
    }

    public String h() {
        return this.f23906g;
    }

    public int hashCode() {
        Integer num = this.f23900a;
        int i2 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f23901b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f23902c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23903d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f23904e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f23905f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f23906g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f23907h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f23908i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f23909j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f23910k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f23911l;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode11 ^ i2;
    }

    public String i() {
        return this.f23910k;
    }

    public String j() {
        return this.f23901b;
    }

    public String k() {
        return this.f23905f;
    }

    public String l() {
        return this.f23904e;
    }

    public Integer m() {
        return this.f23900a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f23900a + ", model=" + this.f23901b + ", hardware=" + this.f23902c + ", device=" + this.f23903d + ", product=" + this.f23904e + ", osBuild=" + this.f23905f + ", manufacturer=" + this.f23906g + ", fingerprint=" + this.f23907h + ", locale=" + this.f23908i + ", country=" + this.f23909j + ", mccMnc=" + this.f23910k + ", applicationBuild=" + this.f23911l + "}";
    }

    public AutoValue_AndroidClientInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f23900a = num;
        this.f23901b = str;
        this.f23902c = str2;
        this.f23903d = str3;
        this.f23904e = str4;
        this.f23905f = str5;
        this.f23906g = str6;
        this.f23907h = str7;
        this.f23908i = str8;
        this.f23909j = str9;
        this.f23910k = str10;
        this.f23911l = str11;
    }
}
