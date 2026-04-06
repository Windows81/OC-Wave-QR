package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public interface Row {
    OsMap A(long j2);

    OsSet B(long j2, RealmFieldType realmFieldType);

    NativeRealmAny C(long j2);

    boolean D(long j2);

    byte[] E(long j2);

    void F();

    double G(long j2);

    float H(long j2);

    String I(long j2);

    OsList M(long j2, RealmFieldType realmFieldType);

    OsMap N(long j2, RealmFieldType realmFieldType);

    RealmFieldType Q(long j2);

    Row R(OsSharedRealm osSharedRealm);

    long S();

    boolean d();

    Decimal128 f(long j2);

    String[] getColumnNames();

    void h(long j2, String str);

    boolean isLoaded();

    Table j();

    void k(long j2, boolean z2);

    OsSet l(long j2);

    ObjectId m(long j2);

    UUID n(long j2);

    boolean o(long j2);

    long p(long j2);

    OsList r(long j2);

    void t(long j2, long j3);

    Date x(long j2);

    boolean y(long j2);

    long z(String str);
}
