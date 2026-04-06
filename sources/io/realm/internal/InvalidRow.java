package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public enum InvalidRow implements Row {
    INSTANCE;

    public OsMap A(long j2) {
        throw T();
    }

    public OsSet B(long j2, RealmFieldType realmFieldType) {
        throw T();
    }

    public NativeRealmAny C(long j2) {
        throw T();
    }

    public boolean D(long j2) {
        throw T();
    }

    public byte[] E(long j2) {
        throw T();
    }

    public void F() {
        throw T();
    }

    public double G(long j2) {
        throw T();
    }

    public float H(long j2) {
        throw T();
    }

    public String I(long j2) {
        throw T();
    }

    public OsList M(long j2, RealmFieldType realmFieldType) {
        throw T();
    }

    public OsMap N(long j2, RealmFieldType realmFieldType) {
        throw T();
    }

    public RealmFieldType Q(long j2) {
        throw T();
    }

    public Row R(OsSharedRealm osSharedRealm) {
        return INSTANCE;
    }

    public long S() {
        throw T();
    }

    public final RuntimeException T() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }

    public boolean d() {
        return false;
    }

    public Decimal128 f(long j2) {
        throw T();
    }

    public String[] getColumnNames() {
        throw T();
    }

    public void h(long j2, String str) {
        throw T();
    }

    public boolean isLoaded() {
        return true;
    }

    public Table j() {
        throw T();
    }

    public void k(long j2, boolean z2) {
        throw T();
    }

    public OsSet l(long j2) {
        throw T();
    }

    public ObjectId m(long j2) {
        throw T();
    }

    public UUID n(long j2) {
        throw T();
    }

    public boolean o(long j2) {
        throw T();
    }

    public long p(long j2) {
        throw T();
    }

    public OsList r(long j2) {
        throw T();
    }

    public void t(long j2, long j3) {
        throw T();
    }

    public Date x(long j2) {
        throw T();
    }

    public boolean y(long j2) {
        throw T();
    }

    public long z(String str) {
        throw T();
    }
}
