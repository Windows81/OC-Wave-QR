package com.hansecom.mapi.infrastructure;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CollectionFormats {

    @Metadata
    public static class CSVParams {

        /* renamed from: a  reason: collision with root package name */
        public List f39144a;

        public final List a() {
            return this.f39144a;
        }

        public String toString() {
            return CollectionsKt.n0(this.f39144a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }

    @Metadata
    public static final class PIPESParams extends CSVParams {
        public String toString() {
            return CollectionsKt.n0(a(), "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }

    @Metadata
    public static final class SPACEParams extends SSVParams {
    }

    @Metadata
    public static class SSVParams extends CSVParams {
        public String toString() {
            return CollectionsKt.n0(a(), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }

    @Metadata
    public static final class TSVParams extends CSVParams {
        public String toString() {
            return CollectionsKt.n0(a(), "\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
    }
}
