package org.bson.types;

import org.bson.BSONObject;

public class CodeWScope extends Code {

    /* renamed from: A  reason: collision with root package name */
    public final BSONObject f44035A;

    public CodeWScope(String str, BSONObject bSONObject) {
        super(str);
        this.f44035A = bSONObject;
    }

    public BSONObject b() {
        return this.f44035A;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeWScope codeWScope = (CodeWScope) obj;
        return a().equals(codeWScope.a()) && this.f44035A.equals(codeWScope.f44035A);
    }

    public int hashCode() {
        return a().hashCode() ^ this.f44035A.hashCode();
    }
}
