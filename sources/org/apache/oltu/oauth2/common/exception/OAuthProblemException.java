package org.apache.oltu.oauth2.common.exception;

import java.util.HashMap;
import java.util.Map;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class OAuthProblemException extends Exception {

    /* renamed from: A  reason: collision with root package name */
    public String f43540A;

    /* renamed from: B  reason: collision with root package name */
    public String f43541B;
    public String C;
    public String D;
    public String E;
    public int F;
    public Map G;

    /* renamed from: z  reason: collision with root package name */
    public String f43542z;

    public OAuthProblemException(String str) {
        this(str, "");
    }

    public static OAuthProblemException b(String str) {
        return new OAuthProblemException(str);
    }

    public static OAuthProblemException c(String str, String str2) {
        return new OAuthProblemException(str, str2);
    }

    public OAuthProblemException a(String str) {
        this.f43540A = str;
        return this;
    }

    public OAuthProblemException d(int i2) {
        this.F = i2;
        return this;
    }

    public OAuthProblemException e(String str) {
        this.C = str;
        return this;
    }

    public OAuthProblemException f(String str) {
        this.f43541B = str;
        return this;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        if (!OAuthUtils.l(this.f43542z)) {
            sb.append(this.f43542z);
        }
        if (!OAuthUtils.l(this.f43540A)) {
            sb.append(", ");
            sb.append(this.f43540A);
        }
        if (!OAuthUtils.l(this.f43541B)) {
            sb.append(", ");
            sb.append(this.f43541B);
        }
        if (!OAuthUtils.l(this.C)) {
            sb.append(", ");
            sb.append(this.C);
        }
        if (!OAuthUtils.l(this.D)) {
            sb.append(", ");
            sb.append(this.D);
        }
        return sb.toString();
    }

    public String toString() {
        return "OAuthProblemException{error='" + this.f43542z + '\'' + ", description='" + this.f43540A + '\'' + ", uri='" + this.f43541B + '\'' + ", state='" + this.C + '\'' + ", scope='" + this.D + '\'' + ", redirectUri='" + this.E + '\'' + ", responseStatus=" + this.F + ", parameters=" + this.G + '}';
    }

    public OAuthProblemException(String str, String str2) {
        super(str + " " + str2);
        this.G = new HashMap();
        this.f43540A = str2;
        this.f43542z = str;
    }
}
