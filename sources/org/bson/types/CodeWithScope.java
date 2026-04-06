package org.bson.types;

import org.bson.Document;

public class CodeWithScope extends Code {

    /* renamed from: A  reason: collision with root package name */
    public final Document f44036A;

    public CodeWithScope(String str, Document document) {
        super(str);
        this.f44036A = document;
    }

    public Document b() {
        return this.f44036A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Document document = this.f44036A;
        Document document2 = ((CodeWithScope) obj).f44036A;
        return document == null ? document2 == null : document.equals(document2);
    }

    public int hashCode() {
        return a().hashCode() ^ this.f44036A.hashCode();
    }
}
