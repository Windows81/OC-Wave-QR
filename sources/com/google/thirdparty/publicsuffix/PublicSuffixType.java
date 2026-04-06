package com.google.thirdparty.publicsuffix;

public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    

    /* renamed from: A  reason: collision with root package name */
    public final char f32407A;

    /* renamed from: z  reason: collision with root package name */
    public final char f32408z;

    /* access modifiers changed from: public */
    PublicSuffixType(char c2, char c3) {
        this.f32408z = c2;
        this.f32407A = c3;
    }

    public static PublicSuffixType f(char c2) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.h() == c2 || publicSuffixType.j() == c2) {
                return publicSuffixType;
            }
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("No enum corresponding to given code: ");
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }

    public char h() {
        return this.f32408z;
    }

    public char j() {
        return this.f32407A;
    }
}
